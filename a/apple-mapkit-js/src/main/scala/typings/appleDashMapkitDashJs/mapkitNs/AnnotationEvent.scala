package typings.appleDashMapkitDashJs.mapkitNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait AnnotationEvent extends js.Object

@JSGlobal("mapkit.AnnotationEvent")
@js.native
object AnnotationEvent extends js.Object {
  @js.native
  sealed trait Deselect extends AnnotationEvent
  
  @js.native
  sealed trait DragEnd extends AnnotationEvent
  
  @js.native
  sealed trait DragStart extends AnnotationEvent
  
  @js.native
  sealed trait Dragging extends AnnotationEvent
  
  @js.native
  sealed trait Select extends AnnotationEvent
  
  /* "deselect" */ val Deselect: typings.appleDashMapkitDashJs.mapkitNs.AnnotationEvent.Deselect with String = js.native
  /* "drag-end" */ val DragEnd: typings.appleDashMapkitDashJs.mapkitNs.AnnotationEvent.DragEnd with String = js.native
  /* "drag-start" */ val DragStart: typings.appleDashMapkitDashJs.mapkitNs.AnnotationEvent.DragStart with String = js.native
  /* "dragging" */ val Dragging: typings.appleDashMapkitDashJs.mapkitNs.AnnotationEvent.Dragging with String = js.native
  /* "select" */ val Select: typings.appleDashMapkitDashJs.mapkitNs.AnnotationEvent.Select with String = js.native
  @JSBracketAccess
  def apply(value: String): js.UndefOr[AnnotationEvent with String] = js.native
}

