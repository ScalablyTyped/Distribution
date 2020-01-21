package typings.agGrid.floatingFilterWrapperMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFloatingFilterWrapper[M] extends js.Object {
  def onParentModelChanged(parentModel: M): Unit
}

object IFloatingFilterWrapper {
  @scala.inline
  def apply[M](onParentModelChanged: M => Unit): IFloatingFilterWrapper[M] = {
    val __obj = js.Dynamic.literal(onParentModelChanged = js.Any.fromFunction1(onParentModelChanged))
  
    __obj.asInstanceOf[IFloatingFilterWrapper[M]]
  }
}

