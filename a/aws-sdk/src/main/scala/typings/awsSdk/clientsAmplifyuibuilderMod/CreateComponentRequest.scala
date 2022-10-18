package typings.awsSdk.clientsAmplifyuibuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateComponentRequest extends StObject {
  
  /**
    * The unique ID of the Amplify app to associate with the component.
    */
  var appId: String
  
  /**
    * The unique client token.
    */
  var clientToken: js.UndefOr[String] = js.undefined
  
  /**
    * Represents the configuration of the component to create.
    */
  var componentToCreate: CreateComponentData
  
  /**
    * The name of the backend environment that is a part of the Amplify app.
    */
  var environmentName: String
}
object CreateComponentRequest {
  
  inline def apply(appId: String, componentToCreate: CreateComponentData, environmentName: String): CreateComponentRequest = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], componentToCreate = componentToCreate.asInstanceOf[js.Any], environmentName = environmentName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateComponentRequest]
  }
  
  extension [Self <: CreateComponentRequest](x: Self) {
    
    inline def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    
    inline def setClientToken(value: String): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    inline def setComponentToCreate(value: CreateComponentData): Self = StObject.set(x, "componentToCreate", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentName(value: String): Self = StObject.set(x, "environmentName", value.asInstanceOf[js.Any])
  }
}
