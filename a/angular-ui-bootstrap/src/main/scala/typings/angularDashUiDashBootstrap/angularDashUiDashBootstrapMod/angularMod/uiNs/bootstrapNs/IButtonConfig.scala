package typings.angularDashUiDashBootstrap.angularDashUiDashBootstrapMod.angularMod.uiNs.bootstrapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IButtonConfig extends js.Object {
  /**
    * @default: 'active'
    */
  var activeClass: js.UndefOr[String] = js.undefined
  /**
    * @default: 'Click'
    */
  var toggleEvent: js.UndefOr[String] = js.undefined
}

object IButtonConfig {
  @scala.inline
  def apply(activeClass: String = null, toggleEvent: String = null): IButtonConfig = {
    val __obj = js.Dynamic.literal()
    if (activeClass != null) __obj.updateDynamic("activeClass")(activeClass)
    if (toggleEvent != null) __obj.updateDynamic("toggleEvent")(toggleEvent)
    __obj.asInstanceOf[IButtonConfig]
  }
}

