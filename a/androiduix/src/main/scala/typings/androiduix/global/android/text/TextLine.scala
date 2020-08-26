package typings.androiduix.global.android.text

import typings.androiduix.android.graphics.Paint.FontMetricsInt
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.text.TextLine")
@js.native
class TextLine ()
  extends typings.androiduix.android.text.TextLine

/* static members */
@JSGlobal("android.text.TextLine")
@js.native
object TextLine extends js.Object {
  var DEBUG: js.Any = js.native
  var TAB_INCREMENT: js.Any = js.native
  var sCached: js.Any = js.native
  /* private */ def expandMetricsFromPaint(fmi: js.Any, wp: js.Any): js.Any = js.native
  def obtain(): typings.androiduix.android.text.TextLine = js.native
  def recycle(tl: typings.androiduix.android.text.TextLine): typings.androiduix.android.text.TextLine = js.native
  def updateMetrics(
    fmi: FontMetricsInt,
    previousTop: Double,
    previousAscent: Double,
    previousDescent: Double,
    previousBottom: Double,
    previousLeading: Double
  ): Unit = js.native
}

