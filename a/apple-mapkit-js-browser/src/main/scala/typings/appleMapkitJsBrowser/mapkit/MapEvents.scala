package typings.appleMapkitJsBrowser.mapkit

import typings.appleMapkitJsBrowser.anon.AnnotationAnnotation
import typings.appleMapkitJsBrowser.anon.Code
import typings.appleMapkitJsBrowser.anon.Timestamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// prettier-ignore
@js.native
trait MapEvents[T] extends StObject {
  
  var deselect: EventBase[T] with typings.appleMapkitJsBrowser.anon.Annotation = js.native
  
  var `double-tap`: EventBase[T] = js.native
  
  var `drag-end`: EventBase[T] with AnnotationAnnotation = js.native
  
  var `drag-start`: EventBase[T] with AnnotationAnnotation = js.native
  
  var dragging: EventBase[T] with typings.appleMapkitJsBrowser.anon.Coordinate = js.native
  
  var `long-press`: EventBase[T] = js.native
  
  var `map-type-change`: EventBase[T] = js.native
  
  var `region-change-end`: EventBase[T] = js.native
  
  var `region-change-start`: EventBase[T] = js.native
  
  var `scroll-end`: EventBase[T] = js.native
  
  var `scroll-start`: EventBase[T] = js.native
  
  // Annotation Events
  var select: EventBase[T] with typings.appleMapkitJsBrowser.anon.Annotation = js.native
  
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
    deselect: EventBase[T] with typings.appleMapkitJsBrowser.anon.Annotation,
    `double-tap`: EventBase[T],
    `drag-end`: EventBase[T] with AnnotationAnnotation,
    `drag-start`: EventBase[T] with AnnotationAnnotation,
    dragging: EventBase[T] with typings.appleMapkitJsBrowser.anon.Coordinate,
    `long-press`: EventBase[T],
    `map-type-change`: EventBase[T],
    `region-change-end`: EventBase[T],
    `region-change-start`: EventBase[T],
    `scroll-end`: EventBase[T],
    `scroll-start`: EventBase[T],
    select: EventBase[T] with typings.appleMapkitJsBrowser.anon.Annotation,
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
  implicit class MapEventsMutableBuilder[Self <: MapEvents[_], T] (val x: Self with MapEvents[T]) extends AnyVal {
    
    @scala.inline
    def setDeselect(value: EventBase[T] with typings.appleMapkitJsBrowser.anon.Annotation): Self = StObject.set(x, "deselect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setDouble-tap`(value: EventBase[T]): Self = StObject.set(x, "double-tap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setDrag-end`(value: EventBase[T] with AnnotationAnnotation): Self = StObject.set(x, "drag-end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setDrag-start`(value: EventBase[T] with AnnotationAnnotation): Self = StObject.set(x, "drag-start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDragging(value: EventBase[T] with typings.appleMapkitJsBrowser.anon.Coordinate): Self = StObject.set(x, "dragging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setLong-press`(value: EventBase[T]): Self = StObject.set(x, "long-press", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setMap-type-change`(value: EventBase[T]): Self = StObject.set(x, "map-type-change", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setRegion-change-end`(value: EventBase[T]): Self = StObject.set(x, "region-change-end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setRegion-change-start`(value: EventBase[T]): Self = StObject.set(x, "region-change-start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setScroll-end`(value: EventBase[T]): Self = StObject.set(x, "scroll-end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setScroll-start`(value: EventBase[T]): Self = StObject.set(x, "scroll-start", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelect(value: EventBase[T] with typings.appleMapkitJsBrowser.anon.Annotation): Self = StObject.set(x, "select", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setSingle-tap`(value: EventBase[T]): Self = StObject.set(x, "single-tap", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setUser-location-change`(value: EventBase[T] with Timestamp): Self = StObject.set(x, "user-location-change", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setUser-location-error`(value: EventBase[T] with Code): Self = StObject.set(x, "user-location-error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setZoom-end`(value: EventBase[T]): Self = StObject.set(x, "zoom-end", value.asInstanceOf[js.Any])
    
    @scala.inline
    def `setZoom-start`(value: EventBase[T]): Self = StObject.set(x, "zoom-start", value.asInstanceOf[js.Any])
  }
}
