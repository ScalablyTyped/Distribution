package typings.awsSdk.clientsMwaaMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetEnvironmentOutput extends StObject {
  
  /**
    * An object containing all available details about the environment.
    */
  var Environment: js.UndefOr[typings.awsSdk.clientsMwaaMod.Environment] = js.undefined
}
object GetEnvironmentOutput {
  
  inline def apply(): GetEnvironmentOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetEnvironmentOutput]
  }
  
  extension [Self <: GetEnvironmentOutput](x: Self) {
    
    inline def setEnvironment(value: Environment): Self = StObject.set(x, "Environment", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentUndefined: Self = StObject.set(x, "Environment", js.undefined)
  }
}
