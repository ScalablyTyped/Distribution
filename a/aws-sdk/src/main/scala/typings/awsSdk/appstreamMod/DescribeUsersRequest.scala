package typings.awsSdk.appstreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeUsersRequest extends StObject {
  
  /**
    * The authentication type for the users in the user pool to describe. You must specify USERPOOL.
    */
  var AuthenticationType: typings.awsSdk.appstreamMod.AuthenticationType
  
  /**
    * The maximum size of each page of results.
    */
  var MaxResults: js.UndefOr[Integer] = js.undefined
  
  /**
    * The pagination token to use to retrieve the next page of results for this operation. If this value is null, it retrieves the first page.
    */
  var NextToken: js.UndefOr[String] = js.undefined
}
object DescribeUsersRequest {
  
  @scala.inline
  def apply(AuthenticationType: AuthenticationType): DescribeUsersRequest = {
    val __obj = js.Dynamic.literal(AuthenticationType = AuthenticationType.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeUsersRequest]
  }
  
  @scala.inline
  implicit class DescribeUsersRequestMutableBuilder[Self <: DescribeUsersRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuthenticationType(value: AuthenticationType): Self = StObject.set(x, "AuthenticationType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResults(value: Integer): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    @scala.inline
    def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
