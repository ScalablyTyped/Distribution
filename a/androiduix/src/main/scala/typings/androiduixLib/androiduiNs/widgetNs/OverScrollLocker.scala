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
    getScrollContentBottom: js.Function0[scala.Double],
    lockOverScrollBottom: js.Function1[scala.Double, scala.Unit],
    lockOverScrollTop: js.Function1[scala.Double, scala.Unit]
  ): OverScrollLocker = {
    val __obj = js.Dynamic.literal(getScrollContentBottom = getScrollContentBottom, lockOverScrollBottom = lockOverScrollBottom, lockOverScrollTop = lockOverScrollTop)
  
    __obj.asInstanceOf[OverScrollLocker]
  }
}

