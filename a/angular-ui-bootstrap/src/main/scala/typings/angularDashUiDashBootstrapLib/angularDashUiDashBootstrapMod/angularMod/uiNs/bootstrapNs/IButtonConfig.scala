package typings
package angularDashUiDashBootstrapLib.angularDashUiDashBootstrapMod.angularMod.uiNs.bootstrapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IButtonConfig extends js.Object {
  /**
    * @default: 'active'
    */
  var activeClass: js.UndefOr[java.lang.String] = js.undefined
  /**
    * @default: 'Click'
    */
  var toggleEvent: js.UndefOr[java.lang.String] = js.undefined
}

object IButtonConfig {
  @scala.inline
  def apply(activeClass: java.lang.String = null, toggleEvent: java.lang.String = null): IButtonConfig = {
    val __obj = js.Dynamic.literal()
    if (activeClass != null) __obj.updateDynamic("activeClass")(activeClass)
    if (toggleEvent != null) __obj.updateDynamic("toggleEvent")(toggleEvent)
    __obj.asInstanceOf[IButtonConfig]
  }
}

