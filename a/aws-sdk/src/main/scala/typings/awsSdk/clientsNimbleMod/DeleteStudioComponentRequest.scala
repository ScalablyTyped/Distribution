package typings.awsSdk.clientsNimbleMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteStudioComponentRequest extends StObject {
  
  /**
    * Unique, case-sensitive identifier that you provide to ensure the idempotency of the request. If you don’t specify a client token, the AWS SDK automatically generates a client token and uses it for the request to ensure idempotency.
    */
  var clientToken: js.UndefOr[ClientToken] = js.undefined
  
  /**
    * The studio component ID.
    */
  var studioComponentId: String
  
  /**
    * The studio ID. 
    */
  var studioId: String
}
object DeleteStudioComponentRequest {
  
  inline def apply(studioComponentId: String, studioId: String): DeleteStudioComponentRequest = {
    val __obj = js.Dynamic.literal(studioComponentId = studioComponentId.asInstanceOf[js.Any], studioId = studioId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteStudioComponentRequest]
  }
  
  extension [Self <: DeleteStudioComponentRequest](x: Self) {
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    inline def setStudioComponentId(value: String): Self = StObject.set(x, "studioComponentId", value.asInstanceOf[js.Any])
    
    inline def setStudioId(value: String): Self = StObject.set(x, "studioId", value.asInstanceOf[js.Any])
  }
}
