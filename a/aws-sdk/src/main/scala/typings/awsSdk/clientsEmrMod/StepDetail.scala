package typings.awsSdk.clientsEmrMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StepDetail extends StObject {
  
  /**
    * The description of the step status.
    */
  var ExecutionStatusDetail: StepExecutionStatusDetail
  
  /**
    * The step configuration.
    */
  var StepConfig: typings.awsSdk.clientsEmrMod.StepConfig
}
object StepDetail {
  
  inline def apply(ExecutionStatusDetail: StepExecutionStatusDetail, StepConfig: StepConfig): StepDetail = {
    val __obj = js.Dynamic.literal(ExecutionStatusDetail = ExecutionStatusDetail.asInstanceOf[js.Any], StepConfig = StepConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[StepDetail]
  }
  
  extension [Self <: StepDetail](x: Self) {
    
    inline def setExecutionStatusDetail(value: StepExecutionStatusDetail): Self = StObject.set(x, "ExecutionStatusDetail", value.asInstanceOf[js.Any])
    
    inline def setStepConfig(value: StepConfig): Self = StObject.set(x, "StepConfig", value.asInstanceOf[js.Any])
  }
}
