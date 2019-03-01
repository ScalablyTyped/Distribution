package typings
package angularDashLoadingDashBarLib.angularDashLoadingDashBarMod.angularMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IRequestShortcutConfig extends js.Object {
  /**
    * Indicates that the loading bar should be hidden.
    */
  var ignoreLoadingBar: js.UndefOr[scala.Boolean] = js.undefined
}

object IRequestShortcutConfig {
  @scala.inline
  def apply(ignoreLoadingBar: js.UndefOr[scala.Boolean] = js.undefined): IRequestShortcutConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ignoreLoadingBar)) __obj.updateDynamic("ignoreLoadingBar")(ignoreLoadingBar)
    __obj.asInstanceOf[IRequestShortcutConfig]
  }
}

