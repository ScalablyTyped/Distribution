package typings
package appleDashMapkitDashJsLib.mapkitNs.DirectionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Transport extends js.Object

@JSGlobal("mapkit.Directions.Transport")
@js.native
object Transport extends js.Object {
  @js.native
  sealed trait Automobile
    extends appleDashMapkitDashJsLib.mapkitNs.DirectionsNs.Transport
  
  @js.native
  sealed trait Walking
    extends appleDashMapkitDashJsLib.mapkitNs.DirectionsNs.Transport
  
  /* "automobile" */ val Automobile: Automobile with java.lang.String = js.native
  /* "walking" */ val Walking: Walking with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[appleDashMapkitDashJsLib.mapkitNs.DirectionsNs.Transport with java.lang.String] = js.native
}

