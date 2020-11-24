package typings.amapJsApi.global.AMap

import typings.amapJsApi.anon.TypeofAMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("AMap.service")
@js.native
object service extends js.Object {
  
  /**
    * 加载插件，
    * @param name 插件名称
    * @param callback 插件加载完成后的回调函数
    */
  def apply(plugin: String, callback: js.Function0[Unit]): TypeofAMap = js.native
  def apply(plugin: js.Array[String], callback: js.Function0[Unit]): TypeofAMap = js.native
}
