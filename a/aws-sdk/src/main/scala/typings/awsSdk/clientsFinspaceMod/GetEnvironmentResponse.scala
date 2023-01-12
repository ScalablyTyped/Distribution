package typings.awsSdk.clientsFinspaceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetEnvironmentResponse extends StObject {
  
  /**
    * The name of the FinSpace environment.
    */
  var environment: js.UndefOr[Environment] = js.undefined
}
object GetEnvironmentResponse {
  
  inline def apply(): GetEnvironmentResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetEnvironmentResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetEnvironmentResponse] (val x: Self) extends AnyVal {
    
    inline def setEnvironment(value: Environment): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentUndefined: Self = StObject.set(x, "environment", js.undefined)
  }
}
