package typings.awsSdk.clientsHealthMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAffectedAccountsForOrganizationResponse extends StObject {
  
  /**
    * A JSON set of elements of the affected accounts.
    */
  var affectedAccounts: js.UndefOr[affectedAccountsList] = js.undefined
  
  /**
    * This parameter specifies if the Health event is a public Amazon Web Services service event or an account-specific event.   If the eventScopeCode value is PUBLIC, then the affectedAccounts value is always empty.   If the eventScopeCode value is ACCOUNT_SPECIFIC, then the affectedAccounts value lists the affected Amazon Web Services accounts in your organization. For example, if an event affects a service such as Amazon Elastic Compute Cloud and you have Amazon Web Services accounts that use that service, those account IDs appear in the response.   If the eventScopeCode value is NONE, then the eventArn that you specified in the request is invalid or doesn't exist.  
    */
  var eventScopeCode: js.UndefOr[typings.awsSdk.clientsHealthMod.eventScopeCode] = js.undefined
  
  /**
    * If the results of a search are large, only a portion of the results are returned, and a nextToken pagination token is returned in the response. To retrieve the next batch of results, reissue the search request and include the returned token. When all results have been returned, the response does not contain a pagination token value.
    */
  var nextToken: js.UndefOr[typings.awsSdk.clientsHealthMod.nextToken] = js.undefined
}
object DescribeAffectedAccountsForOrganizationResponse {
  
  inline def apply(): DescribeAffectedAccountsForOrganizationResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAffectedAccountsForOrganizationResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeAffectedAccountsForOrganizationResponse] (val x: Self) extends AnyVal {
    
    inline def setAffectedAccounts(value: affectedAccountsList): Self = StObject.set(x, "affectedAccounts", value.asInstanceOf[js.Any])
    
    inline def setAffectedAccountsUndefined: Self = StObject.set(x, "affectedAccounts", js.undefined)
    
    inline def setAffectedAccountsVarargs(value: accountId*): Self = StObject.set(x, "affectedAccounts", js.Array(value*))
    
    inline def setEventScopeCode(value: eventScopeCode): Self = StObject.set(x, "eventScopeCode", value.asInstanceOf[js.Any])
    
    inline def setEventScopeCodeUndefined: Self = StObject.set(x, "eventScopeCode", js.undefined)
    
    inline def setNextToken(value: nextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
