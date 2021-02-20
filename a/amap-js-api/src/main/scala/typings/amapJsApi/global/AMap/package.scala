package typings.amapJsApi.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object AMap {
  
  /**
    * 加载插件，
    * @param name 插件名称
    * @param callback 插件加载完成后的回调函数
    */
  @scala.inline
  def plugin(plugin: java.lang.String, callback: js.Function0[scala.Unit]): typings.amapJsApi.anon.TypeofAMap = (typings.amapJsApi.global.AMap.^.asInstanceOf[js.Dynamic].applyDynamic("plugin")(plugin.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typings.amapJsApi.anon.TypeofAMap]
  @scala.inline
  def plugin(plugin: js.Array[java.lang.String], callback: js.Function0[scala.Unit]): typings.amapJsApi.anon.TypeofAMap = (typings.amapJsApi.global.AMap.^.asInstanceOf[js.Dynamic].applyDynamic("plugin")(plugin.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typings.amapJsApi.anon.TypeofAMap]
  
  /**
    * 加载插件，
    * @param name 插件名称
    * @param callback 插件加载完成后的回调函数
    */
  @scala.inline
  def service(plugin: java.lang.String, callback: js.Function0[scala.Unit]): typings.amapJsApi.anon.TypeofAMap = (typings.amapJsApi.global.AMap.^.asInstanceOf[js.Dynamic].applyDynamic("service")(plugin.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typings.amapJsApi.anon.TypeofAMap]
  @scala.inline
  def service(plugin: js.Array[java.lang.String], callback: js.Function0[scala.Unit]): typings.amapJsApi.anon.TypeofAMap = (typings.amapJsApi.global.AMap.^.asInstanceOf[js.Dynamic].applyDynamic("service")(plugin.asInstanceOf[js.Any], callback.asInstanceOf[js.Any])).asInstanceOf[typings.amapJsApi.anon.TypeofAMap]
}
