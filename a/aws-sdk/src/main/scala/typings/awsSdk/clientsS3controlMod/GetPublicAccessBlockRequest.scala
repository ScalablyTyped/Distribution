package typings.awsSdk.clientsS3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetPublicAccessBlockRequest extends StObject {
  
  /**
    * The account ID for the Amazon Web Services account whose PublicAccessBlock configuration you want to retrieve.
    */
  var AccountId: typings.awsSdk.clientsS3controlMod.AccountId
}
object GetPublicAccessBlockRequest {
  
  inline def apply(AccountId: AccountId): GetPublicAccessBlockRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPublicAccessBlockRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetPublicAccessBlockRequest] (val x: Self) extends AnyVal {
    
    inline def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
  }
}
