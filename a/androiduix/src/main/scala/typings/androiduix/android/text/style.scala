package typings.androiduix.android.text

import typings.androiduix.android.graphics.Canvas
import typings.androiduix.android.graphics.Paint
import typings.androiduix.android.graphics.Paint.FontMetricsInt
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object style {
  
  @js.native
  trait CharacterStyle extends StObject {
    
    def getUnderlying(): CharacterStyle = js.native
    
    var mType: js.Symbol = js.native
    
    def updateDrawState(tp: TextPaint): Unit = js.native
  }
  object CharacterStyle {
    
    @scala.inline
    def apply(getUnderlying: () => CharacterStyle, mType: js.Symbol, updateDrawState: TextPaint => Unit): CharacterStyle = {
      val __obj = js.Dynamic.literal(getUnderlying = js.Any.fromFunction0(getUnderlying), mType = mType.asInstanceOf[js.Any], updateDrawState = js.Any.fromFunction1(updateDrawState))
      __obj.asInstanceOf[CharacterStyle]
    }
    
    @scala.inline
    implicit class CharacterStyleMutableBuilder[Self <: CharacterStyle] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetUnderlying(value: () => CharacterStyle): Self = StObject.set(x, "getUnderlying", js.Any.fromFunction0(value))
      
      @scala.inline
      def setMType(value: js.Symbol): Self = StObject.set(x, "mType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUpdateDrawState(value: TextPaint => Unit): Self = StObject.set(x, "updateDrawState", js.Any.fromFunction1(value))
    }
    
    @js.native
    trait PassthroughCharacterStyle extends CharacterStyle {
      
      var mStyle: js.Any = js.native
    }
    object PassthroughCharacterStyle {
      
      @scala.inline
      def apply(
        getUnderlying: () => CharacterStyle,
        mStyle: js.Any,
        mType: js.Symbol,
        updateDrawState: TextPaint => Unit
      ): PassthroughCharacterStyle = {
        val __obj = js.Dynamic.literal(getUnderlying = js.Any.fromFunction0(getUnderlying), mStyle = mStyle.asInstanceOf[js.Any], mType = mType.asInstanceOf[js.Any], updateDrawState = js.Any.fromFunction1(updateDrawState))
        __obj.asInstanceOf[PassthroughCharacterStyle]
      }
      
      @scala.inline
      implicit class PassthroughCharacterStyleMutableBuilder[Self <: PassthroughCharacterStyle] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setMStyle(value: js.Any): Self = StObject.set(x, "mStyle", value.asInstanceOf[js.Any])
      }
    }
  }
  
  @js.native
  trait LeadingMarginSpan extends ParagraphStyle {
    
    def drawLeadingMargin(
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
    
    def getLeadingMargin(first: Boolean): Double = js.native
  }
  object LeadingMarginSpan {
    
    @scala.inline
    def apply(
      drawLeadingMargin: (Canvas, Paint, Double, Double, Double, Double, Double, String, Double, Double, Boolean, Layout) => Unit,
      getLeadingMargin: Boolean => Double
    ): LeadingMarginSpan = {
      val __obj = js.Dynamic.literal(drawLeadingMargin = js.Any.fromFunction12(drawLeadingMargin), getLeadingMargin = js.Any.fromFunction1(getLeadingMargin))
      __obj.asInstanceOf[LeadingMarginSpan]
    }
    
    @js.native
    trait LeadingMarginSpan2 extends LeadingMarginSpan {
      
      def getLeadingMarginLineCount(): Double = js.native
    }
    object LeadingMarginSpan2 {
      
      @scala.inline
      def apply(
        drawLeadingMargin: (Canvas, Paint, Double, Double, Double, Double, Double, String, Double, Double, Boolean, Layout) => Unit,
        getLeadingMargin: Boolean => Double,
        getLeadingMarginLineCount: () => Double
      ): LeadingMarginSpan2 = {
        val __obj = js.Dynamic.literal(drawLeadingMargin = js.Any.fromFunction12(drawLeadingMargin), getLeadingMargin = js.Any.fromFunction1(getLeadingMargin), getLeadingMarginLineCount = js.Any.fromFunction0(getLeadingMarginLineCount))
        __obj.asInstanceOf[LeadingMarginSpan2]
      }
      
      @scala.inline
      implicit class LeadingMarginSpan2MutableBuilder[Self <: LeadingMarginSpan2] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setGetLeadingMarginLineCount(value: () => Double): Self = StObject.set(x, "getLeadingMarginLineCount", js.Any.fromFunction0(value))
      }
    }
    
    @scala.inline
    implicit class LeadingMarginSpanMutableBuilder[Self <: LeadingMarginSpan] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDrawLeadingMargin(
        value: (Canvas, Paint, Double, Double, Double, Double, Double, String, Double, Double, Boolean, Layout) => Unit
      ): Self = StObject.set(x, "drawLeadingMargin", js.Any.fromFunction12(value))
      
      @scala.inline
      def setGetLeadingMargin(value: Boolean => Double): Self = StObject.set(x, "getLeadingMargin", js.Any.fromFunction1(value))
    }
    
    @js.native
    trait Standard extends LeadingMarginSpan {
      
      def describeContents(): Double = js.native
      
      def getSpanTypeId(): Double = js.native
      
      var mFirst: js.Any = js.native
      
      var mRest: js.Any = js.native
    }
    object Standard {
      
      @scala.inline
      def apply(
        describeContents: () => Double,
        drawLeadingMargin: (Canvas, Paint, Double, Double, Double, Double, Double, String, Double, Double, Boolean, Layout) => Unit,
        getLeadingMargin: Boolean => Double,
        getSpanTypeId: () => Double,
        mFirst: js.Any,
        mRest: js.Any
      ): Standard = {
        val __obj = js.Dynamic.literal(describeContents = js.Any.fromFunction0(describeContents), drawLeadingMargin = js.Any.fromFunction12(drawLeadingMargin), getLeadingMargin = js.Any.fromFunction1(getLeadingMargin), getSpanTypeId = js.Any.fromFunction0(getSpanTypeId), mFirst = mFirst.asInstanceOf[js.Any], mRest = mRest.asInstanceOf[js.Any])
        __obj.asInstanceOf[Standard]
      }
      
      @scala.inline
      implicit class StandardMutableBuilder[Self <: Standard] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setDescribeContents(value: () => Double): Self = StObject.set(x, "describeContents", js.Any.fromFunction0(value))
        
        @scala.inline
        def setGetSpanTypeId(value: () => Double): Self = StObject.set(x, "getSpanTypeId", js.Any.fromFunction0(value))
        
        @scala.inline
        def setMFirst(value: js.Any): Self = StObject.set(x, "mFirst", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setMRest(value: js.Any): Self = StObject.set(x, "mRest", value.asInstanceOf[js.Any])
      }
    }
  }
  
  @js.native
  trait LineBackgroundSpan extends ParagraphStyle {
    
    def drawBackground(
      c: Canvas,
      p: Paint,
      left: Double,
      right: Double,
      top: Double,
      baseline: Double,
      bottom: Double,
      text: String,
      start: Double,
      end: Double,
      lnum: Double
    ): Unit = js.native
  }
  object LineBackgroundSpan {
    
    @scala.inline
    def apply(
      drawBackground: (Canvas, Paint, Double, Double, Double, Double, Double, String, Double, Double, Double) => Unit
    ): LineBackgroundSpan = {
      val __obj = js.Dynamic.literal(drawBackground = js.Any.fromFunction11(drawBackground))
      __obj.asInstanceOf[LineBackgroundSpan]
    }
    
    @scala.inline
    implicit class LineBackgroundSpanMutableBuilder[Self <: LineBackgroundSpan] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDrawBackground(
        value: (Canvas, Paint, Double, Double, Double, Double, Double, String, Double, Double, Double) => Unit
      ): Self = StObject.set(x, "drawBackground", js.Any.fromFunction11(value))
    }
  }
  
  @js.native
  trait LineHeightSpan extends ParagraphStyle {
    
    def chooseHeight(text: String, start: Double, end: Double, spanstartv: Double, v: Double, fm: FontMetricsInt): Unit = js.native
  }
  object LineHeightSpan {
    
    @scala.inline
    def apply(chooseHeight: (String, Double, Double, Double, Double, FontMetricsInt) => Unit): LineHeightSpan = {
      val __obj = js.Dynamic.literal(chooseHeight = js.Any.fromFunction6(chooseHeight))
      __obj.asInstanceOf[LineHeightSpan]
    }
    
    @scala.inline
    implicit class LineHeightSpanMutableBuilder[Self <: LineHeightSpan] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setChooseHeight(value: (String, Double, Double, Double, Double, FontMetricsInt) => Unit): Self = StObject.set(x, "chooseHeight", js.Any.fromFunction6(value))
    }
    
    @js.native
    trait WithDensity extends LineHeightSpan {
      
      def chooseHeight(
        text: String,
        start: Double,
        end: Double,
        spanstartv: Double,
        v: Double,
        fm: FontMetricsInt,
        paint: TextPaint
      ): Unit = js.native
    }
  }
  
  @js.native
  trait MetricAffectingSpan
    extends CharacterStyle
       with UpdateAppearance {
    
    def updateMeasureState(p: TextPaint): Unit = js.native
  }
  object MetricAffectingSpan {
    
    @scala.inline
    def apply(
      getUnderlying: () => CharacterStyle,
      mType: js.Symbol,
      updateDrawState: TextPaint => Unit,
      updateMeasureState: TextPaint => Unit
    ): MetricAffectingSpan = {
      val __obj = js.Dynamic.literal(getUnderlying = js.Any.fromFunction0(getUnderlying), mType = mType.asInstanceOf[js.Any], updateDrawState = js.Any.fromFunction1(updateDrawState), updateMeasureState = js.Any.fromFunction1(updateMeasureState))
      __obj.asInstanceOf[MetricAffectingSpan]
    }
    
    @scala.inline
    implicit class MetricAffectingSpanMutableBuilder[Self <: MetricAffectingSpan] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setUpdateMeasureState(value: TextPaint => Unit): Self = StObject.set(x, "updateMeasureState", js.Any.fromFunction1(value))
    }
    
    @js.native
    trait PassthroughMetricAffectingSpan extends MetricAffectingSpan {
      
      var mStyle: js.Any = js.native
    }
    object PassthroughMetricAffectingSpan {
      
      @scala.inline
      def apply(
        getUnderlying: () => CharacterStyle,
        mStyle: js.Any,
        mType: js.Symbol,
        updateDrawState: TextPaint => Unit,
        updateMeasureState: TextPaint => Unit
      ): PassthroughMetricAffectingSpan = {
        val __obj = js.Dynamic.literal(getUnderlying = js.Any.fromFunction0(getUnderlying), mStyle = mStyle.asInstanceOf[js.Any], mType = mType.asInstanceOf[js.Any], updateDrawState = js.Any.fromFunction1(updateDrawState), updateMeasureState = js.Any.fromFunction1(updateMeasureState))
        __obj.asInstanceOf[PassthroughMetricAffectingSpan]
      }
      
      @scala.inline
      implicit class PassthroughMetricAffectingSpanMutableBuilder[Self <: PassthroughMetricAffectingSpan] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setMStyle(value: js.Any): Self = StObject.set(x, "mStyle", value.asInstanceOf[js.Any])
      }
    }
  }
  
  @js.native
  trait ParagraphStyle extends StObject
  
  @js.native
  trait ReplacementSpan extends MetricAffectingSpan {
    
    def draw(
      canvas: Canvas,
      text: String,
      start: Double,
      end: Double,
      x: Double,
      top: Double,
      y: Double,
      bottom: Double,
      paint: Paint
    ): Unit = js.native
    
    def getSize(paint: Paint, text: String, start: Double, end: Double, fm: FontMetricsInt): Double = js.native
  }
  object ReplacementSpan {
    
    @scala.inline
    def apply(
      draw: (Canvas, String, Double, Double, Double, Double, Double, Double, Paint) => Unit,
      getSize: (Paint, String, Double, Double, FontMetricsInt) => Double,
      getUnderlying: () => CharacterStyle,
      mType: js.Symbol,
      updateDrawState: TextPaint => Unit,
      updateMeasureState: TextPaint => Unit
    ): ReplacementSpan = {
      val __obj = js.Dynamic.literal(draw = js.Any.fromFunction9(draw), getSize = js.Any.fromFunction5(getSize), getUnderlying = js.Any.fromFunction0(getUnderlying), mType = mType.asInstanceOf[js.Any], updateDrawState = js.Any.fromFunction1(updateDrawState), updateMeasureState = js.Any.fromFunction1(updateMeasureState))
      __obj.asInstanceOf[ReplacementSpan]
    }
    
    @scala.inline
    implicit class ReplacementSpanMutableBuilder[Self <: ReplacementSpan] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDraw(value: (Canvas, String, Double, Double, Double, Double, Double, Double, Paint) => Unit): Self = StObject.set(x, "draw", js.Any.fromFunction9(value))
      
      @scala.inline
      def setGetSize(value: (Paint, String, Double, Double, FontMetricsInt) => Double): Self = StObject.set(x, "getSize", js.Any.fromFunction5(value))
    }
  }
  
  @js.native
  trait TabStopSpan extends ParagraphStyle {
    
    def getTabStop(): Double = js.native
  }
  object TabStopSpan {
    
    @scala.inline
    def apply(getTabStop: () => Double): TabStopSpan = {
      val __obj = js.Dynamic.literal(getTabStop = js.Any.fromFunction0(getTabStop))
      __obj.asInstanceOf[TabStopSpan]
    }
    
    @js.native
    trait Standard extends TabStopSpan {
      
      var mTab: js.Any = js.native
    }
    object Standard {
      
      @scala.inline
      def apply(getTabStop: () => Double, mTab: js.Any): Standard = {
        val __obj = js.Dynamic.literal(getTabStop = js.Any.fromFunction0(getTabStop), mTab = mTab.asInstanceOf[js.Any])
        __obj.asInstanceOf[Standard]
      }
      
      @scala.inline
      implicit class StandardMutableBuilder[Self <: Standard] (val x: Self) extends AnyVal {
        
        @scala.inline
        def setMTab(value: js.Any): Self = StObject.set(x, "mTab", value.asInstanceOf[js.Any])
      }
    }
    
    @scala.inline
    implicit class TabStopSpanMutableBuilder[Self <: TabStopSpan] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setGetTabStop(value: () => Double): Self = StObject.set(x, "getTabStop", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait UpdateAppearance extends StObject
  
  type UpdateLayout = UpdateAppearance
  
  type WrapTogetherSpan = ParagraphStyle
}
