package typings
package adoneLib.adoneNs.vaultNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VaultConstructorOptions extends js.Object {
  var ValuableClass: js.UndefOr[js.Object] = js.undefined
  // TODO: leveldb options
  var location: java.lang.String
}

object VaultConstructorOptions {
  @scala.inline
  def apply(location: java.lang.String, ValuableClass: js.Object = null): VaultConstructorOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("location")(location)
    if (ValuableClass != null) __obj.updateDynamic("ValuableClass")(ValuableClass)
    __obj.asInstanceOf[VaultConstructorOptions]
  }
}

