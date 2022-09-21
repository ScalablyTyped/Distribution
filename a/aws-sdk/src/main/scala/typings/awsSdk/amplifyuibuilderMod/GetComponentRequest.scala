package typings.awsSdk.amplifyuibuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetComponentRequest extends StObject {
  
  /**
    * The unique ID of the Amplify app.
    */
  var appId: String
  
  /**
    * The name of the backend environment that is part of the Amplify app.
    */
  var environmentName: String
  
  /**
    * The unique ID of the component.
    */
  var id: Uuid
}
object GetComponentRequest {
  
  inline def apply(appId: String, environmentName: String, id: Uuid): GetComponentRequest = {
    val __obj = js.Dynamic.literal(appId = appId.asInstanceOf[js.Any], environmentName = environmentName.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetComponentRequest]
  }
  
  extension [Self <: GetComponentRequest](x: Self) {
    
    inline def setAppId(value: String): Self = StObject.set(x, "appId", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentName(value: String): Self = StObject.set(x, "environmentName", value.asInstanceOf[js.Any])
    
    inline def setId(value: Uuid): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
