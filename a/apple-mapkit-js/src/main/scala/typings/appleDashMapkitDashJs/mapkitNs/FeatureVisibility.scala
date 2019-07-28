package typings.appleDashMapkitDashJs.mapkitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait FeatureVisibility extends js.Object

@JSGlobal("mapkit.FeatureVisibility")
@js.native
object FeatureVisibility extends js.Object {
  @js.native
  sealed trait Adaptive extends FeatureVisibility
  
  @js.native
  sealed trait Hidden extends FeatureVisibility
  
  @js.native
  sealed trait Visible extends FeatureVisibility
  
  /* "adaptive" */ val Adaptive: typings.appleDashMapkitDashJs.mapkitNs.FeatureVisibility.Adaptive with String = js.native
  /* "hidden" */ val Hidden: typings.appleDashMapkitDashJs.mapkitNs.FeatureVisibility.Hidden with String = js.native
  /* "visible" */ val Visible: typings.appleDashMapkitDashJs.mapkitNs.FeatureVisibility.Visible with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[FeatureVisibility with String] = js.native
}

