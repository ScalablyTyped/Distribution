package typings.antvG2plot

import typings.antvG2.libInterfaceMod.CoordinateOption
import typings.antvG2plot.antvG2plotStrings.density
import typings.antvG2plot.antvG2plotStrings.polygon
import typings.antvG2plot.antvG2plotStrings.x
import typings.antvG2plot.antvG2plotStrings.y
import typings.antvG2plot.attrMod.ShapeStyle
import typings.antvG2plot.attrMod.StyleAttr
import typings.antvG2plot.typesCommonMod.Datum
import typings.antvG2plot.typesCommonMod.Options
import typings.antvG2plot.typesLegendMod.Legend
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object heatmapTypesMod {
  
  trait HeatmapOptions
    extends StObject
       with Options {
    
    /**
      * @title 颜色字段
      */
    val colorField: js.UndefOr[String] = js.undefined
    
    /**
      * @title 极坐标属性
      */
    val coordinate: js.UndefOr[CoordinateOption] = js.undefined
    
    /**
      * @title 样式相关
      */
    /**
      * @title 热力图形样式
      */
    val heatmapStyle: js.UndefOr[StyleAttr] = js.undefined
    
    /**
      * @title 坐标轴映射
      * @description 坐标轴映射 'x' | 'y'
      */
    val reflect: js.UndefOr[x | y] = js.undefined
    
    /**
      * @title 热力格子中的形状
      */
    val shape: js.UndefOr[String] = js.undefined
    
    /**
      * @title 图例相关
      */
    /**
      * @title 数据字段名
      * @description  点大小映射对应的数据字段名
      */
    val sizeField: js.UndefOr[String] = js.undefined
    
    /**
      * @title size 对应的图例
      */
    val sizeLegend: js.UndefOr[Legend] = js.undefined
    
    /**
      * @title 热力格子中图形的尺寸比例
      * @description 只有当 shape 和 sizeField 至少指定一项后才生效
      */
    val sizeRatio: js.UndefOr[Double] = js.undefined
    
    /**
      * @title 热力图类型
      * @description  'polygon' | 'density'
      */
    val `type`: js.UndefOr[polygon | density] = js.undefined
    
    /**
      * @title x轴字段
      */
    val xField: String
    
    /**
      * @title y轴字段
      */
    val yField: String
  }
  object HeatmapOptions {
    
    inline def apply(data: js.Array[Record[String, Any]], xField: String, yField: String): HeatmapOptions = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], xField = xField.asInstanceOf[js.Any], yField = yField.asInstanceOf[js.Any])
      __obj.asInstanceOf[HeatmapOptions]
    }
    
    extension [Self <: HeatmapOptions](x: Self) {
      
      inline def setColorField(value: String): Self = StObject.set(x, "colorField", value.asInstanceOf[js.Any])
      
      inline def setColorFieldUndefined: Self = StObject.set(x, "colorField", js.undefined)
      
      inline def setCoordinate(value: CoordinateOption): Self = StObject.set(x, "coordinate", value.asInstanceOf[js.Any])
      
      inline def setCoordinateUndefined: Self = StObject.set(x, "coordinate", js.undefined)
      
      inline def setHeatmapStyle(value: StyleAttr): Self = StObject.set(x, "heatmapStyle", value.asInstanceOf[js.Any])
      
      inline def setHeatmapStyleFunction1(value: /* datum */ Datum => ShapeStyle): Self = StObject.set(x, "heatmapStyle", js.Any.fromFunction1(value))
      
      inline def setHeatmapStyleUndefined: Self = StObject.set(x, "heatmapStyle", js.undefined)
      
      inline def setReflect(value: typings.antvG2plot.antvG2plotStrings.x | y): Self = StObject.set(x, "reflect", value.asInstanceOf[js.Any])
      
      inline def setReflectUndefined: Self = StObject.set(x, "reflect", js.undefined)
      
      inline def setShape(value: String): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      inline def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
      
      inline def setSizeField(value: String): Self = StObject.set(x, "sizeField", value.asInstanceOf[js.Any])
      
      inline def setSizeFieldUndefined: Self = StObject.set(x, "sizeField", js.undefined)
      
      inline def setSizeLegend(value: Legend): Self = StObject.set(x, "sizeLegend", value.asInstanceOf[js.Any])
      
      inline def setSizeLegendUndefined: Self = StObject.set(x, "sizeLegend", js.undefined)
      
      inline def setSizeRatio(value: Double): Self = StObject.set(x, "sizeRatio", value.asInstanceOf[js.Any])
      
      inline def setSizeRatioUndefined: Self = StObject.set(x, "sizeRatio", js.undefined)
      
      inline def setType(value: polygon | density): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setXField(value: String): Self = StObject.set(x, "xField", value.asInstanceOf[js.Any])
      
      inline def setYField(value: String): Self = StObject.set(x, "yField", value.asInstanceOf[js.Any])
    }
  }
}
