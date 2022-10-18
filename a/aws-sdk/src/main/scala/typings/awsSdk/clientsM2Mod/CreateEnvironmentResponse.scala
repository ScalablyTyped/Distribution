package typings.awsSdk.clientsM2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateEnvironmentResponse extends StObject {
  
  /**
    * The identifier of this environment.
    */
  var environmentId: Identifier
}
object CreateEnvironmentResponse {
  
  inline def apply(environmentId: Identifier): CreateEnvironmentResponse = {
    val __obj = js.Dynamic.literal(environmentId = environmentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateEnvironmentResponse]
  }
  
  extension [Self <: CreateEnvironmentResponse](x: Self) {
    
    inline def setEnvironmentId(value: Identifier): Self = StObject.set(x, "environmentId", value.asInstanceOf[js.Any])
  }
}
