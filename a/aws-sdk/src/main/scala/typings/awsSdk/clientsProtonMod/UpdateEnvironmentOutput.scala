package typings.awsSdk.clientsProtonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateEnvironmentOutput extends StObject {
  
  /**
    * The environment detail data that's returned by Proton.
    */
  var environment: Environment
}
object UpdateEnvironmentOutput {
  
  inline def apply(environment: Environment): UpdateEnvironmentOutput = {
    val __obj = js.Dynamic.literal(environment = environment.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateEnvironmentOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateEnvironmentOutput] (val x: Self) extends AnyVal {
    
    inline def setEnvironment(value: Environment): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
  }
}
