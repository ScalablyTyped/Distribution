package typings
package androiduixLib.androidNs.textNs.LayoutNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* import warning: RemoveMultipleInheritance.findNewParents newComments Dropped parents 
- androiduixLib.androidNs.textNs.Spanned because var conflicts: iterator. Inlined getSpans, getSpanStart, getSpanEnd, getSpanFlags, nextSpanTransition */ @JSGlobal("android.text.Layout.SpannedEllipsizer")
@js.native
class SpannedEllipsizer protected () extends Ellipsizer {
  def this(display: java.lang.String) = this()
  var mSpanned: js.Any = js.native
  def getSpanEnd(tag: js.Any): scala.Double = js.native
  def getSpanFlags(tag: js.Any): scala.Double = js.native
  def getSpanStart(tag: js.Any): scala.Double = js.native
  def getSpans[T](start: scala.Double, end: scala.Double, `type`: js.Any): js.Array[T] = js.native
  def nextSpanTransition(start: scala.Double, limit: scala.Double, `type`: js.Any): scala.Double = js.native
}

