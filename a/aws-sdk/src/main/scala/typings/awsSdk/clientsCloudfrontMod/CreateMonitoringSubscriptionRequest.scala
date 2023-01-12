package typings.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateMonitoringSubscriptionRequest extends StObject {
  
  /**
    * The ID of the distribution that you are enabling metrics for.
    */
  var DistributionId: String
  
  /**
    * A monitoring subscription. This structure contains information about whether additional CloudWatch metrics are enabled for a given CloudFront distribution.
    */
  var MonitoringSubscription: typings.awsSdk.clientsCloudfrontMod.MonitoringSubscription
}
object CreateMonitoringSubscriptionRequest {
  
  inline def apply(DistributionId: String, MonitoringSubscription: MonitoringSubscription): CreateMonitoringSubscriptionRequest = {
    val __obj = js.Dynamic.literal(DistributionId = DistributionId.asInstanceOf[js.Any], MonitoringSubscription = MonitoringSubscription.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateMonitoringSubscriptionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateMonitoringSubscriptionRequest] (val x: Self) extends AnyVal {
    
    inline def setDistributionId(value: String): Self = StObject.set(x, "DistributionId", value.asInstanceOf[js.Any])
    
    inline def setMonitoringSubscription(value: MonitoringSubscription): Self = StObject.set(x, "MonitoringSubscription", value.asInstanceOf[js.Any])
  }
}
