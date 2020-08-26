package typings.androiduix.android.graphics

import typings.androiduix.android.graphics.Paint.Align
import typings.androiduix.android.graphics.Paint.Cap
import typings.androiduix.android.graphics.Paint.FontMetrics
import typings.androiduix.android.graphics.Paint.FontMetricsInt
import typings.androiduix.android.graphics.Paint.Join
import typings.androiduix.android.graphics.Paint.Style
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Paint_ extends js.Object {
  var align: js.Any = js.native
  var drawableState: js.Array[Double] = js.native
  var hasShadow: Boolean = js.native
  var mColor: js.Any = js.native
  var mFlag: js.Any = js.native
  var mStrokeCap: js.Any = js.native
  var mStrokeJoin: js.Any = js.native
  var mStrokeWidth: js.Any = js.native
  var mTextStyle: js.Any = js.native
  var shadowColor: Double = js.native
  var shadowDx: Double = js.native
  var shadowDy: Double = js.native
  var shadowRadius: Double = js.native
  var textScaleX: js.Any = js.native
  var textSize: js.Any = js.native
  def applyToCanvas(canvas: Canvas): Unit = js.native
  def ascent(): Double = js.native
  def clearShadowLayer(): Unit = js.native
  def descent(): Double = js.native
  def getAlpha(): Double = js.native
  def getColor(): Double = js.native
  def getFlags(): Double = js.native
  def getFontMetrics(metrics: FontMetrics): Double = js.native
  def getFontMetricsInt(fmi: FontMetricsInt): Double = js.native
  def getStrokeCap(): Cap = js.native
  def getStrokeJoin(): Join = js.native
  def getStrokeWidth(): Double = js.native
  def getStyle(): Style = js.native
  def getTextAlign(): Align = js.native
  def getTextRunAdvances_count(
    chars: String,
    index: Double,
    count: Double,
    contextIndex: Double,
    contextCount: Double,
    flags: Double,
    advances: js.Array[Double],
    advancesIndex: Double
  ): Double = js.native
  def getTextRunAdvances_end(
    text: String,
    start: Double,
    end: Double,
    contextStart: Double,
    contextEnd: Double,
    flags: Double,
    advances: js.Array[Double],
    advancesIndex: Double
  ): Double = js.native
  def getTextRunCursor_end(
    text: String,
    contextStart: Double,
    contextEnd: Double,
    flags: Double,
    offset: Double,
    cursorOpt: Double
  ): Double = js.native
  def getTextRunCursor_len(
    text: String,
    contextStart: Double,
    contextLength: Double,
    flags: Double,
    offset: Double,
    cursorOpt: Double
  ): Double = js.native
  def getTextScaleX(): Double = js.native
  def getTextSize(): Double = js.native
  def getTextWidths_2(text: String, widths: js.Array[Double]): Double = js.native
  def getTextWidths_count(text: String, index: Double, count: Double, widths: js.Array[Double]): Double = js.native
  def getTextWidths_end(text: String, start: Double, end: Double, widths: js.Array[Double]): Double = js.native
  def isAntiAlias(): Boolean = js.native
  def isEmpty(): Boolean = js.native
  def measureText(text: String): Double = js.native
  def measureText(text: String, index: js.UndefOr[scala.Nothing], count: Double): Double = js.native
  def measureText(text: String, index: Double): Double = js.native
  def measureText(text: String, index: Double, count: Double): Double = js.native
  def set(src: Paint): Unit = js.native
  def setARGB(a: Double, r: Double, g: Double, b: Double): Unit = js.native
  def setAlpha(alpha: Double): Unit = js.native
  def setAntiAlias(enable: Boolean): Unit = js.native
  /* private */ def setClassVariablesFrom(paint: js.Any): js.Any = js.native
  def setColor(color: Double): Unit = js.native
  def setFlags(flags: Double): Unit = js.native
  def setShadowLayer(radius: Double, dx: Double, dy: Double, color: Double): Unit = js.native
  def setStrokeCap(cap: Cap): Unit = js.native
  def setStrokeJoin(join: Join): Unit = js.native
  def setStrokeWidth(width: Double): Unit = js.native
  def setStyle(style: Style): Unit = js.native
  def setTextAlign(align: Align): Unit = js.native
  def setTextScaleX(scaleX: Double): Unit = js.native
  def setTextSize(textSize: Double): Unit = js.native
}

