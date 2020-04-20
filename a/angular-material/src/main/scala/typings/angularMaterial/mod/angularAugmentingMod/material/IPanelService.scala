package typings.angularMaterial.mod.angularAugmentingMod.material

import typings.angular.mod.IPromise
import typings.angularMaterial.AnonABOVE
import typings.angularMaterial.AnonALIGNEND
import typings.angularMaterial.AnonBOTTOM
import typings.angularMaterial.AnonCLICKOUTSIDE
import typings.angularMaterial.AnonCLOSE_
import typings.angularMaterial.AnonFADE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPanelService extends js.Object {
  var absPosition: AnonBOTTOM
  var animation: AnonFADE
  var closeReasons: AnonCLICKOUTSIDE
  var interceptorTypes: AnonCLOSE_
  var xPosition: AnonALIGNEND
  var yPosition: AnonABOVE
  def create(opt_config: IPanelConfig): IPanelRef
  def newPanelAnimation(): IPanelAnimation
  def newPanelPosition(): IPanelPosition
  def open(opt_config: IPanelConfig): IPromise[IPanelRef]
}

object IPanelService {
  @scala.inline
  def apply(
    absPosition: AnonBOTTOM,
    animation: AnonFADE,
    closeReasons: AnonCLICKOUTSIDE,
    create: IPanelConfig => IPanelRef,
    interceptorTypes: AnonCLOSE_,
    newPanelAnimation: () => IPanelAnimation,
    newPanelPosition: () => IPanelPosition,
    open: IPanelConfig => IPromise[IPanelRef],
    xPosition: AnonALIGNEND,
    yPosition: AnonABOVE
  ): IPanelService = {
    val __obj = js.Dynamic.literal(absPosition = absPosition.asInstanceOf[js.Any], animation = animation.asInstanceOf[js.Any], closeReasons = closeReasons.asInstanceOf[js.Any], create = js.Any.fromFunction1(create), interceptorTypes = interceptorTypes.asInstanceOf[js.Any], newPanelAnimation = js.Any.fromFunction0(newPanelAnimation), newPanelPosition = js.Any.fromFunction0(newPanelPosition), open = js.Any.fromFunction1(open), xPosition = xPosition.asInstanceOf[js.Any], yPosition = yPosition.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPanelService]
  }
}

