package typings
package adoneLib.adoneNs.netNs.httpNs.clientNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProxyObject extends js.Object {
  var auth: js.UndefOr[adoneLib.Anon_Password] = js.undefined
  var host: js.UndefOr[java.lang.String] = js.undefined
  var port: js.UndefOr[scala.Double] = js.undefined
  var protocol: js.UndefOr[java.lang.String] = js.undefined
}

object ProxyObject {
  @scala.inline
  def apply(
    auth: adoneLib.Anon_Password = null,
    host: java.lang.String = null,
    port: scala.Int | scala.Double = null,
    protocol: java.lang.String = null
  ): ProxyObject = {
    val __obj = js.Dynamic.literal()
    if (auth != null) __obj.updateDynamic("auth")(auth)
    if (host != null) __obj.updateDynamic("host")(host)
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol)
    __obj.asInstanceOf[ProxyObject]
  }
}

