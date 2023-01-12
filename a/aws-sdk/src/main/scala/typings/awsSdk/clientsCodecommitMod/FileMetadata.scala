package typings.awsSdk.clientsCodecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileMetadata extends StObject {
  
  /**
    * The full path to the file to be added or updated, including the name of the file.
    */
  var absolutePath: js.UndefOr[Path] = js.undefined
  
  /**
    * The blob ID that contains the file information.
    */
  var blobId: js.UndefOr[ObjectId] = js.undefined
  
  /**
    * The extrapolated file mode permissions for the file. Valid values include EXECUTABLE and NORMAL.
    */
  var fileMode: js.UndefOr[FileModeTypeEnum] = js.undefined
}
object FileMetadata {
  
  inline def apply(): FileMetadata = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FileMetadata]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: FileMetadata] (val x: Self) extends AnyVal {
    
    inline def setAbsolutePath(value: Path): Self = StObject.set(x, "absolutePath", value.asInstanceOf[js.Any])
    
    inline def setAbsolutePathUndefined: Self = StObject.set(x, "absolutePath", js.undefined)
    
    inline def setBlobId(value: ObjectId): Self = StObject.set(x, "blobId", value.asInstanceOf[js.Any])
    
    inline def setBlobIdUndefined: Self = StObject.set(x, "blobId", js.undefined)
    
    inline def setFileMode(value: FileModeTypeEnum): Self = StObject.set(x, "fileMode", value.asInstanceOf[js.Any])
    
    inline def setFileModeUndefined: Self = StObject.set(x, "fileMode", js.undefined)
  }
}
