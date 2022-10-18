package typings.awsSdk.clientsFsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReleaseFileSystemNfsV3LocksResponse extends StObject {
  
  var FileSystem: js.UndefOr[typings.awsSdk.clientsFsxMod.FileSystem] = js.undefined
}
object ReleaseFileSystemNfsV3LocksResponse {
  
  inline def apply(): ReleaseFileSystemNfsV3LocksResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReleaseFileSystemNfsV3LocksResponse]
  }
  
  extension [Self <: ReleaseFileSystemNfsV3LocksResponse](x: Self) {
    
    inline def setFileSystem(value: FileSystem): Self = StObject.set(x, "FileSystem", value.asInstanceOf[js.Any])
    
    inline def setFileSystemUndefined: Self = StObject.set(x, "FileSystem", js.undefined)
  }
}
