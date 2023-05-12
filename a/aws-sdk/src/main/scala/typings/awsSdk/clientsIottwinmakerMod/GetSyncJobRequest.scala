package typings.awsSdk.clientsIottwinmakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSyncJobRequest extends StObject {
  
  /**
    * The sync source.  Currently the only supported syncSource is SITEWISE . 
    */
  var syncSource: SyncSource
  
  /**
    * The workspace ID.
    */
  var workspaceId: js.UndefOr[Id] = js.undefined
}
object GetSyncJobRequest {
  
  inline def apply(syncSource: SyncSource): GetSyncJobRequest = {
    val __obj = js.Dynamic.literal(syncSource = syncSource.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetSyncJobRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetSyncJobRequest] (val x: Self) extends AnyVal {
    
    inline def setSyncSource(value: SyncSource): Self = StObject.set(x, "syncSource", value.asInstanceOf[js.Any])
    
    inline def setWorkspaceId(value: Id): Self = StObject.set(x, "workspaceId", value.asInstanceOf[js.Any])
    
    inline def setWorkspaceIdUndefined: Self = StObject.set(x, "workspaceId", js.undefined)
  }
}
