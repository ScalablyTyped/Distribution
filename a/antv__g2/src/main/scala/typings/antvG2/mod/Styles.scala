package typings.antvG2.mod

import typings.antvG2.antvG2Strings.`small-caps`
import typings.antvG2.antvG2Strings.bottom
import typings.antvG2.antvG2Strings.center
import typings.antvG2.antvG2Strings.end
import typings.antvG2.antvG2Strings.italic
import typings.antvG2.antvG2Strings.left
import typings.antvG2.antvG2Strings.middle
import typings.antvG2.antvG2Strings.normal
import typings.antvG2.antvG2Strings.oblique
import typings.antvG2.antvG2Strings.right
import typings.antvG2.antvG2Strings.start
import typings.antvG2.antvG2Strings.top
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * base Style interface [绘图属性]
  */
object Styles {
  
  trait background
    extends StObject
       with common {
    
    /**
      * 图表背景透明度
      */
    var fillOpacity: js.UndefOr[Double] = js.undefined
    
    /**
      * 图表边框粗度
      */
    var lineWidth: js.UndefOr[Double] = js.undefined
    
    /**
      * 图表圆角大小
      */
    var radius: js.UndefOr[Double] = js.undefined
    
    /**
      * 图表边框透明度
      */
    var strokeOpacity: js.UndefOr[Double] = js.undefined
  }
  object background {
    
    @scala.inline
    def apply(): background = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[background]
    }
    
