package typings.appleMapkitJs.mapkit

import typings.appleMapkitJs.anon.AnnotationAnnotation
import typings.appleMapkitJs.anon.Code
import typings.appleMapkitJs.anon.Timestamp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// prettier-ignore
@js.native
trait MapEvents[T] extends js.Object {
  var deselect: EventBase[T] with typings.appleMapkitJs.anon.Annotation = js.native
  var `double-tap`: EventBase[T] = js.native
  var `drag-end`: EventBase[T] with AnnotationAnnotation = js.native
  var `drag-start`: EventBase[T] with AnnotationAnnotation = js.native
  var dragging: EventBase[T] with typings.appleMapkitJs.anon.Coordinate = js.native
  var `long-press`: EventBase[T] = js.native
  var `map-type-change`: EventBase[T] = js.native
  var `region-change-end`: EventBase[T] = js.native
  var `region-change-start`: EventBase[T] = js.native
  var `scroll-end`: EventBase[T] = js.native
  var `scroll-start`: EventBase[T] = js.native
  // Annotation Events
  var select: EventBase[T] with typings.appleMapkitJs.anon.Annotation = js.native
  var `single-tap`: EventBase[T] = js.native
  // User Location Events
  var `user-location-change`: EventBase[T] with Timestamp = js.native
  var `user-location-error`: EventBase[T] with Code = js.native
  var `zoom-end`: EventBase[T] = js.native
  var `zoom-start`: EventBase[T] = js.native
}

object MapEvents {
  @scala.inline
  def apply[T](
    deselect: EventBase[T] with typings.appleMapkitJs.anon.Annotation,
    `double-tap`: EventBase[T],
    `drag-end`: EventBase[T] with AnnotationAnnotation,
    `drag-start`: EventBase[T] with AnnotationAnnotation,
    dragging: EventBase[T] with typings.appleMapkitJs.anon.Coordinate,
    `long-press`: EventBase[T],
    `map-type-change`: EventBase[T],
    `region-change-end`: EventBase[T],
    `region-change-start`: EventBase[T],
    `scroll-end`: EventBase[T],
    `scroll-start`: EventBase[T],
    select: EventBase[T] with typings.appleMapkitJs.anon.Annotation,
    `single-tap`: EventBase[T],
    `user-location-change`: EventBase[T] with Timestamp,
    `user-location-error`: EventBase[T] with Code,
    `zoom-end`: EventBase[T],
    `zoom-start`: EventBase[T]
  ): MapEvents[T] = {
    val __obj = js.Dynamic.literal(deselect = deselect.asInstanceOf[js.Any], dragging = dragging.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any])
    __obj.updateDynamic("double-tap")(`double-tap`.asInstanceOf[js.Any])
    __obj.updateDynamic("drag-end")(`drag-end`.asInstanceOf[js.Any])
    __obj.updateDynamic("drag-start")(`drag-start`.asInstanceOf[js.Any])
    __obj.updateDynamic("long-press")(`long-press`.asInstanceOf[js.Any])
    __obj.updateDynamic("map-type-change")(`map-type-change`.asInstanceOf[js.Any])
    __obj.updateDynamic("region-change-end")(`region-change-end`.asInstanceOf[js.Any])
    __obj.updateDynamic("region-change-start")(`region-change-start`.asInstanceOf[js.Any])
    __obj.updateDynamic("scroll-end")(`scroll-end`.asInstanceOf[js.Any])
    __obj.updateDynamic("scroll-start")(`scroll-start`.asInstanceOf[js.Any])
    __obj.updateDynamic("single-tap")(`single-tap`.asInstanceOf[js.Any])
    __obj.updateDynamic("user-location-change")(`user-location-change`.asInstanceOf[js.Any])
    __obj.updateDynamic("user-location-error")(`user-location-error`.asInstanceOf[js.Any])
    __obj.updateDynamic("zoom-end")(`zoom-end`.asInstanceOf[js.Any])
    __obj.updateDynamic("zoom-start")(`zoom-start`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapEvents[T]]
  }
  @scala.inline
  implicit class MapEventsOps[Self <: MapEvents[_], T] (val x: Self with MapEvents[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDeselect(value: EventBase[T] with typings.appleMapkitJs.anon.Annotation): Self = this.set("deselect", value.asInstanceOf[js.Any])
    @scala.inline
    def `setDouble-tap`(value: EventBase[T]): Self = this.set("double-tap", value.asInstanceOf[js.Any])
    @scala.inline
    def `setDrag-end`(value: EventBase[T] with AnnotationAnnotation): Self = this.set("drag-end", value.asInstanceOf[js.Any])
    @scala.inline
    def `setDrag-start`(value: EventBase[T] with AnnotationAnnotation): Self = this.set("drag-start", value.asInstanceOf[js.Any])
    @scala.inline
    def setDragging(value: EventBase[T] with typings.appleMapkitJs.anon.Coordinate): Self = this.set("dragging", value.asInstanceOf[js.Any])
    @scala.inline
    def `setLong-press`(value: EventBase[T]): Self = this.set("long-press", value.asInstanceOf[js.Any])
    @scala.inline
    def `setMap-type-change`(value: EventBase[T]): Self = this.set("map-type-change", value.asInstanceOf[js.Any])
    @scala.inline
    def `setRegion-change-end`(value: EventBase[T]): Self = this.set("region-change-end", value.asInstanceOf[js.Any])
    @scala.inline
    def `setRegion-change-start`(value: EventBase[T]): Self = this.set("region-change-start", value.asInstanceOf[js.Any])
    @scala.inline
    def `setScroll-end`(value: EventBase[T]): Self = this.set("scroll-end", value.asInstanceOf[js.Any])
    @scala.inline
    def `setScroll-start`(value: EventBase[T]): Self = this.set("scroll-start", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelect(value: EventBase[T] with typings.appleMapkitJs.anon.Annotation): Self = this.set("select", value.asInstanceOf[js.Any])
    @scala.inline
    def `setSingle-tap`(value: EventBase[T]): Self = this.set("single-tap", value.asInstanceOf[js.Any])
    @scala.inline
    def `setUser-location-change`(value: EventBase[T] with Timestamp): Self = this.set("user-location-change", value.asInstanceOf[js.Any])
    @scala.inline
    def `setUser-location-error`(value: EventBase[T] with Code): Self = this.set("user-location-error", value.asInstanceOf[js.Any])
    @scala.inline
    def `setZoom-end`(value: EventBase[T]): Self = this.set("zoom-end", value.asInstanceOf[js.Any])
    @scala.inline
    def `setZoom-start`(value: EventBase[T]): Self = this.set("zoom-start", value.asInstanceOf[js.Any])
  }
  
}

