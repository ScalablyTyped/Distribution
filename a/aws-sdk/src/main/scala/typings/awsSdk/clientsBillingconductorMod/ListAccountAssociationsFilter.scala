package typings.awsSdk.clientsBillingconductorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAccountAssociationsFilter extends StObject {
  
  /**
    *  The Amazon Web Services account ID to filter on. 
    */
  var AccountId: js.UndefOr[typings.awsSdk.clientsBillingconductorMod.AccountId] = js.undefined
  
  /**
    *  MONITORED: linked accounts that are associated to billing groups.  UNMONITORED: linked accounts that are not associated to billing groups.  Billing Group Arn: linked accounts that are associated to the provided Billing Group Arn. 
    */
  var Association: js.UndefOr[typings.awsSdk.clientsBillingconductorMod.Association] = js.undefined
}
object ListAccountAssociationsFilter {
  
  inline def apply(): ListAccountAssociationsFilter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAccountAssociationsFilter]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListAccountAssociationsFilter] (val x: Self) extends AnyVal {
    
    inline def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "AccountId", js.undefined)
    
    inline def setAssociation(value: Association): Self = StObject.set(x, "Association", value.asInstanceOf[js.Any])
    
    inline def setAssociationUndefined: Self = StObject.set(x, "Association", js.undefined)
  }
}
