package typings.awsSdk.clientsIottwinmakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SyncResourceStatus extends StObject {
  
  /**
    * The status error.
    */
  var error: js.UndefOr[ErrorDetails] = js.undefined
  
  /**
    * The sync resource status state.
    */
  var state: js.UndefOr[SyncResourceState] = js.undefined
}
object SyncResourceStatus {
  
  inline def apply(): SyncResourceStatus = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SyncResourceStatus]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SyncResourceStatus] (val x: Self) extends AnyVal {
    
    inline def setError(value: ErrorDetails): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setState(value: SyncResourceState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
