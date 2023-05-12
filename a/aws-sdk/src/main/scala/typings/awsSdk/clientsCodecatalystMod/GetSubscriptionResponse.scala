package typings.awsSdk.clientsCodecatalystMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetSubscriptionResponse extends StObject {
  
  /**
    * The display name of the Amazon Web Services account used for billing for the space.
    */
  var awsAccountName: js.UndefOr[NameString] = js.undefined
  
  /**
    * The type of the billing plan for the space.
    */
  var subscriptionType: js.UndefOr[String] = js.undefined
}
object GetSubscriptionResponse {
  
  inline def apply(): GetSubscriptionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetSubscriptionResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetSubscriptionResponse] (val x: Self) extends AnyVal {
    
    inline def setAwsAccountName(value: NameString): Self = StObject.set(x, "awsAccountName", value.asInstanceOf[js.Any])
    
    inline def setAwsAccountNameUndefined: Self = StObject.set(x, "awsAccountName", js.undefined)
    
    inline def setSubscriptionType(value: String): Self = StObject.set(x, "subscriptionType", value.asInstanceOf[js.Any])
    
    inline def setSubscriptionTypeUndefined: Self = StObject.set(x, "subscriptionType", js.undefined)
  }
}
