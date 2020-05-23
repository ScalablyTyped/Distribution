package typings.amapJsSdk.global.AMap

import typings.amapJsSdk.AMap.EventCallback
import typings.amapJsSdk.AMap.MarkerClustererOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * 用于地图上加载大量点标记，提高地图的绘制和显示性能。
  */
@JSGlobal("AMap.MarkerClusterer")
@js.native
class MarkerClusterer protected ()
  extends typings.amapJsSdk.AMap.MarkerClusterer {
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
  override def getStyles(): js.Array[_] = js.native
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
  override def setStyles(styles: js.Array[_]): Unit = js.native
}

