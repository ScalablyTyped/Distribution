package typings.awsSdk.clientsAppstreamMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeSessionsRequest extends StObject {
  
  /**
    * The authentication method. Specify API for a user authenticated using a streaming URL or SAML for a SAML federated user. The default is to authenticate users using a streaming URL.
    */
  var AuthenticationType: js.UndefOr[typings.awsSdk.clientsAppstreamMod.AuthenticationType] = js.undefined
  
  /**
    * The name of the fleet. This value is case-sensitive.
    */
  var FleetName: String
  
  /**
    * The size of each page of results. The default value is 20 and the maximum value is 50.
    */
  var Limit: js.UndefOr[Integer] = js.undefined
  
  /**
    * The pagination token to use to retrieve the next page of results for this operation. If this value is null, it retrieves the first page.
    */
  var NextToken: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the stack. This value is case-sensitive.
    */
  var StackName: String
  
  /**
    * The user identifier (ID). If you specify a user ID, you must also specify the authentication type.
    */
  var UserId: js.UndefOr[typings.awsSdk.clientsAppstreamMod.UserId] = js.undefined
}
object DescribeSessionsRequest {
  
  inline def apply(FleetName: String, StackName: String): DescribeSessionsRequest = {
    val __obj = js.Dynamic.literal(FleetName = FleetName.asInstanceOf[js.Any], StackName = StackName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeSessionsRequest]
  }
  
  extension [Self <: DescribeSessionsRequest](x: Self) {
    
    inline def setAuthenticationType(value: AuthenticationType): Self = StObject.set(x, "AuthenticationType", value.asInstanceOf[js.Any])
    
    inline def setAuthenticationTypeUndefined: Self = StObject.set(x, "AuthenticationType", js.undefined)
    
    inline def setFleetName(value: String): Self = StObject.set(x, "FleetName", value.asInstanceOf[js.Any])
    
    inline def setLimit(value: Integer): Self = StObject.set(x, "Limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "Limit", js.undefined)
    
    inline def setNextToken(value: String): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setStackName(value: String): Self = StObject.set(x, "StackName", value.asInstanceOf[js.Any])
    
    inline def setUserId(value: UserId): Self = StObject.set(x, "UserId", value.asInstanceOf[js.Any])
    
    inline def setUserIdUndefined: Self = StObject.set(x, "UserId", js.undefined)
  }
}
