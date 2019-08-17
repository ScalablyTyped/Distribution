package typings.amapDashJsDashApi.AMapNs.TileLayerNs

import typings.amapDashJsDashApi.AMapNs.TileLayerNs.WMSNs.Params
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AMap.TileLayer.WMS")
@js.native
class WMS protected () extends Flexible {
  /**
    * WMS图层
    * @param options 图层选项
    */
  def this(options: typings.amapDashJsDashApi.AMapNs.TileLayerNs.WMSNs.Options) = this()
  /**
    * 返回OGC标准的WMS getMap接口的参数
    */
  def getParams(): Params = js.native
  /**
    * 返回wms服务地址
    */
  def getUrl(): String = js.native
  /**
    * 设置OGC标准的WMS getMap接口的参数
    * @param params 接口参数
    */
  def setParams(params: Params): Unit = js.native
  /**
    * 设置wms服务地址
    * @param url 服务地址
    */
  def setUrl(url: String): Unit = js.native
}

