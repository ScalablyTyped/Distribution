package typings.antvG2plot

import typings.antvG2plot.libTypesAttrMod.ShapeStyle
import typings.antvG2plot.libTypesAttrMod.StyleAttr
import typings.antvG2plot.libTypesCommonMod.Datum
import typings.antvG2plot.libTypesCommonMod.Options
import typings.antvG2plot.libTypesStatisticMod.Statistic
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPlotsPieTypesMod {
  
  trait PieOptions
    extends StObject
       with Options {
    
    /**
      * @title 角度映射字段
      */
    val angleField: String
    
    /**
      * @title 颜色映射字段
      */
    val colorField: String
    
    /**
      * @title 圆环的结束角度
      */
    val endAngle: js.UndefOr[Double] = js.undefined
    
    /**
      * @title 饼图内半径
      */
    val innerRadius: js.UndefOr[Double] = js.undefined
    
    /**
      * @title 饼图图形样式
      */
    val pieStyle: js.UndefOr[StyleAttr] = js.undefined
    
    /**
      * @title 饼图半径
      */
    val radius: js.UndefOr[Double] = js.undefined
    
    /**
      * @title 圆环的开始角度
      */
    val startAngle: js.UndefOr[Double] = js.undefined
    
    /**
      * @title 指标卡组件
      * @description 显示在环图中心，可以代替tooltip，显示环图数据的总计值和各项数据,启用 statistic 组件的同时将自动关闭tooltip
      */
    val statistic: js.UndefOr[Statistic] = js.undefined
  }
  object PieOptions {
    
    inline def apply(angleField: String, colorField: String, data: js.Array[Record[String, Any]]): PieOptions = {
      val __obj = js.Dynamic.literal(angleField = angleField.asInstanceOf[js.Any], colorField = colorField.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[PieOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PieOptions] (val x: Self) extends AnyVal {
      
      inline def setAngleField(value: String): Self = StObject.set(x, "angleField", value.asInstanceOf[js.Any])
      
      inline def setColorField(value: String): Self = StObject.set(x, "colorField", value.asInstanceOf[js.Any])
      
      inline def setEndAngle(value: Double): Self = StObject.set(x, "endAngle", value.asInstanceOf[js.Any])
      
      inline def setEndAngleUndefined: Self = StObject.set(x, "endAngle", js.undefined)
      
      inline def setInnerRadius(value: Double): Self = StObject.set(x, "innerRadius", value.asInstanceOf[js.Any])
      
      inline def setInnerRadiusUndefined: Self = StObject.set(x, "innerRadius", js.undefined)
      
      inline def setPieStyle(value: StyleAttr): Self = StObject.set(x, "pieStyle", value.asInstanceOf[js.Any])
      
      inline def setPieStyleFunction1(value: /* datum */ Datum => ShapeStyle): Self = StObject.set(x, "pieStyle", js.Any.fromFunction1(value))
      
      inline def setPieStyleUndefined: Self = StObject.set(x, "pieStyle", js.undefined)
      
      inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      inline def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
      
      inline def setStartAngle(value: Double): Self = StObject.set(x, "startAngle", value.asInstanceOf[js.Any])
      
      inline def setStartAngleUndefined: Self = StObject.set(x, "startAngle", js.undefined)
      
      inline def setStatistic(value: Statistic): Self = StObject.set(x, "statistic", value.asInstanceOf[js.Any])
      
      inline def setStatisticUndefined: Self = StObject.set(x, "statistic", js.undefined)
    }
  }
  
  trait StatisticData extends StObject {
    
    var title: String
    
    var value: String | Double | Null
  }
  object StatisticData {
    
    inline def apply(title: String): StatisticData = {
      val __obj = js.Dynamic.literal(title = title.asInstanceOf[js.Any], value = null)
      __obj.asInstanceOf[StatisticData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StatisticData] (val x: Self) extends AnyVal {
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setValue(value: String | Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
      
      inline def setValueNull: Self = StObject.set(x, "value", null)
    }
  }
}
