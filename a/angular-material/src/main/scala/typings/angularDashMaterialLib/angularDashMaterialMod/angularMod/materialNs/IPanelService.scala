package typings
package angularDashMaterialLib.angularDashMaterialMod.angularMod.materialNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPanelService extends js.Object {
  var absPosition: angularDashMaterialLib.Anon_BOTTOM
  var animation: angularDashMaterialLib.Anon_FADE
  var closeReasons: angularDashMaterialLib.Anon_CLICKOUTSIDE
  var interceptorTypes: angularDashMaterialLib.Anon_CLOSE
  var xPosition: angularDashMaterialLib.Anon_ALIGNEND
  var yPosition: angularDashMaterialLib.Anon_ABOVE
  def create(opt_config: IPanelConfig): IPanelRef
  def newPanelAnimation(): IPanelAnimation
  def newPanelPosition(): IPanelPosition
  def open(opt_config: IPanelConfig): angularLib.angularMod.angularNs.IPromise[IPanelRef]
}

