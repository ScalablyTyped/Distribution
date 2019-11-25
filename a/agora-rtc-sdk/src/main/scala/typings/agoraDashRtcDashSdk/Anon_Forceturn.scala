package typings.agoraDashRtcDashSdk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Forceturn extends js.Object {
  /**
    * Sets whether to force data transfer by TURN Server:
    * - true: Force data transfer.
    * - false: (default) Not to force data transfer.
    */
  var forceturn: js.UndefOr[Boolean] = js.undefined
  /** Your TURN Server password. ASCII characters only, and the string length must be greater than 0 and less than 256 bytes. */
  var password: String
  /** The TCP port(s) you want add to TURN Server. Numeric characters only, and the string length must be greater than 0 and less than 256 bytes. */
  var tcpport: js.UndefOr[String] = js.undefined
  /** Your TURN Server URL address. ASCII characters only, and the string length must be greater than 0 and less than 256 bytes. */
  var turnServerURL: String
  /** The UDP port(s) you want to add to TURN Server. Numeric characters only, and the string length must be greater than 0 and less than 256 bytes. */
  var udpport: String
  /** Your TURN Server username. ASCII characters only, and the string length must be greater than 0 and less than 256 bytes. */
  var username: String
}

object Anon_Forceturn {
  @scala.inline
  def apply(
    password: String,
    turnServerURL: String,
    udpport: String,
    username: String,
    forceturn: js.UndefOr[Boolean] = js.undefined,
    tcpport: String = null
  ): Anon_Forceturn = {
    val __obj = js.Dynamic.literal(password = password.asInstanceOf[js.Any], turnServerURL = turnServerURL.asInstanceOf[js.Any], udpport = udpport.asInstanceOf[js.Any], username = username.asInstanceOf[js.Any])
    if (!js.isUndefined(forceturn)) __obj.updateDynamic("forceturn")(forceturn.asInstanceOf[js.Any])
    if (tcpport != null) __obj.updateDynamic("tcpport")(tcpport.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Forceturn]
  }
}

