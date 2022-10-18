package typings.awsSdk.clientsFisMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateExperimentTemplateStopConditionInput extends StObject {
  
  /**
    * The source for the stop condition. Specify aws:cloudwatch:alarm if the stop condition is defined by a CloudWatch alarm. Specify none if there is no stop condition.
    */
  var source: StopConditionSource
  
  /**
    * The Amazon Resource Name (ARN) of the CloudWatch alarm.
    */
  var value: js.UndefOr[StopConditionValue] = js.undefined
}
object UpdateExperimentTemplateStopConditionInput {
  
  inline def apply(source: StopConditionSource): UpdateExperimentTemplateStopConditionInput = {
    val __obj = js.Dynamic.literal(source = source.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateExperimentTemplateStopConditionInput]
  }
  
  extension [Self <: UpdateExperimentTemplateStopConditionInput](x: Self) {
    
    inline def setSource(value: StopConditionSource): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
    
    inline def setValue(value: StopConditionValue): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    inline def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
