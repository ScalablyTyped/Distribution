package typings.amapJsApi.global.AMap

import typings.amapJsApi.AMap.Marker.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AMap.Marker")
@js.native
/**
  * 点标记
  * @param options 选项
  */
class Marker[ExtraData] ()
  extends typings.amapJsApi.AMap.Marker[ExtraData] {
  def this(options: Options[ExtraData]) = this()
}

