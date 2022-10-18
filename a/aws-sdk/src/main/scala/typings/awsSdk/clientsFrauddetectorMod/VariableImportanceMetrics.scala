package typings.awsSdk.clientsFrauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait VariableImportanceMetrics extends StObject {
  
  /**
    * List of variable metrics.
    */
  var logOddsMetrics: js.UndefOr[ListOfLogOddsMetrics] = js.undefined
}
object VariableImportanceMetrics {
  
  inline def apply(): VariableImportanceMetrics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[VariableImportanceMetrics]
  }
  
  extension [Self <: VariableImportanceMetrics](x: Self) {
    
    inline def setLogOddsMetrics(value: ListOfLogOddsMetrics): Self = StObject.set(x, "logOddsMetrics", value.asInstanceOf[js.Any])
    
    inline def setLogOddsMetricsUndefined: Self = StObject.set(x, "logOddsMetrics", js.undefined)
    
    inline def setLogOddsMetricsVarargs(value: LogOddsMetric*): Self = StObject.set(x, "logOddsMetrics", js.Array(value*))
  }
}
