package typings.awsSdk.clientsIotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListBillingGroupsResponse extends StObject {
  
  /**
    * The list of billing groups.
    */
  var billingGroups: js.UndefOr[BillingGroupNameAndArnList] = js.undefined
  
  /**
    * The token to use to get the next set of results, or null if there are no additional results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListBillingGroupsResponse {
  
  inline def apply(): ListBillingGroupsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBillingGroupsResponse]
  }
  
  extension [Self <: ListBillingGroupsResponse](x: Self) {
    
    inline def setBillingGroups(value: BillingGroupNameAndArnList): Self = StObject.set(x, "billingGroups", value.asInstanceOf[js.Any])
    
    inline def setBillingGroupsUndefined: Self = StObject.set(x, "billingGroups", js.undefined)
    
    inline def setBillingGroupsVarargs(value: GroupNameAndArn*): Self = StObject.set(x, "billingGroups", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
