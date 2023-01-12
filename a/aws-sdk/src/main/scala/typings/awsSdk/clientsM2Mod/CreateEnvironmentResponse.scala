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
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateEnvironmentResponse] (val x: Self) extends AnyVal {
    
    inline def setEnvironmentId(value: Identifier): Self = StObject.set(x, "environmentId", value.asInstanceOf[js.Any])
  }
}
