package typings.awsSdk.clientsProtonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteEnvironmentAccountConnectionOutput extends StObject {
  
  /**
    * The detailed data of the environment account connection being deleted.
    */
  var environmentAccountConnection: js.UndefOr[EnvironmentAccountConnection] = js.undefined
}
object DeleteEnvironmentAccountConnectionOutput {
  
  inline def apply(): DeleteEnvironmentAccountConnectionOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteEnvironmentAccountConnectionOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteEnvironmentAccountConnectionOutput] (val x: Self) extends AnyVal {
    
    inline def setEnvironmentAccountConnection(value: EnvironmentAccountConnection): Self = StObject.set(x, "environmentAccountConnection", value.asInstanceOf[js.Any])
    
    inline def setEnvironmentAccountConnectionUndefined: Self = StObject.set(x, "environmentAccountConnection", js.undefined)
  }
}
