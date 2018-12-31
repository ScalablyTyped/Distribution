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

