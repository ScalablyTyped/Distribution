package typings.appleDashMapkitDashJs.mapkitNs.AnnotationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CollisionMode extends js.Object

@JSGlobal("mapkit.Annotation.CollisionMode")
@js.native
object CollisionMode extends js.Object {
  @js.native
  sealed trait Circle extends CollisionMode
  
  @js.native
  sealed trait Rectangle extends CollisionMode
  
  /* "circle" */ val Circle: typings.appleDashMapkitDashJs.mapkitNs.AnnotationNs.CollisionMode.Circle with String = js.native
  /* "rectangle" */ val Rectangle: typings.appleDashMapkitDashJs.mapkitNs.AnnotationNs.CollisionMode.Rectangle with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[CollisionMode with String] = js.native
}

