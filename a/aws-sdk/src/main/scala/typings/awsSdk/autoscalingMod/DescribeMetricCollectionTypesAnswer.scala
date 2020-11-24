package typings.awsSdk.autoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeMetricCollectionTypesAnswer extends js.Object {
  
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
  implicit class DescribeMetricCollectionTypesAnswerOps[Self <: DescribeMetricCollectionTypesAnswer] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setGranularitiesVarargs(value: MetricGranularityType*): Self = this.set("Granularities", js.Array(value :_*))
    
    @scala.inline
    def setGranularities(value: MetricGranularityTypes): Self = this.set("Granularities", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGranularities: Self = this.set("Granularities", js.undefined)
    
    @scala.inline
    def setMetricsVarargs(value: MetricCollectionType*): Self = this.set("Metrics", js.Array(value :_*))
    
    @scala.inline
    def setMetrics(value: MetricCollectionTypes): Self = this.set("Metrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetrics: Self = this.set("Metrics", js.undefined)
  }
}
