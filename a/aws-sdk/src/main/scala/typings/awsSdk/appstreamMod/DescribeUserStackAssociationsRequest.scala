package typings.awsSdk.appstreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeUserStackAssociationsRequest extends StObject {
  
  /**
    * The authentication type for the user who is associated with the stack. You must specify USERPOOL.
    */
  var AuthenticationType: js.UndefOr[typings.awsSdk.appstreamMod.AuthenticationType] = js.undefined
  
  /**
    * The maximum size of each page of results.
    */
  var MaxResults: js.UndefOr[typings.awsSdk.appstreamMod.MaxResults] = js.undefined
  
  /**
    * The pagination token to use to retrieve the next page of results for this operation. If this value is null, it retrieves the first page.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the stack that is associated with the user.
    */
  var StackName: js.UndefOr[String] = js.undefined
  
  /**
    * The email address of the user who is associated with the stack.  Users' email addresses are case-sensitive. 
    */
  var UserName: js.UndefOr[Username] = js.undefined
}
object DescribeUserStackAssociationsRequest {
  
  inline def apply(): DescribeUserStackAssociationsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeUserStackAssociationsRequest]
  }
  
  extension [Self <: DescribeUserStackAssociationsRequest](x: Self) {
    
    inline def setAuthenticationType(value: AuthenticationType): Self = StObject.set(x, "AuthenticationType", value.asInstanceOf[js.Any])
    
    inline def setAuthenticationTypeUndefined: Self = StObject.set(x, "AuthenticationType", js.undefined)
    
    inline def setMaxResults(value: MaxResults): Self = StObject.set(x, "MaxResults", value.asInstanceOf[js.Any])
    
    inline def setMaxResultsUndefined: Self = StObject.set(x, "MaxResults", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setStackName(value: String): Self = StObject.set(x, "StackName", value.asInstanceOf[js.Any])
    
    inline def setStackNameUndefined: Self = StObject.set(x, "StackName", js.undefined)
    
    inline def setUserName(value: Username): Self = StObject.set(x, "UserName", value.asInstanceOf[js.Any])
    
    inline def setUserNameUndefined: Self = StObject.set(x, "UserName", js.undefined)
  }
}
