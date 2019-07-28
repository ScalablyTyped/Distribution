package typings.androiduix.androidNs.textNs.LayoutNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- typings.androiduix.androidNs.textNs.Spanned because var conflicts: iterator. Inlined getSpans, getSpanStart, getSpanEnd, getSpanFlags, nextSpanTransition */ @JSGlobal("android.text.Layout.SpannedEllipsizer")
@js.native
class SpannedEllipsizer protected () extends Ellipsizer {
  def this(display: String) = this()
  var mSpanned: js.Any = js.native
  def getSpanEnd(tag: js.Any): Double = js.native
  def getSpanFlags(tag: js.Any): Double = js.native
  def getSpanStart(tag: js.Any): Double = js.native
  def getSpans[T](start: Double, end: Double, `type`: js.Any): js.Array[T] = js.native
  def nextSpanTransition(start: Double, limit: Double, `type`: js.Any): Double = js.native
}

