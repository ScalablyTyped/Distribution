package typings.awsSdk.clientsAmplifyuibuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ComponentSummary extends StObject {
  
  /**
    * The unique ID of the Amplify app associated with the component.
    */
  var appId: String
  
  /**
    * The component type.
    */
  var componentType: ComponentType
  
  /**
    * The name of the backend environment that is a part of the Amplify app.
    */
  var environmentName: String
  
  /**
    * The unique ID of the component.
    */
  var id: Uuid
  
  /**
    * The name of the component.
    */
  var name: ComponentName
}
object ComponentSummary {
  
  inline def apply(
    appId: String,
    componentType: ComponentType,
    environmentName: String,
    id: Uuid,
    name: ComponentName
  ): ComponentSummary = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], componentType = componentType.asInstanceOf[js.Any], environmentName = environmentName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentSummary]
  }
  
  extension [Self <: ComponentSummary](x: Self) {
    
    inline def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    
    inline def setComponentType(value: ComponentType): Self = StObject.set(x, "componentType", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentName(value: String): Self = StObject.set(x, "environmentName", value.asInstanceOf[js.Any])
    
    inline def setId(value: Uuid): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: ComponentName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
