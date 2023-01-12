package typings.awsSdk.clientsCodepipelineMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StopExecutionTrigger extends StObject {
  
  /**
    * The user-specified reason the pipeline was stopped.
    */
  var reason: js.UndefOr[StopPipelineExecutionReason] = js.undefined
}
object StopExecutionTrigger {
  
  inline def apply(): StopExecutionTrigger = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StopExecutionTrigger]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: StopExecutionTrigger] (val x: Self) extends AnyVal {
    
    inline def setReason(value: StopPipelineExecutionReason): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    
    inline def setReasonUndefined: Self = StObject.set(x, "reason", js.undefined)
  }
}
