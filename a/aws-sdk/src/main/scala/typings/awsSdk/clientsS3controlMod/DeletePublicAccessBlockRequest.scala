package typings.awsSdk.clientsS3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeletePublicAccessBlockRequest extends StObject {
  
  /**
    * The account ID for the Amazon Web Services account whose PublicAccessBlock configuration you want to remove.
    */
  var AccountId: typings.awsSdk.clientsS3controlMod.AccountId
}
object DeletePublicAccessBlockRequest {
  
  inline def apply(AccountId: AccountId): DeletePublicAccessBlockRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeletePublicAccessBlockRequest]
  }
  
  extension [Self <: DeletePublicAccessBlockRequest](x: Self) {
    
    inline def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
  }
}
