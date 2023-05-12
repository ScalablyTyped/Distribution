package typings.awsSdk.clientsIottwinmakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteSyncJobRequest extends StObject {
  
  /**
    * The sync source.  Currently the only supported syncSource is SITEWISE . 
    */
  var syncSource: SyncSource
  
  /**
    * The workspace ID.
    */
  var workspaceId: Id
}
object DeleteSyncJobRequest {
  
  inline def apply(syncSource: SyncSource, workspaceId: Id): DeleteSyncJobRequest = {
    val __obj = js.Dynamic.literal(syncSource = syncSource.asInstanceOf[js.Any], workspaceId = workspaceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteSyncJobRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteSyncJobRequest] (val x: Self) extends AnyVal {
    
    inline def setSyncSource(value: SyncSource): Self = StObject.set(x, "syncSource", value.asInstanceOf[js.Any])
    
    inline def setWorkspaceId(value: Id): Self = StObject.set(x, "workspaceId", value.asInstanceOf[js.Any])
  }
}
