package typings.androiduix.android.text.style.LeadingMarginSpan

import typings.androiduix.android.graphics.Canvas
import typings.androiduix.android.graphics.Paint
import typings.androiduix.android.text.Layout
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.text.style.LeadingMarginSpan.Standard")
@js.native
class Standard protected ()
  extends typings.androiduix.android.text.style.LeadingMarginSpan {
  def this(first: Double) = this()
  def this(first: Double, rest: Double) = this()
  var mFirst: js.Any = js.native
  var mRest: js.Any = js.native
  def describeContents(): Double = js.native
  /* CompleteClass */
  override def drawLeadingMargin(
    c: Canvas,
    p: Paint,
    x: Double,
    dir: Double,
    top: Double,
    baseline: Double,
    bottom: Double,
    text: String,
    start: Double,
    end: Double,
    first: Boolean,
    layout: Layout
  ): Unit = js.native
  /* CompleteClass */
  override def getLeadingMargin(first: Boolean): Double = js.native
  def getSpanTypeId(): Double = js.native
}

