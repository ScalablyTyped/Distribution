package typings.awsSdk.clientsFrauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregatedVariablesImpactExplanation extends StObject {
  
  /**
    *  The names of all the event variables that were used to derive the aggregated variables. 
    */
  var eventVariableNames: js.UndefOr[ListOfStrings] = js.undefined
  
  /**
    *  The raw, uninterpreted value represented as log-odds of the fraud. These values are usually between -10 to +10, but range from -infinity to +infinity.   A positive value indicates that the variables drove the risk score up.   A negative value indicates that the variables drove the risk score down.  
    */
  var logOddsImpact: js.UndefOr[float] = js.undefined
  
  /**
    *  The relative impact of the aggregated variables in terms of magnitude on the prediction scores. 
    */
  var relativeImpact: js.UndefOr[String] = js.undefined
}
object AggregatedVariablesImpactExplanation {
  
  inline def apply(): AggregatedVariablesImpactExplanation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AggregatedVariablesImpactExplanation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AggregatedVariablesImpactExplanation] (val x: Self) extends AnyVal {
    
    inline def setEventVariableNames(value: ListOfStrings): Self = StObject.set(x, "eventVariableNames", value.asInstanceOf[js.Any])
    
    inline def setEventVariableNamesUndefined: Self = StObject.set(x, "eventVariableNames", js.undefined)
    
    inline def setEventVariableNamesVarargs(value: String*): Self = StObject.set(x, "eventVariableNames", js.Array(value*))
    
    inline def setLogOddsImpact(value: float): Self = StObject.set(x, "logOddsImpact", value.asInstanceOf[js.Any])
    
    inline def setLogOddsImpactUndefined: Self = StObject.set(x, "logOddsImpact", js.undefined)
    
    inline def setRelativeImpact(value: String): Self = StObject.set(x, "relativeImpact", value.asInstanceOf[js.Any])
    
    inline def setRelativeImpactUndefined: Self = StObject.set(x, "relativeImpact", js.undefined)
  }
}
