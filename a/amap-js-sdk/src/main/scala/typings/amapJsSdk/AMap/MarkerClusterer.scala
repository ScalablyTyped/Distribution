package typings.amapJsSdk.AMap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * 用于地图上加载大量点标记，提高地图的绘制和显示性能。
  */
trait MarkerClusterer
  extends StObject
     with EventBindable {
  
  /**
    * 添加一个需进行聚合的点标记
    * @param marker
    */
  def addMarker(marker: Marker): Unit
  
  /**
    * 添加一组需进行聚合的点标记
    */
  def addMarkers(markers: js.Array[Marker]): Unit
  
  /**
    * 从地图上彻底清除所有聚合点标记
    */
  def clearMarkers(): Unit
  
  /**
    * 获取聚合点的总数量
    */
  def getClustersCount(): Double
  
  /**
    * 获取聚合网格的像素大小
    */
  def getGridSize(): Double
  
  /**
    * 获取该点聚合的地图对象
    */
  def getMap(): Map
  
  /**
    * 获取该点聚合中的点标记集合
    */
  def getMarkers(): js.Array[Marker]
  
  /**
    * 获取地图中点标记的最大聚合级别
    */
  def getMaxZoom(): Double
  
  /**
    * 获取单个聚合的最小数量
    */
  def getMinClusterSize(): Double
  
  /**
    * 获取聚合的样式风格集合
    */
  def getStyles(): js.Array[js.Any]
  
  /**
    * 获取单个聚合点位置是否是聚合内所有标记的平均中心
    */
  def isAverageCenter(): Boolean
  
  /**
    * 删除一个聚合的点标记
    * @param marker 点标记
    */
  def removeMarker(marker: Marker): Unit
  
  /**
    * 删除一组聚合的点标记
    * @param markers
    */
  def removeMarkers(markers: js.Array[Marker]): Unit
  
  /**
    * 设置单个聚合点位置是否是聚合内所有标记的平均中心
    * @param averageCenter
    */
  def setAverageCenter(averageCenter: Boolean): Unit
  
  /**
    * 设置聚合网格的像素大小
    * @param size
    */
  def setGridSize(size: Double): Unit
  
  /**
    * 设置将进行点聚合的地图对象
    * @param map
    */
  def setMap(map: Map): Unit
  
  /**
    * 设置将进行点聚合显示的点标记集合
    * @param markers
    */
  def setMarkers(markers: js.Array[Marker]): Unit
  
  /**
    * 设置地图中点标记的最大聚合级别
    * @param zoom
    */
  def setMaxZoom(zoom: Double): Unit
  
  /**
    * 设置单个聚合的最小数量
    * @param size
    */
  def setMinClusterSize(size: Double): Unit
  
  /**
    * 设置聚合的样式风格
    * @param styles
    */
  def setStyles(styles: js.Array[js.Any]): Unit
}
object MarkerClusterer {
  
  inline def apply(
    addMarker: Marker => Unit,
    addMarkers: js.Array[Marker] => Unit,
    clearMarkers: () => Unit,
    getClustersCount: () => Double,
    getGridSize: () => Double,
    getMap: () => Map,
    getMarkers: () => js.Array[Marker],
    getMaxZoom: () => Double,
    getMinClusterSize: () => Double,
    getStyles: () => js.Array[js.Any],
    isAverageCenter: () => Boolean,
    off: (String, EventCallback) => Unit,
    on: (String, EventCallback) => Unit,
    removeMarker: Marker => Unit,
    removeMarkers: js.Array[Marker] => Unit,
    setAverageCenter: Boolean => Unit,
    setGridSize: Double => Unit,
    setMap: Map => Unit,
    setMarkers: js.Array[Marker] => Unit,
    setMaxZoom: Double => Unit,
    setMinClusterSize: Double => Unit,
    setStyles: js.Array[js.Any] => Unit
  ): MarkerClusterer = {
    val __obj = js.Dynamic.literal(addMarker = js.Any.fromFunction1(addMarker), addMarkers = js.Any.fromFunction1(addMarkers), clearMarkers = js.Any.fromFunction0(clearMarkers), getClustersCount = js.Any.fromFunction0(getClustersCount), getGridSize = js.Any.fromFunction0(getGridSize), getMap = js.Any.fromFunction0(getMap), getMarkers = js.Any.fromFunction0(getMarkers), getMaxZoom = js.Any.fromFunction0(getMaxZoom), getMinClusterSize = js.Any.fromFunction0(getMinClusterSize), getStyles = js.Any.fromFunction0(getStyles), isAverageCenter = js.Any.fromFunction0(isAverageCenter), off = js.Any.fromFunction2(off), on = js.Any.fromFunction2(on), removeMarker = js.Any.fromFunction1(removeMarker), removeMarkers = js.Any.fromFunction1(removeMarkers), setAverageCenter = js.Any.fromFunction1(setAverageCenter), setGridSize = js.Any.fromFunction1(setGridSize), setMap = js.Any.fromFunction1(setMap), setMarkers = js.Any.fromFunction1(setMarkers), setMaxZoom = js.Any.fromFunction1(setMaxZoom), setMinClusterSize = js.Any.fromFunction1(setMinClusterSize), setStyles = js.Any.fromFunction1(setStyles))
    __obj.asInstanceOf[MarkerClusterer]
  }
  
