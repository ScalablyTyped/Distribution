package typings.awsSdk.clientsS3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutPublicAccessBlockRequest extends StObject {
  
  /**
    * The account ID for the Amazon Web Services account whose PublicAccessBlock configuration you want to set.
    */
  var AccountId: typings.awsSdk.clientsS3controlMod.AccountId
  
  /**
    * The PublicAccessBlock configuration that you want to apply to the specified Amazon Web Services account.
    */
  var PublicAccessBlockConfiguration: typings.awsSdk.clientsS3controlMod.PublicAccessBlockConfiguration
}
object PutPublicAccessBlockRequest {
  
  inline def apply(AccountId: AccountId, PublicAccessBlockConfiguration: PublicAccessBlockConfiguration): PutPublicAccessBlockRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], PublicAccessBlockConfiguration = PublicAccessBlockConfiguration.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutPublicAccessBlockRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutPublicAccessBlockRequest] (val x: Self) extends AnyVal {
    
    inline def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    inline def setPublicAccessBlockConfiguration(value: PublicAccessBlockConfiguration): Self = StObject.set(x, "PublicAccessBlockConfiguration", value.asInstanceOf[js.Any])
  }
}
