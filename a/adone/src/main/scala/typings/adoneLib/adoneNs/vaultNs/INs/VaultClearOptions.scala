package typings
package adoneLib.adoneNs.vaultNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VaultClearOptions extends js.Object {
  var hosts: js.UndefOr[scala.Boolean] = js.undefined
  var tags: js.UndefOr[scala.Boolean] = js.undefined
}

object VaultClearOptions {
  @scala.inline
  def apply(hosts: js.UndefOr[scala.Boolean] = js.undefined, tags: js.UndefOr[scala.Boolean] = js.undefined): VaultClearOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(hosts)) __obj.updateDynamic("hosts")(hosts)
    if (!js.isUndefined(tags)) __obj.updateDynamic("tags")(tags)
    __obj.asInstanceOf[VaultClearOptions]
  }
}

