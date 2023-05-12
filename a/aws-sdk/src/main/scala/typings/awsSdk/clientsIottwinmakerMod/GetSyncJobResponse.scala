package typings.awsSdk.clientsIottwinmakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSyncJobResponse extends StObject {
  
  /**
    * The sync job ARN.
    */
  var arn: TwinMakerArn
  
  /**
    * The creation date and time.
    */
  var creationDateTime: js.Date
  
  /**
    * The SyncJob response status.
    */
  var status: SyncJobStatus
  
  /**
    * The sync IAM role.
    */
  var syncRole: RoleArn
  
  /**
    * The sync soucre.  Currently the only supported syncSource is SITEWISE . 
    */
  var syncSource: SyncSource
  
  /**
    * The update date and time.
    */
  var updateDateTime: js.Date
  
  /**
    * The ID of the workspace that contains the sync job.
    */
  var workspaceId: Id
}
object GetSyncJobResponse {
  
  inline def apply(
    arn: TwinMakerArn,
    creationDateTime: js.Date,
    status: SyncJobStatus,
    syncRole: RoleArn,
    syncSource: SyncSource,
    updateDateTime: js.Date,
    workspaceId: Id
  ): GetSyncJobResponse = {
    val __obj = js.Dynamic.literal(arn = arn.asInstanceOf[js.Any], creationDateTime = creationDateTime.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], syncRole = syncRole.asInstanceOf[js.Any], syncSource = syncSource.asInstanceOf[js.Any], updateDateTime = updateDateTime.asInstanceOf[js.Any], workspaceId = workspaceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSyncJobResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetSyncJobResponse] (val x: Self) extends AnyVal {
    
    inline def setArn(value: TwinMakerArn): Self = StObject.set(x, "arn", value.asInstanceOf[js.Any])
    
    inline def setCreationDateTime(value: js.Date): Self = StObject.set(x, "creationDateTime", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: SyncJobStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setSyncRole(value: RoleArn): Self = StObject.set(x, "syncRole", value.asInstanceOf[js.Any])
    
    inline def setSyncSource(value: SyncSource): Self = StObject.set(x, "syncSource", value.asInstanceOf[js.Any])
    
    inline def setUpdateDateTime(value: js.Date): Self = StObject.set(x, "updateDateTime", value.asInstanceOf[js.Any])
    
    inline def setWorkspaceId(value: Id): Self = StObject.set(x, "workspaceId", value.asInstanceOf[js.Any])
  }
}
