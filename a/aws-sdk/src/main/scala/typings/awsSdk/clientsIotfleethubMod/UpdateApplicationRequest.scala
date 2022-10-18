package typings.awsSdk.clientsIotfleethubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateApplicationRequest extends StObject {
  
  /**
    * An optional description of the web application.
    */
  var applicationDescription: js.UndefOr[Description] = js.undefined
  
  /**
    * The unique Id of the web application.
    */
  var applicationId: Id
  
  /**
    * The name of the web application.
    */
  var applicationName: js.UndefOr[Name] = js.undefined
  
  /**
    * A unique case-sensitive identifier that you can provide to ensure the idempotency of the request. Don't reuse this client token if a new idempotent request is required.
    */
  var clientToken: js.UndefOr[ClientRequestToken] = js.undefined
}
object UpdateApplicationRequest {
  
  inline def apply(applicationId: Id): UpdateApplicationRequest = {
    val __obj = js.Dynamic.literal(applicationId = applicationId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateApplicationRequest]
  }
  
  extension [Self <: UpdateApplicationRequest](x: Self) {
    
    inline def setApplicationDescription(value: Description): Self = StObject.set(x, "applicationDescription", value.asInstanceOf[js.Any])
    
    inline def setApplicationDescriptionUndefined: Self = StObject.set(x, "applicationDescription", js.undefined)
    
    inline def setApplicationId(value: Id): Self = StObject.set(x, "applicationId", value.asInstanceOf[js.Any])
    
    inline def setApplicationName(value: Name): Self = StObject.set(x, "applicationName", value.asInstanceOf[js.Any])
    
    inline def setApplicationNameUndefined: Self = StObject.set(x, "applicationName", js.undefined)
    
    inline def setClientToken(value: ClientRequestToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
  }
}
