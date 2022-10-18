package typings.awsSdk.clientsCognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeResourceServerRequest extends StObject {
  
  /**
    * The identifier for the resource server
    */
  var Identifier: ResourceServerIdentifierType
  
  /**
    * The user pool ID for the user pool that hosts the resource server.
    */
  var UserPoolId: UserPoolIdType
}
object DescribeResourceServerRequest {
  
  inline def apply(Identifier: ResourceServerIdentifierType, UserPoolId: UserPoolIdType): DescribeResourceServerRequest = {
    val __obj = js.Dynamic.literal(Identifier = Identifier.asInstanceOf[js.Any], UserPoolId = UserPoolId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeResourceServerRequest]
  }
  
  extension [Self <: DescribeResourceServerRequest](x: Self) {
    
    inline def setIdentifier(value: ResourceServerIdentifierType): Self = StObject.set(x, "Identifier", value.asInstanceOf[js.Any])
    
    inline def setUserPoolId(value: UserPoolIdType): Self = StObject.set(x, "UserPoolId", value.asInstanceOf[js.Any])
  }
}
