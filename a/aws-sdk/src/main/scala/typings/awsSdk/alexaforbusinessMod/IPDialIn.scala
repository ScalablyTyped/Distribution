package typings.awsSdk.alexaforbusinessMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IPDialIn extends js.Object {
  /**
    * The protocol, including SIP, SIPS, and H323.
    */
  var CommsProtocol: typings.awsSdk.alexaforbusinessMod.CommsProtocol = js.native
  /**
    * The IP address.
    */
  var Endpoint: typings.awsSdk.alexaforbusinessMod.Endpoint = js.native
}

object IPDialIn {
  @scala.inline
  def apply(CommsProtocol: CommsProtocol, Endpoint: Endpoint): IPDialIn = {
    val __obj = js.Dynamic.literal(CommsProtocol = CommsProtocol.asInstanceOf[js.Any], Endpoint = Endpoint.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPDialIn]
  }
  @scala.inline
  implicit class IPDialInOps[Self <: IPDialIn] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCommsProtocol(value: CommsProtocol): Self = this.set("CommsProtocol", value.asInstanceOf[js.Any])
    @scala.inline
    def setEndpoint(value: Endpoint): Self = this.set("Endpoint", value.asInstanceOf[js.Any])
  }
  
}

