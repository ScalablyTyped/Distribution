package typings.amapJsSdk

import typings.amapJsSdk.AMap.AutocompleteResult
import typings.amapJsSdk.AMap.CircleOptions
import typings.amapJsSdk.AMap.CitySearchResult
import typings.amapJsSdk.AMap.ConvertorResult
import typings.amapJsSdk.AMap.DistrictSearchOptions
import typings.amapJsSdk.AMap.EventCallback
import typings.amapJsSdk.AMap.MapOptions
import typings.amapJsSdk.AMap.MarkerClustererOptions
import typings.amapJsSdk.AMap.MarkerOptions
import typings.amapJsSdk.AMap.PolygonOptions
import typings.amapJsSdk.AMap.PolylineOptions
import typings.amapJsSdk.AMap.WeatherForecastResult
import typings.amapJsSdk.AMap.WeatherLiveResult
import typings.amapJsSdk.anon.AlwaysShow
import typings.amapJsSdk.anon.AsDestination
import typings.amapJsSdk.anon.AutoFitView
import typings.amapJsSdk.anon.AutoMove
import typings.amapJsSdk.anon.AutoPosition
import typings.amapJsSdk.anon.AutoRefresh
import typings.amapJsSdk.anon.Batch
import typings.amapJsSdk.anon.ButtonDom
import typings.amapJsSdk.anon.Center
import typings.amapJsSdk.anon.Citylimit
import typings.amapJsSdk.anon.Coords
import typings.amapJsSdk.anon.DefaultType
import typings.amapJsSdk.anon.DetectRetina
import typings.amapJsSdk.anon.Extensions
import typings.amapJsSdk.anon.Image
import typings.amapJsSdk.anon.IsOpen
import typings.amapJsSdk.anon.Lat
import typings.std.EventListener
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object global {
  
  object AMap {
    
    @JSGlobal("AMap")
    @js.native
    val ^ : js.Any = js.native
    
    @JSGlobal("AMap.AdvancedInfoWindow")
    @js.native
    open class AdvancedInfoWindow ()
      extends StObject
         with typings.amapJsSdk.AMap.AdvancedInfoWindow {
      def this(options: AsDestination) = this()
      
      /* CompleteClass */
      override def off(eventName: String, callback: EventCallback): Unit = js.native
      
      /* CompleteClass */
      override def on(eventName: String, callback: EventCallback): Unit = js.native
    }
    
    @JSGlobal("AMap.Autocomplete")
    @js.native
    open class Autocomplete protected ()
      extends StObject
         with typings.amapJsSdk.AMap.Autocomplete {
      def this(opts: Citylimit) = this()
      
      /* CompleteClass */
      override def search(
        keyword: String,
        callback: js.Function2[/* status */ String, /* result */ String | AutocompleteResult, Unit]
      ): Unit = js.native
    }
    
    /**
      * 地物对象的经纬度矩形范围
      */
    @JSGlobal("AMap.Bounds")
    @js.native
    open class Bounds protected ()
      extends StObject
         with typings.amapJsSdk.AMap.Bounds {
      /**
        * 构造一个矩形范围
        * @param southWest 西南角经纬度坐标
        * @param northEast 东北角经纬度坐标
        */
      def this(southWest: typings.amapJsSdk.AMap.LngLat, northEast: typings.amapJsSdk.AMap.LngLat) = this()
      
      /**
        * 判断指定点坐标是否在矩形范围内
        * @param point 指定点
        */
      /* CompleteClass */
      override def contains(point: typings.amapJsSdk.AMap.LngLat): Boolean = js.native
      
      /**
        * 获取当前Bounds的中心点经纬度坐标
        */
      /* CompleteClass */
      override def getCenter(): typings.amapJsSdk.AMap.LngLat = js.native
      
      /**
        * 获取东北角坐标
        */
      /* CompleteClass */
      override def getNorthEast(): typings.amapJsSdk.AMap.LngLat = js.native
      
      /**
        * 获取西南角坐标
        */
      /* CompleteClass */
      override def getSouthWest(): typings.amapJsSdk.AMap.LngLat = js.native
    }
    
    @JSGlobal("AMap.Circle")
    @js.native
    open class Circle ()
      extends StObject
         with typings.amapJsSdk.AMap.Circle {
      def this(options: CircleOptions) = this()
      
      /* CompleteClass */
      override def contains(point: typings.amapJsSdk.AMap.LngLat): Boolean = js.native
      
      /* CompleteClass */
      override def getBounds(): typings.amapJsSdk.AMap.Bounds = js.native
      
      /* CompleteClass */
      override def getCenter(): typings.amapJsSdk.AMap.LngLat = js.native
      
      /* CompleteClass */
      override def getExtData(): Any = js.native
      
      /* CompleteClass */
      override def getOptions(): CircleOptions = js.native
      
      /* CompleteClass */
      override def getRadius(): Double = js.native
      
      /* CompleteClass */
      override def hide(): Unit = js.native
      
      /* CompleteClass */
      override def setCenter(lnglat: typings.amapJsSdk.AMap.LngLat): Unit = js.native
      
      /* CompleteClass */
      override def setExtData(ext: Any): Unit = js.native
      
      /* CompleteClass */
      override def setMap(map: typings.amapJsSdk.AMap.Map): Unit = js.native
      
      /* CompleteClass */
      override def setOptions(circleopt: CircleOptions): Unit = js.native
      
      /* CompleteClass */
      override def setRadius(radius: Double): Unit = js.native
      
      /* CompleteClass */
      override def show(): Unit = js.native
    }
    
    @JSGlobal("AMap.CitySearch")
    @js.native
    open class CitySearch ()
      extends StObject
         with typings.amapJsSdk.AMap.CitySearch {
      
      /* CompleteClass */
      override def getCityByIp(
        ip: String,
        callback: js.Function2[/* status */ String, /* result */ String | CitySearchResult, Unit]
      ): Unit = js.native
      
      /* CompleteClass */
      override def getLocalCity(callback: js.Function2[/* status */ String, /* result */ String | CitySearchResult, Unit]): Unit = js.native
      
      /* CompleteClass */
      override def off(eventName: String, callback: EventCallback): Unit = js.native
      
      /* CompleteClass */
      override def on(eventName: String, callback: EventCallback): Unit = js.native
    }
    
    @JSGlobal("AMap.DistrictSearch")
    @js.native
    open class DistrictSearch protected ()
      extends StObject
         with typings.amapJsSdk.AMap.DistrictSearch {
      def this(opts: DistrictSearchOptions) = this()
    }
    
    @JSGlobal("AMap.Driving")
    @js.native
    open class Driving ()
      extends StObject
         with typings.amapJsSdk.AMap.Driving {
      def this(options: Extensions) = this()
      
      /* CompleteClass */
      override def off(eventName: String, callback: EventCallback): Unit = js.native
      
      /* CompleteClass */
      override def on(eventName: String, callback: EventCallback): Unit = js.native
    }
    
    @JSGlobal("AMap.DrivingPolicy")
    @js.native
    object DrivingPolicy extends StObject {
      
      @JSBracketAccess
      def apply(value: Double): js.UndefOr[typings.amapJsSdk.AMap.DrivingPolicy & Double] = js.native
      
      /* 2 */ val LEAST_DISTANCE: typings.amapJsSdk.AMap.DrivingPolicy.LEAST_DISTANCE & Double = js.native
      
      /* 1 */ val LEAST_FEE: typings.amapJsSdk.AMap.DrivingPolicy.LEAST_FEE & Double = js.native
      
      /* 0 */ val LEAST_TIME: typings.amapJsSdk.AMap.DrivingPolicy.LEAST_TIME & Double = js.native
      
      /* 3 */ val REAL_TRAFFIC: typings.amapJsSdk.AMap.DrivingPolicy.REAL_TRAFFIC & Double = js.native
    }
    
    @JSGlobal("AMap.EventBindable")
    @js.native
    abstract class EventBindable ()
      extends StObject
         with typings.amapJsSdk.AMap.EventBindable {
      
      /* CompleteClass */
      override def off(eventName: String, callback: EventCallback): Unit = js.native
      
      /* CompleteClass */
      override def on(eventName: String, callback: EventCallback): Unit = js.native
    }
    
    @JSGlobal("AMap.Geocoder")
    @js.native
    open class Geocoder ()
      extends StObject
         with typings.amapJsSdk.AMap.Geocoder {
      def this(opts: Batch) = this()
    }
    
    @JSGlobal("AMap.Geolocation")
    @js.native
    open class Geolocation protected ()
      extends StObject
         with typings.amapJsSdk.AMap.Geolocation {
      def this(options: ButtonDom) = this()
      
      /* CompleteClass */
      override def clearWatch(watchId: Double): Double = js.native
      
      /* CompleteClass */
      override def getCurrentPosition(): Unit = js.native
      
      /* CompleteClass */
      override def isSupported(): Boolean = js.native
      
      /* CompleteClass */
      override def off(eventName: String, callback: EventCallback): Unit = js.native
      
      /* CompleteClass */
      override def on(eventName: String, callback: EventCallback): Unit = js.native
      
      /* CompleteClass */
      override def watchPosition(): Double = js.native
    }
    
    @JSGlobal("AMap.Icon")
    @js.native
    open class Icon ()
      extends StObject
         with typings.amapJsSdk.AMap.Icon {
      def this(options: Image) = this()
      
      /* CompleteClass */
      override def getImageSize(): typings.amapJsSdk.AMap.Size = js.native
      
      /* CompleteClass */
      override def setImageSize(size: typings.amapJsSdk.AMap.Size): Unit = js.native
    }
    
    @JSGlobal("AMap.IndoorMap")
    @js.native
    open class IndoorMap protected ()
      extends StObject
         with typings.amapJsSdk.AMap.IndoorMap {
      def this(opts: AlwaysShow) = this()
      
      /* CompleteClass */
      override def getOpacity(): Double = js.native
      
      /* CompleteClass */
      override def getSelectedBuilding(): String = js.native
      
      /* CompleteClass */
      override def getSelectedBuildingId(): String = js.native
      
      /* CompleteClass */
      override def hide(): Unit = js.native
      
      /* CompleteClass */
      override def hideFloorBar(): Unit = js.native
      
      /* CompleteClass */
      override def hideLabels(): Unit = js.native
      
      /* CompleteClass */
      override def setMap(map: typings.amapJsSdk.AMap.Map): Unit = js.native
      
      /* CompleteClass */
      override def setOpacity(alpha: Double): Unit = js.native
      
      /* CompleteClass */
      override def setzIndex(): Unit = js.native
      
      /* CompleteClass */
      override def show(): Unit = js.native
      
      /* CompleteClass */
      override def showFloor(floor: Double, noMove: Boolean): Unit = js.native
      
      /* CompleteClass */
      override def showFloorBar(): Unit = js.native
      
      /* CompleteClass */
      override def showIndoorMap(indoorid: String, floor: Double, shopid: String): Unit = js.native
      
      /* CompleteClass */
      override def showLabels(): Unit = js.native
    }
    
    @JSGlobal("AMap.InfoWindow")
    @js.native
    open class InfoWindow ()
      extends StObject
         with typings.amapJsSdk.AMap.InfoWindow {
      def this(options: AutoMove) = this()
      
      /* CompleteClass */
      override def off(eventName: String, callback: EventCallback): Unit = js.native
      
      /* CompleteClass */
      override def on(eventName: String, callback: EventCallback): Unit = js.native
    }
    
    @JSGlobal("AMap.Layer")
    @js.native
    abstract class Layer ()
      extends StObject
         with typings.amapJsSdk.AMap.Layer {
      
      /* CompleteClass */
      override def getTiles(): js.Array[String] = js.native
      
      /* CompleteClass */
      override def getZooms(): js.Array[Double] = js.native
      
      /* CompleteClass */
      override def hide(): Unit = js.native
      
      /* CompleteClass */
      override def off(eventName: String, callback: EventCallback): Unit = js.native
      
      /* CompleteClass */
      override def on(eventName: String, callback: EventCallback): Unit = js.native
      
      /* CompleteClass */
      override def reload(): Unit = js.native
      
      /* CompleteClass */
      override def setMap(map: typings.amapJsSdk.AMap.Map): Unit = js.native
      
      /* CompleteClass */
      override def setOpacity(alpha: Double): Unit = js.native
      
      /* CompleteClass */
      override def setTileUrl(): Unit = js.native
      
      /* CompleteClass */
      override def setzIndex(index: Double): Unit = js.native
      
      /* CompleteClass */
      override def show(): Unit = js.native
    }
    
    /**
      * 经纬度坐标，确定地图上的一个点
      */
    @JSGlobal("AMap.LngLat")
    @js.native
    open class LngLat protected ()
      extends StObject
         with typings.amapJsSdk.AMap.LngLat {
      /**
        * 构造一个地理坐标对象
        * @param lng 经度
        * @param lat 纬度
        */
      def this(lng: Double, lat: Double) = this()
    }
    
    @JSGlobal("AMap.Map")
    @js.native
    open class Map protected ()
      extends StObject
         with typings.amapJsSdk.AMap.Map {
      def this(mapDiv: String) = this()
      def this(mapDiv: String, opts: MapOptions) = this()
      
      /* CompleteClass */
      override def off(eventName: String, callback: EventCallback): Unit = js.native
      
      /* CompleteClass */
      override def on(eventName: String, callback: EventCallback): Unit = js.native
    }
    
    @JSGlobal("AMap.MapType")
    @js.native
    open class MapType ()
      extends StObject
         with typings.amapJsSdk.AMap.MapType {
      def this(options: DefaultType) = this()
      
      /* CompleteClass */
      override def hide(): Unit = js.native
      
      /* CompleteClass */
      override def show(): Unit = js.native
    }
    
    /**
      * 点标记。
      */
    @JSGlobal("AMap.Marker")
    @js.native
    open class Marker ()
      extends StObject
         with typings.amapJsSdk.AMap.Marker {
      def this(options: MarkerOptions) = this()
      
      /* CompleteClass */
      override def off(eventName: String, callback: EventCallback): Unit = js.native
      
      /* CompleteClass */
      override def on(eventName: String, callback: EventCallback): Unit = js.native
    }
    
    /**
      * 用于地图上加载大量点标记，提高地图的绘制和显示性能。
      */
    @JSGlobal("AMap.MarkerClusterer")
    @js.native
    open class MarkerClusterer protected ()
      extends StObject
         with typings.amapJsSdk.AMap.MarkerClusterer {
      def this(map: typings.amapJsSdk.AMap.Map, markers: js.Array[typings.amapJsSdk.AMap.Marker]) = this()
      def this(
        map: typings.amapJsSdk.AMap.Map,
        markers: js.Array[typings.amapJsSdk.AMap.Marker],
        opt: MarkerClustererOptions
      ) = this()
      
      /**
        * 添加一个需进行聚合的点标记
        * @param marker
        */
      /* CompleteClass */
      override def addMarker(marker: typings.amapJsSdk.AMap.Marker): Unit = js.native
      
      /**
        * 添加一组需进行聚合的点标记
        */
      /* CompleteClass */
      override def addMarkers(markers: js.Array[typings.amapJsSdk.AMap.Marker]): Unit = js.native
      
      /**
        * 从地图上彻底清除所有聚合点标记
        */
      /* CompleteClass */
      override def clearMarkers(): Unit = js.native
      
      /**
        * 获取聚合点的总数量
        */
      /* CompleteClass */
      override def getClustersCount(): Double = js.native
      
      /**
        * 获取聚合网格的像素大小
        */
      /* CompleteClass */
      override def getGridSize(): Double = js.native
      
      /**
        * 获取该点聚合的地图对象
        */
      /* CompleteClass */
      override def getMap(): typings.amapJsSdk.AMap.Map = js.native
      
      /**
        * 获取该点聚合中的点标记集合
        */
      /* CompleteClass */
      override def getMarkers(): js.Array[typings.amapJsSdk.AMap.Marker] = js.native
      
      /**
        * 获取地图中点标记的最大聚合级别
        */
      /* CompleteClass */
      override def getMaxZoom(): Double = js.native
      
      /**
        * 获取单个聚合的最小数量
        */
      /* CompleteClass */
      override def getMinClusterSize(): Double = js.native
      
      /**
        * 获取聚合的样式风格集合
        */
      /* CompleteClass */
      override def getStyles(): js.Array[Any] = js.native
      
      /**
        * 获取单个聚合点位置是否是聚合内所有标记的平均中心
        */
      /* CompleteClass */
      override def isAverageCenter(): Boolean = js.native
      
      /* CompleteClass */
      override def off(eventName: String, callback: EventCallback): Unit = js.native
      
      /* CompleteClass */
      override def on(eventName: String, callback: EventCallback): Unit = js.native
      
      /**
        * 删除一个聚合的点标记
        * @param marker 点标记
        */
      /* CompleteClass */
      override def removeMarker(marker: typings.amapJsSdk.AMap.Marker): Unit = js.native
      
      /**
        * 删除一组聚合的点标记
        * @param markers
        */
      /* CompleteClass */
      override def removeMarkers(markers: js.Array[typings.amapJsSdk.AMap.Marker]): Unit = js.native
      
      /**
        * 设置单个聚合点位置是否是聚合内所有标记的平均中心
        * @param averageCenter
        */
      /* CompleteClass */
      override def setAverageCenter(averageCenter: Boolean): Unit = js.native
      
      /**
        * 设置聚合网格的像素大小
        * @param size
        */
      /* CompleteClass */
      override def setGridSize(size: Double): Unit = js.native
      
      /**
        * 设置将进行点聚合的地图对象
        * @param map
        */
      /* CompleteClass */
      override def setMap(map: typings.amapJsSdk.AMap.Map): Unit = js.native
      
      /**
        * 设置将进行点聚合显示的点标记集合
        * @param markers
        */
      /* CompleteClass */
      override def setMarkers(markers: js.Array[typings.amapJsSdk.AMap.Marker]): Unit = js.native
      
      /**
        * 设置地图中点标记的最大聚合级别
        * @param zoom
        */
      /* CompleteClass */
      override def setMaxZoom(zoom: Double): Unit = js.native
      
      /**
        * 设置单个聚合的最小数量
        * @param size
        */
      /* CompleteClass */
      override def setMinClusterSize(size: Double): Unit = js.native
      
      /**
        * 设置聚合的样式风格
        * @param styles
        */
      /* CompleteClass */
      override def setStyles(styles: js.Array[Any]): Unit = js.native
    }
    
    /**
      * MarkerShape用于划定Marker的可点击区域范围。需要注意的是，在IE浏览器中图标透明区域默认为不触发事件，因此MarkerShape在IE中不起作用。
      */
    @JSGlobal("AMap.MarkerShape")
    @js.native
    open class MarkerShape protected ()
      extends StObject
         with typings.amapJsSdk.AMap.MarkerShape {
      def this(options: Coords) = this()
    }
    
    @JSGlobal("AMap.OverView")
    @js.native
    open class OverView ()
      extends StObject
         with typings.amapJsSdk.AMap.OverView {
      def this(options: IsOpen) = this()
      
      /* CompleteClass */
      override def close(): Unit = js.native
      
      /* CompleteClass */
      override def getTileLayer(): typings.amapJsSdk.AMap.TileLayer = js.native
      
      /* CompleteClass */
      override def hide(): Unit = js.native
      
      /* CompleteClass */
      override def off(eventName: String, callback: EventCallback): Unit = js.native
      
      /* CompleteClass */
      override def on(eventName: String, callback: EventCallback): Unit = js.native
      
      /* CompleteClass */
      override def open(): Unit = js.native
      
      /* CompleteClass */
      override def setTileLayer(layer: typings.amapJsSdk.AMap.TileLayer): Unit = js.native
      
      /* CompleteClass */
      override def show(): Unit = js.native
    }
    
    /* --------------------------- 基础类 --------------------------- */
    /* 参考地址:http://lbs.amap.com/api/javascript-api/reference/core */
    /**
      * 像素坐标，确定地图上的一个像素点。
      */
    @JSGlobal("AMap.Pixel")
    @js.native
    open class Pixel protected ()
      extends StObject
         with typings.amapJsSdk.AMap.Pixel {
      /**
        * 构造一个像素坐标对象。
        */
      def this(x: Double, y: Double) = this()
      
      /**
        * 当前像素坐标与传入像素坐标是否相等
        */
      /* CompleteClass */
      override def equals(point: typings.amapJsSdk.AMap.Pixel): Boolean = js.native
      
      /**
        * 获得X方向像素坐标
        */
      /* CompleteClass */
      override def getX(): Double = js.native
      
      /**
        * 获得Y方向像素坐标
        */
      /* CompleteClass */
      override def getY(): Double = js.native
    }
    
    @JSGlobal("AMap.PlaceSearch")
    @js.native
    open class PlaceSearch protected ()
      extends StObject
         with typings.amapJsSdk.AMap.PlaceSearch {
      def this(opts: AutoFitView) = this()
    }
    
    @JSGlobal("AMap.Polygon")
    @js.native
    open class Polygon ()
      extends StObject
         with typings.amapJsSdk.AMap.Polygon {
      def this(options: PolygonOptions) = this()
      
      /* CompleteClass */
      override def off(eventName: String, callback: EventCallback): Unit = js.native
      
      /* CompleteClass */
      override def on(eventName: String, callback: EventCallback): Unit = js.native
    }
    
    @JSGlobal("AMap.Polyline")
    @js.native
    open class Polyline ()
      extends StObject
         with typings.amapJsSdk.AMap.Polyline {
      def this(options: PolylineOptions) = this()
      
      /* CompleteClass */
      override def getBounds(): typings.amapJsSdk.AMap.Bounds = js.native
      
      /* CompleteClass */
      override def getExtData(): Any = js.native
      
      /* CompleteClass */
      override def getLength(): Double = js.native
      
      /* CompleteClass */
      override def getOptions(): PolylineOptions = js.native
      
      /* CompleteClass */
      override def getPath(): js.Array[typings.amapJsSdk.AMap.LngLat] = js.native
      
      /* CompleteClass */
      override def hide(): Unit = js.native
      
      /* CompleteClass */
      override def off(eventName: String, callback: EventCallback): Unit = js.native
      
      /* CompleteClass */
      override def on(eventName: String, callback: EventCallback): Unit = js.native
      
      /* CompleteClass */
      override def setExtData(ext: Any): Unit = js.native
      
      /* CompleteClass */
      override def setMap(map: typings.amapJsSdk.AMap.Map): Unit = js.native
      
      /* CompleteClass */
      override def setOptions(opt: PolylineOptions): Unit = js.native
      
      /* CompleteClass */
      override def setPath(path: js.Array[typings.amapJsSdk.AMap.LngLat]): Unit = js.native
      
      /* CompleteClass */
      override def show(): Unit = js.native
    }
    
    @JSGlobal("AMap.Scale")
    @js.native
    open class Scale ()
      extends StObject
         with typings.amapJsSdk.AMap.Scale {
      
      /* CompleteClass */
      override def hide(): Unit = js.native
      
      /* CompleteClass */
      override def off(eventName: String, callback: EventCallback): Unit = js.native
      
      /* CompleteClass */
      var offset: typings.amapJsSdk.AMap.Pixel = js.native
      
      /* CompleteClass */
      override def on(eventName: String, callback: EventCallback): Unit = js.native
      
      /* CompleteClass */
      var position: String = js.native
      
      /* CompleteClass */
      override def show(): Unit = js.native
    }
    
    /**
      * 地物对象的像素尺寸
      */
    @JSGlobal("AMap.Size")
    @js.native
    open class Size protected ()
      extends StObject
         with typings.amapJsSdk.AMap.Size {
      /**
        * 构造尺寸对象
        * @param width 宽度，单位：像素
        * @param height 高度，单位：像素
        */
      def this(width: Double, height: Double) = this()
      
      /**
        * 获得高度
        */
      /* CompleteClass */
      override def getHeight(): Double = js.native
      
      /**
        * 获得宽度
        */
      /* CompleteClass */
      override def getWidth(): Double = js.native
    }
    
    @JSGlobal("AMap.TileLayer")
    @js.native
    open class TileLayer ()
      extends StObject
         with typings.amapJsSdk.AMap.Layer {
      def this(tileOpt: DetectRetina) = this()
      
      /* CompleteClass */
      override def getTiles(): js.Array[String] = js.native
      
      /* CompleteClass */
      override def getZooms(): js.Array[Double] = js.native
      
      /* CompleteClass */
      override def hide(): Unit = js.native
      
      /* CompleteClass */
      override def off(eventName: String, callback: EventCallback): Unit = js.native
      
      /* CompleteClass */
      override def on(eventName: String, callback: EventCallback): Unit = js.native
      
      /* CompleteClass */
      override def reload(): Unit = js.native
      
      /* CompleteClass */
      override def setMap(map: typings.amapJsSdk.AMap.Map): Unit = js.native
      
      /* CompleteClass */
      override def setOpacity(alpha: Double): Unit = js.native
      
      /* CompleteClass */
      override def setTileUrl(): Unit = js.native
      
      /* CompleteClass */
      override def setzIndex(index: Double): Unit = js.native
      
      /* CompleteClass */
      override def show(): Unit = js.native
    }
    object TileLayer {
      
      @JSGlobal("AMap.TileLayer.MapTypeLayer")
      @js.native
      abstract class MapTypeLayer ()
        extends StObject
           with typings.amapJsSdk.AMap.Layer {
        def this(options: typings.amapJsSdk.anon.Map) = this()
        
        /* CompleteClass */
        override def getTiles(): js.Array[String] = js.native
        
        /* CompleteClass */
        override def getZooms(): js.Array[Double] = js.native
        
        /* CompleteClass */
        override def hide(): Unit = js.native
        
        /* CompleteClass */
        override def off(eventName: String, callback: EventCallback): Unit = js.native
        
        /* CompleteClass */
        override def on(eventName: String, callback: EventCallback): Unit = js.native
        
        /* CompleteClass */
        override def reload(): Unit = js.native
        
        /* CompleteClass */
        override def setMap(map: typings.amapJsSdk.AMap.Map): Unit = js.native
        
        /* CompleteClass */
        override def setOpacity(alpha: Double): Unit = js.native
        
        /* CompleteClass */
        override def setTileUrl(): Unit = js.native
        
        /* CompleteClass */
        override def setzIndex(index: Double): Unit = js.native
        
        /* CompleteClass */
        override def show(): Unit = js.native
      }
      
      @JSGlobal("AMap.TileLayer.RoadNet")
      @js.native
      open class RoadNet ()
        extends StObject
           with typings.amapJsSdk.AMap.Layer {
        
        /* CompleteClass */
        override def getTiles(): js.Array[String] = js.native
        
        /* CompleteClass */
        override def getZooms(): js.Array[Double] = js.native
        
        /* CompleteClass */
        override def hide(): Unit = js.native
        
        /* CompleteClass */
        override def off(eventName: String, callback: EventCallback): Unit = js.native
        
        /* CompleteClass */
        override def on(eventName: String, callback: EventCallback): Unit = js.native
        
        /* CompleteClass */
        override def reload(): Unit = js.native
        
        /* CompleteClass */
        override def setMap(map: typings.amapJsSdk.AMap.Map): Unit = js.native
        
        /* CompleteClass */
        override def setOpacity(alpha: Double): Unit = js.native
        
        /* CompleteClass */
        override def setTileUrl(): Unit = js.native
        
        /* CompleteClass */
        override def setzIndex(index: Double): Unit = js.native
        
        /* CompleteClass */
        override def show(): Unit = js.native
      }
      
      @JSGlobal("AMap.TileLayer.Satellite")
      @js.native
      open class Satellite ()
        extends StObject
           with typings.amapJsSdk.AMap.Layer {
        
        /* CompleteClass */
        override def getTiles(): js.Array[String] = js.native
        
        /* CompleteClass */
        override def getZooms(): js.Array[Double] = js.native
        
        /* CompleteClass */
        override def hide(): Unit = js.native
        
        /* CompleteClass */
        override def off(eventName: String, callback: EventCallback): Unit = js.native
        
        /* CompleteClass */
        override def on(eventName: String, callback: EventCallback): Unit = js.native
        
        /* CompleteClass */
        override def reload(): Unit = js.native
        
        /* CompleteClass */
        override def setMap(map: typings.amapJsSdk.AMap.Map): Unit = js.native
        
        /* CompleteClass */
        override def setOpacity(alpha: Double): Unit = js.native
        
        /* CompleteClass */
        override def setTileUrl(): Unit = js.native
        
        /* CompleteClass */
        override def setzIndex(index: Double): Unit = js.native
        
        /* CompleteClass */
        override def show(): Unit = js.native
      }
      
      @JSGlobal("AMap.TileLayer.Traffic")
      @js.native
      open class Traffic ()
        extends StObject
           with typings.amapJsSdk.AMap.TileLayer.Traffic {
        def this(options: AutoRefresh) = this()
        
        /* CompleteClass */
        var autoRefresh: Boolean = js.native
        
        /* CompleteClass */
        override def getTiles(): js.Array[String] = js.native
        
        /* CompleteClass */
        override def getZooms(): js.Array[Double] = js.native
        
        /* CompleteClass */
        override def hide(): Unit = js.native
        
        /* CompleteClass */
        var interval: Double = js.native
        
        /* CompleteClass */
        override def off(eventName: String, callback: EventCallback): Unit = js.native
        
        /* CompleteClass */
        override def on(eventName: String, callback: EventCallback): Unit = js.native
        
        /* CompleteClass */
        override def reload(): Unit = js.native
        
        /* CompleteClass */
        override def setMap(map: typings.amapJsSdk.AMap.Map): Unit = js.native
        
        /* CompleteClass */
        override def setOpacity(alpha: Double): Unit = js.native
        
        /* CompleteClass */
        override def setTileUrl(): Unit = js.native
        
        /* CompleteClass */
        override def setzIndex(index: Double): Unit = js.native
        
        /* CompleteClass */
        override def show(): Unit = js.native
      }
    }
    
    @JSGlobal("AMap.ToolBar")
    @js.native
    open class ToolBar ()
      extends StObject
         with typings.amapJsSdk.AMap.ToolBar {
      def this(options: AutoPosition) = this()
      
      /* CompleteClass */
      override def doLocation(): Unit = js.native
      
      /* CompleteClass */
      override def getLocation(): Lat = js.native
      
      /* CompleteClass */
      override def getOffset(): typings.amapJsSdk.AMap.Pixel = js.native
      
      /* CompleteClass */
      override def hide(): Unit = js.native
      
      /* CompleteClass */
      override def hideDirection(): Unit = js.native
      
      /* CompleteClass */
      override def hideLocation(): Unit = js.native
      
      /* CompleteClass */
      override def hideRuler(): Unit = js.native
      
      /* CompleteClass */
      override def off(eventName: String, callback: EventCallback): Unit = js.native
      
      /* CompleteClass */
      override def on(eventName: String, callback: EventCallback): Unit = js.native
      
      /* CompleteClass */
      override def setOffset(offset: typings.amapJsSdk.AMap.Pixel): Unit = js.native
      
      /* CompleteClass */
      override def show(): Unit = js.native
      
      /* CompleteClass */
      override def showDirection(): Unit = js.native
      
      /* CompleteClass */
      override def showLocation(): Unit = js.native
      
      /* CompleteClass */
      override def showRuler(): Unit = js.native
    }
    
    @JSGlobal("AMap.View2D")
    @js.native
    open class View2D protected ()
      extends StObject
         with typings.amapJsSdk.AMap.View2D {
      def this(opt: Center) = this()
    }
    
    @JSGlobal("AMap.Weather")
    @js.native
    open class Weather ()
      extends StObject
         with typings.amapJsSdk.AMap.Weather {
      
      /**
        * 查询四天预报天气，包括查询当天天气信息
        * @param district 支持城市名称/区域编码（如：“杭州市”/“330100”）
        * @param callback 当请求成功时ErrorStatus为null，当请求不成功时ErrorStatus为Obj
        */
      /* CompleteClass */
      override def getForecast(
        district: String,
        callback: js.Function2[/* errorStatus */ Any, /* result */ WeatherForecastResult, Unit]
      ): Unit = js.native
      
      /**
        * 查询实时天气信息
        * @param district 支持城市名称/区域编码（如：“杭州市”/“330100”）
        * @param callback 当请求成功时ErrorStatus为null，当请求不成功时ErrorStatus为Obj
        */
      /* CompleteClass */
      override def getLive(
        district: String,
        callback: js.Function2[/* errorStatus */ Any, /* result */ WeatherLiveResult, Unit]
      ): Unit = js.native
    }
    
    inline def convertFrom(
      lnglat: js.Array[typings.amapJsSdk.AMap.LngLat],
      `type`: String,
      result: js.Function2[/* status */ String, /* result */ ConvertorResult, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("convertFrom")(lnglat.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Unit]
    inline def convertFrom(
      lnglat: js.Tuple2[Double, Double],
      `type`: String,
      result: js.Function2[/* status */ String, /* result */ ConvertorResult, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("convertFrom")(lnglat.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Unit]
    /**
      * 坐标转换
      */
    inline def convertFrom(
      lnglat: typings.amapJsSdk.AMap.LngLat,
      `type`: String,
      result: js.Function2[/* status */ String, /* result */ ConvertorResult, Unit]
    ): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("convertFrom")(lnglat.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], result.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    object event {
      
      @JSGlobal("AMap.event")
      @js.native
      val ^ : js.Any = js.native
      
      /**
        * 注册DOM对象事件：给DOM对象注册事件，并返回eventListener。运行AMap.event.removeListener(eventListener)可以删除该事件的监听器。
        * @param instance：需注册事件的DOM对象（必填）
        * @param eventName：事件名称（必填）
        * @param handler：事件功能函数（必填）
        * @param context：事件上下文（可选，缺省时，handler中this指向参数instance引用的对象，否则this指向context引用的对象）
        */
      inline def addDomListener(instance: Any, eventName: String, handler: EventCallback): EventListener = (^.asInstanceOf[js.Dynamic].applyDynamic("addDomListener")(instance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventListener]
      inline def addDomListener(instance: Any, eventName: String, handler: EventCallback, context: Any): EventListener = (^.asInstanceOf[js.Dynamic].applyDynamic("addDomListener")(instance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[EventListener]
      
      /**
        * 注册对象事件：给对象注册事件，并返回eventListener。运行AMap.event.removeListener(eventListener)可以删除该事件的监听器。
        * @param instance：需注册事件的对象（必填）
        * @param eventName：事件名称（必填）
        * @param handler：事件功能函数（必填）
        * @param context：事件上下文（可选，缺省时，handler中this指向参数instance引用的对象，否则this指向context引用的对象）
        */
      inline def addListener(instance: Any, eventName: String, handler: EventCallback): EventListener = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(instance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventListener]
      inline def addListener(instance: Any, eventName: String, handler: EventCallback, context: Any): EventListener = (^.asInstanceOf[js.Dynamic].applyDynamic("addListener")(instance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[EventListener]
      
      /**
        * 类似于addListener，但处理程序会在处理完第一个事件后将自已移除。
        */
      inline def addListenerOnce(instance: Any, eventName: String, handler: EventCallback): EventListener = (^.asInstanceOf[js.Dynamic].applyDynamic("addListenerOnce")(instance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[EventListener]
      inline def addListenerOnce(instance: Any, eventName: String, handler: EventCallback, context: Any): EventListener = (^.asInstanceOf[js.Dynamic].applyDynamic("addListenerOnce")(instance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], handler.asInstanceOf[js.Any], context.asInstanceOf[js.Any])).asInstanceOf[EventListener]
      
      /**
        * 删除由上述 event.addDomListener 和 event.addListener 传回的指定侦听器。
        */
      inline def removeListener(listener: EventListener): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("removeListener")(listener.asInstanceOf[js.Any]).asInstanceOf[Unit]
      
      /**
        * 触发非DOM事件：触发非DOM事件eventName，extArgs将扩展到事件监听函数（handler）接受到的event参数中。如:在extArgs内写入{m:10,p:2}，eventName监听函数（handler）可以接收到包含m,p两个key值的event对象。
        */
      inline def trigger(instance: Any, eventName: String, extArgs: Any): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("trigger")(instance.asInstanceOf[js.Any], eventName.asInstanceOf[js.Any], extArgs.asInstanceOf[js.Any])).asInstanceOf[Unit]
    }
    
    /**
      * 加载插件
      * @param pluginNames
      * @param ready
      */
    inline def plugin(pluginNames: js.Array[String]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("plugin")(pluginNames.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def plugin(pluginNames: js.Array[String], ready: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("plugin")(pluginNames.asInstanceOf[js.Any], ready.asInstanceOf[js.Any])).asInstanceOf[Unit]
    
    /**
      * 加载服务
      * @param serviceName
      * @param ready
      */
    inline def service(serviceName: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("service")(serviceName.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def service(serviceName: String, ready: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("service")(serviceName.asInstanceOf[js.Any], ready.asInstanceOf[js.Any])).asInstanceOf[Unit]
  }
}
