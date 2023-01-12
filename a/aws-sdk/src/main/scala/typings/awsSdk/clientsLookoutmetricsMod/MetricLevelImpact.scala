package typings.awsSdk.clientsLookoutmetricsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MetricLevelImpact extends StObject {
  
  /**
    * Details about the dimensions that contributed to the anomaly.
    */
  var ContributionMatrix: js.UndefOr[typings.awsSdk.clientsLookoutmetricsMod.ContributionMatrix] = js.undefined
  
  /**
    * The name of the measure.
    */
  var MetricName: js.UndefOr[typings.awsSdk.clientsLookoutmetricsMod.MetricName] = js.undefined
  
  /**
    * The number of anomalous metrics for the measure.
    */
  var NumTimeSeries: js.UndefOr[Integer] = js.undefined
}
object MetricLevelImpact {
  
  inline def apply(): MetricLevelImpact = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetricLevelImpact]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MetricLevelImpact] (val x: Self) extends AnyVal {
    
    inline def setContributionMatrix(value: ContributionMatrix): Self = StObject.set(x, "ContributionMatrix", value.asInstanceOf[js.Any])
    
    inline def setContributionMatrixUndefined: Self = StObject.set(x, "ContributionMatrix", js.undefined)
    
    inline def setMetricName(value: MetricName): Self = StObject.set(x, "MetricName", value.asInstanceOf[js.Any])
    
    inline def setMetricNameUndefined: Self = StObject.set(x, "MetricName", js.undefined)
    
    inline def setNumTimeSeries(value: Integer): Self = StObject.set(x, "NumTimeSeries", value.asInstanceOf[js.Any])
    
    inline def setNumTimeSeriesUndefined: Self = StObject.set(x, "NumTimeSeries", js.undefined)
  }
}
