package typings
package appleDashMapkitDashJsLib.mapkitNs.MapNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ColorSchemes extends js.Object

@JSGlobal("mapkit.Map.ColorSchemes")
@js.native
object ColorSchemes extends js.Object {
  @js.native
  sealed trait Dark
    extends appleDashMapkitDashJsLib.mapkitNs.MapNs.ColorSchemes
  
  @js.native
  sealed trait Light
    extends appleDashMapkitDashJsLib.mapkitNs.MapNs.ColorSchemes
  
  /* "dark" */ val Dark: Dark with java.lang.String = js.native
  /* "light" */ val Light: Light with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[appleDashMapkitDashJsLib.mapkitNs.MapNs.ColorSchemes with java.lang.String] = js.native
}

