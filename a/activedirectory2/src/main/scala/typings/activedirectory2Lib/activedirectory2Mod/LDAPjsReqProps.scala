package typings
package activedirectory2Lib.activedirectory2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LDAPjsReqProps extends js.Object {
  var connectionTimeout: js.UndefOr[scala.Double] = js.undefined
  var idleTimeout: js.UndefOr[scala.Double] = js.undefined
  var log: js.UndefOr[js.Any] = js.undefined
  var socketPath: js.UndefOr[java.lang.String] = js.undefined
  var strictDN: js.UndefOr[scala.Boolean] = js.undefined
  var timeout: js.UndefOr[scala.Double] = js.undefined
  var tlsOptions: activedirectory2Lib.Anon_Ca
  var url: java.lang.String
}

object LDAPjsReqProps {
  @scala.inline
  def apply(
    tlsOptions: activedirectory2Lib.Anon_Ca,
    url: java.lang.String,
    connectionTimeout: scala.Int | scala.Double = null,
    idleTimeout: scala.Int | scala.Double = null,
    log: js.Any = null,
    socketPath: java.lang.String = null,
    strictDN: js.UndefOr[scala.Boolean] = js.undefined,
    timeout: scala.Int | scala.Double = null
  ): LDAPjsReqProps = {
    val __obj = js.Dynamic.literal(tlsOptions = tlsOptions, url = url)
    if (connectionTimeout != null) __obj.updateDynamic("connectionTimeout")(connectionTimeout.asInstanceOf[js.Any])
    if (idleTimeout != null) __obj.updateDynamic("idleTimeout")(idleTimeout.asInstanceOf[js.Any])
    if (log != null) __obj.updateDynamic("log")(log)
    if (socketPath != null) __obj.updateDynamic("socketPath")(socketPath)
    if (!js.isUndefined(strictDN)) __obj.updateDynamic("strictDN")(strictDN)
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[LDAPjsReqProps]
  }
}

