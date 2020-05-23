package typings.amapJsSdk.AMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 用于地图上加载大量点标记，提高地图的绘制和显示性能。
  */
trait MarkerClusterer extends EventBindable {
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
  def getStyles(): js.Array[_]
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
  def setStyles(styles: js.Array[_]): Unit
}

object MarkerClusterer {
  @scala.inline
  def apply(
    addMarker: Marker => Unit,
    addMarkers: js.Array[Marker] => Unit,
    clearMarkers: () => Unit,
    getClustersCount: () => Double,
    getGridSize: () => Double,
    getMap: () => Map,
    getMarkers: () => js.Array[Marker],
    getMaxZoom: () => Double,
    getMinClusterSize: () => Double,
    getStyles: () => js.Array[_],
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
    setStyles: js.Array[_] => Unit
  ): MarkerClusterer = {
    val __obj = js.Dynamic.literal(addMarker = js.Any.fromFunction1(addMarker), addMarkers = js.Any.fromFunction1(addMarkers), clearMarkers = js.Any.fromFunction0(clearMarkers), getClustersCount = js.Any.fromFunction0(getClustersCount), getGridSize = js.Any.fromFunction0(getGridSize), getMap = js.Any.fromFunction0(getMap), getMarkers = js.Any.fromFunction0(getMarkers), getMaxZoom = js.Any.fromFunction0(getMaxZoom), getMinClusterSize = js.Any.fromFunction0(getMinClusterSize), getStyles = js.Any.fromFunction0(getStyles), isAverageCenter = js.Any.fromFunction0(isAverageCenter), off = js.Any.fromFunction2(off), on = js.Any.fromFunction2(on), removeMarker = js.Any.fromFunction1(removeMarker), removeMarkers = js.Any.fromFunction1(removeMarkers), setAverageCenter = js.Any.fromFunction1(setAverageCenter), setGridSize = js.Any.fromFunction1(setGridSize), setMap = js.Any.fromFunction1(setMap), setMarkers = js.Any.fromFunction1(setMarkers), setMaxZoom = js.Any.fromFunction1(setMaxZoom), setMinClusterSize = js.Any.fromFunction1(setMinClusterSize), setStyles = js.Any.fromFunction1(setStyles))
    __obj.asInstanceOf[MarkerClusterer]
  }
}

