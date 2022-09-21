package typings.amapJsApi.global.AMap

import typings.amapJsApi.AMap.LocationValue
import typings.amapJsApi.AMap.convertFrom.Result
import typings.amapJsApi.AMap.convertFrom.SearchStatus
import typings.amapJsApi.AMap.convertFrom.Type
import typings.amapJsApi.anon.TypeofAMap
import typings.amapJsApi.global.AMap.^
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def convertFrom(
  lnglat: js.Array[LocationValue],
  `type`: Null,
  callback: js.Function2[/* status */ SearchStatus, /* result */ String | Result, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("convertFrom")(lnglat.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def convertFrom(
  lnglat: js.Array[LocationValue],
  `type`: Type,
  callback: js.Function2[/* status */ SearchStatus, /* result */ String | Result, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("convertFrom")(lnglat.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
inline def convertFrom(
  lnglat: LocationValue,
  `type`: Null,
  callback: js.Function2[/* status */ SearchStatus, /* result */ String | Result, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("convertFrom")(lnglat.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]
/**
  * 为坐标转换类，支持将其他坐标系的坐标点转换为高德坐标系。
  * @param lnglat 待转换坐标
  * @param type 用于说明是哪个服务商的坐标
  * @param callback 转换完成后的回调函数
  */
inline def convertFrom(
  lnglat: LocationValue,
  `type`: Type,
  callback: js.Function2[/* status */ SearchStatus, /* result */ String | Result, Unit]
): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("convertFrom")(lnglat.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[Unit]

/**
  * 加载插件，
  * @param name 插件名称
  * @param callback 插件加载完成后的回调函数
  */
inline def plugin(plugin: String, callback: js.Function0[Unit]): TypeofAMap = (^.asInstanceOf[js.Dynamic].applyDynamic("plugin")(plugin.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[TypeofAMap]
inline def plugin(plugin: js.Array[String], callback: js.Function0[Unit]): TypeofAMap = (^.asInstanceOf[js.Dynamic].applyDynamic("plugin")(plugin.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[TypeofAMap]

/**
  * 加载插件，
  * @param name 插件名称
  * @param callback 插件加载完成后的回调函数
  */
inline def service(plugin: String, callback: js.Function0[Unit]): TypeofAMap = (^.asInstanceOf[js.Dynamic].applyDynamic("service")(plugin.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[TypeofAMap]
inline def service(plugin: js.Array[String], callback: js.Function0[Unit]): TypeofAMap = (^.asInstanceOf[js.Dynamic].applyDynamic("service")(plugin.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[TypeofAMap]
