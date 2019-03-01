package typings
package androiduixLib.androidNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpanWatcher extends js.Object {
  def onSpanAdded(text: Spannable, what: js.Any, start: scala.Double, end: scala.Double): scala.Unit
  def onSpanChanged(
    text: Spannable,
    what: js.Any,
    ostart: scala.Double,
    oend: scala.Double,
    nstart: scala.Double,
    nend: scala.Double
  ): scala.Unit
  def onSpanRemoved(text: Spannable, what: js.Any, start: scala.Double, end: scala.Double): scala.Unit
}

object SpanWatcher {
  @scala.inline
  def apply(
    onSpanAdded: js.Function4[Spannable, js.Any, scala.Double, scala.Double, scala.Unit],
    onSpanChanged: js.Function6[Spannable, js.Any, scala.Double, scala.Double, scala.Double, scala.Double, scala.Unit],
    onSpanRemoved: js.Function4[Spannable, js.Any, scala.Double, scala.Double, scala.Unit]
  ): SpanWatcher = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("onSpanAdded")(onSpanAdded)
    __obj.updateDynamic("onSpanChanged")(onSpanChanged)
    __obj.updateDynamic("onSpanRemoved")(onSpanRemoved)
    __obj.asInstanceOf[SpanWatcher]
  }
}

