package typings.awsSdk.clientsEmrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AddJobFlowStepsOutput extends StObject {
  
  /**
    * The identifiers of the list of steps added to the job flow.
    */
  var StepIds: js.UndefOr[StepIdsList] = js.undefined
}
object AddJobFlowStepsOutput {
  
  inline def apply(): AddJobFlowStepsOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AddJobFlowStepsOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AddJobFlowStepsOutput] (val x: Self) extends AnyVal {
    
    inline def setStepIds(value: StepIdsList): Self = StObject.set(x, "StepIds", value.asInstanceOf[js.Any])
    
    inline def setStepIdsUndefined: Self = StObject.set(x, "StepIds", js.undefined)
    
    inline def setStepIdsVarargs(value: XmlStringMaxLen256*): Self = StObject.set(x, "StepIds", js.Array(value*))
  }
}
