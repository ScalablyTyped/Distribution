package typings.amapJsApi.global.AMap

import typings.amapJsApi.AMap.Polygon.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AMap.Polygon")
@js.native
/**
  * 多边形
  * @param options 选项
  */
class Polygon[ExtraData] ()
  extends typings.amapJsApi.AMap.Polygon[ExtraData] {
  def this(options: Options[ExtraData]) = this()
}

