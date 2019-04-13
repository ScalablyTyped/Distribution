package typings
package awsDashSdkLib.clientsAlexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPDialIn extends js.Object {
  /**
    * The protocol, including SIP, SIPS, and H323.
    */
  var CommsProtocol: awsDashSdkLib.clientsAlexaforbusinessMod.CommsProtocol
  /**
    * The IP address.
    */
  var Endpoint: awsDashSdkLib.clientsAlexaforbusinessMod.Endpoint
}

object IPDialIn {
  @scala.inline
  def apply(CommsProtocol: CommsProtocol, Endpoint: Endpoint): IPDialIn = {
    val __obj = js.Dynamic.literal(CommsProtocol = CommsProtocol.asInstanceOf[js.Any], Endpoint = Endpoint)
  
    __obj.asInstanceOf[IPDialIn]
  }
}

