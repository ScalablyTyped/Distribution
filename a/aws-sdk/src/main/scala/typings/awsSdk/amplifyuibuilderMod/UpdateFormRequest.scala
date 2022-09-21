package typings.awsSdk.amplifyuibuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateFormRequest extends StObject {
  
  /**
    * The unique ID for the Amplify app.
    */
  var appId: String
  
  /**
    * The unique client token.
    */
  var clientToken: js.UndefOr[String] = js.undefined
  
  /**
    * The name of the backend environment that is part of the Amplify app.
    */
  var environmentName: String
  
  /**
    * The unique ID for the form.
    */
  var id: Uuid
  
  /**
    * The request accepts the following data in JSON format.
    */
  var updatedForm: UpdateFormData
}
object UpdateFormRequest {
  
  inline def apply(appId: String, environmentName: String, id: Uuid, updatedForm: UpdateFormData): UpdateFormRequest = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], environmentName = environmentName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], updatedForm = updatedForm.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateFormRequest]
  }
  
  extension [Self <: UpdateFormRequest](x: Self) {
    
    inline def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    
    inline def setClientToken(value: String): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    inline def setEnvironmentName(value: String): Self = StObject.set(x, "environmentName", value.asInstanceOf[js.Any])
    
    inline def setId(value: Uuid): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setUpdatedForm(value: UpdateFormData): Self = StObject.set(x, "updatedForm", value.asInstanceOf[js.Any])
  }
}
