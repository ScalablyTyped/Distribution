package typings.awsSdk.clientsAmplifybackendMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CloneBackendRequest extends StObject {
  
  /**
    * The app ID.
    */
  var AppId: string
  
  /**
    * The name of the backend environment.
    */
  var BackendEnvironmentName: string
  
  /**
    * The name of the destination backend environment to be created.
    */
  var TargetEnvironmentName: string
}
object CloneBackendRequest {
  
  inline def apply(AppId: string, BackendEnvironmentName: string, TargetEnvironmentName: string): CloneBackendRequest = {
    val __obj = js.Dynamic.literal(AppId = AppId.asInstanceOf[js.Any], BackendEnvironmentName = BackendEnvironmentName.asInstanceOf[js.Any], TargetEnvironmentName = TargetEnvironmentName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CloneBackendRequest]
  }
  
  extension [Self <: CloneBackendRequest](x: Self) {
    
    inline def setAppId(value: string): Self = StObject.set(x, "AppId", value.asInstanceOf[js.Any])
    
    inline def setBackendEnvironmentName(value: string): Self = StObject.set(x, "BackendEnvironmentName", value.asInstanceOf[js.Any])
    
    inline def setTargetEnvironmentName(value: string): Self = StObject.set(x, "TargetEnvironmentName", value.asInstanceOf[js.Any])
  }
}
