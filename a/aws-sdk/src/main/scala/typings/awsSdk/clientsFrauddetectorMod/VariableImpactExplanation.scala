package typings.awsSdk.clientsFrauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VariableImpactExplanation extends StObject {
  
  /**
    *  The event variable name. 
    */
  var eventVariableName: js.UndefOr[String] = js.undefined
  
  /**
    *  The raw, uninterpreted value represented as log-odds of the fraud. These values are usually between -10 to +10, but range from - infinity to + infinity.   A positive value indicates that the variable drove the risk score up.   A negative value indicates that the variable drove the risk score down.  
    */
  var logOddsImpact: js.UndefOr[float] = js.undefined
  
  /**
    *  The event variable's relative impact in terms of magnitude on the prediction scores. The relative impact values consist of a numerical rating (0-5, 5 being the highest) and direction (increased/decreased) impact of the fraud risk. 
    */
  var relativeImpact: js.UndefOr[String] = js.undefined
}
object VariableImpactExplanation {
  
  inline def apply(): VariableImpactExplanation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VariableImpactExplanation]
  }
  
  extension [Self <: VariableImpactExplanation](x: Self) {
    
    inline def setEventVariableName(value: String): Self = StObject.set(x, "eventVariableName", value.asInstanceOf[js.Any])
    
    inline def setEventVariableNameUndefined: Self = StObject.set(x, "eventVariableName", js.undefined)
    
    inline def setLogOddsImpact(value: float): Self = StObject.set(x, "logOddsImpact", value.asInstanceOf[js.Any])
    
    inline def setLogOddsImpactUndefined: Self = StObject.set(x, "logOddsImpact", js.undefined)
    
    inline def setRelativeImpact(value: String): Self = StObject.set(x, "relativeImpact", value.asInstanceOf[js.Any])
    
    inline def setRelativeImpactUndefined: Self = StObject.set(x, "relativeImpact", js.undefined)
  }
}
