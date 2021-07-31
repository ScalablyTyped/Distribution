package typings.awsSdk.chimeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListAccountsRequest extends StObject {
  
  /**
    * The maximum number of results to return in a single call. Defaults to 100.
    */
  var MaxResults: js.UndefOr[ProfileServiceMaxResults] = js.undefined
  
  /**
    * Amazon Chime account name prefix with which to filter results.
    */
  var Name: js.UndefOr[AccountName] = js.undefined
  
  /**
    * The token to use to retrieve the next page of results.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * User email address with which to filter results.
    */
  var UserEmail: js.UndefOr[EmailAddress] = js.undefined
}
object ListAccountsRequest {
  
  @scala.inline
  def apply(): ListAccountsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListAccountsRequest]
  }
  
  @scala.inline
  implicit class ListAccountsRequestMutableBuilder[Self <: ListAccountsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxResults(value: ProfileServiceMaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setName(value: AccountName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setUserEmail(value: EmailAddress): Self = StObject.set(x, "UserEmail", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserEmailUndefined: Self = StObject.set(x, "UserEmail", js.undefined)
  }
}
