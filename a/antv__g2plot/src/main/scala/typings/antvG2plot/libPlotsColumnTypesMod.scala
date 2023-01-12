package typings.antvG2plot

import typings.antvG2plot.anon.`0`
import typings.antvG2plot.anon.`4`
import typings.antvG2plot.anon.`5`
import typings.antvG2plot.anon.`6`
import typings.antvG2plot.libAdaptorConnectedAreaMod.OptionWithConnectedArea
import typings.antvG2plot.libAdaptorConversionTagMod.OptionWithConversionTag
import typings.antvG2plot.libTypesAttrMod.ShapeStyle
import typings.antvG2plot.libTypesAttrMod.StyleAttr
import typings.antvG2plot.libTypesCommonMod.Datum
import typings.antvG2plot.libTypesCommonMod.Options
import typings.antvG2plot.libTypesCoordinateMod.Transformations
import typings.antvG2plot.libTypesInteractionMod.BrushCfg
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPlotsColumnTypesMod {
  
  trait ColumnOptions
    extends StObject
       with Options
       with OptionWithConversionTag
       with OptionWithConnectedArea
       with PartialIntervalGeometryOptions {
    
    /**
      * @title 图表交互
      * @description 开启下钻交互，以及进行下钻交互的配置
      */
    val brush: js.UndefOr[BrushCfg] = js.undefined
    
    /**
      * @title 柱状图柱子的背景
      */
    val columnBackground: js.UndefOr[`0`] = js.undefined
    
    /**
      * @title 柱子样式
      */
    val columnStyle: js.UndefOr[StyleAttr] = js.undefined
    
    /**
      * @title 柱状图宽度占比
      * @description 范围[0-1]
      */
    val columnWidthRatio: js.UndefOr[Double] = js.undefined
    
    /**
      * @title 坐标转换
      * @description 可以对坐标系进行转换，如: reflectX, reflectY, transpose 等
      */
    val coordinate: js.UndefOr[Transformations] = js.undefined
    
    /**
      * @title 分组字段
      * @description 优先级高于 seriesField , isGroup: true 时会根据 groupField 进行分组
      */
    val groupField: js.UndefOr[String] = js.undefined
    
    /**
      * @title 是否分组柱形图
      * @default false
      */
    val isGroup: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @title 是否是百分比柱状图
      * @default false
      */
    val isPercent: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @title 是否是区间柱状图
      * @default false
      */
    val isRange: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @title 是否堆积柱状图
      * @default false
      */
    val isStack: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @title 分组中柱子之间的间距
      * @description 范围[0-1]，仅对分组柱状图适用
      */
    val marginRatio: js.UndefOr[Double] = js.undefined
    
    /**
      * @title 柱状图最大宽度（像素）
      */
    val maxColumnWidth: js.UndefOr[Double] = js.undefined
    
    /**
      * @title 柱状图最小宽度（像素）
      */
    val minColumnWidth: js.UndefOr[Double] = js.undefined
    
    /**
      * @title 拆分字段
      */
    val seriesField: js.UndefOr[String] = js.undefined
    
    /**
      * @title 自定义柱状图
      * @description interval 图形元素展示形状
      */
    val shape: js.UndefOr[String] = js.undefined
    
    /**
      * @title x轴字段
      */
    val xField: String
    
    /**
      * @title y轴字段
      */
    val yField: String
  }
  object ColumnOptions {
    
    inline def apply(data: js.Array[Record[String, Any]], xField: String, yField: String): ColumnOptions = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], xField = xField.asInstanceOf[js.Any], yField = yField.asInstanceOf[js.Any])
      __obj.asInstanceOf[ColumnOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ColumnOptions] (val x: Self) extends AnyVal {
      
      inline def setBrush(value: BrushCfg): Self = StObject.set(x, "brush", value.asInstanceOf[js.Any])
      
      inline def setBrushUndefined: Self = StObject.set(x, "brush", js.undefined)
      
      inline def setColumnBackground(value: `0`): Self = StObject.set(x, "columnBackground", value.asInstanceOf[js.Any])
      
      inline def setColumnBackgroundUndefined: Self = StObject.set(x, "columnBackground", js.undefined)
      
      inline def setColumnStyle(value: StyleAttr): Self = StObject.set(x, "columnStyle", value.asInstanceOf[js.Any])
      
      inline def setColumnStyleFunction1(value: /* datum */ Datum => ShapeStyle): Self = StObject.set(x, "columnStyle", js.Any.fromFunction1(value))
      
      inline def setColumnStyleUndefined: Self = StObject.set(x, "columnStyle", js.undefined)
      
      inline def setColumnWidthRatio(value: Double): Self = StObject.set(x, "columnWidthRatio", value.asInstanceOf[js.Any])
      
      inline def setColumnWidthRatioUndefined: Self = StObject.set(x, "columnWidthRatio", js.undefined)
      
      inline def setCoordinate(value: Transformations): Self = StObject.set(x, "coordinate", value.asInstanceOf[js.Any])
      
      inline def setCoordinateUndefined: Self = StObject.set(x, "coordinate", js.undefined)
      
      inline def setCoordinateVarargs(value: (`4` | `5` | `6`)*): Self = StObject.set(x, "coordinate", js.Array(value*))
      
      inline def setGroupField(value: String): Self = StObject.set(x, "groupField", value.asInstanceOf[js.Any])
      
      inline def setGroupFieldUndefined: Self = StObject.set(x, "groupField", js.undefined)
      
      inline def setIsGroup(value: Boolean): Self = StObject.set(x, "isGroup", value.asInstanceOf[js.Any])
      
      inline def setIsGroupUndefined: Self = StObject.set(x, "isGroup", js.undefined)
      
      inline def setIsPercent(value: Boolean): Self = StObject.set(x, "isPercent", value.asInstanceOf[js.Any])
      
      inline def setIsPercentUndefined: Self = StObject.set(x, "isPercent", js.undefined)
      
      inline def setIsRange(value: Boolean): Self = StObject.set(x, "isRange", value.asInstanceOf[js.Any])
      
      inline def setIsRangeUndefined: Self = StObject.set(x, "isRange", js.undefined)
      
      inline def setIsStack(value: Boolean): Self = StObject.set(x, "isStack", value.asInstanceOf[js.Any])
      
      inline def setIsStackUndefined: Self = StObject.set(x, "isStack", js.undefined)
      
      inline def setMarginRatio(value: Double): Self = StObject.set(x, "marginRatio", value.asInstanceOf[js.Any])
      
      inline def setMarginRatioUndefined: Self = StObject.set(x, "marginRatio", js.undefined)
      
      inline def setMaxColumnWidth(value: Double): Self = StObject.set(x, "maxColumnWidth", value.asInstanceOf[js.Any])
      
      inline def setMaxColumnWidthUndefined: Self = StObject.set(x, "maxColumnWidth", js.undefined)
      
      inline def setMinColumnWidth(value: Double): Self = StObject.set(x, "minColumnWidth", value.asInstanceOf[js.Any])
      
      inline def setMinColumnWidthUndefined: Self = StObject.set(x, "minColumnWidth", js.undefined)
      
      inline def setSeriesField(value: String): Self = StObject.set(x, "seriesField", value.asInstanceOf[js.Any])
      
      inline def setSeriesFieldUndefined: Self = StObject.set(x, "seriesField", js.undefined)
      
      inline def setShape(value: String): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      inline def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
      
      inline def setXField(value: String): Self = StObject.set(x, "xField", value.asInstanceOf[js.Any])
      
      inline def setYField(value: String): Self = StObject.set(x, "yField", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined std.Pick<@antv/g2plot.@antv/g2plot/lib/adaptor/geometries/interval.IntervalGeometryOptions, 'dodgePadding' | 'intervalPadding'> */
  trait PartialIntervalGeometryOptions extends StObject {
    
    var dodgePadding: js.UndefOr[Double] = js.undefined
    
    var intervalPadding: js.UndefOr[Double] = js.undefined
  }
  object PartialIntervalGeometryOptions {
    
    inline def apply(): PartialIntervalGeometryOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialIntervalGeometryOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialIntervalGeometryOptions] (val x: Self) extends AnyVal {
      
      inline def setDodgePadding(value: Double): Self = StObject.set(x, "dodgePadding", value.asInstanceOf[js.Any])
      
      inline def setDodgePaddingUndefined: Self = StObject.set(x, "dodgePadding", js.undefined)
      
      inline def setIntervalPadding(value: Double): Self = StObject.set(x, "intervalPadding", value.asInstanceOf[js.Any])
      
      inline def setIntervalPaddingUndefined: Self = StObject.set(x, "intervalPadding", js.undefined)
    }
  }
}
