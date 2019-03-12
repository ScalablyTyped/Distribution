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
    checkPosition: () => scala.Unit,
    checkPositionWithEventLoop: () => scala.Unit,
    destroy: () => scala.Unit,
    init: () => scala.Unit
  ): IAffix = {
    val __obj = js.Dynamic.literal(checkPosition = js.Any.fromFunction0(checkPosition), checkPositionWithEventLoop = js.Any.fromFunction0(checkPositionWithEventLoop), destroy = js.Any.fromFunction0(destroy), init = js.Any.fromFunction0(init))
  
    __obj.asInstanceOf[IAffix]
  }
}

