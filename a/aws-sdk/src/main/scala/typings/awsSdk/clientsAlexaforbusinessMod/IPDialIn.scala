package typings.awsSdk.clientsAlexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPDialIn extends StObject {
  
  /**
    * The protocol, including SIP, SIPS, and H323.
    */
  var CommsProtocol: typings.awsSdk.clientsAlexaforbusinessMod.CommsProtocol
  
  /**
    * The IP address.
    */
  var Endpoint: typings.awsSdk.clientsAlexaforbusinessMod.Endpoint
}
object IPDialIn {
  
  inline def apply(CommsProtocol: CommsProtocol, Endpoint: Endpoint): IPDialIn = {
    val __obj = js.Dynamic.literal(CommsProtocol = CommsProtocol.asInstanceOf[js.Any], Endpoint = Endpoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPDialIn]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IPDialIn] (val x: Self) extends AnyVal {
    
    inline def setCommsProtocol(value: CommsProtocol): Self = StObject.set(x, "CommsProtocol", value.asInstanceOf[js.Any])
    
    inline def setEndpoint(value: Endpoint): Self = StObject.set(x, "Endpoint", value.asInstanceOf[js.Any])
  }
}
