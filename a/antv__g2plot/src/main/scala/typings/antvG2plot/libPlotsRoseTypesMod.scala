package typings.antvG2plot

import typings.antvG2plot.libTypesAttrMod.ShapeStyle
import typings.antvG2plot.libTypesAttrMod.StyleAttr
import typings.antvG2plot.libTypesCommonMod.Datum
import typings.antvG2plot.libTypesCommonMod.Options
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPlotsRoseTypesMod {
  
  trait RoseOptions
    extends StObject
       with Options {
    
    /**
      * @title 玫瑰图结束角度
      */
    val endAngle: js.UndefOr[Double] = js.undefined
    
    /**
      * @title 内部空心圆的半径
      * @description 规则与 radius 一致
      */
    val innerRadius: js.UndefOr[Double] = js.undefined
    
    /**
      * @title 是否分组玫瑰图
      * @default false
      */
    val isGroup: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @title 是否堆积玫瑰图
      * @default false
      */
    val isStack: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @title 玫瑰图的半径
      * @description 原点为画布中心。配置值域为 (0,1] 1 代表玫瑰图大小为 1，即撑满绘图区域
      */
    val radius: js.UndefOr[Double] = js.undefined
    
    /**
      * @title 设置扇形样式
      * @description sectorStyle 中的fill会覆盖 color 的配置,sectorStyle 可以直接指定，也可以通过 callback 的方式，根据数据为每个扇形切片指定单独的样式
      */
    val sectorStyle: js.UndefOr[StyleAttr] = js.undefined
    
    /**
      * @title 拆分字段
      */
    val seriesField: js.UndefOr[String] = js.undefined
    
    /**
      * @title 玫瑰图开始角度
      */
    val startAngle: js.UndefOr[Double] = js.undefined
    
    /**
      * @title 扇形切片分类所对应的数据字段名
      * @description 每个扇形的弧度相等
      */
    val xField: String
    
    /**
      * @title 扇形切片半径长度所对应的数据字段名
      */
    val yField: String
  }
  object RoseOptions {
    
    inline def apply(data: js.Array[Record[String, Any]], xField: String, yField: String): RoseOptions = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], xField = xField.asInstanceOf[js.Any], yField = yField.asInstanceOf[js.Any])
      __obj.asInstanceOf[RoseOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RoseOptions] (val x: Self) extends AnyVal {
      
      inline def setEndAngle(value: Double): Self = StObject.set(x, "endAngle", value.asInstanceOf[js.Any])
      
      inline def setEndAngleUndefined: Self = StObject.set(x, "endAngle", js.undefined)
      
      inline def setInnerRadius(value: Double): Self = StObject.set(x, "innerRadius", value.asInstanceOf[js.Any])
      
      inline def setInnerRadiusUndefined: Self = StObject.set(x, "innerRadius", js.undefined)
      
      inline def setIsGroup(value: Boolean): Self = StObject.set(x, "isGroup", value.asInstanceOf[js.Any])
      
      inline def setIsGroupUndefined: Self = StObject.set(x, "isGroup", js.undefined)
      
      inline def setIsStack(value: Boolean): Self = StObject.set(x, "isStack", value.asInstanceOf[js.Any])
      
      inline def setIsStackUndefined: Self = StObject.set(x, "isStack", js.undefined)
      
      inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      inline def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
      
      inline def setSectorStyle(value: StyleAttr): Self = StObject.set(x, "sectorStyle", value.asInstanceOf[js.Any])
      
      inline def setSectorStyleFunction1(value: /* datum */ Datum => ShapeStyle): Self = StObject.set(x, "sectorStyle", js.Any.fromFunction1(value))
      
      inline def setSectorStyleUndefined: Self = StObject.set(x, "sectorStyle", js.undefined)
      
      inline def setSeriesField(value: String): Self = StObject.set(x, "seriesField", value.asInstanceOf[js.Any])
      
      inline def setSeriesFieldUndefined: Self = StObject.set(x, "seriesField", js.undefined)
      
      inline def setStartAngle(value: Double): Self = StObject.set(x, "startAngle", value.asInstanceOf[js.Any])
      
      inline def setStartAngleUndefined: Self = StObject.set(x, "startAngle", js.undefined)
      
      inline def setXField(value: String): Self = StObject.set(x, "xField", value.asInstanceOf[js.Any])
      
      inline def setYField(value: String): Self = StObject.set(x, "yField", value.asInstanceOf[js.Any])
    }
  }
}
