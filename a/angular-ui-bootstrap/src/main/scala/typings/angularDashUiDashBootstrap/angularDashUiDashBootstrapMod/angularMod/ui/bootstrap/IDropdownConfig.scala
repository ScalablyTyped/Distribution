package typings.angularDashUiDashBootstrap.angularDashUiDashBootstrapMod.angularMod.ui.bootstrap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IDropdownConfig extends js.Object {
  /**
    * @default: 'uib-dropdown-open'
    */
  var appendToOpenClass: js.UndefOr[String] = js.undefined
  /**
    * @default: 'open'
    */
  var openClass: js.UndefOr[String] = js.undefined
}

object IDropdownConfig {
  @scala.inline
  def apply(appendToOpenClass: String = null, openClass: String = null): IDropdownConfig = {
    val __obj = js.Dynamic.literal()
    if (appendToOpenClass != null) __obj.updateDynamic("appendToOpenClass")(appendToOpenClass)
    if (openClass != null) __obj.updateDynamic("openClass")(openClass)
    __obj.asInstanceOf[IDropdownConfig]
  }
}

