package typings
package androiduixLib.androidNs.graphicsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("android.graphics.Paint")
@js.native
class Paint () extends js.Object {
  def this(flag: scala.Double) = this()
  var align: js.Any = js.native
  var drawableState: js.Array[scala.Double] = js.native
  var hasShadow: scala.Boolean = js.native
  var mColor: js.Any = js.native
  var mFlag: js.Any = js.native
  var mStrokeCap: js.Any = js.native
  var mStrokeJoin: js.Any = js.native
  var mStrokeWidth: js.Any = js.native
  var mTextStyle: js.Any = js.native
  var shadowColor: scala.Double = js.native
  var shadowDx: scala.Double = js.native
  var shadowDy: scala.Double = js.native
  var shadowRadius: scala.Double = js.native
  var textScaleX: js.Any = js.native
  var textSize: js.Any = js.native
  def applyToCanvas(canvas: Canvas): scala.Unit = js.native
  def ascent(): scala.Double = js.native
  def clearShadowLayer(): scala.Unit = js.native
  def descent(): scala.Double = js.native
  def getAlpha(): scala.Double = js.native
  def getColor(): scala.Double = js.native
  def getFlags(): scala.Double = js.native
  def getFontMetrics(metrics: androiduixLib.androidNs.graphicsNs.PaintNs.FontMetrics): scala.Double = js.native
  def getFontMetricsInt(fmi: androiduixLib.androidNs.graphicsNs.PaintNs.FontMetricsInt): scala.Double = js.native
  def getStrokeCap(): androiduixLib.androidNs.graphicsNs.PaintNs.Cap = js.native
  def getStrokeJoin(): androiduixLib.androidNs.graphicsNs.PaintNs.Join = js.native
  def getStrokeWidth(): scala.Double = js.native
  def getStyle(): androiduixLib.androidNs.graphicsNs.PaintNs.Style = js.native
  def getTextAlign(): androiduixLib.androidNs.graphicsNs.PaintNs.Align = js.native
  def getTextRunAdvances_count(
    chars: java.lang.String,
    index: scala.Double,
    count: scala.Double,
    contextIndex: scala.Double,
    contextCount: scala.Double,
    flags: scala.Double,
    advances: js.Array[scala.Double],
    advancesIndex: scala.Double
  ): scala.Double = js.native
  def getTextRunAdvances_end(
    text: java.lang.String,
    start: scala.Double,
    end: scala.Double,
    contextStart: scala.Double,
    contextEnd: scala.Double,
    flags: scala.Double,
    advances: js.Array[scala.Double],
    advancesIndex: scala.Double
  ): scala.Double = js.native
  def getTextRunCursor_end(
    text: java.lang.String,
    contextStart: scala.Double,
    contextEnd: scala.Double,
    flags: scala.Double,
    offset: scala.Double,
    cursorOpt: scala.Double
  ): scala.Double = js.native
  def getTextRunCursor_len(
    text: java.lang.String,
    contextStart: scala.Double,
    contextLength: scala.Double,
    flags: scala.Double,
    offset: scala.Double,
    cursorOpt: scala.Double
  ): scala.Double = js.native
  def getTextScaleX(): scala.Double = js.native
  def getTextSize(): scala.Double = js.native
  def getTextWidths_2(text: java.lang.String, widths: js.Array[scala.Double]): scala.Double = js.native
  def getTextWidths_count(text: java.lang.String, index: scala.Double, count: scala.Double, widths: js.Array[scala.Double]): scala.Double = js.native
  def getTextWidths_end(text: java.lang.String, start: scala.Double, end: scala.Double, widths: js.Array[scala.Double]): scala.Double = js.native
  def isAntiAlias(): scala.Boolean = js.native
  def isEmpty(): scala.Boolean = js.native
  def measureText(text: java.lang.String): scala.Double = js.native
  def measureText(text: java.lang.String, index: scala.Double): scala.Double = js.native
  def measureText(text: java.lang.String, index: scala.Double, count: scala.Double): scala.Double = js.native
  def set(src: Paint): scala.Unit = js.native
  def setARGB(a: scala.Double, r: scala.Double, g: scala.Double, b: scala.Double): scala.Unit = js.native
  def setAlpha(alpha: scala.Double): scala.Unit = js.native
  def setAntiAlias(enable: scala.Boolean): scala.Unit = js.native
  /* private */ def setClassVariablesFrom(paint: js.Any): js.Any = js.native
  def setColor(color: scala.Double): scala.Unit = js.native
  def setFlags(flags: scala.Double): scala.Unit = js.native
  def setShadowLayer(radius: scala.Double, dx: scala.Double, dy: scala.Double, color: scala.Double): scala.Unit = js.native
  def setStrokeCap(cap: androiduixLib.androidNs.graphicsNs.PaintNs.Cap): scala.Unit = js.native
  def setStrokeJoin(join: androiduixLib.androidNs.graphicsNs.PaintNs.Join): scala.Unit = js.native
  def setStrokeWidth(width: scala.Double): scala.Unit = js.native
  def setStyle(style: androiduixLib.androidNs.graphicsNs.PaintNs.Style): scala.Unit = js.native
  def setTextAlign(align: androiduixLib.androidNs.graphicsNs.PaintNs.Align): scala.Unit = js.native
  def setTextScaleX(scaleX: scala.Double): scala.Unit = js.native
  def setTextSize(textSize: scala.Double): scala.Unit = js.native
}

/* static members */
@JSGlobal("android.graphics.Paint")
@js.native
object Paint extends js.Object {
  var ANTI_ALIAS_FLAG: scala.Double = js.native
  var AUTO_HINTING_TEXT_FLAG: scala.Double = js.native
  var CURSOR_AFTER: scala.Double = js.native
  var CURSOR_AT: scala.Double = js.native
  var CURSOR_AT_OR_AFTER: scala.Double = js.native
  var CURSOR_AT_OR_BEFORE: scala.Double = js.native
  var CURSOR_BEFORE: scala.Double = js.native
  var CURSOR_OPT_MAX_VALUE: js.Any = js.native
  var DEFAULT_PAINT_FLAGS: scala.Double = js.native
  var DEV_KERN_TEXT_FLAG: scala.Double = js.native
  var DIRECTION_LTR: scala.Double = js.native
  var DIRECTION_RTL: scala.Double = js.native
  var DITHER_FLAG: scala.Double = js.native
  var EMBEDDED_BITMAP_TEXT_FLAG: scala.Double = js.native
  var FAKE_BOLD_TEXT_FLAG: scala.Double = js.native
  var FILTER_BITMAP_FLAG: scala.Double = js.native
  var FontMetrics_Size_Ascent: js.Any = js.native
  var FontMetrics_Size_Bottom: js.Any = js.native
  var FontMetrics_Size_Descent: js.Any = js.native
  var FontMetrics_Size_Leading: js.Any = js.native
  var FontMetrics_Size_Top: js.Any = js.native
  var LCD_RENDER_TEXT_FLAG: scala.Double = js.native
  var LINEAR_TEXT_FLAG: scala.Double = js.native
  var STRIKE_THRU_TEXT_FLAG: scala.Double = js.native
  var SUBPIXEL_TEXT_FLAG: scala.Double = js.native
  var UNDERLINE_TEXT_FLAG: scala.Double = js.native
  var VERTICAL_TEXT_FLAG: scala.Double = js.native
}