    @scala.inline
    implicit class backgroundMutableBuilder[Self <: background] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFillOpacity(value: Double): Self = StObject.set(x, "fillOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillOpacityUndefined: Self = StObject.set(x, "fillOpacity", js.undefined)
      
      @scala.inline
      def setLineWidth(value: Double): Self = StObject.set(x, "lineWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineWidthUndefined: Self = StObject.set(x, "lineWidth", js.undefined)
      
      @scala.inline
      def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
      
      @scala.inline
      def setStrokeOpacity(value: Double): Self = StObject.set(x, "strokeOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeOpacityUndefined: Self = StObject.set(x, "strokeOpacity", js.undefined)
    }
  }
  
  trait common extends StObject {
    
    /**
      * 设置用于填充绘画的颜色、渐变或模式；
      */
    var fill: js.UndefOr[String] = js.undefined
    
    /**
      * 设置新图像如何绘制到已有的图像上。
      */
    var globalCompositeOperation: js.UndefOr[String] = js.undefined
    
    /**
      * 设置绘图的当前 alpha 或透明值；
      */
    var opacity: js.UndefOr[String | Double] = js.undefined
    
    /**
      * 设置用于阴影的模糊级别；
      */
    var shadowBlur: js.UndefOr[String | Double] = js.undefined
    
    /**
      * 设置用于阴影的颜色；
      */
    var shadowColor: js.UndefOr[String] = js.undefined
    
    /**
      * 设置阴影距形状的水平距离；
      */
    var shadowOffsetX: js.UndefOr[String | Double] = js.undefined
    
    /**
      * 设置阴影距形状的垂直距离；
      */
    var shadowOffsetY: js.UndefOr[String | Double] = js.undefined
    
    /**
      * 设置用于笔触的颜色、渐变或模式；
      */
    var stroke: js.UndefOr[String | Double] = js.undefined
  }
  object common {
    
    @scala.inline
    def apply(): common = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[common]
    }
    
    @scala.inline
    implicit class commonMutableBuilder[Self <: common] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      @scala.inline
      def setGlobalCompositeOperation(value: String): Self = StObject.set(x, "globalCompositeOperation", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGlobalCompositeOperationUndefined: Self = StObject.set(x, "globalCompositeOperation", js.undefined)
      
      @scala.inline
      def setOpacity(value: String | Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      @scala.inline
      def setShadowBlur(value: String | Double): Self = StObject.set(x, "shadowBlur", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShadowBlurUndefined: Self = StObject.set(x, "shadowBlur", js.undefined)
      
      @scala.inline
      def setShadowColor(value: String): Self = StObject.set(x, "shadowColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShadowColorUndefined: Self = StObject.set(x, "shadowColor", js.undefined)
      
      @scala.inline
      def setShadowOffsetX(value: String | Double): Self = StObject.set(x, "shadowOffsetX", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShadowOffsetXUndefined: Self = StObject.set(x, "shadowOffsetX", js.undefined)
      
      @scala.inline
      def setShadowOffsetY(value: String | Double): Self = StObject.set(x, "shadowOffsetY", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShadowOffsetYUndefined: Self = StObject.set(x, "shadowOffsetY", js.undefined)
      
      @scala.inline
      def setStroke(value: String | Double): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
    }
  }
  
  trait line
    extends StObject
       with common {
    
    var arrowAngle: js.UndefOr[Double] = js.undefined
    
    var arrowRadius: js.UndefOr[Double] = js.undefined
    
    var endArrow: js.UndefOr[Boolean] = js.undefined
    
    var lineCap: js.UndefOr[String] = js.undefined
    
    /**
      * 虚线的设置
      */
    var lineDash: js.UndefOr[js.Array[Double]] = js.undefined
    
    var lineJoin: js.UndefOr[String] = js.undefined
    
    var lineWidth: js.UndefOr[String | Double] = js.undefined
    
    var miterLimit: js.UndefOr[String | Double] = js.undefined
    
    var startArrow: js.UndefOr[Boolean] = js.undefined
    
    var strokeOpacity: js.UndefOr[String | Double] = js.undefined
  }
  object line {
    
    @scala.inline
    def apply(): line = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[line]
    }
    
    @scala.inline
    implicit class lineMutableBuilder[Self <: line] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setArrowAngle(value: Double): Self = StObject.set(x, "arrowAngle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArrowAngleUndefined: Self = StObject.set(x, "arrowAngle", js.undefined)
      
      @scala.inline
      def setArrowRadius(value: Double): Self = StObject.set(x, "arrowRadius", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArrowRadiusUndefined: Self = StObject.set(x, "arrowRadius", js.undefined)
      
      @scala.inline
      def setEndArrow(value: Boolean): Self = StObject.set(x, "endArrow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndArrowUndefined: Self = StObject.set(x, "endArrow", js.undefined)
      
      @scala.inline
      def setLineCap(value: String): Self = StObject.set(x, "lineCap", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineCapUndefined: Self = StObject.set(x, "lineCap", js.undefined)
      
      @scala.inline
      def setLineDash(value: js.Array[Double]): Self = StObject.set(x, "lineDash", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineDashUndefined: Self = StObject.set(x, "lineDash", js.undefined)
      
      @scala.inline
      def setLineDashVarargs(value: Double*): Self = StObject.set(x, "lineDash", js.Array(value :_*))
      
      @scala.inline
      def setLineJoin(value: String): Self = StObject.set(x, "lineJoin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineJoinUndefined: Self = StObject.set(x, "lineJoin", js.undefined)
      
      @scala.inline
      def setLineWidth(value: String | Double): Self = StObject.set(x, "lineWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLineWidthUndefined: Self = StObject.set(x, "lineWidth", js.undefined)
      
      @scala.inline
      def setMiterLimit(value: String | Double): Self = StObject.set(x, "miterLimit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMiterLimitUndefined: Self = StObject.set(x, "miterLimit", js.undefined)
      
      @scala.inline
      def setStartArrow(value: Boolean): Self = StObject.set(x, "startArrow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartArrowUndefined: Self = StObject.set(x, "startArrow", js.undefined)
      
      @scala.inline
      def setStrokeOpacity(value: String | Double): Self = StObject.set(x, "strokeOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeOpacityUndefined: Self = StObject.set(x, "strokeOpacity", js.undefined)
    }
  }
  
  trait path
    extends StObject
       with common {
    
    /**
      * 图表背景透明度
      */
    var fillOpacity: js.UndefOr[Double] = js.undefined
    
    /**
      * 图表边框透明度
      */
    var strokeOpacity: js.UndefOr[Double] = js.undefined
  }
  object path {
    
    @scala.inline
    def apply(): path = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[path]
    }
    
    @scala.inline
    implicit class pathMutableBuilder[Self <: path] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFillOpacity(value: Double): Self = StObject.set(x, "fillOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFillOpacityUndefined: Self = StObject.set(x, "fillOpacity", js.undefined)
      
      @scala.inline
      def setStrokeOpacity(value: Double): Self = StObject.set(x, "strokeOpacity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStrokeOpacityUndefined: Self = StObject.set(x, "strokeOpacity", js.undefined)
    }
  }
  
  trait text
    extends StObject
       with common {
    
    var font: js.UndefOr[String] = js.undefined
    
    /**
      * 文本字体名称
      */
    var fontFamily: js.UndefOr[String] = js.undefined
    
    /**
      * 文本字号大小
      */
    var fontSize: js.UndefOr[String | Double] = js.undefined
    
    /**
      * 文本样式
      */
    var fontStyle: js.UndefOr[normal | italic | oblique] = js.undefined
    
    /**
      * 文本变体
      */
    var fontVariant: js.UndefOr[normal | `small-caps`] = js.undefined
    
    /**
      * 文本粗细
      */
    var fontWeight: js.UndefOr[String | Double] = js.undefined
    
    /**
      * 文本旋转角度
      */
    var rotate: js.UndefOr[Double] = js.undefined
    
    /**
      * 文本对齐方向
      */
    var textAlign: js.UndefOr[center | end | left | right | start] = js.undefined
    
    /**
      * 文本基准线，默认为`middle`
      */
    var textBaseline: js.UndefOr[top | middle | bottom] = js.undefined
  }
  object text {
    
    @scala.inline
    def apply(): text = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[text]
    }
    
    @scala.inline
    implicit class textMutableBuilder[Self <: text] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFont(value: String): Self = StObject.set(x, "font", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontFamily(value: String): Self = StObject.set(x, "fontFamily", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontFamilyUndefined: Self = StObject.set(x, "fontFamily", js.undefined)
      
      @scala.inline
      def setFontSize(value: String | Double): Self = StObject.set(x, "fontSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontSizeUndefined: Self = StObject.set(x, "fontSize", js.undefined)
      
      @scala.inline
      def setFontStyle(value: normal | italic | oblique): Self = StObject.set(x, "fontStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontStyleUndefined: Self = StObject.set(x, "fontStyle", js.undefined)
      
      @scala.inline
      def setFontUndefined: Self = StObject.set(x, "font", js.undefined)
      
      @scala.inline
      def setFontVariant(value: normal | `small-caps`): Self = StObject.set(x, "fontVariant", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontVariantUndefined: Self = StObject.set(x, "fontVariant", js.undefined)
      
      @scala.inline
      def setFontWeight(value: String | Double): Self = StObject.set(x, "fontWeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontWeightUndefined: Self = StObject.set(x, "fontWeight", js.undefined)
      
      @scala.inline
      def setRotate(value: Double): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRotateUndefined: Self = StObject.set(x, "rotate", js.undefined)
      
      @scala.inline
      def setTextAlign(value: center | end | left | right | start): Self = StObject.set(x, "textAlign", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextAlignUndefined: Self = StObject.set(x, "textAlign", js.undefined)
      
      @scala.inline
      def setTextBaseline(value: top | middle | bottom): Self = StObject.set(x, "textBaseline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTextBaselineUndefined: Self = StObject.set(x, "textBaseline", js.undefined)
    }
  }
  
  trait tickLine
    extends StObject
       with line {
    
    /**
      * 刻度线的长度，可以为负值（表示反方向渲染）
      */
    var length: js.UndefOr[Double] = js.undefined
  }
  object tickLine {
    
    @scala.inline
    def apply(): tickLine = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[tickLine]
    }
    
    @scala.inline
    implicit class tickLineMutableBuilder[Self <: tickLine] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setLength(value: Double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
    }
  }
}
