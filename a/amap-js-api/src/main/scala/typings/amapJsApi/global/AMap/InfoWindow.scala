package typings.amapJsApi.global.AMap

import typings.amapJsApi.AMap.InfoWindow.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AMap.InfoWindow")
@js.native
/**
  * 信息展示窗体
  * @param options 选项
  */
class InfoWindow[ExtraData] ()
  extends typings.amapJsApi.AMap.InfoWindow[ExtraData] {
  def this(options: Options[_]) = this()
}

