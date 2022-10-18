package typings.awsSdk.clientsAutoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MetricCollectionType extends StObject {
  
  /**
    * One of the following metrics:    GroupMinSize     GroupMaxSize     GroupDesiredCapacity     GroupInServiceInstances     GroupPendingInstances     GroupStandbyInstances     GroupTerminatingInstances     GroupTotalInstances     GroupInServiceCapacity     GroupPendingCapacity     GroupStandbyCapacity     GroupTerminatingCapacity     GroupTotalCapacity     WarmPoolDesiredCapacity     WarmPoolWarmedCapacity     WarmPoolPendingCapacity     WarmPoolTerminatingCapacity     WarmPoolTotalCapacity     GroupAndWarmPoolDesiredCapacity     GroupAndWarmPoolTotalCapacity   
    */
  var Metric: js.UndefOr[XmlStringMaxLen255] = js.undefined
}
object MetricCollectionType {
  
  inline def apply(): MetricCollectionType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetricCollectionType]
  }
  
  extension [Self <: MetricCollectionType](x: Self) {
    
    inline def setMetric(value: XmlStringMaxLen255): Self = StObject.set(x, "Metric", value.asInstanceOf[js.Any])
    
    inline def setMetricUndefined: Self = StObject.set(x, "Metric", js.undefined)
  }
}
