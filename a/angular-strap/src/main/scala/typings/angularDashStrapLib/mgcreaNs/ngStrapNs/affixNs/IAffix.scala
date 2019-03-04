package typings
package angularDashStrapLib.mgcreaNs.ngStrapNs.affixNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAffix extends js.Object {
  def checkPosition(): scala.Unit
  def checkPositionWithEventLoop(): scala.Unit
  def destroy(): scala.Unit
  def init(): scala.Unit
}

object IAffix {
  @scala.inline
  def apply(
    checkPosition: js.Function0[scala.Unit],
    checkPositionWithEventLoop: js.Function0[scala.Unit],
    destroy: js.Function0[scala.Unit],
    init: js.Function0[scala.Unit]
  ): IAffix = {
    val __obj = js.Dynamic.literal(checkPosition = checkPosition, checkPositionWithEventLoop = checkPositionWithEventLoop, destroy = destroy, init = init)
  
    __obj.asInstanceOf[IAffix]
  }
}

