package typings.awsSdk.clientsEventbridgeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateConnectionRequest extends StObject {
  
  /**
    * The authorization parameters to use for the connection.
    */
  var AuthParameters: js.UndefOr[UpdateConnectionAuthRequestParameters] = js.undefined
  
  /**
    * The type of authorization to use for the connection.
    */
  var AuthorizationType: js.UndefOr[ConnectionAuthorizationType] = js.undefined
  
  /**
    * A description for the connection.
    */
  var Description: js.UndefOr[ConnectionDescription] = js.undefined
  
  /**
    * The name of the connection to update.
    */
  var Name: ConnectionName
}
object UpdateConnectionRequest {
  
  inline def apply(Name: ConnectionName): UpdateConnectionRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateConnectionRequest]
  }
  
  extension [Self <: UpdateConnectionRequest](x: Self) {
    
    inline def setAuthParameters(value: UpdateConnectionAuthRequestParameters): Self = StObject.set(x, "AuthParameters", value.asInstanceOf[js.Any])
    
    inline def setAuthParametersUndefined: Self = StObject.set(x, "AuthParameters", js.undefined)
    
    inline def setAuthorizationType(value: ConnectionAuthorizationType): Self = StObject.set(x, "AuthorizationType", value.asInstanceOf[js.Any])
    
    inline def setAuthorizationTypeUndefined: Self = StObject.set(x, "AuthorizationType", js.undefined)
    
    inline def setDescription(value: ConnectionDescription): Self = StObject.set(x, "Description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "Description", js.undefined)
    
    inline def setName(value: ConnectionName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
  }
}
