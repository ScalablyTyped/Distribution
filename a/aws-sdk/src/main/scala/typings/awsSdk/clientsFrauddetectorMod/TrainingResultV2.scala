package typings.awsSdk.clientsFrauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TrainingResultV2 extends StObject {
  
  /**
    *  The variable importance metrics of the aggregated variables.  Account Takeover Insights (ATI) model uses event variables from the login data you provide to continuously calculate a set of variables (aggregated variables) based on historical events. For example, your ATI model might calculate the number of times an user has logged in using the same IP address. In this case, event variables used to derive the aggregated variables are IP address and user.
    */
  var aggregatedVariablesImportanceMetrics: js.UndefOr[AggregatedVariablesImportanceMetrics] = js.undefined
  
  var dataValidationMetrics: js.UndefOr[DataValidationMetrics] = js.undefined
  
  /**
    *  The training metric details. 
    */
  var trainingMetricsV2: js.UndefOr[TrainingMetricsV2] = js.undefined
  
  var variableImportanceMetrics: js.UndefOr[VariableImportanceMetrics] = js.undefined
}
object TrainingResultV2 {
  
  inline def apply(): TrainingResultV2 = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TrainingResultV2]
  }
  
  extension [Self <: TrainingResultV2](x: Self) {
    
    inline def setAggregatedVariablesImportanceMetrics(value: AggregatedVariablesImportanceMetrics): Self = StObject.set(x, "aggregatedVariablesImportanceMetrics", value.asInstanceOf[js.Any])
    
    inline def setAggregatedVariablesImportanceMetricsUndefined: Self = StObject.set(x, "aggregatedVariablesImportanceMetrics", js.undefined)
    
    inline def setDataValidationMetrics(value: DataValidationMetrics): Self = StObject.set(x, "dataValidationMetrics", value.asInstanceOf[js.Any])
    
    inline def setDataValidationMetricsUndefined: Self = StObject.set(x, "dataValidationMetrics", js.undefined)
    
    inline def setTrainingMetricsV2(value: TrainingMetricsV2): Self = StObject.set(x, "trainingMetricsV2", value.asInstanceOf[js.Any])
    
    inline def setTrainingMetricsV2Undefined: Self = StObject.set(x, "trainingMetricsV2", js.undefined)
    
    inline def setVariableImportanceMetrics(value: VariableImportanceMetrics): Self = StObject.set(x, "variableImportanceMetrics", value.asInstanceOf[js.Any])
    
    inline def setVariableImportanceMetricsUndefined: Self = StObject.set(x, "variableImportanceMetrics", js.undefined)
  }
}
