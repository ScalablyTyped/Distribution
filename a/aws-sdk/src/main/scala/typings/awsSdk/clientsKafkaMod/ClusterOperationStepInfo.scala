package typings.awsSdk.clientsKafkaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClusterOperationStepInfo extends StObject {
  
  /**
    * 
    The steps current status.
    
    */
  var StepStatus: js.UndefOr[string] = js.undefined
}
object ClusterOperationStepInfo {
  
  inline def apply(): ClusterOperationStepInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClusterOperationStepInfo]
  }
  
  extension [Self <: ClusterOperationStepInfo](x: Self) {
    
    inline def setStepStatus(value: string): Self = StObject.set(x, "StepStatus", value.asInstanceOf[js.Any])
    
    inline def setStepStatusUndefined: Self = StObject.set(x, "StepStatus", js.undefined)
  }
}
