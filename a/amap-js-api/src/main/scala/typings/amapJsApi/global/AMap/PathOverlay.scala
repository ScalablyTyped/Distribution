package typings.amapJsApi.global.AMap

import typings.amapJsApi.AMap.PathOverlay.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("AMap.PathOverlay")
@js.native
abstract class PathOverlay[ExtraData] ()
  extends typings.amapJsApi.AMap.PathOverlay[ExtraData] {
  def this(options: Options[ExtraData]) = this()
}

