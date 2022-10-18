package typings.awsSdk.clientsFsxMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReleaseFileSystemNfsV3LocksRequest extends StObject {
  
  var ClientRequestToken: js.UndefOr[typings.awsSdk.clientsFsxMod.ClientRequestToken] = js.undefined
  
  var FileSystemId: typings.awsSdk.clientsFsxMod.FileSystemId
}
object ReleaseFileSystemNfsV3LocksRequest {
  
  inline def apply(FileSystemId: FileSystemId): ReleaseFileSystemNfsV3LocksRequest = {
    val __obj = js.Dynamic.literal(FileSystemId = FileSystemId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReleaseFileSystemNfsV3LocksRequest]
  }
  
  extension [Self <: ReleaseFileSystemNfsV3LocksRequest](x: Self) {
    
    inline def setClientRequestToken(value: ClientRequestToken): Self = StObject.set(x, "ClientRequestToken", value.asInstanceOf[js.Any])
    
    inline def setClientRequestTokenUndefined: Self = StObject.set(x, "ClientRequestToken", js.undefined)
    
    inline def setFileSystemId(value: FileSystemId): Self = StObject.set(x, "FileSystemId", value.asInstanceOf[js.Any])
  }
}
