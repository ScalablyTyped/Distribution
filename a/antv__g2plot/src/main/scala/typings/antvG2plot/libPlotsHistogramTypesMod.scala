package typings.antvG2plot

import typings.antvG2plot.libTypesAttrMod.ShapeStyle
import typings.antvG2plot.libTypesAttrMod.StyleAttr
import typings.antvG2plot.libTypesCommonMod.Datum
import typings.antvG2plot.libTypesCommonMod.Options
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPlotsHistogramTypesMod {
  
  trait HistogramOptions
    extends StObject
       with Options {
    
    /**
      * @title 直方图绘制字段
      * @description   设置直方图绘制 (进行分箱) 的字段
      */
    val binField: String
    
    /**
      * @title 设置直方图的分箱数量
      * @description   binNumber 影响直方图分箱后每个柱子的宽度
      */
    val binNumber: js.UndefOr[Double] = js.undefined
    
    /**
      * @title 设置直方图的分箱宽度
      * @description   binWidth 影响直方图分成多少箱,不能与binNumber一起使用
      */
    val binWidth: js.UndefOr[Double] = js.undefined
    
    /**
      * @title 柱子样式配置
      */
    val columnStyle: js.UndefOr[StyleAttr] = js.undefined
    
    /**
      * @title 指定层叠字段
      * @description   通过该字段的值，柱子将会被分割为多个部分，通过颜色进行区分
      */
    val stackField: js.UndefOr[String] = js.undefined
  }
  object HistogramOptions {
    
    inline def apply(binField: String, data: js.Array[Record[String, Any]]): HistogramOptions = {
      val __obj = js.Dynamic.literal(binField = binField.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[HistogramOptions]
    }
    
    extension [Self <: HistogramOptions](x: Self) {
      
      inline def setBinField(value: String): Self = StObject.set(x, "binField", value.asInstanceOf[js.Any])
      
      inline def setBinNumber(value: Double): Self = StObject.set(x, "binNumber", value.asInstanceOf[js.Any])
      
      inline def setBinNumberUndefined: Self = StObject.set(x, "binNumber", js.undefined)
      
      inline def setBinWidth(value: Double): Self = StObject.set(x, "binWidth", value.asInstanceOf[js.Any])
      
      inline def setBinWidthUndefined: Self = StObject.set(x, "binWidth", js.undefined)
      
      inline def setColumnStyle(value: StyleAttr): Self = StObject.set(x, "columnStyle", value.asInstanceOf[js.Any])
      
      inline def setColumnStyleFunction1(value: /* datum */ Datum => ShapeStyle): Self = StObject.set(x, "columnStyle", js.Any.fromFunction1(value))
      
      inline def setColumnStyleUndefined: Self = StObject.set(x, "columnStyle", js.undefined)
      
      inline def setStackField(value: String): Self = StObject.set(x, "stackField", value.asInstanceOf[js.Any])
      
      inline def setStackFieldUndefined: Self = StObject.set(x, "stackField", js.undefined)
    }
  }
}
