package typings.awsDashSdk.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPDialIn extends js.Object {
  /**
    * The protocol, including SIP, SIPS, and H323.
    */
  var CommsProtocol: typings.awsDashSdk.clientsAlexaforbusinessMod.CommsProtocol = js.native
  /**
    * The IP address.
    */
  var Endpoint: typings.awsDashSdk.clientsAlexaforbusinessMod.Endpoint = js.native
}

object IPDialIn {
  @scala.inline
  def apply(CommsProtocol: CommsProtocol, Endpoint: Endpoint): IPDialIn = {
    val __obj = js.Dynamic.literal(CommsProtocol = CommsProtocol.asInstanceOf[js.Any], Endpoint = Endpoint.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IPDialIn]
  }
}

