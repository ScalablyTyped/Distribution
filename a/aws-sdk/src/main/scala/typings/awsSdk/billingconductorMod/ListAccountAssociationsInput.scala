package typings.awsSdk.billingconductorMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAccountAssociationsInput extends StObject {
  
  /**
    *  The preferred billing period to get account associations. 
    */
  var BillingPeriod: js.UndefOr[typings.awsSdk.billingconductorMod.BillingPeriod] = js.undefined
  
  /**
    * The filter on the account ID of the linked account, or any of the following:  MONITORED: linked accounts that are associated to billing groups.  UNMONITORED: linked accounts that are not associated to billing groups.  Billing Group Arn: linked accounts that are associated to the provided billing group Arn. 
    */
  var Filters: js.UndefOr[ListAccountAssociationsFilter] = js.undefined
  
  /**
    *  The pagination token used on subsequent calls to retrieve accounts. 
    */
  var NextToken: js.UndefOr[Token] = js.undefined
}
object ListAccountAssociationsInput {
  
  inline def apply(): ListAccountAssociationsInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAccountAssociationsInput]
  }
  
  extension [Self <: ListAccountAssociationsInput](x: Self) {
    
    inline def setBillingPeriod(value: BillingPeriod): Self = StObject.set(x, "BillingPeriod", value.asInstanceOf[js.Any])
    
    inline def setBillingPeriodUndefined: Self = StObject.set(x, "BillingPeriod", js.undefined)
    
    inline def setFilters(value: ListAccountAssociationsFilter): Self = StObject.set(x, "Filters", value.asInstanceOf[js.Any])
    
    inline def setFiltersUndefined: Self = StObject.set(x, "Filters", js.undefined)
    
    inline def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
