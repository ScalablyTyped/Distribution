package typings.appleDashMapkitDashJs.mapkitNs.MapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ColorSchemes extends js.Object

@JSGlobal("mapkit.Map.ColorSchemes")
@js.native
object ColorSchemes extends js.Object {
  @js.native
  sealed trait Dark extends ColorSchemes
  
  @js.native
  sealed trait Light extends ColorSchemes
  
  /* "dark" */ val Dark: typings.appleDashMapkitDashJs.mapkitNs.MapNs.ColorSchemes.Dark with String = js.native
  /* "light" */ val Light: typings.appleDashMapkitDashJs.mapkitNs.MapNs.ColorSchemes.Light with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[ColorSchemes with String] = js.native
}

