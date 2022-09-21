package typings.amapJsApiHeatmap

import typings.amapJsApiHeatmap.AMap.Heatmap.DataSet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Data extends StObject {
    
    var data: String
    
    var dataParser: js.UndefOr[js.Function1[/* data */ Any, DataSet]] = js.undefined
  }
  object Data {
    
    inline def apply(data: String): Data = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data]
    }
    
    extension [Self <: Data](x: Self) {
      
      inline def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setDataParser(value: /* data */ Any => DataSet): Self = StObject.set(x, "dataParser", js.Any.fromFunction1(value))
      
      inline def setDataParserUndefined: Self = StObject.set(x, "dataParser", js.undefined)
    }
  }
  
  trait DrawGridLine extends StObject {
    
    var drawGridLine: js.UndefOr[Boolean] = js.undefined
    
    var gridSize: js.UndefOr[Double] = js.undefined
    
    var heightBezier: js.UndefOr[js.Array[Double]] = js.undefined
    
    var heightScale: js.UndefOr[Double] = js.undefined
  }
  object DrawGridLine {
    
    inline def apply(): DrawGridLine = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DrawGridLine]
    }
    
    extension [Self <: DrawGridLine](x: Self) {
      
      inline def setDrawGridLine(value: Boolean): Self = StObject.set(x, "drawGridLine", value.asInstanceOf[js.Any])
      
      inline def setDrawGridLineUndefined: Self = StObject.set(x, "drawGridLine", js.undefined)
      
      inline def setGridSize(value: Double): Self = StObject.set(x, "gridSize", value.asInstanceOf[js.Any])
      
      inline def setGridSizeUndefined: Self = StObject.set(x, "gridSize", js.undefined)
      
      inline def setHeightBezier(value: js.Array[Double]): Self = StObject.set(x, "heightBezier", value.asInstanceOf[js.Any])
      
      inline def setHeightBezierUndefined: Self = StObject.set(x, "heightBezier", js.undefined)
      
      inline def setHeightBezierVarargs(value: Double*): Self = StObject.set(x, "heightBezier", js.Array(value*))
      
      inline def setHeightScale(value: Double): Self = StObject.set(x, "heightScale", value.asInstanceOf[js.Any])
      
      inline def setHeightScaleUndefined: Self = StObject.set(x, "heightScale", js.undefined)
    }
  }
}
