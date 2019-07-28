package typings.appleDashMapkitDashJs.mapkitNs.DirectionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait Transport extends js.Object

@JSGlobal("mapkit.Directions.Transport")
@js.native
object Transport extends js.Object {
  @js.native
  sealed trait Automobile extends Transport
  
  @js.native
  sealed trait Walking extends Transport
  
  /* "automobile" */ val Automobile: typings.appleDashMapkitDashJs.mapkitNs.DirectionsNs.Transport.Automobile with String = js.native
  /* "walking" */ val Walking: typings.appleDashMapkitDashJs.mapkitNs.DirectionsNs.Transport.Walking with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[Transport with String] = js.native
}

