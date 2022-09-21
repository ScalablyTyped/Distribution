package typings.antvG2plot

import typings.antvG2plot.attrMod.ShapeStyle
import typings.antvG2plot.attrMod.StyleAttr
import typings.antvG2plot.typesCommonMod.Datum
import typings.antvG2plot.typesCommonMod.Options
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object stockTypesMod {
  
  trait StockOptions
    extends StObject
       with Options {
    
    /**
      * @title 下跌色
      */
    val fallingFill: js.UndefOr[String] = js.undefined
    
    /**
      * @title 颜色配置
      * @description  不支持 color 配置
      */
    /**
      * @title 上涨色
      */
    val risingFill: js.UndefOr[String] = js.undefined
    
    /**
      * @title 样式配置
      */
    val stockStyle: js.UndefOr[StyleAttr] = js.undefined
    
    /**
      * @title x 轴字段 日期
      */
    val xField: String
    
    /**
      * @title y 轴映射
      * @description   range  【开盘价/收盘价/最高价/最低价】，设置一个指定 [open, close, high, low]【开盘价/收盘价/最高价/最低价】字段的数组
      */
    val yField: js.Tuple4[String, String, String, String]
  }
  object StockOptions {
    
    inline def apply(
      data: js.Array[Record[String, Any]],
      xField: String,
      yField: js.Tuple4[String, String, String, String]
    ): StockOptions = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], xField = xField.asInstanceOf[js.Any], yField = yField.asInstanceOf[js.Any])
      __obj.asInstanceOf[StockOptions]
    }
    
    extension [Self <: StockOptions](x: Self) {
      
      inline def setFallingFill(value: String): Self = StObject.set(x, "fallingFill", value.asInstanceOf[js.Any])
      
      inline def setFallingFillUndefined: Self = StObject.set(x, "fallingFill", js.undefined)
      
      inline def setRisingFill(value: String): Self = StObject.set(x, "risingFill", value.asInstanceOf[js.Any])
      
      inline def setRisingFillUndefined: Self = StObject.set(x, "risingFill", js.undefined)
      
      inline def setStockStyle(value: StyleAttr): Self = StObject.set(x, "stockStyle", value.asInstanceOf[js.Any])
      
      inline def setStockStyleFunction1(value: /* datum */ Datum => ShapeStyle): Self = StObject.set(x, "stockStyle", js.Any.fromFunction1(value))
      
      inline def setStockStyleUndefined: Self = StObject.set(x, "stockStyle", js.undefined)
      
      inline def setXField(value: String): Self = StObject.set(x, "xField", value.asInstanceOf[js.Any])
      
      inline def setYField(value: js.Tuple4[String, String, String, String]): Self = StObject.set(x, "yField", value.asInstanceOf[js.Any])
    }
  }
}
