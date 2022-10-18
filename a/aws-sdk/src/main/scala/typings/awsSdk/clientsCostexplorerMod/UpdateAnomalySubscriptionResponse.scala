package typings.awsSdk.clientsCostexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateAnomalySubscriptionResponse extends StObject {
  
  /**
    * A cost anomaly subscription ARN. 
    */
  var SubscriptionArn: GenericString
}
object UpdateAnomalySubscriptionResponse {
  
  inline def apply(SubscriptionArn: GenericString): UpdateAnomalySubscriptionResponse = {
    val __obj = js.Dynamic.literal(SubscriptionArn = SubscriptionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAnomalySubscriptionResponse]
  }
  
  extension [Self <: UpdateAnomalySubscriptionResponse](x: Self) {
    
    inline def setSubscriptionArn(value: GenericString): Self = StObject.set(x, "SubscriptionArn", value.asInstanceOf[js.Any])
  }
}
