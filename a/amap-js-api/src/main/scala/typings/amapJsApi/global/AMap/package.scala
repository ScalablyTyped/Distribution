package typings.amapJsApi.global.AMap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}


inline def convertFrom(
  lnglat: js.Array[typings.amapJsApi.AMap.LocationValue],
  `type`: scala.Null,
  callback: js.Function2[
  /* status */ typings.amapJsApi.AMap.convertFrom.SearchStatus, 
  /* result */ java.lang.String | typings.amapJsApi.AMap.convertFrom.Result, 
  scala.Unit
]
): scala.Unit = (typings.amapJsApi.global.AMap.^.asInstanceOf[js.Dynamic].applyDynamic("convertFrom")(lnglat.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
inline def convertFrom(
  lnglat: js.Array[typings.amapJsApi.AMap.LocationValue],
  `type`: typings.amapJsApi.AMap.convertFrom.Type,
  callback: js.Function2[
  /* status */ typings.amapJsApi.AMap.convertFrom.SearchStatus, 
  /* result */ java.lang.String | typings.amapJsApi.AMap.convertFrom.Result, 
  scala.Unit
]
): scala.Unit = (typings.amapJsApi.global.AMap.^.asInstanceOf[js.Dynamic].applyDynamic("convertFrom")(lnglat.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
inline def convertFrom(
  lnglat: typings.amapJsApi.AMap.LocationValue,
  `type`: scala.Null,
  callback: js.Function2[
  /* status */ typings.amapJsApi.AMap.convertFrom.SearchStatus, 
  /* result */ java.lang.String | typings.amapJsApi.AMap.convertFrom.Result, 
  scala.Unit
]
): scala.Unit = (typings.amapJsApi.global.AMap.^.asInstanceOf[js.Dynamic].applyDynamic("convertFrom")(lnglat.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]
/**
  * 为坐标转换类，支持将其他坐标系的坐标点转换为高德坐标系。
  * @param lnglat 待转换坐标
  * @param type 用于说明是哪个服务商的坐标
  * @param callback 转换完成后的回调函数
  */
inline def convertFrom(
  lnglat: typings.amapJsApi.AMap.LocationValue,
  `type`: typings.amapJsApi.AMap.convertFrom.Type,
  callback: js.Function2[
  /* status */ typings.amapJsApi.AMap.convertFrom.SearchStatus, 
  /* result */ java.lang.String | typings.amapJsApi.AMap.convertFrom.Result, 
  scala.Unit
]
): scala.Unit = (typings.amapJsApi.global.AMap.^.asInstanceOf[js.Dynamic].applyDynamic("convertFrom")(lnglat.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[scala.Unit]

/**
  * 加载插件，
  * @param name 插件名称
  * @param callback 插件加载完成后的回调函数
  */
inline def plugin(plugin: java.lang.String, callback: js.Function0[scala.Unit]): typings.amapJsApi.anon.TypeofAMap = (typings.amapJsApi.global.AMap.^.asInstanceOf[js.Dynamic].applyDynamic("plugin")(plugin.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typings.amapJsApi.anon.TypeofAMap]
inline def plugin(plugin: js.Array[java.lang.String], callback: js.Function0[scala.Unit]): typings.amapJsApi.anon.TypeofAMap = (typings.amapJsApi.global.AMap.^.asInstanceOf[js.Dynamic].applyDynamic("plugin")(plugin.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typings.amapJsApi.anon.TypeofAMap]

/**
  * 加载插件，
  * @param name 插件名称
  * @param callback 插件加载完成后的回调函数
  */
inline def service(plugin: java.lang.String, callback: js.Function0[scala.Unit]): typings.amapJsApi.anon.TypeofAMap = (typings.amapJsApi.global.AMap.^.asInstanceOf[js.Dynamic].applyDynamic("service")(plugin.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typings.amapJsApi.anon.TypeofAMap]
inline def service(plugin: js.Array[java.lang.String], callback: js.Function0[scala.Unit]): typings.amapJsApi.anon.TypeofAMap = (typings.amapJsApi.global.AMap.^.asInstanceOf[js.Dynamic].applyDynamic("service")(plugin.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typings.amapJsApi.anon.TypeofAMap]
