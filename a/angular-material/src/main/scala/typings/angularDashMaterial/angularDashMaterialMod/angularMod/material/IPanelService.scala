package typings.angularDashMaterial.angularDashMaterialMod.angularMod.material

import typings.angular.angularMod.IPromise
import typings.angularDashMaterial.Anon_ABOVE
import typings.angularDashMaterial.Anon_ALIGNEND
import typings.angularDashMaterial.Anon_BOTTOM
import typings.angularDashMaterial.Anon_CLICKOUTSIDE
import typings.angularDashMaterial.Anon_CLOSE
import typings.angularDashMaterial.Anon_FADE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPanelService extends js.Object {
  var absPosition: Anon_BOTTOM
  var animation: Anon_FADE
  var closeReasons: Anon_CLICKOUTSIDE
  var interceptorTypes: Anon_CLOSE
  var xPosition: Anon_ALIGNEND
  var yPosition: Anon_ABOVE
  def create(opt_config: IPanelConfig): IPanelRef
  def newPanelAnimation(): IPanelAnimation
  def newPanelPosition(): IPanelPosition
  def open(opt_config: IPanelConfig): IPromise[IPanelRef]
}

object IPanelService {
  @scala.inline
  def apply(
    absPosition: Anon_BOTTOM,
    animation: Anon_FADE,
    closeReasons: Anon_CLICKOUTSIDE,
    create: IPanelConfig => IPanelRef,
    interceptorTypes: Anon_CLOSE,
    newPanelAnimation: () => IPanelAnimation,
    newPanelPosition: () => IPanelPosition,
    open: IPanelConfig => IPromise[IPanelRef],
    xPosition: Anon_ALIGNEND,
    yPosition: Anon_ABOVE
  ): IPanelService = {
    val __obj = js.Dynamic.literal(absPosition = absPosition, animation = animation, closeReasons = closeReasons, create = js.Any.fromFunction1(create), interceptorTypes = interceptorTypes, newPanelAnimation = js.Any.fromFunction0(newPanelAnimation), newPanelPosition = js.Any.fromFunction0(newPanelPosition), open = js.Any.fromFunction1(open), xPosition = xPosition, yPosition = yPosition)
  
    __obj.asInstanceOf[IPanelService]
  }
}

