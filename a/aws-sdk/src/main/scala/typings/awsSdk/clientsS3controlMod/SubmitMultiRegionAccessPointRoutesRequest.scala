package typings.awsSdk.clientsS3controlMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubmitMultiRegionAccessPointRoutesRequest extends StObject {
  
  /**
    * The Amazon Web Services account ID for the owner of the Multi-Region Access Point.
    */
  var AccountId: typings.awsSdk.clientsS3controlMod.AccountId
  
  /**
    * The Multi-Region Access Point ARN.
    */
  var Mrap: MultiRegionAccessPointId
  
  /**
    * The different routes that make up the new route configuration. Active routes return a value of 100, and passive routes return a value of 0.
    */
  var RouteUpdates: RouteList
}
object SubmitMultiRegionAccessPointRoutesRequest {
  
  inline def apply(AccountId: AccountId, Mrap: MultiRegionAccessPointId, RouteUpdates: RouteList): SubmitMultiRegionAccessPointRoutesRequest = {
    val __obj = js.Dynamic.literal(AccountId = AccountId.asInstanceOf[js.Any], Mrap = Mrap.asInstanceOf[js.Any], RouteUpdates = RouteUpdates.asInstanceOf[js.Any])
    __obj.asInstanceOf[SubmitMultiRegionAccessPointRoutesRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SubmitMultiRegionAccessPointRoutesRequest] (val x: Self) extends AnyVal {
    
    inline def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    inline def setMrap(value: MultiRegionAccessPointId): Self = StObject.set(x, "Mrap", value.asInstanceOf[js.Any])
    
    inline def setRouteUpdates(value: RouteList): Self = StObject.set(x, "RouteUpdates", value.asInstanceOf[js.Any])
    
    inline def setRouteUpdatesVarargs(value: MultiRegionAccessPointRoute*): Self = StObject.set(x, "RouteUpdates", js.Array(value*))
  }
}
