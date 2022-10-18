package typings.antvG2plot

import typings.antvG2plot.libTypesAttrMod.ShapeStyle
import typings.antvG2plot.libTypesAttrMod.StyleAttr
import typings.antvG2plot.libTypesCommonMod.Datum
import typings.antvG2plot.libTypesCommonMod.Options
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPlotsBoxTypesMod {
  
  trait BoxOptions
    extends StObject
       with Options {
    
    /**
      * @title 箱型样式
      */
    val boxStyle: js.UndefOr[StyleAttr] = js.undefined
    
    /**
      * @title 分组拆分字段
      * @default 分组情况，颜色作为视觉通道
      */
    val groupField: js.UndefOr[String] = js.undefined
    
    /**
      * @title 异常值字段
      */
    val outliersField: js.UndefOr[String] = js.undefined
    
    /**
      * @title 异常值样式
      */
    val outliersStyle: js.UndefOr[StyleAttr] = js.undefined
    
    /**
      * @title x轴字段
      */
    val xField: String
    
    /**
      * @title y轴映射
      * @descriptionbox range [low, q1, median, q3, high] 五个字段 or 一个数组字段
      */
    val yField: String | (js.Tuple5[
        js.UndefOr[String], 
        js.UndefOr[String], 
        js.UndefOr[String], 
        js.UndefOr[String], 
        js.UndefOr[String]
      ])
  }
  object BoxOptions {
    
    inline def apply(
      data: js.Array[Record[String, Any]],
      xField: String,
      yField: String | (js.Tuple5[
          js.UndefOr[String], 
          js.UndefOr[String], 
          js.UndefOr[String], 
          js.UndefOr[String], 
          js.UndefOr[String]
        ])
    ): BoxOptions = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], xField = xField.asInstanceOf[js.Any], yField = yField.asInstanceOf[js.Any])
      __obj.asInstanceOf[BoxOptions]
    }
    
    extension [Self <: BoxOptions](x: Self) {
      
      inline def setBoxStyle(value: StyleAttr): Self = StObject.set(x, "boxStyle", value.asInstanceOf[js.Any])
      
      inline def setBoxStyleFunction1(value: /* datum */ Datum => ShapeStyle): Self = StObject.set(x, "boxStyle", js.Any.fromFunction1(value))
      
      inline def setBoxStyleUndefined: Self = StObject.set(x, "boxStyle", js.undefined)
      
      inline def setGroupField(value: String): Self = StObject.set(x, "groupField", value.asInstanceOf[js.Any])
      
      inline def setGroupFieldUndefined: Self = StObject.set(x, "groupField", js.undefined)
      
      inline def setOutliersField(value: String): Self = StObject.set(x, "outliersField", value.asInstanceOf[js.Any])
      
      inline def setOutliersFieldUndefined: Self = StObject.set(x, "outliersField", js.undefined)
      
      inline def setOutliersStyle(value: StyleAttr): Self = StObject.set(x, "outliersStyle", value.asInstanceOf[js.Any])
      
      inline def setOutliersStyleFunction1(value: /* datum */ Datum => ShapeStyle): Self = StObject.set(x, "outliersStyle", js.Any.fromFunction1(value))
      
      inline def setOutliersStyleUndefined: Self = StObject.set(x, "outliersStyle", js.undefined)
      
      inline def setXField(value: String): Self = StObject.set(x, "xField", value.asInstanceOf[js.Any])
      
      inline def setYField(
        value: String | (js.Tuple5[
              js.UndefOr[String], 
              js.UndefOr[String], 
              js.UndefOr[String], 
              js.UndefOr[String], 
              js.UndefOr[String]
            ])
      ): Self = StObject.set(x, "yField", value.asInstanceOf[js.Any])
    }
  }
}
