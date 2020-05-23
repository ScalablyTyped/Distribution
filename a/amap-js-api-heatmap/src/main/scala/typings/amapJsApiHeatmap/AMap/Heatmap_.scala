package typings.amapJsApiHeatmap.AMap

import typings.amapJsApi.AMap.Map
import typings.amapJsApiHeatmap.AMap.Heatmap.DataSet
import typings.amapJsApiHeatmap.AMap.Heatmap.Options
import typings.amapJsApiHeatmap.anon.Data
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Heatmap_ extends js.Object {
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

