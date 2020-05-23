package typings.amapJsApi.global.AMap

import typings.amapJsApi.AMap.LocationValue
import typings.amapJsApi.AMap.convertFrom.Result
import typings.amapJsApi.AMap.convertFrom.SearchStatus
import typings.amapJsApi.AMap.convertFrom.Type
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AMap.convertFrom")
@js.native
object convertFrom extends js.Object {
  def apply(
    lnglat: js.Array[LocationValue],
    `type`: Null,
    callback: js.Function2[/* status */ SearchStatus, /* result */ String | Result, Unit]
  ): Unit = js.native
  def apply(
    lnglat: js.Array[LocationValue],
    `type`: Type,
    callback: js.Function2[/* status */ SearchStatus, /* result */ String | Result, Unit]
  ): Unit = js.native
  def apply(
    lnglat: LocationValue,
    `type`: Null,
    callback: js.Function2[/* status */ SearchStatus, /* result */ String | Result, Unit]
  ): Unit = js.native
  /**
    * 为坐标转换类，支持将其他坐标系的坐标点转换为高德坐标系。
    * @param lnglat 待转换坐标
    * @param type 用于说明是哪个服务商的坐标
    * @param callback 转换完成后的回调函数
    */
  def apply(
    lnglat: LocationValue,
    `type`: Type,
    callback: js.Function2[/* status */ SearchStatus, /* result */ String | Result, Unit]
  ): Unit = js.native
}

