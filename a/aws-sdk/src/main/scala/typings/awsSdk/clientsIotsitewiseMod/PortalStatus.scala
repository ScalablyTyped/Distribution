package typings.awsSdk.clientsIotsitewiseMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PortalStatus extends StObject {
  
  /**
    * Contains associated error information, if any.
    */
  var error: js.UndefOr[MonitorErrorDetails] = js.undefined
  
  /**
    * The current state of the portal.
    */
  var state: PortalState
}
object PortalStatus {
  
  inline def apply(state: PortalState): PortalStatus = {
    val __obj = js.Dynamic.literal(state = state.asInstanceOf[js.Any])
    __obj.asInstanceOf[PortalStatus]
  }
  
  extension [Self <: PortalStatus](x: Self) {
    
    inline def setError(value: MonitorErrorDetails): Self = StObject.set(x, "error", value.asInstanceOf[js.Any])
    
    inline def setErrorUndefined: Self = StObject.set(x, "error", js.undefined)
    
    inline def setState(value: PortalState): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
  }
}
