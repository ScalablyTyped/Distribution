package typings.awsSdk.appmeshMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PortMapping extends StObject {
  
  /**
    * The port used for the port mapping.
    */
  var port: PortNumber = js.native
  
  /**
    * The protocol used for the port mapping. Specify one protocol.
    */
  var protocol: PortProtocol = js.native
}
object PortMapping {
  
  @scala.inline
  def apply(port: PortNumber, protocol: PortProtocol): PortMapping = {
    val __obj = js.Dynamic.literal(port = port.asInstanceOf[js.Any], protocol = protocol.asInstanceOf[js.Any])
    __obj.asInstanceOf[PortMapping]
  }
  
  @scala.inline
  implicit class PortMappingMutableBuilder[Self <: PortMapping] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPort(value: PortNumber): Self = StObject.set(x, "port", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProtocol(value: PortProtocol): Self = StObject.set(x, "protocol", value.asInstanceOf[js.Any])
  }
}
