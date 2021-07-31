package typings.awsSdk.autoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisableMetricsCollectionQuery extends StObject {
  
  /**
    * The name of the Auto Scaling group.
    */
  var AutoScalingGroupName: ResourceName
  
  /**
    * Specifies one or more of the following metrics:    GroupMinSize     GroupMaxSize     GroupDesiredCapacity     GroupInServiceInstances     GroupPendingInstances     GroupStandbyInstances     GroupTerminatingInstances     GroupTotalInstances     GroupInServiceCapacity     GroupPendingCapacity     GroupStandbyCapacity     GroupTerminatingCapacity     GroupTotalCapacity    If you omit this parameter, all metrics are disabled. 
    */
  var Metrics: js.UndefOr[typings.awsSdk.autoscalingMod.Metrics] = js.undefined
}
object DisableMetricsCollectionQuery {
  
  @scala.inline
  def apply(AutoScalingGroupName: ResourceName): DisableMetricsCollectionQuery = {
    val __obj = js.Dynamic.literal(AutoScalingGroupName = AutoScalingGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisableMetricsCollectionQuery]
  }
  
  @scala.inline
  implicit class DisableMetricsCollectionQueryMutableBuilder[Self <: DisableMetricsCollectionQuery] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAutoScalingGroupName(value: ResourceName): Self = StObject.set(x, "AutoScalingGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetrics(value: Metrics): Self = StObject.set(x, "Metrics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricsUndefined: Self = StObject.set(x, "Metrics", js.undefined)
    
    @scala.inline
    def setMetricsVarargs(value: XmlStringMaxLen255*): Self = StObject.set(x, "Metrics", js.Array(value :_*))
  }
}
