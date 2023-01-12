package typings.awsSdk.clientsProtonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateEnvironmentAccountConnectionOutput extends StObject {
  
  /**
    * The environment account connection detail data that's returned by Proton.
    */
  var environmentAccountConnection: EnvironmentAccountConnection
}
object CreateEnvironmentAccountConnectionOutput {
  
  inline def apply(environmentAccountConnection: EnvironmentAccountConnection): CreateEnvironmentAccountConnectionOutput = {
    val __obj = js.Dynamic.literal(environmentAccountConnection = environmentAccountConnection.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateEnvironmentAccountConnectionOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: CreateEnvironmentAccountConnectionOutput] (val x: Self) extends AnyVal {
    
    inline def setEnvironmentAccountConnection(value: EnvironmentAccountConnection): Self = StObject.set(x, "environmentAccountConnection", value.asInstanceOf[js.Any])
  }
}
