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
  def open(opt_config: IPanelConfig): angularLib.angularMod.IPromise[IPanelRef]
}

object IPanelService {
  @scala.inline
  def apply(
    absPosition: angularDashMaterialLib.Anon_BOTTOM,
    animation: angularDashMaterialLib.Anon_FADE,
    closeReasons: angularDashMaterialLib.Anon_CLICKOUTSIDE,
    create: IPanelConfig => IPanelRef,
    interceptorTypes: angularDashMaterialLib.Anon_CLOSE,
    newPanelAnimation: () => IPanelAnimation,
    newPanelPosition: () => IPanelPosition,
    open: IPanelConfig => angularLib.angularMod.IPromise[IPanelRef],
    xPosition: angularDashMaterialLib.Anon_ALIGNEND,
    yPosition: angularDashMaterialLib.Anon_ABOVE
  ): IPanelService = {
    val __obj = js.Dynamic.literal(absPosition = absPosition, animation = animation, closeReasons = closeReasons, create = js.Any.fromFunction1(create), interceptorTypes = interceptorTypes, newPanelAnimation = js.Any.fromFunction0(newPanelAnimation), newPanelPosition = js.Any.fromFunction0(newPanelPosition), open = js.Any.fromFunction1(open), xPosition = xPosition, yPosition = yPosition)
  
    __obj.asInstanceOf[IPanelService]
  }
}

