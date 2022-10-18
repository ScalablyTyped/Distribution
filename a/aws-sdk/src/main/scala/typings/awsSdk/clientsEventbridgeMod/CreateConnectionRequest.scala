package typings.awsSdk.clientsEventbridgeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateConnectionRequest extends StObject {
  
  /**
    * A CreateConnectionAuthRequestParameters object that contains the authorization parameters to use to authorize with the endpoint. 
    */
  var AuthParameters: CreateConnectionAuthRequestParameters
  
  /**
    * The type of authorization to use for the connection.
    */
  var AuthorizationType: ConnectionAuthorizationType
  
  /**
    * A description for the connection to create.
    */
  var Description: js.UndefOr[ConnectionDescription] = js.undefined
  
  /**
    * The name for the connection to create.
    */
  var Name: ConnectionName
}
object CreateConnectionRequest {
  
  inline def apply(
    AuthParameters: CreateConnectionAuthRequestParameters,
    AuthorizationType: ConnectionAuthorizationType,
    Name: ConnectionName
  ): CreateConnectionRequest = {
    val __obj = js.Dynamic.literal(AuthParameters = AuthParameters.asInstanceOf[js.Any], AuthorizationType = AuthorizationType.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateConnectionRequest]
  }
  
  extension [Self <: CreateConnectionRequest](x: Self) {
    
    inline def setAuthParameters(value: CreateConnectionAuthRequestParameters): Self = StObject.set(x, "AuthParameters", value.asInstanceOf[js.Any])
    
    inline def setAuthorizationType(value: ConnectionAuthorizationType): Self = StObject.set(x, "AuthorizationType", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: ConnectionDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setName(value: ConnectionName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
