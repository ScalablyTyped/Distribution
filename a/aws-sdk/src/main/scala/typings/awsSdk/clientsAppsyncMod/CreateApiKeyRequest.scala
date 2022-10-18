package typings.awsSdk.clientsAppsyncMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateApiKeyRequest extends StObject {
  
  /**
    * The ID for your GraphQL API.
    */
  var apiId: String
  
  /**
    * A description of the purpose of the API key.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * From the creation time, the time after which the API key expires. The date is represented as seconds since the epoch, rounded down to the nearest hour. The default value for this parameter is 7 days from creation time. For more information, see .
    */
  var expires: js.UndefOr[Long] = js.undefined
}
object CreateApiKeyRequest {
  
  inline def apply(apiId: String): CreateApiKeyRequest = {
    val __obj = js.Dynamic.literal(apiId = apiId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateApiKeyRequest]
  }
  
  extension [Self <: CreateApiKeyRequest](x: Self) {
    
    inline def setApiId(value: String): Self = StObject.set(x, "apiId", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setExpires(value: Long): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
    
    inline def setExpiresUndefined: Self = StObject.set(x, "expires", js.undefined)
  }
}
