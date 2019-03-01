package typings
package angularDashUiDashBootstrapLib.angularDashUiDashBootstrapMod.angularMod.uiNs.bootstrapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAccordionConfig extends js.Object {
  /**
    * Controls whether expanding an item will cause the other items to close.
    *
    * @default true
    */
  var closeOthers: js.UndefOr[scala.Boolean] = js.undefined
}

object IAccordionConfig {
  @scala.inline
  def apply(closeOthers: js.UndefOr[scala.Boolean] = js.undefined): IAccordionConfig = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(closeOthers)) __obj.updateDynamic("closeOthers")(closeOthers)
    __obj.asInstanceOf[IAccordionConfig]
  }
}

