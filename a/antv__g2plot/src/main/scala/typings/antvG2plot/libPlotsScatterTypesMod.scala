package typings.antvG2plot

import typings.antvComponent.libTypesMod.EnhancedTextBackgroundCfg
import typings.antvG2.libInterfaceMod.ComponentAnimateOption
import typings.antvG2plot.antvG2plotStrings.dodge
import typings.antvG2plot.antvG2plotStrings.head
import typings.antvG2plot.antvG2plotStrings.jitter
import typings.antvG2plot.antvG2plotStrings.middle
import typings.antvG2plot.antvG2plotStrings.stack
import typings.antvG2plot.antvG2plotStrings.symmetric
import typings.antvG2plot.antvG2plotStrings.tail
import typings.antvG2plot.libTypesAttrMod.ShapeAttr
import typings.antvG2plot.libTypesAttrMod.ShapeStyle
import typings.antvG2plot.libTypesAttrMod.SizeAttr
import typings.antvG2plot.libTypesAttrMod.StyleAttr
import typings.antvG2plot.libTypesCommonMod.AnnotationPosition
import typings.antvG2plot.libTypesCommonMod.Datum
import typings.antvG2plot.libTypesCommonMod.Options
import typings.antvG2plot.libTypesCommonMod.RegionPositionBaseOption
import typings.antvG2plot.libTypesInteractionMod.BrushCfg
import typings.antvG2plot.libTypesLegendMod.Legend
import typings.antvGBase.libTypesMod.ShapeAttrs
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPlotsScatterTypesMod {
  
  /* Inlined parent std.Omit<@antv/g2plot.@antv/g2plot/lib/types.TextOption, 'position'> */
  trait Labels extends StObject {
    
    var animate: js.UndefOr[Boolean] = js.undefined
    
    var animateOption: js.UndefOr[ComponentAnimateOption] = js.undefined
    
    var autoEllipsis: js.UndefOr[Boolean] = js.undefined
    
    var background: js.UndefOr[EnhancedTextBackgroundCfg] = js.undefined
    
    var content: js.UndefOr[
        String | Double | (js.Function1[/* filteredData */ js.Array[js.Object], String | Double])
      ] = js.undefined
    
    var ellipsisPosition: js.UndefOr[head | middle | tail] = js.undefined
    
    var isVertical: js.UndefOr[Boolean] = js.undefined
    
    var maxLength: js.UndefOr[Double] = js.undefined
    
    var offsetX: js.UndefOr[Double] = js.undefined
    
    var offsetY: js.UndefOr[Double] = js.undefined
    
    var position: js.UndefOr[AnnotationPosition] = js.undefined
    
    var rotate: js.UndefOr[Double] = js.undefined
    
    var style: js.UndefOr[ShapeAttrs] = js.undefined
    
    var top: js.UndefOr[Boolean] = js.undefined
    
    var `type`: js.UndefOr[String] = js.undefined
  }
  object Labels {
    
    inline def apply(): Labels = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Labels]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Labels] (val x: Self) extends AnyVal {
      
      inline def setAnimate(value: Boolean): Self = StObject.set(x, "animate", value.asInstanceOf[js.Any])
      
      inline def setAnimateOption(value: ComponentAnimateOption): Self = StObject.set(x, "animateOption", value.asInstanceOf[js.Any])
      
      inline def setAnimateOptionUndefined: Self = StObject.set(x, "animateOption", js.undefined)
      
      inline def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
      
      inline def setAutoEllipsis(value: Boolean): Self = StObject.set(x, "autoEllipsis", value.asInstanceOf[js.Any])
      
      inline def setAutoEllipsisUndefined: Self = StObject.set(x, "autoEllipsis", js.undefined)
      
      inline def setBackground(value: EnhancedTextBackgroundCfg): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      inline def setContent(value: String | Double | (js.Function1[/* filteredData */ js.Array[js.Object], String | Double])): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
      
      inline def setContentFunction1(value: /* filteredData */ js.Array[js.Object] => String | Double): Self = StObject.set(x, "content", js.Any.fromFunction1(value))
      
      inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
      
      inline def setEllipsisPosition(value: head | middle | tail): Self = StObject.set(x, "ellipsisPosition", value.asInstanceOf[js.Any])
      
      inline def setEllipsisPositionUndefined: Self = StObject.set(x, "ellipsisPosition", js.undefined)
      
      inline def setIsVertical(value: Boolean): Self = StObject.set(x, "isVertical", value.asInstanceOf[js.Any])
      
      inline def setIsVerticalUndefined: Self = StObject.set(x, "isVertical", js.undefined)
      
      inline def setMaxLength(value: Double): Self = StObject.set(x, "maxLength", value.asInstanceOf[js.Any])
      
      inline def setMaxLengthUndefined: Self = StObject.set(x, "maxLength", js.undefined)
      
      inline def setOffsetX(value: Double): Self = StObject.set(x, "offsetX", value.asInstanceOf[js.Any])
      
      inline def setOffsetXUndefined: Self = StObject.set(x, "offsetX", js.undefined)
      
      inline def setOffsetY(value: Double): Self = StObject.set(x, "offsetY", value.asInstanceOf[js.Any])
      
      inline def setOffsetYUndefined: Self = StObject.set(x, "offsetY", js.undefined)
      
      inline def setPosition(value: AnnotationPosition): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
      
      inline def setPositionFunction2(
        value: (/* xScales */ (js.Array[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Scale */ Any
            ]) | (Record[
              String, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Scale */ Any
            ]), /* yScales */ (js.Array[
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Scale */ Any
            ]) | (Record[
              String, 
              /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify Scale */ Any
            ])) => js.Tuple2[Double | String, Double | String]
      ): Self = StObject.set(x, "position", js.Any.fromFunction2(value))
      
      inline def setPositionUndefined: Self = StObject.set(x, "position", js.undefined)
      
      inline def setRotate(value: Double): Self = StObject.set(x, "rotate", value.asInstanceOf[js.Any])
      
      inline def setRotateUndefined: Self = StObject.set(x, "rotate", js.undefined)
      
      inline def setStyle(value: ShapeAttrs): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTop(value: Boolean): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait QuadrantOptions extends StObject {
    
    /**
      * @title 象限文本
      */
    val labels: js.UndefOr[js.Array[Labels]] = js.undefined
    
    /**
      * @title 配置象限分割线的样式
      */
    val lineStyle: js.UndefOr[RegionPositionBaseOption] = js.undefined
    
    /**
      * @title 象限样式
      */
    val regionStyle: js.UndefOr[js.Array[RegionPositionBaseOption]] = js.undefined
    
    /**
      * @title x 基准线
      * @description x 方向上的象限分割基准线
      * @default 0
      */
    val xBaseline: js.UndefOr[Double] = js.undefined
    
    /**
      * @title y 基准线
      * @description y 方向上的象限分割基准线
      * @default 0
      */
    val yBaseline: js.UndefOr[Double] = js.undefined
  }
  object QuadrantOptions {
    
    inline def apply(): QuadrantOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[QuadrantOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: QuadrantOptions] (val x: Self) extends AnyVal {
      
      inline def setLabels(value: js.Array[Labels]): Self = StObject.set(x, "labels", value.asInstanceOf[js.Any])
      
      inline def setLabelsUndefined: Self = StObject.set(x, "labels", js.undefined)
      
      inline def setLabelsVarargs(value: Labels*): Self = StObject.set(x, "labels", js.Array(value*))
      
      inline def setLineStyle(value: RegionPositionBaseOption): Self = StObject.set(x, "lineStyle", value.asInstanceOf[js.Any])
      
      inline def setLineStyleUndefined: Self = StObject.set(x, "lineStyle", js.undefined)
      
      inline def setRegionStyle(value: js.Array[RegionPositionBaseOption]): Self = StObject.set(x, "regionStyle", value.asInstanceOf[js.Any])
      
      inline def setRegionStyleUndefined: Self = StObject.set(x, "regionStyle", js.undefined)
      
      inline def setRegionStyleVarargs(value: RegionPositionBaseOption*): Self = StObject.set(x, "regionStyle", js.Array(value*))
      
      inline def setXBaseline(value: Double): Self = StObject.set(x, "xBaseline", value.asInstanceOf[js.Any])
      
      inline def setXBaselineUndefined: Self = StObject.set(x, "xBaseline", js.undefined)
      
      inline def setYBaseline(value: Double): Self = StObject.set(x, "yBaseline", value.asInstanceOf[js.Any])
      
      inline def setYBaselineUndefined: Self = StObject.set(x, "yBaseline", js.undefined)
    }
  }
  
  trait RegressionLineOptions extends StObject {
    
    /**
      * @title 自定义算法
      * @description  [[0,0],[100,100]]
      */
    val algorithm: js.UndefOr[
        (js.Array[js.Tuple2[Double, Double]]) | (js.Function1[/* data */ Any, js.Array[js.Tuple2[Double, Double]]])
      ] = js.undefined
    
    /**
      * @title 配置回归线样式
      */
    val style: js.UndefOr[ShapeStyle] = js.undefined
    
    /**
      * @title 是否顶层显示
      * @default false
      */
    val top: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @title 回归线类型
      */
    val `type`: js.UndefOr[String] = js.undefined
  }
  object RegressionLineOptions {
    
    inline def apply(): RegressionLineOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RegressionLineOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RegressionLineOptions] (val x: Self) extends AnyVal {
      
      inline def setAlgorithm(
        value: (js.Array[js.Tuple2[Double, Double]]) | (js.Function1[/* data */ Any, js.Array[js.Tuple2[Double, Double]]])
      ): Self = StObject.set(x, "algorithm", value.asInstanceOf[js.Any])
      
      inline def setAlgorithmFunction1(value: /* data */ Any => js.Array[js.Tuple2[Double, Double]]): Self = StObject.set(x, "algorithm", js.Any.fromFunction1(value))
      
      inline def setAlgorithmUndefined: Self = StObject.set(x, "algorithm", js.undefined)
      
      inline def setAlgorithmVarargs(value: (js.Tuple2[Double, Double])*): Self = StObject.set(x, "algorithm", js.Array(value*))
      
      inline def setStyle(value: ShapeStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setTop(value: Boolean): Self = StObject.set(x, "top", value.asInstanceOf[js.Any])
      
      inline def setTopUndefined: Self = StObject.set(x, "top", js.undefined)
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  trait ScatterOptions
    extends StObject
       with Options {
    
    /**
      * @title 图表交互
      */
    val brush: js.UndefOr[BrushCfg] = js.undefined
    
    /**
      * @title 点颜色映射对应的数据字段名
      */
    val colorField: js.UndefOr[String] = js.undefined
    
    /**
      * @title 散点图样式
      */
    val pointStyle: js.UndefOr[StyleAttr] = js.undefined
    
    /**
      * @title 四象限组件
      */
    val quadrant: js.UndefOr[QuadrantOptions] = js.undefined
    
    /**
      * @title 归曲线
      */
    val regressionLine: js.UndefOr[RegressionLineOptions] = js.undefined
    
    /**
      * @title 散点图形状
      */
    val shape: js.UndefOr[ShapeAttr] = js.undefined
    
    /**
      * @title 点形状映射对应的数据字段名
      */
    val shapeField: js.UndefOr[String] = js.undefined
    
    /**
      * @title shape 对应的图例
      */
    val shapeLegend: js.UndefOr[Legend] = js.undefined
    
    /**
      * @title 散点图大小
      */
    val size: js.UndefOr[SizeAttr] = js.undefined
    
    /**
      * @title 点大小映射对应的数据字段名
      */
    val sizeField: js.UndefOr[String] = js.undefined
    
    /**
      * @title size 对应的图例
      */
    val sizeLegend: js.UndefOr[Legend] = js.undefined
    
    /**
      * @title 数据调整类型
      * @description 数据调整类型 'jitter' | 'stack' | 'symmetric' | 'dodge'
      */
    val `type`: js.UndefOr[jitter | stack | symmetric | dodge] = js.undefined
    
    /**
      * @title x 轴字段
      */
    val xField: String
    
    /**
      * @title y 轴字段
      */
    val yField: String
  }
  object ScatterOptions {
    
    inline def apply(data: js.Array[Record[String, Any]], xField: String, yField: String): ScatterOptions = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], xField = xField.asInstanceOf[js.Any], yField = yField.asInstanceOf[js.Any])
      __obj.asInstanceOf[ScatterOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ScatterOptions] (val x: Self) extends AnyVal {
      
      inline def setBrush(value: BrushCfg): Self = StObject.set(x, "brush", value.asInstanceOf[js.Any])
      
      inline def setBrushUndefined: Self = StObject.set(x, "brush", js.undefined)
      
      inline def setColorField(value: String): Self = StObject.set(x, "colorField", value.asInstanceOf[js.Any])
      
      inline def setColorFieldUndefined: Self = StObject.set(x, "colorField", js.undefined)
      
      inline def setPointStyle(value: StyleAttr): Self = StObject.set(x, "pointStyle", value.asInstanceOf[js.Any])
      
      inline def setPointStyleFunction1(value: /* datum */ Datum => ShapeStyle): Self = StObject.set(x, "pointStyle", js.Any.fromFunction1(value))
      
      inline def setPointStyleUndefined: Self = StObject.set(x, "pointStyle", js.undefined)
      
      inline def setQuadrant(value: QuadrantOptions): Self = StObject.set(x, "quadrant", value.asInstanceOf[js.Any])
      
      inline def setQuadrantUndefined: Self = StObject.set(x, "quadrant", js.undefined)
      
      inline def setRegressionLine(value: RegressionLineOptions): Self = StObject.set(x, "regressionLine", value.asInstanceOf[js.Any])
      
      inline def setRegressionLineUndefined: Self = StObject.set(x, "regressionLine", js.undefined)
      
      inline def setShape(value: ShapeAttr): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      inline def setShapeField(value: String): Self = StObject.set(x, "shapeField", value.asInstanceOf[js.Any])
      
      inline def setShapeFieldUndefined: Self = StObject.set(x, "shapeField", js.undefined)
      
      inline def setShapeFunction1(value: /* datum */ Datum => String): Self = StObject.set(x, "shape", js.Any.fromFunction1(value))
      
      inline def setShapeLegend(value: Legend): Self = StObject.set(x, "shapeLegend", value.asInstanceOf[js.Any])
      
      inline def setShapeLegendUndefined: Self = StObject.set(x, "shapeLegend", js.undefined)
      
      inline def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
      
      inline def setShapeVarargs(value: String*): Self = StObject.set(x, "shape", js.Array(value*))
      
      inline def setSize(value: SizeAttr): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeField(value: String): Self = StObject.set(x, "sizeField", value.asInstanceOf[js.Any])
      
      inline def setSizeFieldUndefined: Self = StObject.set(x, "sizeField", js.undefined)
      
      inline def setSizeFunction1(value: /* datum */ Datum => Double): Self = StObject.set(x, "size", js.Any.fromFunction1(value))
      
      inline def setSizeLegend(value: Legend): Self = StObject.set(x, "sizeLegend", value.asInstanceOf[js.Any])
      
      inline def setSizeLegendUndefined: Self = StObject.set(x, "sizeLegend", js.undefined)
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setType(value: jitter | stack | symmetric | dodge): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setXField(value: String): Self = StObject.set(x, "xField", value.asInstanceOf[js.Any])
      
      inline def setYField(value: String): Self = StObject.set(x, "yField", value.asInstanceOf[js.Any])
    }
  }
}
