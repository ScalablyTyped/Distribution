package typings.antvG2plot

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libTypesPatternMod {
  
  trait DotPatternCfg
    extends StObject
       with PatternCfg {
    
    /**
      * @title 是否交错
      * @default true
      */
    var isStagger: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @title 点间距
      * @default 4
      */
    var padding: js.UndefOr[Double] = js.undefined
    
    /**
      * @title 点的大小
      * @default 4
      */
    var size: js.UndefOr[Double] = js.undefined
  }
  object DotPatternCfg {
    
    inline def apply(): DotPatternCfg = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DotPatternCfg]
    }
    
    extension [Self <: DotPatternCfg](x: Self) {
      
      inline def setIsStagger(value: Boolean): Self = StObject.set(x, "isStagger", value.asInstanceOf[js.Any])
      
      inline def setIsStaggerUndefined: Self = StObject.set(x, "isStagger", js.undefined)
      
      inline def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
  
  trait LinePatternCfg
    extends StObject
       with PatternCfg {
    
    /**
      * @title 线之间的距离
      */
    var spacing: js.UndefOr[Double] = js.undefined
  }
  object LinePatternCfg {
    
    inline def apply(): LinePatternCfg = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LinePatternCfg]
    }
    
    extension [Self <: LinePatternCfg](x: Self) {
      
      inline def setSpacing(value: Double): Self = StObject.set(x, "spacing", value.asInstanceOf[js.Any])
      
      inline def setSpacingUndefined: Self = StObject.set(x, "spacing", js.undefined)
    }
  }
  
  trait PatternCfg extends StObject {
    
    /**
      * @title 背景色
      * @description pattern background color. Default: inherit (默认: 继承图形元素颜色)
      * @default "inherit"
      */
    var backgroundColor: js.UndefOr[String] = js.undefined
    
    /**
      * @title 贴图图案填充色
      */
    var fill: js.UndefOr[String] = js.undefined
    
    /**
      * @title 填充透明度
      */
    var fillOpacity: js.UndefOr[Double] = js.undefined
    
    /**
      * @title 描边粗细
      */
    var lineWidth: js.UndefOr[Double] = js.undefined
    
    /**
      * @title 透明度
      * @description 整个pattern 透明度
      */
    var opacity: js.UndefOr[Double] = js.undefined
    
    /**
      * @title 旋转角度
      * @description 整个pattern 的旋转角度
      */
    var rotation: js.UndefOr[Double] = js.undefined
    
    /**
      * @title 描边色
      * @description 贴图图案描边色
      */
    var stroke: js.UndefOr[String] = js.undefined
    
    /**
      * @title 描边透明度
      */
    var strokeOpacity: js.UndefOr[Double] = js.undefined
  }
  object PatternCfg {
    
    inline def apply(): PatternCfg = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PatternCfg]
    }
    
    extension [Self <: PatternCfg](x: Self) {
      
      inline def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      inline def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      inline def setFill(value: String): Self = StObject.set(x, "fill", value.asInstanceOf[js.Any])
      
      inline def setFillOpacity(value: Double): Self = StObject.set(x, "fillOpacity", value.asInstanceOf[js.Any])
      
      inline def setFillOpacityUndefined: Self = StObject.set(x, "fillOpacity", js.undefined)
      
      inline def setFillUndefined: Self = StObject.set(x, "fill", js.undefined)
      
      inline def setLineWidth(value: Double): Self = StObject.set(x, "lineWidth", value.asInstanceOf[js.Any])
      
      inline def setLineWidthUndefined: Self = StObject.set(x, "lineWidth", js.undefined)
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
      
      inline def setRotation(value: Double): Self = StObject.set(x, "rotation", value.asInstanceOf[js.Any])
      
      inline def setRotationUndefined: Self = StObject.set(x, "rotation", js.undefined)
      
      inline def setStroke(value: String): Self = StObject.set(x, "stroke", value.asInstanceOf[js.Any])
      
      inline def setStrokeOpacity(value: Double): Self = StObject.set(x, "strokeOpacity", value.asInstanceOf[js.Any])
      
      inline def setStrokeOpacityUndefined: Self = StObject.set(x, "strokeOpacity", js.undefined)
      
      inline def setStrokeUndefined: Self = StObject.set(x, "stroke", js.undefined)
    }
  }
  
  trait SquarePatternCfg
    extends StObject
       with PatternCfg {
    
    /**
      * @title 是否交错
      * @description 即 staggered squares.
      * @default true
      */
    var isStagger: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @title 矩形之间的间隔
      */
    var padding: js.UndefOr[Double] = js.undefined
    
    /**
      * @title 矩形的大小
      */
    var size: js.UndefOr[Double] = js.undefined
  }
  object SquarePatternCfg {
    
    inline def apply(): SquarePatternCfg = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[SquarePatternCfg]
    }
    
    extension [Self <: SquarePatternCfg](x: Self) {
      
      inline def setIsStagger(value: Boolean): Self = StObject.set(x, "isStagger", value.asInstanceOf[js.Any])
      
      inline def setIsStaggerUndefined: Self = StObject.set(x, "isStagger", js.undefined)
      
      inline def setPadding(value: Double): Self = StObject.set(x, "padding", value.asInstanceOf[js.Any])
      
      inline def setPaddingUndefined: Self = StObject.set(x, "padding", js.undefined)
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
    }
  }
}
