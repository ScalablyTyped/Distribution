package typings
package amapDashJsDashSdkLib.AMapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 用于地图上加载大量点标记，提高地图的绘制和显示性能。
  */
@JSGlobal("AMap.MarkerClusterer")
@js.native
class MarkerClusterer protected () extends EventBindable {
  def this(map: Map, markers: js.Array[Marker]) = this()
  def this(map: Map, markers: js.Array[Marker], opt: MarkerClustererOptions) = this()
  /**
    * 添加一个需进行聚合的点标记
    * @param marker
    */
  def addMarker(marker: Marker): scala.Unit = js.native
  /**
    * 添加一组需进行聚合的点标记
    */
  def addMarkers(markers: js.Array[Marker]): scala.Unit = js.native
  /**
    * 从地图上彻底清除所有聚合点标记
    */
  def clearMarkers(): scala.Unit = js.native
  /**
    * 获取聚合点的总数量
    */
  def getClustersCount(): scala.Double = js.native
  /**
    * 获取聚合网格的像素大小
    */
  def getGridSize(): scala.Double = js.native
  /**
    * 获取该点聚合的地图对象
    */
  def getMap(): Map = js.native
  /**
    * 获取该点聚合中的点标记集合
    */
  def getMarkers(): js.Array[Marker] = js.native
  /**
    * 获取地图中点标记的最大聚合级别
    */
  def getMaxZoom(): scala.Double = js.native
  /**
    * 获取单个聚合的最小数量
    */
  def getMinClusterSize(): scala.Double = js.native
  /**
    * 获取聚合的样式风格集合
    */
  def getStyles(): js.Array[_] = js.native
  /**
    * 获取单个聚合点位置是否是聚合内所有标记的平均中心
    */
  def isAverageCenter(): scala.Boolean = js.native
  /**
    * 删除一个聚合的点标记
    * @param marker 点标记
    */
  def removeMarker(marker: Marker): scala.Unit = js.native
  /**
    * 删除一组聚合的点标记
    * @param markers
    */
  def removeMarkers(markers: js.Array[Marker]): scala.Unit = js.native
  /**
    * 设置单个聚合点位置是否是聚合内所有标记的平均中心
    * @param averageCenter
    */
  def setAverageCenter(averageCenter: scala.Boolean): scala.Unit = js.native
  /**
    * 设置聚合网格的像素大小
    * @param size
    */
  def setGridSize(size: scala.Double): scala.Unit = js.native
  /**
    * 设置将进行点聚合的地图对象
    * @param map
    */
  def setMap(map: Map): scala.Unit = js.native
  /**
    * 设置将进行点聚合显示的点标记集合
    * @param markers
    */
  def setMarkers(markers: js.Array[Marker]): scala.Unit = js.native
  /**
    * 设置地图中点标记的最大聚合级别
    * @param zoom
    */
  def setMaxZoom(zoom: scala.Double): scala.Unit = js.native
  /**
    * 设置单个聚合的最小数量
    * @param size
    */
  def setMinClusterSize(size: scala.Double): scala.Unit = js.native
  /**
    * 设置聚合的样式风格
    * @param styles
    */
  def setStyles(styles: js.Array[_]): scala.Unit = js.native
}

