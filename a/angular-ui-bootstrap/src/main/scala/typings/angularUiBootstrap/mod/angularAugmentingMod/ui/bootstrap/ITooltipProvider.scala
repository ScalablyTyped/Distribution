package typings.angularUiBootstrap.mod.angularAugmentingMod.ui.bootstrap

import typings.angular.mod.IServiceProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITooltipProvider extends IServiceProvider {
  /**
    * Provide a set of defaults for certain tooltip and popover attributes.
    */
  def options(value: ITooltipOptions): Unit
  /**
    * Extends the default trigger mappings with mappings of your own. E.g. `{ 'openTrigger': 'closeTrigger' }`.
    */
  def setTriggers(triggers: js.Object): Unit
}

object ITooltipProvider {
  @scala.inline
  def apply($get: js.Any, options: ITooltipOptions => Unit, setTriggers: js.Object => Unit): ITooltipProvider = {
    val __obj = js.Dynamic.literal($get = $get.asInstanceOf[js.Any], options = js.Any.fromFunction1(options), setTriggers = js.Any.fromFunction1(setTriggers))
    __obj.asInstanceOf[ITooltipProvider]
  }
}

