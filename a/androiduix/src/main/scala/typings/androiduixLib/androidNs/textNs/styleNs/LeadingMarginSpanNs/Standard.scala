package typings
package androiduixLib.androidNs.textNs.styleNs.LeadingMarginSpanNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.text.style.LeadingMarginSpan.Standard")
@js.native
class Standard protected ()
  extends androiduixLib.androidNs.textNs.styleNs.LeadingMarginSpan {
  def this(first: scala.Double) = this()
  def this(first: scala.Double, rest: scala.Double) = this()
  var mFirst: js.Any = js.native
  var mRest: js.Any = js.native
  def describeContents(): scala.Double = js.native
  /* CompleteClass */
  override def drawLeadingMargin(
    c: androiduixLib.androidNs.graphicsNs.Canvas,
    p: androiduixLib.androidNs.graphicsNs.Paint,
    x: scala.Double,
    dir: scala.Double,
    top: scala.Double,
    baseline: scala.Double,
    bottom: scala.Double,
    text: java.lang.String,
    start: scala.Double,
    end: scala.Double,
    first: scala.Boolean,
    layout: androiduixLib.androidNs.textNs.Layout
  ): scala.Unit = js.native
  /* CompleteClass */
  override def getLeadingMargin(first: scala.Boolean): scala.Double = js.native
  def getSpanTypeId(): scala.Double = js.native
}

