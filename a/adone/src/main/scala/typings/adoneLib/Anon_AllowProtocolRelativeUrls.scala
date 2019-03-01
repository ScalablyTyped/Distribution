package typings
package adoneLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AllowProtocolRelativeUrls extends js.Object {
  /**
    * Whether to allow urls like "//example.com", default `false`
    */
  var allowProtocolRelativeUrls: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * List of valid protocols.
    * Used when requireValidProtocol is `true`.
    * Default ["http", "https", "ftp"]
    */
  var protocols: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  /**
    * Whether to require host, default `true`
    */
  var requireHost: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether to require protocol, default `true`
    */
  var requireProtocol: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Whether to require valid protocol defined in `protocols` options, default `true`
    */
  var requireValidProtocol: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_AllowProtocolRelativeUrls {
  @scala.inline
  def apply(
    allowProtocolRelativeUrls: js.UndefOr[scala.Boolean] = js.undefined,
    protocols: js.Array[java.lang.String] = null,
    requireHost: js.UndefOr[scala.Boolean] = js.undefined,
    requireProtocol: js.UndefOr[scala.Boolean] = js.undefined,
    requireValidProtocol: js.UndefOr[scala.Boolean] = js.undefined
  ): Anon_AllowProtocolRelativeUrls = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowProtocolRelativeUrls)) __obj.updateDynamic("allowProtocolRelativeUrls")(allowProtocolRelativeUrls)
    if (protocols != null) __obj.updateDynamic("protocols")(protocols)
    if (!js.isUndefined(requireHost)) __obj.updateDynamic("requireHost")(requireHost)
    if (!js.isUndefined(requireProtocol)) __obj.updateDynamic("requireProtocol")(requireProtocol)
    if (!js.isUndefined(requireValidProtocol)) __obj.updateDynamic("requireValidProtocol")(requireValidProtocol)
    __obj.asInstanceOf[Anon_AllowProtocolRelativeUrls]
  }
}

