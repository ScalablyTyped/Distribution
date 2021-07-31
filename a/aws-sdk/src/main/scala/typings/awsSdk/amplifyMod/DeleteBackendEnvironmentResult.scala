package typings.awsSdk.amplifyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteBackendEnvironmentResult extends StObject {
  
  /**
    *  Describes the backend environment for an Amplify app. 
    */
  var backendEnvironment: BackendEnvironment
}
object DeleteBackendEnvironmentResult {
  
  @scala.inline
  def apply(backendEnvironment: BackendEnvironment): DeleteBackendEnvironmentResult = {
    val __obj = js.Dynamic.literal(backendEnvironment = backendEnvironment.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteBackendEnvironmentResult]
  }
  
  @scala.inline
  implicit class DeleteBackendEnvironmentResultMutableBuilder[Self <: DeleteBackendEnvironmentResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackendEnvironment(value: BackendEnvironment): Self = StObject.set(x, "backendEnvironment", value.asInstanceOf[js.Any])
  }
}
