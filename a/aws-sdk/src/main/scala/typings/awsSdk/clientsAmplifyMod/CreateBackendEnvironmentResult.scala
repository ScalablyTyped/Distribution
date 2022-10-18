package typings.awsSdk.clientsAmplifyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateBackendEnvironmentResult extends StObject {
  
  /**
    *  Describes the backend environment for an Amplify app. 
    */
  var backendEnvironment: BackendEnvironment
}
object CreateBackendEnvironmentResult {
  
  inline def apply(backendEnvironment: BackendEnvironment): CreateBackendEnvironmentResult = {
    val __obj = js.Dynamic.literal(backendEnvironment = backendEnvironment.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateBackendEnvironmentResult]
  }
  
  extension [Self <: CreateBackendEnvironmentResult](x: Self) {
    
    inline def setBackendEnvironment(value: BackendEnvironment): Self = StObject.set(x, "backendEnvironment", value.asInstanceOf[js.Any])
  }
}
