package typings
package angularDashMaterialLib.angularDashMaterialMod.angularMod.materialNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPanelService extends js.Object {
  var absPosition: angularDashMaterialLib.Anon_RIGHT
  var animation: angularDashMaterialLib.Anon_FADE
  var closeReasons: angularDashMaterialLib.Anon_ESCAPE
  var interceptorTypes: angularDashMaterialLib.Anon_CLOSE
  var xPosition: angularDashMaterialLib.Anon_CENTER
  var yPosition: angularDashMaterialLib.Anon_CENTERALIGNBOTTOMS
  def create(opt_config: IPanelConfig): IPanelRef
  def newPanelAnimation(): IPanelAnimation
  def newPanelPosition(): IPanelPosition
  def open(opt_config: IPanelConfig): angularLib.angularMod.angularNs.IPromise[IPanelRef]
}

