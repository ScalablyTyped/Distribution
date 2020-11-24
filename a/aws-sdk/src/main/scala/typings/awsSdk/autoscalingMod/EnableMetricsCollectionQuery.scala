package typings.awsSdk.autoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnableMetricsCollectionQuery extends js.Object {
  
  /**
    * The name of the Auto Scaling group.
    */
  var AutoScalingGroupName: ResourceName = js.native
  
  /**
    * The granularity to associate with the metrics to collect. The only valid value is 1Minute.
    */
  var Granularity: XmlStringMaxLen255 = js.native
  
  /**
    * Specifies which group-level metrics to start collecting. You can specify one or more of the following metrics:    GroupMinSize     GroupMaxSize     GroupDesiredCapacity     GroupInServiceInstances     GroupPendingInstances     GroupStandbyInstances     GroupTerminatingInstances     GroupTotalInstances    The instance weighting feature supports the following additional metrics:     GroupInServiceCapacity     GroupPendingCapacity     GroupStandbyCapacity     GroupTerminatingCapacity     GroupTotalCapacity    If you omit this parameter, all metrics are enabled. 
    */
  var Metrics: js.UndefOr[typings.awsSdk.autoscalingMod.Metrics] = js.native
}
object EnableMetricsCollectionQuery {
  
  @scala.inline
  def apply(AutoScalingGroupName: ResourceName, Granularity: XmlStringMaxLen255): EnableMetricsCollectionQuery = {
    val __obj = js.Dynamic.literal(AutoScalingGroupName = AutoScalingGroupName.asInstanceOf[js.Any], Granularity = Granularity.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnableMetricsCollectionQuery]
  }
  
  @scala.inline
  implicit class EnableMetricsCollectionQueryOps[Self <: EnableMetricsCollectionQuery] (val x: Self) extends AnyVal {
    
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
    def setAutoScalingGroupName(value: ResourceName): Self = this.set("AutoScalingGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGranularity(value: XmlStringMaxLen255): Self = this.set("Granularity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricsVarargs(value: XmlStringMaxLen255*): Self = this.set("Metrics", js.Array(value :_*))
    
    @scala.inline
    def setMetrics(value: Metrics): Self = this.set("Metrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetrics: Self = this.set("Metrics", js.undefined)
  }
}
