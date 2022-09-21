package typings.appleMapkitJsBrowser.mapkit

import typings.appleMapkitJsBrowser.anon.AnnotationAnnotation
import typings.appleMapkitJsBrowser.anon.Code
import typings.appleMapkitJsBrowser.anon.Timestamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// All map events
trait MapEvents[T]
  extends StObject
     with MapDisplayEvents[T]
     with MapAnnotationOverlayEvents[T]
     with MapUserLocationEvents[T]
     with MapInteractionEvents[T]
object MapEvents {
  
  inline def apply[T](
    deselect: EventBase[T] & typings.appleMapkitJsBrowser.anon.Annotation,
    `double-tap`: EventBase[T],
    `drag-end`: EventBase[T] & AnnotationAnnotation,
    `drag-start`: EventBase[T] & AnnotationAnnotation,
    dragging: EventBase[T] & typings.appleMapkitJsBrowser.anon.Coordinate,
    `long-press`: EventBase[T],
    `map-type-change`: EventBase[T],
    `region-change-end`: EventBase[T],
    `region-change-start`: EventBase[T],
    `rotation-end`: EventBase[T],
    `rotation-start`: EventBase[T],
    `scroll-end`: EventBase[T],
    `scroll-start`: EventBase[T],
    select: EventBase[T] & typings.appleMapkitJsBrowser.anon.Annotation,
    `single-tap`: EventBase[T],
    `user-location-change`: EventBase[T] & Timestamp,
    `user-location-error`: EventBase[T] & Code,
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
    __obj.updateDynamic("rotation-end")(`rotation-end`.asInstanceOf[js.Any])
    __obj.updateDynamic("rotation-start")(`rotation-start`.asInstanceOf[js.Any])
    __obj.updateDynamic("scroll-end")(`scroll-end`.asInstanceOf[js.Any])
    __obj.updateDynamic("scroll-start")(`scroll-start`.asInstanceOf[js.Any])
    __obj.updateDynamic("single-tap")(`single-tap`.asInstanceOf[js.Any])
    __obj.updateDynamic("user-location-change")(`user-location-change`.asInstanceOf[js.Any])
    __obj.updateDynamic("user-location-error")(`user-location-error`.asInstanceOf[js.Any])
    __obj.updateDynamic("zoom-end")(`zoom-end`.asInstanceOf[js.Any])
    __obj.updateDynamic("zoom-start")(`zoom-start`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapEvents[T]]
  }
}
