package typings.amapJsApiIndoorMap.AMap

import typings.amapJsApi.AMap.Layer
import typings.amapJsApiIndoorMap.AMap.IndoorMap.Building
import typings.amapJsApiIndoorMap.AMap.IndoorMap.Options
import typings.amapJsApiIndoorMap.AMap.IndoorMap.SearchResult
import typings.amapJsApiIndoorMap.amapJsApiIndoorMapBooleans.`false`
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AMap.IndoorMap")
@js.native
/**
  * 室内地图
  * @param options 选项
  */
class IndoorMap_ () extends Layer {
  def this(options: Options) = this()
  // internal
  def getFloorBar(): Unit = js.native
  /**
    * 获取处于被选中状态的室内地图的一些基本信息
    */
  def getSelectedBuilding(): Building | Null = js.native
  /**
    * 获取处于被选中状态的室内地图的ID
    */
  def getSelectedBuildingId(): String | Null = js.native
  /**
    * 隐藏楼层切换控件
    */
  def hideFloorBar(): Unit = js.native
  /**
    * 隐藏室内地图标注
    */
  def hideLabels(): Unit = js.native
  def setSelectedBuildingId(id: String): Unit = js.native
  /**
    * 显示指定的楼层
    * @param floor 楼层
    * @param noMove 禁止移动
    */
  def showFloor(floor: Double): js.UndefOr[`false`] = js.native
  def showFloor(floor: Double, noMove: Boolean): js.UndefOr[`false`] = js.native
  /**
    * 显示楼层切换控件
    */
  def showFloorBar(): Unit = js.native
  /**
    * 显示指定室内地图信息
    * @param indoorId 建筑物ID
    * @param callback 回调
    */
  def showIndoorMap(indoorId: String): Unit = js.native
  def showIndoorMap(
    indoorId: String,
    callback: js.Function2[/* error */ Null | Error, /* result */ SearchResult, Unit]
  ): Unit = js.native
  def showIndoorMap(indoorId: String, floor: Double): Unit = js.native
  def showIndoorMap(
    indoorId: String,
    floor: Double,
    callback: js.Function2[/* error */ Null | Error, /* result */ SearchResult, Unit]
  ): Unit = js.native
  def showIndoorMap(indoorId: String, floor: Double, shopId: String): Unit = js.native
  def showIndoorMap(
    indoorId: String,
    floor: Double,
    shopId: String,
    callback: js.Function2[/* error */ Null | Error, /* result */ SearchResult, Unit]
  ): Unit = js.native
  def showIndoorMap(indoorId: String, floor: Double, shopId: String, noMove: Boolean): Unit = js.native
  def showIndoorMap(
    indoorId: String,
    floor: Double,
    shopId: String,
    noMove: Boolean,
    callback: js.Function2[/* error */ Null | Error, /* result */ SearchResult, Unit]
  ): Unit = js.native
  /**
    * 显示室内地图标注
    */
  def showLabels(): Unit = js.native
}

