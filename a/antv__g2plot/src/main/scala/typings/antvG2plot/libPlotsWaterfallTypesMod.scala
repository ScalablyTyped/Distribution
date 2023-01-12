package typings.antvG2plot

import typings.antvG2plot.antvG2plotBooleans.`false`
import typings.antvG2plot.antvG2plotStrings.absolute
import typings.antvG2plot.antvG2plotStrings.difference
import typings.antvG2plot.libTypesAttrMod.ShapeStyle
import typings.antvG2plot.libTypesAttrMod.StyleAttr
import typings.antvG2plot.libTypesCommonMod.Datum
import typings.antvG2plot.libTypesCommonMod.Options
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPlotsWaterfallTypesMod {
  
  /** leaderLineCfg of waterfall */
  trait LeaderLineCfg extends StObject {
    
    /**
      * @title 样式
      */
    var style: js.UndefOr[ShapeStyle] = js.undefined
  }
  object LeaderLineCfg {
    
    inline def apply(): LeaderLineCfg = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[LeaderLineCfg]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: LeaderLineCfg] (val x: Self) extends AnyVal {
      
      inline def setStyle(value: ShapeStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  /** totalCfg of waterfall */
  trait TotalCfg extends StObject {
    
    /**
      * @title 总计的标签
      */
    var label: js.UndefOr[String] = js.undefined
    
    /**
      * @title 样式
      */
    var style: js.UndefOr[ShapeStyle] = js.undefined
  }
  object TotalCfg {
    
    inline def apply(): TotalCfg = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TotalCfg]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TotalCfg] (val x: Self) extends AnyVal {
      
      inline def setLabel(value: String): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setStyle(value: ShapeStyle): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  trait WaterfallOptions
    extends StObject
       with Options {
    
    /**
      * @title 柱状图宽度占比
      * @description 范围0-1
      */
    val columnWidthRatio: js.UndefOr[Double] = js.undefined
    
    /**
      * @title 下跌色
      */
    val fallingFill: js.UndefOr[String] = js.undefined
    
    /**
      * @title label 数据模式
      * @description absolute' | 'difference'
      * @default "difference"
      */
    val labelMode: js.UndefOr[absolute | difference] = js.undefined
    
    /**
      * @title 是否展示 柱子间牵引线
      * @description false | LeaderLineCfg
      */
    val leaderLine: js.UndefOr[`false` | LeaderLineCfg] = js.undefined
    
    /**
      * @title 上涨色
      */
    val risingFill: js.UndefOr[String] = js.undefined
    
    /**
      * @title 是否展示 总计
      * @description   false | TotalCfg
      */
    val total: js.UndefOr[`false` | TotalCfg] = js.undefined
    
    /**
      * @title 柱子样式配置
      * @description 注意: fill 不再生效，直接使用 risingFill, fallingFill 或 color
      */
    val waterfallStyle: js.UndefOr[StyleAttr] = js.undefined
    
    /**
      * @title x 轴字段
      */
    val xField: String
    
    /**
      * @title y 轴字段
      */
    val yField: String
  }
  object WaterfallOptions {
    
    inline def apply(data: js.Array[Record[String, Any]], xField: String, yField: String): WaterfallOptions = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], xField = xField.asInstanceOf[js.Any], yField = yField.asInstanceOf[js.Any])
      __obj.asInstanceOf[WaterfallOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: WaterfallOptions] (val x: Self) extends AnyVal {
      
      inline def setColumnWidthRatio(value: Double): Self = StObject.set(x, "columnWidthRatio", value.asInstanceOf[js.Any])
      
      inline def setColumnWidthRatioUndefined: Self = StObject.set(x, "columnWidthRatio", js.undefined)
      
      inline def setFallingFill(value: String): Self = StObject.set(x, "fallingFill", value.asInstanceOf[js.Any])
      
      inline def setFallingFillUndefined: Self = StObject.set(x, "fallingFill", js.undefined)
      
      inline def setLabelMode(value: absolute | difference): Self = StObject.set(x, "labelMode", value.asInstanceOf[js.Any])
      
      inline def setLabelModeUndefined: Self = StObject.set(x, "labelMode", js.undefined)
      
      inline def setLeaderLine(value: `false` | LeaderLineCfg): Self = StObject.set(x, "leaderLine", value.asInstanceOf[js.Any])
      
      inline def setLeaderLineUndefined: Self = StObject.set(x, "leaderLine", js.undefined)
      
      inline def setRisingFill(value: String): Self = StObject.set(x, "risingFill", value.asInstanceOf[js.Any])
      
      inline def setRisingFillUndefined: Self = StObject.set(x, "risingFill", js.undefined)
      
      inline def setTotal(value: `false` | TotalCfg): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
      
      inline def setTotalUndefined: Self = StObject.set(x, "total", js.undefined)
      
      inline def setWaterfallStyle(value: StyleAttr): Self = StObject.set(x, "waterfallStyle", value.asInstanceOf[js.Any])
      
      inline def setWaterfallStyleFunction1(value: /* datum */ Datum => ShapeStyle): Self = StObject.set(x, "waterfallStyle", js.Any.fromFunction1(value))
      
      inline def setWaterfallStyleUndefined: Self = StObject.set(x, "waterfallStyle", js.undefined)
      
      inline def setXField(value: String): Self = StObject.set(x, "xField", value.asInstanceOf[js.Any])
      
      inline def setYField(value: String): Self = StObject.set(x, "yField", value.asInstanceOf[js.Any])
    }
  }
}
