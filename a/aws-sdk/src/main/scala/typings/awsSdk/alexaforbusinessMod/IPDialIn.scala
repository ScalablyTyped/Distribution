package typings.awsSdk.alexaforbusinessMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IPDialIn extends StObject {
  
  /**
    * The protocol, including SIP, SIPS, and H323.
    */
  var CommsProtocol: typings.awsSdk.alexaforbusinessMod.CommsProtocol
  
  /**
    * The IP address.
    */
  var Endpoint: typings.awsSdk.alexaforbusinessMod.Endpoint
}
object IPDialIn {
  
  @scala.inline
  def apply(CommsProtocol: CommsProtocol, Endpoint: Endpoint): IPDialIn = {
    val __obj = js.Dynamic.literal(CommsProtocol = CommsProtocol.asInstanceOf[js.Any], Endpoint = Endpoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPDialIn]
  }
  
  @scala.inline
  implicit class IPDialInMutableBuilder[Self <: IPDialIn] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCommsProtocol(value: CommsProtocol): Self = StObject.set(x, "CommsProtocol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndpoint(value: Endpoint): Self = StObject.set(x, "Endpoint", value.asInstanceOf[js.Any])
  }
}
