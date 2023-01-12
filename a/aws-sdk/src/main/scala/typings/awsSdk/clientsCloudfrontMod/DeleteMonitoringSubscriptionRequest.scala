package typings.awsSdk.clientsCloudfrontMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteMonitoringSubscriptionRequest extends StObject {
  
  /**
    * The ID of the distribution that you are disabling metrics for.
    */
  var DistributionId: String
}
object DeleteMonitoringSubscriptionRequest {
  
  inline def apply(DistributionId: String): DeleteMonitoringSubscriptionRequest = {
    val __obj = js.Dynamic.literal(DistributionId = DistributionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteMonitoringSubscriptionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteMonitoringSubscriptionRequest] (val x: Self) extends AnyVal {
    
    inline def setDistributionId(value: String): Self = StObject.set(x, "DistributionId", value.asInstanceOf[js.Any])
  }
}
