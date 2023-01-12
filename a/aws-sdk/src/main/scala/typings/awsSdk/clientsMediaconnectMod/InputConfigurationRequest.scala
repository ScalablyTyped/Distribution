package typings.awsSdk.clientsMediaconnectMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait InputConfigurationRequest extends StObject {
  
  /**
    * The port that you want the flow to listen on for an incoming media stream.
    */
  var InputPort: integer
  
  /**
    * The VPC interface that you want to use for the incoming media stream.
    */
  var Interface: InterfaceRequest
}
object InputConfigurationRequest {
  
  inline def apply(InputPort: integer, Interface: InterfaceRequest): InputConfigurationRequest = {
    val __obj = js.Dynamic.literal(InputPort = InputPort.asInstanceOf[js.Any], Interface = Interface.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputConfigurationRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: InputConfigurationRequest] (val x: Self) extends AnyVal {
    
    inline def setInputPort(value: integer): Self = StObject.set(x, "InputPort", value.asInstanceOf[js.Any])
    
    inline def setInterface(value: InterfaceRequest): Self = StObject.set(x, "Interface", value.asInstanceOf[js.Any])
  }
}
