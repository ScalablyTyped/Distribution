package typings.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetMonitoringSubscriptionRequest extends StObject {
  
  /**
    * The ID of the distribution that you are getting metrics information for.
    */
  var DistributionId: String
}
object GetMonitoringSubscriptionRequest {
  
  inline def apply(DistributionId: String): GetMonitoringSubscriptionRequest = {
    val __obj = js.Dynamic.literal(DistributionId = DistributionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMonitoringSubscriptionRequest]
  }
  
  extension [Self <: GetMonitoringSubscriptionRequest](x: Self) {
    
    inline def setDistributionId(value: String): Self = StObject.set(x, "DistributionId", value.asInstanceOf[js.Any])
  }
}
