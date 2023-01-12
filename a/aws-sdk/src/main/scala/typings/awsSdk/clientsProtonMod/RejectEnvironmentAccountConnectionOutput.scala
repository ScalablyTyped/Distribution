package typings.awsSdk.clientsProtonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RejectEnvironmentAccountConnectionOutput extends StObject {
  
  /**
    * The environment connection account detail data that's returned by Proton.
    */
  var environmentAccountConnection: EnvironmentAccountConnection
}
object RejectEnvironmentAccountConnectionOutput {
  
  inline def apply(environmentAccountConnection: EnvironmentAccountConnection): RejectEnvironmentAccountConnectionOutput = {
    val __obj = js.Dynamic.literal(environmentAccountConnection = environmentAccountConnection.asInstanceOf[js.Any])
    __obj.asInstanceOf[RejectEnvironmentAccountConnectionOutput]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RejectEnvironmentAccountConnectionOutput] (val x: Self) extends AnyVal {
    
    inline def setEnvironmentAccountConnection(value: EnvironmentAccountConnection): Self = StObject.set(x, "environmentAccountConnection", value.asInstanceOf[js.Any])
  }
}
