package typings.amapJsApi.global.AMap

import typings.amapJsApi.AMap.LocationValue
import typings.amapJsApi.AMap.convertFrom.Result
import typings.amapJsApi.AMap.convertFrom.SearchStatus
import typings.amapJsApi.AMap.convertFrom.Type
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object convertFrom {
  
  @scala.inline
  def apply(
    lnglat: js.Array[LocationValue],
    `type`: Null,
    callback: js.Function2[/* status */ SearchStatus, /* result */ String | Result, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].apply(lnglat.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def apply(
    lnglat: js.Array[LocationValue],
    `type`: Type,
    callback: js.Function2[/* status */ SearchStatus, /* result */ String | Result, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].apply(lnglat.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def apply(
    lnglat: LocationValue,
    `type`: Null,
    callback: js.Function2[/* status */ SearchStatus, /* result */ String | Result, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].apply(lnglat.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  /**
    * 为坐标转换类，支持将其他坐标系的坐标点转换为高德坐标系。
    * @param lnglat 待转换坐标
    * @param type 用于说明是哪个服务商的坐标
    * @param callback 转换完成后的回调函数
    */
  @scala.inline
  def apply(
    lnglat: LocationValue,
    `type`: Type,
    callback: js.Function2[/* status */ SearchStatus, /* result */ String | Result, Unit]
  ): Unit = (^.asInstanceOf[js.Dynamic].apply(lnglat.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  @JSGlobal("AMap.convertFrom")
  @js.native
  val ^ : js.Any = js.native
}
