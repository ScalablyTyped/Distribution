package typings.angularDashStrap.mgcreaNs.ngStrapNs.affixNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IAffix extends js.Object {
  def checkPosition(): Unit
  def checkPositionWithEventLoop(): Unit
  def destroy(): Unit
  def init(): Unit
}

object IAffix {
  @scala.inline
  def apply(
    checkPosition: () => Unit,
    checkPositionWithEventLoop: () => Unit,
    destroy: () => Unit,
    init: () => Unit
  ): IAffix = {
    val __obj = js.Dynamic.literal(checkPosition = js.Any.fromFunction0(checkPosition), checkPositionWithEventLoop = js.Any.fromFunction0(checkPositionWithEventLoop), destroy = js.Any.fromFunction0(destroy), init = js.Any.fromFunction0(init))
  
    __obj.asInstanceOf[IAffix]
  }
}

