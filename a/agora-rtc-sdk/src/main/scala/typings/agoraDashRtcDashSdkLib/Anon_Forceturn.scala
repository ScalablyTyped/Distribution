package typings
package agoraDashRtcDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Forceturn extends js.Object {
  /**
    * Sets whether to force data transfer by TURN Server:
    * - true: Force data transfer.
    * - false: (default) Not to force data transfer.
    */
  var forceturn: js.UndefOr[scala.Boolean] = js.undefined
  /** Your TURN Server password. ASCII characters only, and the string length must be greater than 0 and less than 256 bytes. */
  var password: java.lang.String
  /** The TCP port(s) you want add to TURN Server. Numeric characters only, and the string length must be greater than 0 and less than 256 bytes. */
  var tcpport: js.UndefOr[java.lang.String] = js.undefined
  /** Your TURN Server URL address. ASCII characters only, and the string length must be greater than 0 and less than 256 bytes. */
  var turnServerURL: java.lang.String
  /** The UDP port(s) you want to add to TURN Server. Numeric characters only, and the string length must be greater than 0 and less than 256 bytes. */
  var udpport: java.lang.String
  /** Your TURN Server username. ASCII characters only, and the string length must be greater than 0 and less than 256 bytes. */
  var username: java.lang.String
}

object Anon_Forceturn {
  @scala.inline
  def apply(
    password: java.lang.String,
    turnServerURL: java.lang.String,
    udpport: java.lang.String,
    username: java.lang.String,
    forceturn: js.UndefOr[scala.Boolean] = js.undefined,
    tcpport: java.lang.String = null
  ): Anon_Forceturn = {
    val __obj = js.Dynamic.literal(password = password, turnServerURL = turnServerURL, udpport = udpport, username = username)
    if (!js.isUndefined(forceturn)) __obj.updateDynamic("forceturn")(forceturn)
    if (tcpport != null) __obj.updateDynamic("tcpport")(tcpport)
    __obj.asInstanceOf[Anon_Forceturn]
  }
}

