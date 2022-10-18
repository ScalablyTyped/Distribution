package typings.awsSdk.clientsFisMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExperimentActionState extends StObject {
  
  /**
    * The reason for the state.
    */
  var reason: js.UndefOr[ExperimentActionStatusReason] = js.undefined
  
  /**
    * The state of the action.
    */
  var status: js.UndefOr[ExperimentActionStatus] = js.undefined
}
object ExperimentActionState {
  
  inline def apply(): ExperimentActionState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExperimentActionState]
  }
  
  extension [Self <: ExperimentActionState](x: Self) {
    
    inline def setReason(value: ExperimentActionStatusReason): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
    
    inline def setStatus(value: ExperimentActionStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
