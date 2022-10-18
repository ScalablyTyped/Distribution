package typings.awsSdk.clientsAmplifyuibuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateComponentRequest extends StObject {
  
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
    * The unique ID for the component.
    */
  var id: Uuid
  
  /**
    * The configuration of the updated component.
    */
  var updatedComponent: UpdateComponentData
}
object UpdateComponentRequest {
  
  inline def apply(appId: String, environmentName: String, id: Uuid, updatedComponent: UpdateComponentData): UpdateComponentRequest = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], environmentName = environmentName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], updatedComponent = updatedComponent.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateComponentRequest]
  }
  
  extension [Self <: UpdateComponentRequest](x: Self) {
    
    inline def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    
    inline def setClientToken(value: String): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    inline def setEnvironmentName(value: String): Self = StObject.set(x, "environmentName", value.asInstanceOf[js.Any])
    
    inline def setId(value: Uuid): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setUpdatedComponent(value: UpdateComponentData): Self = StObject.set(x, "updatedComponent", value.asInstanceOf[js.Any])
  }
}
