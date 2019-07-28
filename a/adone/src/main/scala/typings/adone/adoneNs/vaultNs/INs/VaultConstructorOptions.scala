package typings.adone.adoneNs.vaultNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VaultConstructorOptions extends js.Object {
  var ValuableClass: js.UndefOr[js.Object] = js.undefined
  // TODO: leveldb options
  var location: String
}

object VaultConstructorOptions {
  @scala.inline
  def apply(location: String, ValuableClass: js.Object = null): VaultConstructorOptions = {
    val __obj = js.Dynamic.literal(location = location)
    if (ValuableClass != null) __obj.updateDynamic("ValuableClass")(ValuableClass)
    __obj.asInstanceOf[VaultConstructorOptions]
  }
}

