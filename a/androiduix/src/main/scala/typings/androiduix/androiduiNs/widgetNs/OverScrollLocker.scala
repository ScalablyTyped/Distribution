package typings.androiduix.androiduiNs.widgetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OverScrollLocker extends js.Object {
  def getScrollContentBottom(): Double
  def lockOverScrollBottom(lockBottom: Double): Unit
  def lockOverScrollTop(lockTop: Double): Unit
}

object OverScrollLocker {
  @scala.inline
  def apply(
    getScrollContentBottom: () => Double,
    lockOverScrollBottom: Double => Unit,
    lockOverScrollTop: Double => Unit
  ): OverScrollLocker = {
    val __obj = js.Dynamic.literal(getScrollContentBottom = js.Any.fromFunction0(getScrollContentBottom), lockOverScrollBottom = js.Any.fromFunction1(lockOverScrollBottom), lockOverScrollTop = js.Any.fromFunction1(lockOverScrollTop))
  
    __obj.asInstanceOf[OverScrollLocker]
  }
}

