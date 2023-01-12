package typings.awsSdk.clientsCostexplorerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateAnomalySubscriptionResponse extends StObject {
  
  /**
    * The unique identifier of your newly created cost anomaly subscription. 
    */
  var SubscriptionArn: GenericString
}
object CreateAnomalySubscriptionResponse {
  
  inline def apply(SubscriptionArn: GenericString): CreateAnomalySubscriptionResponse = {
    val __obj = js.Dynamic.literal(SubscriptionArn = SubscriptionArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAnomalySubscriptionResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateAnomalySubscriptionResponse] (val x: Self) extends AnyVal {
    
    inline def setSubscriptionArn(value: GenericString): Self = StObject.set(x, "SubscriptionArn", value.asInstanceOf[js.Any])
  }
}
