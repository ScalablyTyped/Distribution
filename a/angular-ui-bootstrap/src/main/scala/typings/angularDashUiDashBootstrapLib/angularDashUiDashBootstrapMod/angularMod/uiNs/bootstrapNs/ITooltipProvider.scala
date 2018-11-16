package typings
package angularDashUiDashBootstrapLib.angularDashUiDashBootstrapMod.angularMod.uiNs.bootstrapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._


trait ITooltipProvider
  extends angularLib.angularMod.angularNs.IServiceProvider {
  /**
               * Provide a set of defaults for certain tooltip and popover attributes.
               */
  def options(value: ITooltipOptions): scala.Unit
  /**
               * Extends the default trigger mappings with mappings of your own. E.g. `{ 'openTrigger': 'closeTrigger' }`.
               */
  def setTriggers(triggers: js.Object): scala.Unit
}

