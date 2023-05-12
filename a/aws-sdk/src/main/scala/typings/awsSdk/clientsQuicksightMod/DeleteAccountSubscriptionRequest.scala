package typings.awsSdk.clientsQuicksightMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteAccountSubscriptionRequest extends StObject {
  
  /**
    * The Amazon Web Services account ID of the account that you want to delete.
    */
  var AwsAccountId: typings.awsSdk.clientsQuicksightMod.AwsAccountId
}
object DeleteAccountSubscriptionRequest {
  
  inline def apply(AwsAccountId: AwsAccountId): DeleteAccountSubscriptionRequest = {
    val __obj = js.Dynamic.literal(AwsAccountId = AwsAccountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAccountSubscriptionRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteAccountSubscriptionRequest] (val x: Self) extends AnyVal {
    
    inline def setAwsAccountId(value: AwsAccountId): Self = StObject.set(x, "AwsAccountId", value.asInstanceOf[js.Any])
  }
}
