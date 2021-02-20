package typings.awsSdk.amplifyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateBackendEnvironmentResult extends StObject {
  
  /**
    *  Describes the backend environment for an Amplify app. 
    */
  var backendEnvironment: BackendEnvironment = js.native
}
object CreateBackendEnvironmentResult {
  
  @scala.inline
  def apply(backendEnvironment: BackendEnvironment): CreateBackendEnvironmentResult = {
    val __obj = js.Dynamic.literal(backendEnvironment = backendEnvironment.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateBackendEnvironmentResult]
  }
  
  @scala.inline
  implicit class CreateBackendEnvironmentResultMutableBuilder[Self <: CreateBackendEnvironmentResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setBackendEnvironment(value: BackendEnvironment): Self = StObject.set(x, "backendEnvironment", value.asInstanceOf[js.Any])
  }
}
