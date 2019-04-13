package typings
package angularDashUiDashBootstrapLib.angularDashUiDashBootstrapMod.angularMod.uiNs.bootstrapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITooltipProvider
  extends angularLib.angularMod.IServiceProvider {
  /**
    * Provide a set of defaults for certain tooltip and popover attributes.
    */
  def options(value: ITooltipOptions): scala.Unit
  /**
    * Extends the default trigger mappings with mappings of your own. E.g. `{ 'openTrigger': 'closeTrigger' }`.
    */
  def setTriggers(triggers: js.Object): scala.Unit
}

object ITooltipProvider {
  @scala.inline
  def apply($get: js.Any, options: ITooltipOptions => scala.Unit, setTriggers: js.Object => scala.Unit): ITooltipProvider = {
    val __obj = js.Dynamic.literal($get = $get, options = js.Any.fromFunction1(options), setTriggers = js.Any.fromFunction1(setTriggers))
  
    __obj.asInstanceOf[ITooltipProvider]
  }
}

