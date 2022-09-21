package typings.antvG2plot

import typings.antvG2plot.anon.Max
import typings.antvG2plot.anon.State
import typings.antvG2plot.antvG2plotStrings.`hollow-smooth`
import typings.antvG2plot.antvG2plotStrings.hollow
import typings.antvG2plot.antvG2plotStrings.smooth
import typings.antvG2plot.attrMod.ShapeStyle
import typings.antvG2plot.attrMod.StyleAttr
import typings.antvG2plot.typesCommonMod.Datum
import typings.antvG2plot.typesCommonMod.Options
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object violinTypesMod {
  
  trait ViolinOptions
    extends StObject
       with Options {
    
    /**
      * @title 内部箱线图配置
      * @description false 为不显示
      */
    val box: js.UndefOr[Boolean | State] = js.undefined
    
    /**
      * @title 核函数配置
      * @description 核函数配置，当前只支持三角核
      */
    val kde: js.UndefOr[Max] = js.undefined
    
    /**
      * @title 拆分字段映射
      * @default "分组情况,颜色作为视觉通道 "
      */
    val seriesField: js.UndefOr[String] = js.undefined
    
    /**
      * @title 小提琴的形状
      * @description smooth: 平滑,hollow: 空心,hollow-smooth: 平滑、空心.
      * @default "非平滑、实心"
      */
    val shape: js.UndefOr[smooth | hollow | `hollow-smooth`] = js.undefined
    
    /**
      * @title 小提琴样式配置
      */
    val violinStyle: js.UndefOr[StyleAttr] = js.undefined
    
    /**
      * @title X 轴映射
      */
    val xField: String
    
    /**
      * @title Y 轴映射
      */
    val yField: String
  }
  object ViolinOptions {
    
    inline def apply(data: js.Array[Record[String, Any]], xField: String, yField: String): ViolinOptions = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], xField = xField.asInstanceOf[js.Any], yField = yField.asInstanceOf[js.Any])
      __obj.asInstanceOf[ViolinOptions]
    }
    
    extension [Self <: ViolinOptions](x: Self) {
      
      inline def setBox(value: Boolean | State): Self = StObject.set(x, "box", value.asInstanceOf[js.Any])
      
      inline def setBoxUndefined: Self = StObject.set(x, "box", js.undefined)
      
      inline def setKde(value: Max): Self = StObject.set(x, "kde", value.asInstanceOf[js.Any])
      
      inline def setKdeUndefined: Self = StObject.set(x, "kde", js.undefined)
      
      inline def setSeriesField(value: String): Self = StObject.set(x, "seriesField", value.asInstanceOf[js.Any])
      
      inline def setSeriesFieldUndefined: Self = StObject.set(x, "seriesField", js.undefined)
      
      inline def setShape(value: smooth | hollow | `hollow-smooth`): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      inline def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
      
      inline def setViolinStyle(value: StyleAttr): Self = StObject.set(x, "violinStyle", value.asInstanceOf[js.Any])
      
      inline def setViolinStyleFunction1(value: /* datum */ Datum => ShapeStyle): Self = StObject.set(x, "violinStyle", js.Any.fromFunction1(value))
      
      inline def setViolinStyleUndefined: Self = StObject.set(x, "violinStyle", js.undefined)
      
      inline def setXField(value: String): Self = StObject.set(x, "xField", value.asInstanceOf[js.Any])
      
      inline def setYField(value: String): Self = StObject.set(x, "yField", value.asInstanceOf[js.Any])
    }
  }
}
