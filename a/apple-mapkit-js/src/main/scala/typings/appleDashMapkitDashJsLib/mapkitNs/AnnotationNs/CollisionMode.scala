package typings
package appleDashMapkitDashJsLib.mapkitNs.AnnotationNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait CollisionMode extends js.Object

@JSGlobal("mapkit.Annotation.CollisionMode")
@js.native
object CollisionMode extends js.Object {
  @js.native
  sealed trait Circle
    extends appleDashMapkitDashJsLib.mapkitNs.AnnotationNs.CollisionMode
  
  @js.native
  sealed trait Rectangle
    extends appleDashMapkitDashJsLib.mapkitNs.AnnotationNs.CollisionMode
  
  /* "circle" */ val Circle: Circle with java.lang.String = js.native
  /* "rectangle" */ val Rectangle: Rectangle with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[
    appleDashMapkitDashJsLib.mapkitNs.AnnotationNs.CollisionMode with java.lang.String
  ] = js.native
}

