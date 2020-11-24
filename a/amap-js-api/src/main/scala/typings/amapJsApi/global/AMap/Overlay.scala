package typings.amapJsApi.global.AMap

import typings.amapJsApi.AMap.Overlay.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("AMap.Overlay")
@js.native
abstract class Overlay[ExtraData] ()
  extends typings.amapJsApi.AMap.Overlay[ExtraData] {
  def this(options: Options[_]) = this()
}
