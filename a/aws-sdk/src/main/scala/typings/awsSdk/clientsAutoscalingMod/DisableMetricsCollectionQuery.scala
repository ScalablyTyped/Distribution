package typings.awsSdk.clientsAutoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisableMetricsCollectionQuery extends StObject {
  
  /**
    * The name of the Auto Scaling group.
    */
  var AutoScalingGroupName: XmlStringMaxLen255
  
  /**
    * Identifies the metrics to disable. You can specify one or more of the following metrics:    GroupMinSize     GroupMaxSize     GroupDesiredCapacity     GroupInServiceInstances     GroupPendingInstances     GroupStandbyInstances     GroupTerminatingInstances     GroupTotalInstances     GroupInServiceCapacity     GroupPendingCapacity     GroupStandbyCapacity     GroupTerminatingCapacity     GroupTotalCapacity     WarmPoolDesiredCapacity     WarmPoolWarmedCapacity     WarmPoolPendingCapacity     WarmPoolTerminatingCapacity     WarmPoolTotalCapacity     GroupAndWarmPoolDesiredCapacity     GroupAndWarmPoolTotalCapacity    If you omit this property, all metrics are disabled. For more information, see Auto Scaling group metrics in the Amazon EC2 Auto Scaling User Guide.
    */
  var Metrics: js.UndefOr[typings.awsSdk.clientsAutoscalingMod.Metrics] = js.undefined
}
object DisableMetricsCollectionQuery {
  
  inline def apply(AutoScalingGroupName: XmlStringMaxLen255): DisableMetricsCollectionQuery = {
    val __obj = js.Dynamic.literal(AutoScalingGroupName = AutoScalingGroupName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisableMetricsCollectionQuery]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DisableMetricsCollectionQuery] (val x: Self) extends AnyVal {
    
    inline def setAutoScalingGroupName(value: XmlStringMaxLen255): Self = StObject.set(x, "AutoScalingGroupName", value.asInstanceOf[js.Any])
    
    inline def setMetrics(value: Metrics): Self = StObject.set(x, "Metrics", value.asInstanceOf[js.Any])
    
    inline def setMetricsUndefined: Self = StObject.set(x, "Metrics", js.undefined)
    
    inline def setMetricsVarargs(value: XmlStringMaxLen255*): Self = StObject.set(x, "Metrics", js.Array(value*))
  }
}
