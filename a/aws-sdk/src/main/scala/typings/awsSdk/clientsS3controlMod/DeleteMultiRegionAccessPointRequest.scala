package typings.awsSdk.clientsS3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteMultiRegionAccessPointRequest extends StObject {
  
  /**
    * The Amazon Web Services account ID for the owner of the Multi-Region Access Point.
    */
  var AccountId: typings.awsSdk.clientsS3controlMod.AccountId
  
  /**
    * An idempotency token used to identify the request and guarantee that requests are unique.
    */
  var ClientToken: MultiRegionAccessPointClientToken
  
  /**
    * A container element containing details about the Multi-Region Access Point.
    */
  var Details: DeleteMultiRegionAccessPointInput
}
object DeleteMultiRegionAccessPointRequest {
  
  inline def apply(
    AccountId: AccountId,
    ClientToken: MultiRegionAccessPointClientToken,
    Details: DeleteMultiRegionAccessPointInput
  ): DeleteMultiRegionAccessPointRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], ClientToken = ClientToken.asInstanceOf[js.Any], Details = Details.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteMultiRegionAccessPointRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteMultiRegionAccessPointRequest] (val x: Self) extends AnyVal {
    
    inline def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    inline def setClientToken(value: MultiRegionAccessPointClientToken): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setDetails(value: DeleteMultiRegionAccessPointInput): Self = StObject.set(x, "Details", value.asInstanceOf[js.Any])
  }
}
