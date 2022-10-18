package typings.awsSdk.clientsStoragegatewayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NFSFileShareDefaults extends StObject {
  
  /**
    * The Unix directory mode in the form "nnnn". For example, 0666 represents the default access mode for all directories inside the file share. The default value is 0777.
    */
  var DirectoryMode: js.UndefOr[PermissionMode] = js.undefined
  
  /**
    * The Unix file mode in the form "nnnn". For example, 0666 represents the default file mode inside the file share. The default value is 0666.
    */
  var FileMode: js.UndefOr[PermissionMode] = js.undefined
  
  /**
    * The default group ID for the file share (unless the files have another group ID specified). The default value is nfsnobody.
    */
  var GroupId: js.UndefOr[PermissionId] = js.undefined
  
  /**
    * The default owner ID for files in the file share (unless the files have another owner ID specified). The default value is nfsnobody.
    */
  var OwnerId: js.UndefOr[PermissionId] = js.undefined
}
object NFSFileShareDefaults {
  
  inline def apply(): NFSFileShareDefaults = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NFSFileShareDefaults]
  }
  
  extension [Self <: NFSFileShareDefaults](x: Self) {
    
    inline def setDirectoryMode(value: PermissionMode): Self = StObject.set(x, "DirectoryMode", value.asInstanceOf[js.Any])
    
    inline def setDirectoryModeUndefined: Self = StObject.set(x, "DirectoryMode", js.undefined)
    
    inline def setFileMode(value: PermissionMode): Self = StObject.set(x, "FileMode", value.asInstanceOf[js.Any])
    
    inline def setFileModeUndefined: Self = StObject.set(x, "FileMode", js.undefined)
    
    inline def setGroupId(value: PermissionId): Self = StObject.set(x, "GroupId", value.asInstanceOf[js.Any])
    
    inline def setGroupIdUndefined: Self = StObject.set(x, "GroupId", js.undefined)
    
    inline def setOwnerId(value: PermissionId): Self = StObject.set(x, "OwnerId", value.asInstanceOf[js.Any])
    
    inline def setOwnerIdUndefined: Self = StObject.set(x, "OwnerId", js.undefined)
  }
}
