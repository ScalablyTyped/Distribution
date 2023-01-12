package typings.awsSdk.clientsProtonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteEnvironmentOutput extends StObject {
  
  /**
    * The detailed data of the environment being deleted.
    */
  var environment: js.UndefOr[Environment] = js.undefined
}
object DeleteEnvironmentOutput {
  
  inline def apply(): DeleteEnvironmentOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteEnvironmentOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteEnvironmentOutput] (val x: Self) extends AnyVal {
    
    inline def setEnvironment(value: Environment): Self = StObject.set(x, "environment", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentUndefined: Self = StObject.set(x, "environment", js.undefined)
  }
}
