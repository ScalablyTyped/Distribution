package typings.awsSdk.clientsS3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateMultiRegionAccessPointRequest extends StObject {
  
  /**
    * The Amazon Web Services account ID for the owner of the Multi-Region Access Point. The owner of the Multi-Region Access Point also must own the underlying buckets.
    */
  var AccountId: typings.awsSdk.clientsS3controlMod.AccountId
  
  /**
    * An idempotency token used to identify the request and guarantee that requests are unique.
    */
  var ClientToken: MultiRegionAccessPointClientToken
  
  /**
    * A container element containing details about the Multi-Region Access Point.
    */
  var Details: CreateMultiRegionAccessPointInput
}
object CreateMultiRegionAccessPointRequest {
  
  inline def apply(
    AccountId: AccountId,
    ClientToken: MultiRegionAccessPointClientToken,
    Details: CreateMultiRegionAccessPointInput
  ): CreateMultiRegionAccessPointRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], ClientToken = ClientToken.asInstanceOf[js.Any], Details = Details.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateMultiRegionAccessPointRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateMultiRegionAccessPointRequest] (val x: Self) extends AnyVal {
    
    inline def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    inline def setClientToken(value: MultiRegionAccessPointClientToken): Self = StObject.set(x, "ClientToken", value.asInstanceOf[js.Any])
    
    inline def setDetails(value: CreateMultiRegionAccessPointInput): Self = StObject.set(x, "Details", value.asInstanceOf[js.Any])
  }
}
