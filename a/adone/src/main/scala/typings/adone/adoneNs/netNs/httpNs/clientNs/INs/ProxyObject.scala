package typings.adone.adoneNs.netNs.httpNs.clientNs.INs

import typings.adone.Anon_Password
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProxyObject extends js.Object {
  var auth: js.UndefOr[Anon_Password] = js.undefined
  var host: js.UndefOr[String] = js.undefined
  var port: js.UndefOr[Double] = js.undefined
  var protocol: js.UndefOr[String] = js.undefined
}

object ProxyObject {
  @scala.inline
  def apply(
    auth: Anon_Password = null,
    host: String = null,
    port: Int | Double = null,
    protocol: String = null
  ): ProxyObject = {
    val __obj = js.Dynamic.literal()
    if (auth != null) __obj.updateDynamic("auth")(auth)
    if (host != null) __obj.updateDynamic("host")(host)
    if (port != null) __obj.updateDynamic("port")(port.asInstanceOf[js.Any])
    if (protocol != null) __obj.updateDynamic("protocol")(protocol)
    __obj.asInstanceOf[ProxyObject]
  }
}

