package typings.awsSdk.clientsFrauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregatedLogOddsMetric extends StObject {
  
  /**
    *  The relative importance of the variables in the list to the other event variable. 
    */
  var aggregatedVariablesImportance: float
  
  /**
    *  The names of all the variables. 
    */
  var variableNames: ListOfStrings
}
object AggregatedLogOddsMetric {
  
  inline def apply(aggregatedVariablesImportance: float, variableNames: ListOfStrings): AggregatedLogOddsMetric = {
    val __obj = js.Dynamic.literal(aggregatedVariablesImportance = aggregatedVariablesImportance.asInstanceOf[js.Any], variableNames = variableNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[AggregatedLogOddsMetric]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AggregatedLogOddsMetric] (val x: Self) extends AnyVal {
    
    inline def setAggregatedVariablesImportance(value: float): Self = StObject.set(x, "aggregatedVariablesImportance", value.asInstanceOf[js.Any])
    
    inline def setVariableNames(value: ListOfStrings): Self = StObject.set(x, "variableNames", value.asInstanceOf[js.Any])
    
    inline def setVariableNamesVarargs(value: String*): Self = StObject.set(x, "variableNames", js.Array(value*))
  }
}
