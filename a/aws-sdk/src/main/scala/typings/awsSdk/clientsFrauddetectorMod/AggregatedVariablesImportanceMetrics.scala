package typings.awsSdk.clientsFrauddetectorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AggregatedVariablesImportanceMetrics extends StObject {
  
  /**
    *  List of variables' metrics. 
    */
  var logOddsMetrics: js.UndefOr[ListOfAggregatedLogOddsMetrics] = js.undefined
}
object AggregatedVariablesImportanceMetrics {
  
  inline def apply(): AggregatedVariablesImportanceMetrics = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AggregatedVariablesImportanceMetrics]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AggregatedVariablesImportanceMetrics] (val x: Self) extends AnyVal {
    
    inline def setLogOddsMetrics(value: ListOfAggregatedLogOddsMetrics): Self = StObject.set(x, "logOddsMetrics", value.asInstanceOf[js.Any])
    
    inline def setLogOddsMetricsUndefined: Self = StObject.set(x, "logOddsMetrics", js.undefined)
    
    inline def setLogOddsMetricsVarargs(value: AggregatedLogOddsMetric*): Self = StObject.set(x, "logOddsMetrics", js.Array(value*))
  }
}
