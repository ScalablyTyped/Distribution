package typings.awsSdk.clientsFrauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PredictionExplanations extends StObject {
  
  /**
    *  The details of the aggregated variables impact on the prediction score.  Account Takeover Insights (ATI) model uses event variables from the login data you provide to continuously calculate a set of variables (aggregated variables) based on historical events. For example, your ATI model might calculate the number of times an user has logged in using the same IP address. In this case, event variables used to derive the aggregated variables are IP address and user.
    */
  var aggregatedVariablesImpactExplanations: js.UndefOr[ListOfAggregatedVariablesImpactExplanations] = js.undefined
  
  /**
    *  The details of the event variable's impact on the prediction score. 
    */
  var variableImpactExplanations: js.UndefOr[listOfVariableImpactExplanations] = js.undefined
}
object PredictionExplanations {
  
  inline def apply(): PredictionExplanations = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PredictionExplanations]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PredictionExplanations] (val x: Self) extends AnyVal {
    
    inline def setAggregatedVariablesImpactExplanations(value: ListOfAggregatedVariablesImpactExplanations): Self = StObject.set(x, "aggregatedVariablesImpactExplanations", value.asInstanceOf[js.Any])
    
    inline def setAggregatedVariablesImpactExplanationsUndefined: Self = StObject.set(x, "aggregatedVariablesImpactExplanations", js.undefined)
    
    inline def setAggregatedVariablesImpactExplanationsVarargs(value: AggregatedVariablesImpactExplanation*): Self = StObject.set(x, "aggregatedVariablesImpactExplanations", js.Array(value*))
    
    inline def setVariableImpactExplanations(value: listOfVariableImpactExplanations): Self = StObject.set(x, "variableImpactExplanations", value.asInstanceOf[js.Any])
    
    inline def setVariableImpactExplanationsUndefined: Self = StObject.set(x, "variableImpactExplanations", js.undefined)
    
    inline def setVariableImpactExplanationsVarargs(value: VariableImpactExplanation*): Self = StObject.set(x, "variableImpactExplanations", js.Array(value*))
  }
}
