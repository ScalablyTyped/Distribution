package typings.angularMaterial.mod.angularAugmentingMod.material

import typings.angular.mod.IPromise
import typings.angularMaterial.anon.ABOVE
import typings.angularMaterial.anon.ALIGNEND
import typings.angularMaterial.anon.BOTTOM
import typings.angularMaterial.anon.CLICKOUTSIDE
import typings.angularMaterial.anon.CLOSE_
import typings.angularMaterial.anon.FADE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPanelService extends js.Object {
  var absPosition: BOTTOM
  var animation: FADE
  var closeReasons: CLICKOUTSIDE
  var interceptorTypes: CLOSE_
  var xPosition: ALIGNEND
  var yPosition: ABOVE
  def create(opt_config: IPanelConfig): IPanelRef
  def newPanelAnimation(): IPanelAnimation
  def newPanelPosition(): IPanelPosition
  def open(opt_config: IPanelConfig): IPromise[IPanelRef]
}

object IPanelService {
  @scala.inline
  def apply(
    absPosition: BOTTOM,
    animation: FADE,
    closeReasons: CLICKOUTSIDE,
    create: IPanelConfig => IPanelRef,
    interceptorTypes: CLOSE_,
    newPanelAnimation: () => IPanelAnimation,
    newPanelPosition: () => IPanelPosition,
    open: IPanelConfig => IPromise[IPanelRef],
    xPosition: ALIGNEND,
    yPosition: ABOVE
  ): IPanelService = {
    val __obj = js.Dynamic.literal(absPosition = absPosition.asInstanceOf[js.Any], animation = animation.asInstanceOf[js.Any], closeReasons = closeReasons.asInstanceOf[js.Any], create = js.Any.fromFunction1(create), interceptorTypes = interceptorTypes.asInstanceOf[js.Any], newPanelAnimation = js.Any.fromFunction0(newPanelAnimation), newPanelPosition = js.Any.fromFunction0(newPanelPosition), open = js.Any.fromFunction1(open), xPosition = xPosition.asInstanceOf[js.Any], yPosition = yPosition.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPanelService]
  }
}

