package typings.awsSdk.clientsCognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateResourceServerRequest extends StObject {
  
  /**
    * The identifier for the resource server.
    */
  var Identifier: ResourceServerIdentifierType
  
  /**
    * The name of the resource server.
    */
  var Name: ResourceServerNameType
  
  /**
    * The scope values to be set for the resource server.
    */
  var Scopes: js.UndefOr[ResourceServerScopeListType] = js.undefined
  
  /**
    * The user pool ID for the user pool.
    */
  var UserPoolId: UserPoolIdType
}
object UpdateResourceServerRequest {
  
  inline def apply(Identifier: ResourceServerIdentifierType, Name: ResourceServerNameType, UserPoolId: UserPoolIdType): UpdateResourceServerRequest = {
    val __obj = js.Dynamic.literal(Identifier = Identifier.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], UserPoolId = UserPoolId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateResourceServerRequest]
  }
  
  extension [Self <: UpdateResourceServerRequest](x: Self) {
    
    inline def setIdentifier(value: ResourceServerIdentifierType): Self = StObject.set(x, "Identifier", value.asInstanceOf[js.Any])
    
    inline def setName(value: ResourceServerNameType): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setScopes(value: ResourceServerScopeListType): Self = StObject.set(x, "Scopes", value.asInstanceOf[js.Any])
    
    inline def setScopesUndefined: Self = StObject.set(x, "Scopes", js.undefined)
    
    inline def setScopesVarargs(value: ResourceServerScopeType*): Self = StObject.set(x, "Scopes", js.Array(value*))
    
    inline def setUserPoolId(value: UserPoolIdType): Self = StObject.set(x, "UserPoolId", value.asInstanceOf[js.Any])
  }
}
