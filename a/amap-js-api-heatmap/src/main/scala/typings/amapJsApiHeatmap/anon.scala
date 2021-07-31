package typings.amapJsApiHeatmap

import typings.amapJsApiHeatmap.AMap.Heatmap.DataSet
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait Data extends StObject {
    
    var data: String
    
    var dataParser: js.UndefOr[js.Function1[/* data */ js.Any, DataSet]] = js.undefined
  }
  object Data {
    
    @scala.inline
    def apply(data: String): Data = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
      __obj.asInstanceOf[Data]
    }
    
    @scala.inline
    implicit class DataMutableBuilder[Self <: Data] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: String): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDataParser(value: /* data */ js.Any => DataSet): Self = StObject.set(x, "dataParser", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDataParserUndefined: Self = StObject.set(x, "dataParser", js.undefined)
    }
  }
  
  trait DrawGridLine extends StObject {
    
    var drawGridLine: js.UndefOr[Boolean] = js.undefined
    
    var gridSize: js.UndefOr[Double] = js.undefined
    
    var heightBezier: js.UndefOr[js.Array[Double]] = js.undefined
    
    var heightScale: js.UndefOr[Double] = js.undefined
  }
  object DrawGridLine {
    
    @scala.inline
    def apply(): DrawGridLine = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[DrawGridLine]
    }
    
    @scala.inline
    implicit class DrawGridLineMutableBuilder[Self <: DrawGridLine] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDrawGridLine(value: Boolean): Self = StObject.set(x, "drawGridLine", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDrawGridLineUndefined: Self = StObject.set(x, "drawGridLine", js.undefined)
      
      @scala.inline
      def setGridSize(value: Double): Self = StObject.set(x, "gridSize", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridSizeUndefined: Self = StObject.set(x, "gridSize", js.undefined)
      
      @scala.inline
      def setHeightBezier(value: js.Array[Double]): Self = StObject.set(x, "heightBezier", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightBezierUndefined: Self = StObject.set(x, "heightBezier", js.undefined)
      
      @scala.inline
      def setHeightBezierVarargs(value: Double*): Self = StObject.set(x, "heightBezier", js.Array(value :_*))
      
      @scala.inline
      def setHeightScale(value: Double): Self = StObject.set(x, "heightScale", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightScaleUndefined: Self = StObject.set(x, "heightScale", js.undefined)
    }
  }
}
