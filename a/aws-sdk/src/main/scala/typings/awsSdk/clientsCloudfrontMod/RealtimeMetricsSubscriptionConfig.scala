package typings.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RealtimeMetricsSubscriptionConfig extends StObject {
  
  /**
    * A flag that indicates whether additional CloudWatch metrics are enabled for a given CloudFront distribution.
    */
  var RealtimeMetricsSubscriptionStatus: typings.awsSdk.clientsCloudfrontMod.RealtimeMetricsSubscriptionStatus
}
object RealtimeMetricsSubscriptionConfig {
  
  inline def apply(RealtimeMetricsSubscriptionStatus: RealtimeMetricsSubscriptionStatus): RealtimeMetricsSubscriptionConfig = {
    val __obj = js.Dynamic.literal(RealtimeMetricsSubscriptionStatus = RealtimeMetricsSubscriptionStatus.asInstanceOf[js.Any])
    __obj.asInstanceOf[RealtimeMetricsSubscriptionConfig]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RealtimeMetricsSubscriptionConfig] (val x: Self) extends AnyVal {
    
    inline def setRealtimeMetricsSubscriptionStatus(value: RealtimeMetricsSubscriptionStatus): Self = StObject.set(x, "RealtimeMetricsSubscriptionStatus", value.asInstanceOf[js.Any])
  }
}
