package typings.amapJsApi.global.AMap

import typings.amapJsApi.AMap.Circle.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AMap.Circle")
@js.native
/**
  * 圆形覆盖物
  * @param options 覆盖物选项
  */
class Circle[ExtraData] ()
  extends typings.amapJsApi.AMap.Circle[ExtraData] {
  def this(options: Options[ExtraData]) = this()
}

