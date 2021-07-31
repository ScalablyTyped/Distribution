package typings.awsSdk.autoscalingMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MetricCollectionType extends StObject {
  
  /**
    * One of the following metrics:    GroupMinSize     GroupMaxSize     GroupDesiredCapacity     GroupInServiceInstances     GroupPendingInstances     GroupStandbyInstances     GroupTerminatingInstances     GroupTotalInstances     GroupInServiceCapacity     GroupPendingCapacity     GroupStandbyCapacity     GroupTerminatingCapacity     GroupTotalCapacity   
    */
  var Metric: js.UndefOr[XmlStringMaxLen255] = js.undefined
}
object MetricCollectionType {
  
  @scala.inline
  def apply(): MetricCollectionType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MetricCollectionType]
  }
  
  @scala.inline
  implicit class MetricCollectionTypeMutableBuilder[Self <: MetricCollectionType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMetric(value: XmlStringMaxLen255): Self = StObject.set(x, "Metric", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricUndefined: Self = StObject.set(x, "Metric", js.undefined)
  }
}
