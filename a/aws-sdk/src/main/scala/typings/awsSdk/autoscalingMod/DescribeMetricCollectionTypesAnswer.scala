package typings.awsSdk.autoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeMetricCollectionTypesAnswer extends StObject {
  
  /**
    * The granularities for the metrics.
    */
  var Granularities: js.UndefOr[MetricGranularityTypes] = js.native
  
  /**
    * One or more metrics.
    */
  var Metrics: js.UndefOr[MetricCollectionTypes] = js.native
}
object DescribeMetricCollectionTypesAnswer {
  
  @scala.inline
  def apply(): DescribeMetricCollectionTypesAnswer = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeMetricCollectionTypesAnswer]
  }
  
  @scala.inline
  implicit class DescribeMetricCollectionTypesAnswerMutableBuilder[Self <: DescribeMetricCollectionTypesAnswer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGranularities(value: MetricGranularityTypes): Self = StObject.set(x, "Granularities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGranularitiesUndefined: Self = StObject.set(x, "Granularities", js.undefined)
    
    @scala.inline
    def setGranularitiesVarargs(value: MetricGranularityType*): Self = StObject.set(x, "Granularities", js.Array(value :_*))
    
    @scala.inline
    def setMetrics(value: MetricCollectionTypes): Self = StObject.set(x, "Metrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricsUndefined: Self = StObject.set(x, "Metrics", js.undefined)
    
    @scala.inline
    def setMetricsVarargs(value: MetricCollectionType*): Self = StObject.set(x, "Metrics", js.Array(value :_*))
  }
}
