package typings.awsSdk.clientsFsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateFileSystemResponse extends StObject {
  
  /**
    * The configuration of the file system that was created.
    */
  var FileSystem: js.UndefOr[typings.awsSdk.clientsFsxMod.FileSystem] = js.undefined
}
object CreateFileSystemResponse {
  
  inline def apply(): CreateFileSystemResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateFileSystemResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateFileSystemResponse] (val x: Self) extends AnyVal {
    
    inline def setFileSystem(value: FileSystem): Self = StObject.set(x, "FileSystem", value.asInstanceOf[js.Any])
    
    inline def setFileSystemUndefined: Self = StObject.set(x, "FileSystem", js.undefined)
  }
}
