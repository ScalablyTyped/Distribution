package typings.awsSdk.clientsS3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetMultiRegionAccessPointRoutesRequest extends StObject {
  
  /**
    * The Amazon Web Services account ID for the owner of the Multi-Region Access Point.
    */
  var AccountId: typings.awsSdk.clientsS3controlMod.AccountId
  
  /**
    * The Multi-Region Access Point ARN.
    */
  var Mrap: MultiRegionAccessPointId
}
object GetMultiRegionAccessPointRoutesRequest {
  
  inline def apply(AccountId: AccountId, Mrap: MultiRegionAccessPointId): GetMultiRegionAccessPointRoutesRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], Mrap = Mrap.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetMultiRegionAccessPointRoutesRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetMultiRegionAccessPointRoutesRequest] (val x: Self) extends AnyVal {
    
    inline def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    inline def setMrap(value: MultiRegionAccessPointId): Self = StObject.set(x, "Mrap", value.asInstanceOf[js.Any])
  }
}
