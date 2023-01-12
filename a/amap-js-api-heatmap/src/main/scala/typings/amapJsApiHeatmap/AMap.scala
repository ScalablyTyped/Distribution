package typings.amapJsApiHeatmap

import org.scalablytyped.runtime.StringDictionary
import typings.amapJsApi.AMap.Map
import typings.amapJsApiHeatmap.AMap.Heatmap.DataSet
import typings.amapJsApiHeatmap.AMap.Heatmap.Options
import typings.amapJsApiHeatmap.anon.Data
import typings.amapJsApiHeatmap.anon.DrawGridLine
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object AMap {
  
  @js.native
  trait Heatmap extends StObject {
    
    /**
      * 向热力图数据集中添加坐标点，count不填写时默认：1
      * @param lng 经度
      * @param lat 维度
      * @param count 权重
      */
    def addDataPoint(lng: Double, lat: Double): Unit = js.native
    def addDataPoint(lng: Double, lat: Double, count: Double): Unit = js.native
    
    /**
      * 输出热力图的数据集，数据结构同setDataSet中的数据集
      */
    def getDataSet(): DataSet = js.native
    
    /**
      * 获取热力图叠加地图对象
      */
    def getMap(): Map = js.native
    
    /**
      *     获取热力图的属性信息
      */
    def getOptions(): Options = js.native
    
    def getzIndex(): Double = js.native
    
    /**
      * 隐藏热力图
      */
    def hide(): Unit = js.native
    
    /**
      * 设置热力图展现的数据集，数据格式详见
      * https://lbs.amap.com/api/javascript-api/reference/layer#m_AMap.Heatmap
      * @param dataset 数据集
      */
    def setDataSet(dataset: DataSet): Unit = js.native
    def setDataSet(dataset: Data): Unit = js.native
    
    /**
      * 设置热力图要叠加的地图对象
      * @param map 地图对象
      */
    def setMap(map: Map): Unit = js.native
    
    /**
      * 设置热力图属性
      * @param opts 热力图属性
      */
    def setOptions(): Unit = js.native
    def setOptions(opts: Options): Unit = js.native
    
    // internal
    def setzIndex(zIndex: Double): Unit = js.native
    
    /**
      * 显示热力图
      */
    def show(): Unit = js.native
  }
  object Heatmap {
    
    trait Data extends StObject {
      
      /**
        * 权重
        */
      var count: Double
      
      /**
        * 维度
        */
      var lat: Double
      
      /**
        * 经度
        */
      var lng: Double
    }
    object Data {
      
      inline def apply(count: Double, lat: Double, lng: Double): typings.amapJsApiHeatmap.AMap.Heatmap.Data = {
        val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], lat = lat.asInstanceOf[js.Any], lng = lng.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.amapJsApiHeatmap.AMap.Heatmap.Data]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: typings.amapJsApiHeatmap.AMap.Heatmap.Data] (val x: Self) extends AnyVal {
        
        inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
        
        inline def setLat(value: Double): Self = StObject.set(x, "lat", value.asInstanceOf[js.Any])
        
        inline def setLng(value: Double): Self = StObject.set(x, "lng", value.asInstanceOf[js.Any])
      }
    }
    
    trait DataSet extends StObject {
      
      /**
        * 坐标数据集
        */
      var data: js.Array[typings.amapJsApiHeatmap.AMap.Heatmap.Data]
      
      /**
        * 权重的最大值
        */
      var max: js.UndefOr[Double] = js.undefined
    }
    object DataSet {
      
      inline def apply(data: js.Array[typings.amapJsApiHeatmap.AMap.Heatmap.Data]): DataSet = {
        val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any])
        __obj.asInstanceOf[DataSet]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: DataSet] (val x: Self) extends AnyVal {
        
        inline def setData(value: js.Array[typings.amapJsApiHeatmap.AMap.Heatmap.Data]): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
        
        inline def setDataVarargs(value: typings.amapJsApiHeatmap.AMap.Heatmap.Data*): Self = StObject.set(x, "data", js.Array(value*))
        
        inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
        
        inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      }
    }
    
    trait Options extends StObject {
      
      var `3d`: js.UndefOr[DrawGridLine] = js.undefined
      
      var blur: js.UndefOr[Double] = js.undefined
      
      /**
        * 热力图的渐变区间
        */
      var gradient: js.UndefOr[StringDictionary[String]] = js.undefined
      
      /**
        * 热力图透明度数组，取值范围[0,1]，0表示完全透明，1表示不透明
        * 默认：[0,1]
        */
      var opacity: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
      
      /**
        * 热力图中单个点的半径，默认：30，单位：pixel
        */
      var radius: js.UndefOr[Double] = js.undefined
      
      var radiusUnit: js.UndefOr[String] = js.undefined
      
      var rejectMapMask: js.UndefOr[Boolean] = js.undefined
      
      var renderOnZooming: js.UndefOr[Boolean] = js.undefined
      
      var visible: js.UndefOr[Boolean] = js.undefined
      
      var zIndex: js.UndefOr[Double] = js.undefined
      
      /**
        * 支持的缩放级别范围，取值范围[3-18]
        * 默认：[3,18]
        */
      var zooms: js.UndefOr[js.Tuple2[Double, Double]] = js.undefined
    }
    object Options {
      
      inline def apply(): Options = {
        val __obj = js.Dynamic.literal()
        __obj.asInstanceOf[Options]
      }
      
      @scala.inline
      implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
        
        inline def set3d(value: DrawGridLine): Self = StObject.set(x, "3d", value.asInstanceOf[js.Any])
        
        inline def set3dUndefined: Self = StObject.set(x, "3d", js.undefined)
        
        inline def setBlur(value: Double): Self = StObject.set(x, "blur", value.asInstanceOf[js.Any])
        
        inline def setBlurUndefined: Self = StObject.set(x, "blur", js.undefined)
        
        inline def setGradient(value: StringDictionary[String]): Self = StObject.set(x, "gradient", value.asInstanceOf[js.Any])
        
        inline def setGradientUndefined: Self = StObject.set(x, "gradient", js.undefined)
        
        inline def setOpacity(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
        
        inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
        
        inline def setRadius(value: Double): Self = StObject.set(x, "radius", value.asInstanceOf[js.Any])
        
        inline def setRadiusUndefined: Self = StObject.set(x, "radius", js.undefined)
        
        inline def setRadiusUnit(value: String): Self = StObject.set(x, "radiusUnit", value.asInstanceOf[js.Any])
        
        inline def setRadiusUnitUndefined: Self = StObject.set(x, "radiusUnit", js.undefined)
        
        inline def setRejectMapMask(value: Boolean): Self = StObject.set(x, "rejectMapMask", value.asInstanceOf[js.Any])
        
        inline def setRejectMapMaskUndefined: Self = StObject.set(x, "rejectMapMask", js.undefined)
        
        inline def setRenderOnZooming(value: Boolean): Self = StObject.set(x, "renderOnZooming", value.asInstanceOf[js.Any])
        
        inline def setRenderOnZoomingUndefined: Self = StObject.set(x, "renderOnZooming", js.undefined)
        
        inline def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
        
        inline def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
        
        inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
        
        inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
        
        inline def setZooms(value: js.Tuple2[Double, Double]): Self = StObject.set(x, "zooms", value.asInstanceOf[js.Any])
        
        inline def setZoomsUndefined: Self = StObject.set(x, "zooms", js.undefined)
      }
    }
  }
}
