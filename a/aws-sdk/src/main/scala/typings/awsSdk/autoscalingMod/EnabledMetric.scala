package typings.awsSdk.autoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnabledMetric extends StObject {
  
  /**
    * The granularity of the metric. The only valid value is 1Minute.
    */
  var Granularity: js.UndefOr[XmlStringMaxLen255] = js.undefined
  
  /**
    * One of the following metrics:    GroupMinSize     GroupMaxSize     GroupDesiredCapacity     GroupInServiceInstances     GroupPendingInstances     GroupStandbyInstances     GroupTerminatingInstances     GroupTotalInstances     GroupInServiceCapacity     GroupPendingCapacity     GroupStandbyCapacity     GroupTerminatingCapacity     GroupTotalCapacity   
    */
  var Metric: js.UndefOr[XmlStringMaxLen255] = js.undefined
}
object EnabledMetric {
  
  inline def apply(): EnabledMetric = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnabledMetric]
  }
  
  extension [Self <: EnabledMetric](x: Self) {
    
    inline def setGranularity(value: XmlStringMaxLen255): Self = StObject.set(x, "Granularity", value.asInstanceOf[js.Any])
    
    inline def setGranularityUndefined: Self = StObject.set(x, "Granularity", js.undefined)
    
    inline def setMetric(value: XmlStringMaxLen255): Self = StObject.set(x, "Metric", value.asInstanceOf[js.Any])
    
    inline def setMetricUndefined: Self = StObject.set(x, "Metric", js.undefined)
  }
}
