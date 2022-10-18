package typings.awsSdk.clientsProtonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetEnvironmentOutput extends StObject {
  
  /**
    * The detailed data of the requested environment.
    */
  var environment: Environment
}
object GetEnvironmentOutput {
  
  inline def apply(environment: Environment): GetEnvironmentOutput = {
    val __obj = js.Dynamic.literal(environment = environment.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetEnvironmentOutput]
  }
  
  extension [Self <: GetEnvironmentOutput](x: Self) {
    
    inline def setEnvironment(value: Environment): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
  }
}
