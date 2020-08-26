package typings.agoraRtcSdk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Forceturn extends js.Object {
  /**
    * Sets whether to force data transfer by TURN Server:
    * - `true`: Force data transfer.
    * - `false`: (default) Not to force data transfer.
    */
  var forceturn: js.UndefOr[Boolean] = js.native
  /** Your TURN Server password. ASCII characters only, and the string length must be greater than 0 and less than 256 bytes. */
  var password: String = js.native
  /** The TCP port(s) you want add to TURN Server. Numeric characters only, and the string length must be greater than 0 and less than 256 bytes. */
  var tcpport: js.UndefOr[String] = js.native
  /** Your TURN Server URL address. ASCII characters only, and the string length must be greater than 0 and less than 256 bytes. */
  var turnServerURL: String = js.native
  /** The UDP port(s) you want to add to TURN Server. Numeric characters only, and the string length must be greater than 0 and less than 256 bytes. */
  var udpport: String = js.native
  /** Your TURN Server username. ASCII characters only, and the string length must be greater than 0 and less than 256 bytes. */
  var username: String = js.native
}

object Forceturn {
  @scala.inline
  def apply(password: String, turnServerURL: String, udpport: String, username: String): Forceturn = {
    val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any], turnServerURL = turnServerURL.asInstanceOf[js.Any], udpport = udpport.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    __obj.asInstanceOf[Forceturn]
  }
  @scala.inline
  implicit class ForceturnOps[Self <: Forceturn] (val x: Self) extends AnyVal {
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
    def setPassword(value: String): Self = this.set("password", value.asInstanceOf[js.Any])
    @scala.inline
    def setTurnServerURL(value: String): Self = this.set("turnServerURL", value.asInstanceOf[js.Any])
    @scala.inline
    def setUdpport(value: String): Self = this.set("udpport", value.asInstanceOf[js.Any])
    @scala.inline
    def setUsername(value: String): Self = this.set("username", value.asInstanceOf[js.Any])
    @scala.inline
    def setForceturn(value: Boolean): Self = this.set("forceturn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteForceturn: Self = this.set("forceturn", js.undefined)
    @scala.inline
    def setTcpport(value: String): Self = this.set("tcpport", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTcpport: Self = this.set("tcpport", js.undefined)
  }
  
}

