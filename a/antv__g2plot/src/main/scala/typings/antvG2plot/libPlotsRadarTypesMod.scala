package typings.antvG2plot

import typings.antvG2plot.anon.PickPointGeometryOptionss
import typings.antvG2plot.libAdaptorGeometriesBaseMod.MappingOptions
import typings.antvG2plot.libTypesAttrMod.ShapeStyle
import typings.antvG2plot.libTypesCommonMod.Options
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libPlotsRadarTypesMod {
  
  trait RadarOptions
    extends StObject
       with Options {
    
    /**
      * @title area 图形样式
      * @description 均提供回调的方式, 不开放 field 映射配置
      */
    val area: js.UndefOr[MappingOptions] = js.undefined
    
    /**
      * @title 雷达图结束角度
      */
    val endAngle: js.UndefOr[Double] = js.undefined
    
    /**
      * @title 折线图形样式
      */
    val lineStyle: js.UndefOr[
        ShapeStyle | (js.Function3[/* x */ Any, /* y */ Any, /* series */ js.UndefOr[Any], ShapeStyle])
      ] = js.undefined
    
    /**
      * @title 数据点图形样式
      */
    val point: js.UndefOr[js.UndefOr[MappingOptions] & PickPointGeometryOptionss] = js.undefined
    
    /**
      * @title 雷达图半径
      */
    val radius: js.UndefOr[Double] = js.undefined
    
    /**
      * @title 分组字段
      */
    val seriesField: js.UndefOr[String] = js.undefined
    
    /**
      * @title 是否平滑
      * @default false
      */
    val smooth: js.UndefOr[Boolean] = js.undefined
    
    /**
      * @title 雷达图开始角度
      */
    val startAngle: js.UndefOr[Double] = js.undefined
    
    /**
      * @title 角度轴配置
      */
    @JSName("xAxis")
    val xAxis_RadarOptions: js.UndefOr[Any] = js.undefined
    
    /**
      * @title x轴字段
      */
    val xField: String
    
    /**
      * @title 径向轴配置
      */
    @JSName("yAxis")
    val yAxis_RadarOptions: js.UndefOr[Any] = js.undefined
    
    /**
      * @title y轴字段
      * @description 映射雷达图的射线长度
      */
    val yField: String
  }
  object RadarOptions {
    
    inline def apply(data: js.Array[Record[String, Any]], xField: String, yField: String): RadarOptions = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], xField = xField.asInstanceOf[js.Any], yField = yField.asInstanceOf[js.Any])
      __obj.asInstanceOf[RadarOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RadarOptions] (val x: Self) extends AnyVal {
      
      inline def setArea(value: MappingOptions): Self = StObject.set(x, "area", value.asInstanceOf[js.Any])
      
      inline def setAreaUndefined: Self = StObject.set(x, "area", js.undefined)
      
      inline def setEndAngle(value: Double): Self = StObject.set(x, "endAngle", value.asInstanceOf[js.Any])
      
      inline def setEndAngleUndefined: Self = StObject.set(x, "endAngle", js.undefined)
      
      inline def setLineStyle(
        value: ShapeStyle | (js.Function3[/* x */ Any, /* y */ Any, /* series */ js.UndefOr[Any], ShapeStyle])
      ): Self = StObject.set(x, "lineStyle", value.asInstanceOf[js.Any])
      
      inline def setLineStyleFunction3(value: (/* x */ Any, /* y */ Any, /* series */ js.UndefOr[Any]) => ShapeStyle): Self = StObject.set(x, "lineStyle", js.Any.fromFunction3(value))
      
      inline def setLineStyleUndefined: Self = StObject.set(x, "lineStyle", js.undefined)
      
      inline def setPoint(value: js.UndefOr[MappingOptions] & PickPointGeometryOptionss): Self = StObject.set(x, "point", value.asInstanceOf[js.Any])
      
      inline def setPointUndefined: Self = StObject.set(x, "point", js.undefined)
      
      inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
      
      inline def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
      
      inline def setSeriesField(value: String): Self = StObject.set(x, "seriesField", value.asInstanceOf[js.Any])
      
      inline def setSeriesFieldUndefined: Self = StObject.set(x, "seriesField", js.undefined)
      
      inline def setSmooth(value: Boolean): Self = StObject.set(x, "smooth", value.asInstanceOf[js.Any])
      
      inline def setSmoothUndefined: Self = StObject.set(x, "smooth", js.undefined)
      
      inline def setStartAngle(value: Double): Self = StObject.set(x, "startAngle", value.asInstanceOf[js.Any])
      
      inline def setStartAngleUndefined: Self = StObject.set(x, "startAngle", js.undefined)
      
      inline def setXAxis(value: Any): Self = StObject.set(x, "xAxis", value.asInstanceOf[js.Any])
      
      inline def setXAxisUndefined: Self = StObject.set(x, "xAxis", js.undefined)
      
      inline def setXField(value: String): Self = StObject.set(x, "xField", value.asInstanceOf[js.Any])
      
      inline def setYAxis(value: Any): Self = StObject.set(x, "yAxis", value.asInstanceOf[js.Any])
      
      inline def setYAxisUndefined: Self = StObject.set(x, "yAxis", js.undefined)
      
      inline def setYField(value: String): Self = StObject.set(x, "yField", value.asInstanceOf[js.Any])
    }
  }
}
