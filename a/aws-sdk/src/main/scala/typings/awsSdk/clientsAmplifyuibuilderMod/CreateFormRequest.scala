package typings.awsSdk.clientsAmplifyuibuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateFormRequest extends StObject {
  
  /**
    * The unique ID of the Amplify app to associate with the form.
    */
  var appId: String
  
  /**
    * The unique client token.
    */
  var clientToken: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the backend environment that is a part of the Amplify app.
    */
  var environmentName: String
  
  /**
    * Represents the configuration of the form to create.
    */
  var formToCreate: CreateFormData
}
object CreateFormRequest {
  
  inline def apply(appId: String, environmentName: String, formToCreate: CreateFormData): CreateFormRequest = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], environmentName = environmentName.asInstanceOf[js.Any], formToCreate = formToCreate.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateFormRequest]
  }
  
  extension [Self <: CreateFormRequest](x: Self) {
    
    inline def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    
    inline def setClientToken(value: String): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    inline def setEnvironmentName(value: String): Self = StObject.set(x, "environmentName", value.asInstanceOf[js.Any])
    
    inline def setFormToCreate(value: CreateFormData): Self = StObject.set(x, "formToCreate", value.asInstanceOf[js.Any])
  }
}
