package typings.awsSdk.clientsIottwinmakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateSyncJobRequest extends StObject {
  
  /**
    * The SyncJob IAM role. This IAM role is used by the SyncJob to read from the syncSource, and create, update, or delete the corresponding resources.
    */
  var syncRole: RoleArn
  
  /**
    * The sync source.  Currently the only supported syncSoource is SITEWISE . 
    */
  var syncSource: SyncSource
  
  /**
    * The SyncJob tags.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
  
  /**
    * The workspace ID.
    */
  var workspaceId: Id
}
object CreateSyncJobRequest {
  
  inline def apply(syncRole: RoleArn, syncSource: SyncSource, workspaceId: Id): CreateSyncJobRequest = {
    val __obj = js.Dynamic.literal(syncRole = syncRole.asInstanceOf[js.Any], syncSource = syncSource.asInstanceOf[js.Any], workspaceId = workspaceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSyncJobRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateSyncJobRequest] (val x: Self) extends AnyVal {
    
    inline def setSyncRole(value: RoleArn): Self = StObject.set(x, "syncRole", value.asInstanceOf[js.Any])
    
    inline def setSyncSource(value: SyncSource): Self = StObject.set(x, "syncSource", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setWorkspaceId(value: Id): Self = StObject.set(x, "workspaceId", value.asInstanceOf[js.Any])
  }
}
