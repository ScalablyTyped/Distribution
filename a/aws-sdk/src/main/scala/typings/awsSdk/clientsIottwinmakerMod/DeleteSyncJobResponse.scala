package typings.awsSdk.clientsIottwinmakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteSyncJobResponse extends StObject {
  
  /**
    * The SyncJob response state.
    */
  var state: SyncJobState
}
object DeleteSyncJobResponse {
  
  inline def apply(state: SyncJobState): DeleteSyncJobResponse = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteSyncJobResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteSyncJobResponse] (val x: Self) extends AnyVal {
    
    inline def setState(value: SyncJobState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
