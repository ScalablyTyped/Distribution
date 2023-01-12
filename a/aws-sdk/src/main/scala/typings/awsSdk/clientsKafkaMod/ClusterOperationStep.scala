package typings.awsSdk.clientsKafkaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterOperationStep extends StObject {
  
  /**
    * 
    Information about the step and its status.
    
    */
  var StepInfo: js.UndefOr[ClusterOperationStepInfo] = js.undefined
  
  /**
    * 
    The name of the step.
    
    */
  var StepName: js.UndefOr[string] = js.undefined
}
object ClusterOperationStep {
  
  inline def apply(): ClusterOperationStep = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterOperationStep]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClusterOperationStep] (val x: Self) extends AnyVal {
    
    inline def setStepInfo(value: ClusterOperationStepInfo): Self = StObject.set(x, "StepInfo", value.asInstanceOf[js.Any])
    
    inline def setStepInfoUndefined: Self = StObject.set(x, "StepInfo", js.undefined)
    
    inline def setStepName(value: string): Self = StObject.set(x, "StepName", value.asInstanceOf[js.Any])
    
    inline def setStepNameUndefined: Self = StObject.set(x, "StepName", js.undefined)
  }
}
