package typings.awsSdk.clientsAccountMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListRegionsRequest extends StObject {
  
  /**
    * Specifies the 12-digit account ID number of the Amazon Web Services account that you want to access or modify with this operation. If you don't specify this parameter, it defaults to the Amazon Web Services account of the identity used to call the operation. To use this parameter, the caller must be an identity in the organization's management account or a delegated administrator account. The specified account ID must also be a member account in the same organization. The organization must have all features enabled, and the organization must have trusted access enabled for the Account Management service, and optionally a delegated admin account assigned.  The management account can't specify its own AccountId. It must call the operation in standalone context by not including the AccountId parameter.  To call this operation on an account that is not a member of an organization, don't specify this parameter. Instead, call the operation using an identity belonging to the account whose contacts you wish to retrieve or modify.
    */
  var AccountId: js.UndefOr[typings.awsSdk.clientsAccountMod.AccountId] = js.undefined
  
  /**
    * The total number of items to return in the command’s output. If the total number of items available is more than the value specified, a NextToken is provided in the command’s output. To resume pagination, provide the NextToken value in the starting-token argument of a subsequent command. Do not use the NextToken response element directly outside of the Amazon Web Services CLI. For usage examples, see Pagination in the Amazon Web Services Command Line Interface User Guide. 
    */
  var MaxResults: js.UndefOr[ListRegionsRequestMaxResultsInteger] = js.undefined
  
  /**
    * A token used to specify where to start paginating. This is the NextToken from a previously truncated response. For usage examples, see Pagination in the Amazon Web Services Command Line Interface User Guide.
    */
  var NextToken: js.UndefOr[ListRegionsRequestNextTokenString] = js.undefined
  
  /**
    * A list of Region statuses (Enabling, Enabled, Disabling, Disabled, Enabled_by_default) to use to filter the list of Regions for a given account. For example, passing in a value of ENABLING will only return a list of Regions with a Region status of ENABLING.
    */
  var RegionOptStatusContains: js.UndefOr[RegionOptStatusList] = js.undefined
}
object ListRegionsRequest {
  
  inline def apply(): ListRegionsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRegionsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListRegionsRequest] (val x: Self) extends AnyVal {
    
    inline def setAccountId(value: AccountId): Self = StObject.set(x, "AccountId", value.asInstanceOf[js.Any])
    
    inline def setAccountIdUndefined: Self = StObject.set(x, "AccountId", js.undefined)
    
    inline def setMaxResults(value: ListRegionsRequestMaxResultsInteger): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: ListRegionsRequestNextTokenString): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setRegionOptStatusContains(value: RegionOptStatusList): Self = StObject.set(x, "RegionOptStatusContains", value.asInstanceOf[js.Any])
    
    inline def setRegionOptStatusContainsUndefined: Self = StObject.set(x, "RegionOptStatusContains", js.undefined)
    
    inline def setRegionOptStatusContainsVarargs(value: RegionOptStatus*): Self = StObject.set(x, "RegionOptStatusContains", js.Array(value*))
  }
}
