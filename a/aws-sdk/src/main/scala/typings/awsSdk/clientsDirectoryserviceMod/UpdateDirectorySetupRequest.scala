package typings.awsSdk.clientsDirectoryserviceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateDirectorySetupRequest extends StObject {
  
  /**
    *  The boolean that specifies if a snapshot for the directory needs to be taken before updating the directory. 
    */
  var CreateSnapshotBeforeUpdate: js.UndefOr[typings.awsSdk.clientsDirectoryserviceMod.CreateSnapshotBeforeUpdate] = js.undefined
  
  /**
    *  The identifier of the directory on which you want to perform the update. 
    */
  var DirectoryId: typings.awsSdk.clientsDirectoryserviceMod.DirectoryId
  
  /**
    *  The settings for the OS update that needs to be performed on the directory. 
    */
  var OSUpdateSettings: js.UndefOr[typings.awsSdk.clientsDirectoryserviceMod.OSUpdateSettings] = js.undefined
  
  /**
    *  The type of update that needs to be performed on the directory. For example, OS. 
    */
  var UpdateType: typings.awsSdk.clientsDirectoryserviceMod.UpdateType
}
object UpdateDirectorySetupRequest {
  
  inline def apply(DirectoryId: DirectoryId, UpdateType: UpdateType): UpdateDirectorySetupRequest = {
    val __obj = js.Dynamic.literal(DirectoryId = DirectoryId.asInstanceOf[js.Any], UpdateType = UpdateType.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDirectorySetupRequest]
  }
  
  extension [Self <: UpdateDirectorySetupRequest](x: Self) {
    
    inline def setCreateSnapshotBeforeUpdate(value: CreateSnapshotBeforeUpdate): Self = StObject.set(x, "CreateSnapshotBeforeUpdate", value.asInstanceOf[js.Any])
    
    inline def setCreateSnapshotBeforeUpdateUndefined: Self = StObject.set(x, "CreateSnapshotBeforeUpdate", js.undefined)
    
    inline def setDirectoryId(value: DirectoryId): Self = StObject.set(x, "DirectoryId", value.asInstanceOf[js.Any])
    
    inline def setOSUpdateSettings(value: OSUpdateSettings): Self = StObject.set(x, "OSUpdateSettings", value.asInstanceOf[js.Any])
    
    inline def setOSUpdateSettingsUndefined: Self = StObject.set(x, "OSUpdateSettings", js.undefined)
    
    inline def setUpdateType(value: UpdateType): Self = StObject.set(x, "UpdateType", value.asInstanceOf[js.Any])
  }
}
