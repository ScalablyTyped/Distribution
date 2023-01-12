package typings.activestorage

import typings.std.File
import typings.std.XMLHttpRequest
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("activestorage", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("activestorage", "DirectUpload")
  @js.native
  open class DirectUpload protected () extends StObject {
    def this(file: File, url: String) = this()
    def this(file: File, url: String, delegate: DirectUploadDelegate) = this()
    
    def create(callback: js.Function2[/* error */ js.Error, /* blob */ Blob, Unit]): Unit = js.native
    
    var file: File = js.native
    
    var id: Double = js.native
    
    var url: String = js.native
  }
  
  inline def start(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("start")().asInstanceOf[Unit]
  
  trait Blob extends StObject {
    
    var byte_size: Double
    
    var checksum: String
    
    var content_type: String
    
    var filename: String
    
    var signed_id: String
  }
  object Blob {
    
    inline def apply(byte_size: Double, checksum: String, content_type: String, filename: String, signed_id: String): Blob = {
      val __obj = js.Dynamic.literal(byte_size = byte_size.asInstanceOf[js.Any], checksum = checksum.asInstanceOf[js.Any], content_type = content_type.asInstanceOf[js.Any], filename = filename.asInstanceOf[js.Any], signed_id = signed_id.asInstanceOf[js.Any])
      __obj.asInstanceOf[Blob]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Blob] (val x: Self) extends AnyVal {
      
      inline def setByte_size(value: Double): Self = StObject.set(x, "byte_size", value.asInstanceOf[js.Any])
      
      inline def setChecksum(value: String): Self = StObject.set(x, "checksum", value.asInstanceOf[js.Any])
      
      inline def setContent_type(value: String): Self = StObject.set(x, "content_type", value.asInstanceOf[js.Any])
      
      inline def setFilename(value: String): Self = StObject.set(x, "filename", value.asInstanceOf[js.Any])
      
      inline def setSigned_id(value: String): Self = StObject.set(x, "signed_id", value.asInstanceOf[js.Any])
    }
  }
  
  trait DirectUploadDelegate extends StObject {
    
    var directUploadWillCreateBlobWithXHR: js.UndefOr[js.Function1[/* xhr */ XMLHttpRequest, Unit]] = js.undefined
    
    var directUploadWillStoreFileWithXHR: js.UndefOr[js.Function1[/* xhr */ XMLHttpRequest, Unit]] = js.undefined
  }
  object DirectUploadDelegate {
    
    inline def apply(): DirectUploadDelegate = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DirectUploadDelegate]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: DirectUploadDelegate] (val x: Self) extends AnyVal {
      
      inline def setDirectUploadWillCreateBlobWithXHR(value: /* xhr */ XMLHttpRequest => Unit): Self = StObject.set(x, "directUploadWillCreateBlobWithXHR", js.Any.fromFunction1(value))
      
      inline def setDirectUploadWillCreateBlobWithXHRUndefined: Self = StObject.set(x, "directUploadWillCreateBlobWithXHR", js.undefined)
      
      inline def setDirectUploadWillStoreFileWithXHR(value: /* xhr */ XMLHttpRequest => Unit): Self = StObject.set(x, "directUploadWillStoreFileWithXHR", js.Any.fromFunction1(value))
      
      inline def setDirectUploadWillStoreFileWithXHRUndefined: Self = StObject.set(x, "directUploadWillStoreFileWithXHR", js.undefined)
    }
  }
}
