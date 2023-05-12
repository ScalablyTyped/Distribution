package typings.awsSdk.clientsIottwinmakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SyncJobStatus extends StObject {
  
  /**
    * The SyncJob error.
    */
  var error: js.UndefOr[ErrorDetails] = js.undefined
  
  /**
    * The SyncJob status state.
    */
  var state: js.UndefOr[SyncJobState] = js.undefined
}
object SyncJobStatus {
  
  inline def apply(): SyncJobStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SyncJobStatus]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SyncJobStatus] (val x: Self) extends AnyVal {
    
    inline def setError(value: ErrorDetails): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setState(value: SyncJobState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
