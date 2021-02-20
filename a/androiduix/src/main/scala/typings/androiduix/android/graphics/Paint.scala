package typings.androiduix.android.graphics

import typings.androiduix.android.graphics.Paint.Align
import typings.androiduix.android.graphics.Paint.Cap
import typings.androiduix.android.graphics.Paint.FontMetrics
import typings.androiduix.android.graphics.Paint.FontMetricsInt
import typings.androiduix.android.graphics.Paint.Join
import typings.androiduix.android.graphics.Paint.Style
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Paint extends StObject {
  
  var align: js.Any = js.native
  
  def applyToCanvas(canvas: Canvas): Unit = js.native
  
  def ascent(): Double = js.native
  
  def clearShadowLayer(): Unit = js.native
  
  def descent(): Double = js.native
  
  var drawableState: js.Array[Double] = js.native
  
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
  
  var hasShadow: Boolean = js.native
  
  def isAntiAlias(): Boolean = js.native
  
  def isEmpty(): Boolean = js.native
  
  var mColor: js.Any = js.native
  
  var mFlag: js.Any = js.native
  
  var mStrokeCap: js.Any = js.native
  
  var mStrokeJoin: js.Any = js.native
  
  var mStrokeWidth: js.Any = js.native
  
  var mTextStyle: js.Any = js.native
  
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
  
  var shadowColor: Double = js.native
  
  var shadowDx: Double = js.native
  
  var shadowDy: Double = js.native
  
  var shadowRadius: Double = js.native
  
  var textScaleX: js.Any = js.native
  
  var textSize: js.Any = js.native
}
object Paint {
  
  @js.native
  sealed trait Align extends StObject
  @JSGlobal("android.graphics.Paint.Align")
  @js.native
  object Align extends StObject {
    
    @js.native
    sealed trait CENTER extends Align
    
    @js.native
    sealed trait LEFT extends Align
    
    @js.native
    sealed trait RIGHT extends Align
  }
  
  @js.native
  sealed trait Cap extends StObject
  @JSGlobal("android.graphics.Paint.Cap")
  @js.native
  object Cap extends StObject {
    
    @js.native
    sealed trait BUTT extends Cap
    
    @js.native
    sealed trait ROUND extends Cap
    
    @js.native
    sealed trait SQUARE extends Cap
  }
  
  @js.native
  sealed trait Join extends StObject
  @JSGlobal("android.graphics.Paint.Join")
  @js.native
  object Join extends StObject {
    
    @js.native
    sealed trait BEVEL extends Join
    
    @js.native
    sealed trait MITER extends Join
    
    @js.native
    sealed trait ROUND extends Join
  }
  
  @js.native
  sealed trait Style extends StObject
  @JSGlobal("android.graphics.Paint.Style")
  @js.native
  object Style extends StObject {
    
    @js.native
    sealed trait FILL extends Style
    
    @js.native
    sealed trait FILL_AND_STROKE extends Style
    
    @js.native
    sealed trait STROKE extends Style
  }
  
  @js.native
  trait FontMetrics extends StObject {
    
    var ascent: Double = js.native
    
    var bottom: Double = js.native
    
    var descent: Double = js.native
    
    var leading: Double = js.native
    
    var top: Double = js.native
  }
  object FontMetrics {
    
    @scala.inline
    def apply(ascent: Double, bottom: Double, descent: Double, leading: Double, top: Double): FontMetrics = {
      val __obj = js.Dynamic.literal(ascent = ascent.asInstanceOf[js.Any], bottom = bottom.asInstanceOf[js.Any], descent = descent.asInstanceOf[js.Any], leading = leading.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
      __obj.asInstanceOf[FontMetrics]
    }
    
    @scala.inline
    implicit class FontMetricsMutableBuilder[Self <: FontMetrics] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAscent(value: Double): Self = StObject.set(x, "ascent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescent(value: Double): Self = StObject.set(x, "descent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeading(value: Double): Self = StObject.set(x, "leading", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait FontMetricsInt extends StObject {
    
    var ascent: Double = js.native
    
    var bottom: Double = js.native
    
    var descent: Double = js.native
    
    var leading: Double = js.native
    
    var top: Double = js.native
  }
  object FontMetricsInt {
    
    @scala.inline
    def apply(ascent: Double, bottom: Double, descent: Double, leading: Double, top: Double): FontMetricsInt = {
      val __obj = js.Dynamic.literal(ascent = ascent.asInstanceOf[js.Any], bottom = bottom.asInstanceOf[js.Any], descent = descent.asInstanceOf[js.Any], leading = leading.asInstanceOf[js.Any], top = top.asInstanceOf[js.Any])
      __obj.asInstanceOf[FontMetricsInt]
    }
    
    @scala.inline
    implicit class FontMetricsIntMutableBuilder[Self <: FontMetricsInt] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAscent(value: Double): Self = StObject.set(x, "ascent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBottom(value: Double): Self = StObject.set(x, "bottom", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDescent(value: Double): Self = StObject.set(x, "descent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeading(value: Double): Self = StObject.set(x, "leading", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTop(value: Double): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
    }
  }
}
