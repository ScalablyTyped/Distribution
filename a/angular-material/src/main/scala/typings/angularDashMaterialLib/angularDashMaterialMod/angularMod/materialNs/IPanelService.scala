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

object IPanelService {
  @scala.inline
  def apply(
    absPosition: angularDashMaterialLib.Anon_BOTTOM,
    animation: angularDashMaterialLib.Anon_FADE,
    closeReasons: angularDashMaterialLib.Anon_CLICKOUTSIDE,
    create: js.Function1[IPanelConfig, IPanelRef],
    interceptorTypes: angularDashMaterialLib.Anon_CLOSE,
    newPanelAnimation: js.Function0[IPanelAnimation],
    newPanelPosition: js.Function0[IPanelPosition],
    open: js.Function1[IPanelConfig, angularLib.angularMod.angularNs.IPromise[IPanelRef]],
    xPosition: angularDashMaterialLib.Anon_ALIGNEND,
    yPosition: angularDashMaterialLib.Anon_ABOVE
  ): IPanelService = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("absPosition")(absPosition)
    __obj.updateDynamic("animation")(animation)
    __obj.updateDynamic("closeReasons")(closeReasons)
    __obj.updateDynamic("create")(create)
    __obj.updateDynamic("interceptorTypes")(interceptorTypes)
    __obj.updateDynamic("newPanelAnimation")(newPanelAnimation)
    __obj.updateDynamic("newPanelPosition")(newPanelPosition)
    __obj.updateDynamic("open")(open)
    __obj.updateDynamic("xPosition")(xPosition)
    __obj.updateDynamic("yPosition")(yPosition)
    __obj.asInstanceOf[IPanelService]
  }
}

