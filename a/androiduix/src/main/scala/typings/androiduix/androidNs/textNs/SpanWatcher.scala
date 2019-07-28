package typings.androiduix.androidNs.textNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpanWatcher extends js.Object {
  def onSpanAdded(text: Spannable, what: js.Any, start: Double, end: Double): Unit
  def onSpanChanged(text: Spannable, what: js.Any, ostart: Double, oend: Double, nstart: Double, nend: Double): Unit
  def onSpanRemoved(text: Spannable, what: js.Any, start: Double, end: Double): Unit
}

object SpanWatcher {
  @scala.inline
  def apply(
    onSpanAdded: (Spannable, js.Any, Double, Double) => Unit,
    onSpanChanged: (Spannable, js.Any, Double, Double, Double, Double) => Unit,
    onSpanRemoved: (Spannable, js.Any, Double, Double) => Unit
  ): SpanWatcher = {
    val __obj = js.Dynamic.literal(onSpanAdded = js.Any.fromFunction4(onSpanAdded), onSpanChanged = js.Any.fromFunction6(onSpanChanged), onSpanRemoved = js.Any.fromFunction4(onSpanRemoved))
  
    __obj.asInstanceOf[SpanWatcher]
  }
}

