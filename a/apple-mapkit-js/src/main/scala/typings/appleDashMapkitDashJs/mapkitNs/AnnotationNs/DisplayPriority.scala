package typings.appleDashMapkitDashJs.mapkitNs.AnnotationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DisplayPriority extends js.Object

@JSGlobal("mapkit.Annotation.DisplayPriority")
@js.native
object DisplayPriority extends js.Object {
  @js.native
  sealed trait High extends DisplayPriority
  
  @js.native
  sealed trait Low extends DisplayPriority
  
  @js.native
  sealed trait Require extends DisplayPriority
  
  /* 750 */ val High: typings.appleDashMapkitDashJs.mapkitNs.AnnotationNs.DisplayPriority.High with Double = js.native
  /* 250 */ val Low: typings.appleDashMapkitDashJs.mapkitNs.AnnotationNs.DisplayPriority.Low with Double = js.native
  /* 1000 */ val Require: typings.appleDashMapkitDashJs.mapkitNs.AnnotationNs.DisplayPriority.Require with Double = js.native
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[DisplayPriority with Double] = js.native
}

