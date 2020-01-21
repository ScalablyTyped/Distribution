package typings.angularUiBootstrap.mod.angularAugmentingMod.ui.bootstrap

import typings.angular.mod.IServiceProvider
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITooltipProvider extends IServiceProvider {
  /**
    * Provide a set of defaults for certain tooltip and popover attributes.
    */
  def options(value: ITooltipOptions): Unit = js.native
  /**
    * Extends the default trigger mappings with mappings of your own. E.g. `{ 'openTrigger': 'closeTrigger' }`.
    */
  def setTriggers(triggers: js.Object): Unit = js.native
}

