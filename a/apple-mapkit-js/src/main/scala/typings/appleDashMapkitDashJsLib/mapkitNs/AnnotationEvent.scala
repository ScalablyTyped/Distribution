package typings
package appleDashMapkitDashJsLib.mapkitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AnnotationEvent extends js.Object

@JSGlobal("mapkit.AnnotationEvent")
@js.native
object AnnotationEvent extends js.Object {
  @js.native
  sealed trait Deselect
    extends appleDashMapkitDashJsLib.mapkitNs.AnnotationEvent
  
  @js.native
  sealed trait DragEnd
    extends appleDashMapkitDashJsLib.mapkitNs.AnnotationEvent
  
  @js.native
  sealed trait DragStart
    extends appleDashMapkitDashJsLib.mapkitNs.AnnotationEvent
  
  @js.native
  sealed trait Dragging
    extends appleDashMapkitDashJsLib.mapkitNs.AnnotationEvent
  
  @js.native
  sealed trait Select
    extends appleDashMapkitDashJsLib.mapkitNs.AnnotationEvent
  
  /* "deselect" */ val Deselect: Deselect with java.lang.String = js.native
  /* "drag-end" */ val DragEnd: DragEnd with java.lang.String = js.native
  /* "drag-start" */ val DragStart: DragStart with java.lang.String = js.native
  /* "dragging" */ val Dragging: Dragging with java.lang.String = js.native
  /* "select" */ val Select: Select with java.lang.String = js.native
  @JSBracketAccess
  def apply(value: java.lang.String): js.UndefOr[appleDashMapkitDashJsLib.mapkitNs.AnnotationEvent with java.lang.String] = js.native
}

