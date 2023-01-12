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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateAnomalySubscriptionResponse] (val x: Self) extends AnyVal {
    
    inline def setSubscriptionArn(value: GenericString): Self = StObject.set(x, "SubscriptionArn", value.asInstanceOf[js.Any])
  }
}
