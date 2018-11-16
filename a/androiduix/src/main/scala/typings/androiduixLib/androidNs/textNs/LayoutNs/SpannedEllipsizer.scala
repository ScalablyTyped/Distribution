package typings
package androiduixLib.androidNs.textNs.LayoutNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.text.Layout.SpannedEllipsizer")
@js.native
class SpannedEllipsizer protected ()
  extends Ellipsizer
     with androiduixLib.androidNs.textNs.Spanned {
  def this(display: java.lang.String) = this()
  var mSpanned: js.Any = js.native
  /* CompleteClass */
  override def getSpanEnd(tag: js.Any): scala.Double = js.native
  /* CompleteClass */
  override def getSpanFlags(tag: js.Any): scala.Double = js.native
  /* CompleteClass */
  override def getSpanStart(tag: js.Any): scala.Double = js.native
  /* CompleteClass */
  override def getSpans[T](start: scala.Double, end: scala.Double, `type`: js.Any): js.Array[T] = js.native
  /* CompleteClass */
  override def nextSpanTransition(start: scala.Double, limit: scala.Double, `type`: js.Any): scala.Double = js.native
}

