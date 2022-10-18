package typings.awsSdk.clientsFrauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait LogOddsMetric extends StObject {
  
  /**
    * The relative importance of the variable. For more information, see Model variable importance.
    */
  var variableImportance: float
  
  /**
    * The name of the variable.
    */
  var variableName: String
  
  /**
    * The type of variable.
    */
  var variableType: String
}
object LogOddsMetric {
  
  inline def apply(variableImportance: float, variableName: String, variableType: String): LogOddsMetric = {
    val __obj = js.Dynamic.literal(variableImportance = variableImportance.asInstanceOf[js.Any], variableName = variableName.asInstanceOf[js.Any], variableType = variableType.asInstanceOf[js.Any])
    __obj.asInstanceOf[LogOddsMetric]
  }
  
  extension [Self <: LogOddsMetric](x: Self) {
    
    inline def setVariableImportance(value: float): Self = StObject.set(x, "variableImportance", value.asInstanceOf[js.Any])
    
    inline def setVariableName(value: String): Self = StObject.set(x, "variableName", value.asInstanceOf[js.Any])
    
    inline def setVariableType(value: String): Self = StObject.set(x, "variableType", value.asInstanceOf[js.Any])
  }
}
