package typings
package androiduixLib.androiduiNs.widgetNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OverScrollLocker extends js.Object {
  def getScrollContentBottom(): scala.Double
  def lockOverScrollBottom(lockBottom: scala.Double): scala.Unit
  def lockOverScrollTop(lockTop: scala.Double): scala.Unit
}

object OverScrollLocker {
  @scala.inline
  def apply(
    getScrollContentBottom: () => scala.Double,
    lockOverScrollBottom: scala.Double => scala.Unit,
    lockOverScrollTop: scala.Double => scala.Unit
  ): OverScrollLocker = {
    val __obj = js.Dynamic.literal(getScrollContentBottom = js.Any.fromFunction0(getScrollContentBottom), lockOverScrollBottom = js.Any.fromFunction1(lockOverScrollBottom), lockOverScrollTop = js.Any.fromFunction1(lockOverScrollTop))
  
    __obj.asInstanceOf[OverScrollLocker]
  }
}

