package typings
package adoneLib.adoneNs.vaultNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VaultToJSONOptions extends js.Object {
  var includeStats: js.UndefOr[scala.Boolean] = js.undefined
  var valuable: js.UndefOr[ValuableToJSONOptions] = js.undefined
}

object VaultToJSONOptions {
  @scala.inline
  def apply(includeStats: js.UndefOr[scala.Boolean] = js.undefined, valuable: ValuableToJSONOptions = null): VaultToJSONOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(includeStats)) __obj.updateDynamic("includeStats")(includeStats)
    if (valuable != null) __obj.updateDynamic("valuable")(valuable)
    __obj.asInstanceOf[VaultToJSONOptions]
  }
}

