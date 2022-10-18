package typings.awsSdk.clientsGuarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RemoteAccountDetails extends StObject {
  
  /**
    * The Amazon Web Services account ID of the remote API caller.
    */
  var AccountId: js.UndefOr[String] = js.undefined
  
  /**
    * Details on whether the Amazon Web Services account of the remote API caller is related to your GuardDuty environment. If this value is True the API caller is affiliated to your account in some way. If it is False the API caller is from outside your environment.
    */
  var Affiliated: js.UndefOr[Boolean] = js.undefined
}
object RemoteAccountDetails {
  
  inline def apply(): RemoteAccountDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemoteAccountDetails]
  }
  
  extension [Self <: RemoteAccountDetails](x: Self) {
    
    inline def setAccountId(value: String): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "AccountId", js.undefined)
    
    inline def setAffiliated(value: Boolean): Self = StObject.set(x, "Affiliated", value.asInstanceOf[js.Any])
    
    inline def setAffiliatedUndefined: Self = StObject.set(x, "Affiliated", js.undefined)
  }
}
