package typings.awsSdk.clientsEc2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EnableAwsNetworkPerformanceMetricSubscriptionRequest extends StObject {
  
  /**
    * The target Region or Availability Zone that the metric subscription is enabled for. For example, eu-west-1.
    */
  var Destination: js.UndefOr[String] = js.undefined
  
  /**
    * Checks whether you have the required permissions for the action, without actually making the request, and provides an error response. If you have the required permissions, the error response is DryRunOperation. Otherwise, it is UnauthorizedOperation.
    */
  var DryRun: js.UndefOr[Boolean] = js.undefined
  
  /**
    * The metric used for the enabled subscription.
    */
  var Metric: js.UndefOr[MetricType] = js.undefined
  
  /**
    * The source Region or Availability Zone that the metric subscription is enabled for. For example, us-east-1.
    */
  var Source: js.UndefOr[String] = js.undefined
  
  /**
    * The statistic used for the enabled subscription.
    */
  var Statistic: js.UndefOr[StatisticType] = js.undefined
}
object EnableAwsNetworkPerformanceMetricSubscriptionRequest {
  
  inline def apply(): EnableAwsNetworkPerformanceMetricSubscriptionRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnableAwsNetworkPerformanceMetricSubscriptionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EnableAwsNetworkPerformanceMetricSubscriptionRequest] (val x: Self) extends AnyVal {
    
    inline def setDestination(value: String): Self = StObject.set(x, "Destination", value.asInstanceOf[js.Any])
    
    inline def setDestinationUndefined: Self = StObject.set(x, "Destination", js.undefined)
    
    inline def setDryRun(value: Boolean): Self = StObject.set(x, "DryRun", value.asInstanceOf[js.Any])
    
    inline def setDryRunUndefined: Self = StObject.set(x, "DryRun", js.undefined)
    
    inline def setMetric(value: MetricType): Self = StObject.set(x, "Metric", value.asInstanceOf[js.Any])
    
    inline def setMetricUndefined: Self = StObject.set(x, "Metric", js.undefined)
    
    inline def setSource(value: String): Self = StObject.set(x, "Source", value.asInstanceOf[js.Any])
    
    inline def setSourceUndefined: Self = StObject.set(x, "Source", js.undefined)
    
    inline def setStatistic(value: StatisticType): Self = StObject.set(x, "Statistic", value.asInstanceOf[js.Any])
    
    inline def setStatisticUndefined: Self = StObject.set(x, "Statistic", js.undefined)
  }
}
