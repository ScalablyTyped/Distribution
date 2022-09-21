package typings.amapJsApi.global.AMap

import typings.amapJsApi.AMap.ContextMenu.Options
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("AMap.ContextMenu")
@js.native
/**
  * 地图右键菜单
  * @param options 选项
  */
open class ContextMenu[ExtraData] ()
  extends StObject
     with typings.amapJsApi.AMap.ContextMenu[ExtraData] {
  def this(options: Options) = this()
}
