package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Subscription extends StObject {
  
  /**
    * The Region or Availability Zone that's the target for the subscription. For example, eu-west-1.
    */
  var Destination: js.UndefOr[String] = js.undefined
  
  /**
    * The metric used for the subscription.
    */
  var Metric: js.UndefOr[MetricType] = js.undefined
  
  /**
    * The data aggregation time for the subscription.
    */
  var Period: js.UndefOr[PeriodType] = js.undefined
  
  /**
    * The Region or Availability Zone that's the source for the subscription. For example, us-east-1.
    */
  var Source: js.UndefOr[String] = js.undefined
  
  /**
    * The statistic used for the subscription.
    */
  var Statistic: js.UndefOr[StatisticType] = js.undefined
}
object Subscription {
  
  inline def apply(): Subscription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Subscription]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Subscription] (val x: Self) extends AnyVal {
    
    inline def setDestination(value: String): Self = StObject.set(x, "Destination", value.asInstanceOf[js.Any])
    
    inline def setDestinationUndefined: Self = StObject.set(x, "Destination", js.undefined)
    
    inline def setMetric(value: MetricType): Self = StObject.set(x, "Metric", value.asInstanceOf[js.Any])
    
    inline def setMetricUndefined: Self = StObject.set(x, "Metric", js.undefined)
    
    inline def setPeriod(value: PeriodType): Self = StObject.set(x, "Period", value.asInstanceOf[js.Any])
    
    inline def setPeriodUndefined: Self = StObject.set(x, "Period", js.undefined)
    
    inline def setSource(value: String): Self = StObject.set(x, "Source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "Source", js.undefined)
    
    inline def setStatistic(value: StatisticType): Self = StObject.set(x, "Statistic", value.asInstanceOf[js.Any])
    
    inline def setStatisticUndefined: Self = StObject.set(x, "Statistic", js.undefined)
  }
}
