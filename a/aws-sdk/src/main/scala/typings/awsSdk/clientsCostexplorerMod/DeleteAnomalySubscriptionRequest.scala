package typings.awsSdk.clientsCostexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteAnomalySubscriptionRequest extends StObject {
  
  /**
    * The unique identifier of the cost anomaly subscription that you want to delete. 
    */
  var SubscriptionArn: GenericString
}
object DeleteAnomalySubscriptionRequest {
  
  inline def apply(SubscriptionArn: GenericString): DeleteAnomalySubscriptionRequest = {
    val __obj = js.Dynamic.literal(SubscriptionArn = SubscriptionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAnomalySubscriptionRequest]
  }
  
  extension [Self <: DeleteAnomalySubscriptionRequest](x: Self) {
    
    inline def setSubscriptionArn(value: GenericString): Self = StObject.set(x, "SubscriptionArn", value.asInstanceOf[js.Any])
  }
}