  extension [Self <: MarkerClusterer](x: Self) {
    
    inline def setAddMarker(value: Marker => Unit): Self = StObject.set(x, "addMarker", js.Any.fromFunction1(value))
    
    inline def setAddMarkers(value: js.Array[Marker] => Unit): Self = StObject.set(x, "addMarkers", js.Any.fromFunction1(value))
    
    inline def setClearMarkers(value: () => Unit): Self = StObject.set(x, "clearMarkers", js.Any.fromFunction0(value))
    
    inline def setGetClustersCount(value: () => Double): Self = StObject.set(x, "getClustersCount", js.Any.fromFunction0(value))
    
    inline def setGetGridSize(value: () => Double): Self = StObject.set(x, "getGridSize", js.Any.fromFunction0(value))
    
    inline def setGetMap(value: () => Map): Self = StObject.set(x, "getMap", js.Any.fromFunction0(value))
    
    inline def setGetMarkers(value: () => js.Array[Marker]): Self = StObject.set(x, "getMarkers", js.Any.fromFunction0(value))
    
    inline def setGetMaxZoom(value: () => Double): Self = StObject.set(x, "getMaxZoom", js.Any.fromFunction0(value))
    
    inline def setGetMinClusterSize(value: () => Double): Self = StObject.set(x, "getMinClusterSize", js.Any.fromFunction0(value))
    
    inline def setGetStyles(value: () => js.Array[js.Any]): Self = StObject.set(x, "getStyles", js.Any.fromFunction0(value))
    
    inline def setIsAverageCenter(value: () => Boolean): Self = StObject.set(x, "isAverageCenter", js.Any.fromFunction0(value))
    
    inline def setRemoveMarker(value: Marker => Unit): Self = StObject.set(x, "removeMarker", js.Any.fromFunction1(value))
    
    inline def setRemoveMarkers(value: js.Array[Marker] => Unit): Self = StObject.set(x, "removeMarkers", js.Any.fromFunction1(value))
    
    inline def setSetAverageCenter(value: Boolean => Unit): Self = StObject.set(x, "setAverageCenter", js.Any.fromFunction1(value))
    
    inline def setSetGridSize(value: Double => Unit): Self = StObject.set(x, "setGridSize", js.Any.fromFunction1(value))
    
    inline def setSetMap(value: Map => Unit): Self = StObject.set(x, "setMap", js.Any.fromFunction1(value))
    
    inline def setSetMarkers(value: js.Array[Marker] => Unit): Self = StObject.set(x, "setMarkers", js.Any.fromFunction1(value))
    
    inline def setSetMaxZoom(value: Double => Unit): Self = StObject.set(x, "setMaxZoom", js.Any.fromFunction1(value))
    
    inline def setSetMinClusterSize(value: Double => Unit): Self = StObject.set(x, "setMinClusterSize", js.Any.fromFunction1(value))
    
    inline def setSetStyles(value: js.Array[js.Any] => Unit): Self = StObject.set(x, "setStyles", js.Any.fromFunction1(value))
  }
}
