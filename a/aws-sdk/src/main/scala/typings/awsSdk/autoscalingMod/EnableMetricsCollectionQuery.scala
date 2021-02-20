package typings.awsSdk.autoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EnableMetricsCollectionQuery extends StObject {
  
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
  implicit class EnableMetricsCollectionQueryMutableBuilder[Self <: EnableMetricsCollectionQuery] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoScalingGroupName(value: ResourceName): Self = StObject.set(x, "AutoScalingGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGranularity(value: XmlStringMaxLen255): Self = StObject.set(x, "Granularity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetrics(value: Metrics): Self = StObject.set(x, "Metrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricsUndefined: Self = StObject.set(x, "Metrics", js.undefined)
    
    @scala.inline
    def setMetricsVarargs(value: XmlStringMaxLen255*): Self = StObject.set(x, "Metrics", js.Array(value :_*))
  }
}
