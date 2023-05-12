package typings.awsSdk.clientsCloudwatchlogsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeLogGroupsRequest extends StObject {
  
  /**
    * When includeLinkedAccounts is set to True, use this parameter to specify the list of accounts to search. You can specify as many as 20 account IDs in the array. 
    */
  var accountIdentifiers: js.UndefOr[AccountIds] = js.undefined
  
  /**
    * If you are using a monitoring account, set this to True to have the operation return log groups in the accounts listed in accountIdentifiers. If this parameter is set to true and accountIdentifiers contains a null value, the operation returns all log groups in the monitoring account and all log groups in all source accounts that are linked to the monitoring account.    If you specify includeLinkedAccounts in your request, then metricFilterCount, retentionInDays, and storedBytes are not included in the response.  
    */
  var includeLinkedAccounts: js.UndefOr[IncludeLinkedAccounts] = js.undefined
  
  /**
    * The maximum number of items returned. If you don't specify a value, the default is up to 50 items.
    */
  var limit: js.UndefOr[DescribeLimit] = js.undefined
  
  /**
    * If you specify a string for this parameter, the operation returns only log groups that have names that match the string based on a case-sensitive substring search. For example, if you specify Foo, log groups named FooBar, aws/Foo, and GroupFoo would match, but foo, F/o/o and Froo would not match.   logGroupNamePattern and logGroupNamePrefix are mutually exclusive. Only one of these parameters can be passed.  
    */
  var logGroupNamePattern: js.UndefOr[LogGroupNamePattern] = js.undefined
  
  /**
    * The prefix to match.   logGroupNamePrefix and logGroupNamePattern are mutually exclusive. Only one of these parameters can be passed.  
    */
  var logGroupNamePrefix: js.UndefOr[LogGroupName] = js.undefined
  
  /**
    * The token for the next set of items to return. (You received this token from a previous call.)
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object DescribeLogGroupsRequest {
  
  inline def apply(): DescribeLogGroupsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeLogGroupsRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeLogGroupsRequest] (val x: Self) extends AnyVal {
    
    inline def setAccountIdentifiers(value: AccountIds): Self = StObject.set(x, "accountIdentifiers", value.asInstanceOf[js.Any])
    
    inline def setAccountIdentifiersUndefined: Self = StObject.set(x, "accountIdentifiers", js.undefined)
    
    inline def setAccountIdentifiersVarargs(value: AccountId*): Self = StObject.set(x, "accountIdentifiers", js.Array(value*))
    
    inline def setIncludeLinkedAccounts(value: IncludeLinkedAccounts): Self = StObject.set(x, "includeLinkedAccounts", value.asInstanceOf[js.Any])
    
    inline def setIncludeLinkedAccountsUndefined: Self = StObject.set(x, "includeLinkedAccounts", js.undefined)
    
    inline def setLimit(value: DescribeLimit): Self = StObject.set(x, "limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "limit", js.undefined)
    
    inline def setLogGroupNamePattern(value: LogGroupNamePattern): Self = StObject.set(x, "logGroupNamePattern", value.asInstanceOf[js.Any])
    
    inline def setLogGroupNamePatternUndefined: Self = StObject.set(x, "logGroupNamePattern", js.undefined)
    
    inline def setLogGroupNamePrefix(value: LogGroupName): Self = StObject.set(x, "logGroupNamePrefix", value.asInstanceOf[js.Any])
    
    inline def setLogGroupNamePrefixUndefined: Self = StObject.set(x, "logGroupNamePrefix", js.undefined)
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
