package typings
package agoraDashRtcDashSdkLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Forceturn extends js.Object {
  var forceturn: scala.Boolean
  var password: java.lang.String
  var tcpport: java.lang.String
  var turnServerURL: java.lang.String
  var udpport: java.lang.String
  var username: java.lang.String
}

object Anon_Forceturn {
  @scala.inline
  def apply(
    forceturn: scala.Boolean,
    password: java.lang.String,
    tcpport: java.lang.String,
    turnServerURL: java.lang.String,
    udpport: java.lang.String,
    username: java.lang.String
  ): Anon_Forceturn = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("forceturn")(forceturn)
    __obj.updateDynamic("password")(password)
    __obj.updateDynamic("tcpport")(tcpport)
    __obj.updateDynamic("turnServerURL")(turnServerURL)
    __obj.updateDynamic("udpport")(udpport)
    __obj.updateDynamic("username")(username)
    __obj.asInstanceOf[Anon_Forceturn]
  }
}

