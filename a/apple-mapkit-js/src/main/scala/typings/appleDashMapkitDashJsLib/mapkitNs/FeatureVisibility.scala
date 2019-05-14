package typings
package appleDashMapkitDashJsLib.mapkitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FeatureVisibility extends js.Object

@JSGlobal("mapkit.FeatureVisibility")
@js.native
object FeatureVisibility extends js.Object {
  @js.native
  sealed trait Adaptive
    extends appleDashMapkitDashJsLib.mapkitNs.FeatureVisibility
  
  @js.native
  sealed trait Hidden
    extends appleDashMapkitDashJsLib.mapkitNs.FeatureVisibility
  
  @js.native
  sealed trait Visible
    extends appleDashMapkitDashJsLib.mapkitNs.FeatureVisibility
  
  /* "adaptive" */ val Adaptive: Adaptive with java.lang.String = js.native
  /* "hidden" */ val Hidden: Hidden with java.lang.String = js.native
  /* "visible" */ val Visible: Visible with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[appleDashMapkitDashJsLib.mapkitNs.FeatureVisibility with java.lang.String] = js.native
}

