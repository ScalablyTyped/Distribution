package typings
package appleDashMapkitDashJsLib.mapkitNs.AnnotationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait DisplayPriority extends js.Object

@JSGlobal("mapkit.Annotation.DisplayPriority")
@js.native
object DisplayPriority extends js.Object {
  @js.native
  sealed trait High
    extends appleDashMapkitDashJsLib.mapkitNs.AnnotationNs.DisplayPriority
  
  @js.native
  sealed trait Low
    extends appleDashMapkitDashJsLib.mapkitNs.AnnotationNs.DisplayPriority
  
  @js.native
  sealed trait Require
    extends appleDashMapkitDashJsLib.mapkitNs.AnnotationNs.DisplayPriority
  
  /* 750 */ val High: High with scala.Double = js.native
  /* 250 */ val Low: Low with scala.Double = js.native
  /* 1000 */ val Require: Require with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[appleDashMapkitDashJsLib.mapkitNs.AnnotationNs.DisplayPriority with scala.Double] = js.native
}

