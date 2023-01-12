package typings.awsSdk.clientsFisMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExperimentState extends StObject {
  
  /**
    * The reason for the state.
    */
  var reason: js.UndefOr[ExperimentStatusReason] = js.undefined
  
  /**
    * The state of the experiment.
    */
  var status: js.UndefOr[ExperimentStatus] = js.undefined
}
object ExperimentState {
  
  inline def apply(): ExperimentState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ExperimentState]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExperimentState] (val x: Self) extends AnyVal {
    
    inline def setReason(value: ExperimentStatusReason): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
    
    inline def setStatus(value: ExperimentStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "status", js.undefined)
  }
}
