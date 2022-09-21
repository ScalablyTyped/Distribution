package typings.appleMapkitJsBrowser.mapkit

import typings.appleMapkitJsBrowser.anon.AnnotationAnnotation
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Map Annotations Overlay Events
trait MapAnnotationOverlayEvents[T] extends StObject {
  
  var deselect: EventBase[T] & typings.appleMapkitJsBrowser.anon.Annotation
  
  var `drag-end`: EventBase[T] & AnnotationAnnotation
  
  var `drag-start`: EventBase[T] & AnnotationAnnotation
  
  var dragging: EventBase[T] & typings.appleMapkitJsBrowser.anon.Coordinate
  
  var select: EventBase[T] & typings.appleMapkitJsBrowser.anon.Annotation
}
object MapAnnotationOverlayEvents {
  
  inline def apply[T](
    deselect: EventBase[T] & typings.appleMapkitJsBrowser.anon.Annotation,
    `drag-end`: EventBase[T] & AnnotationAnnotation,
    `drag-start`: EventBase[T] & AnnotationAnnotation,
    dragging: EventBase[T] & typings.appleMapkitJsBrowser.anon.Coordinate,
    select: EventBase[T] & typings.appleMapkitJsBrowser.anon.Annotation
  ): MapAnnotationOverlayEvents[T] = {
    val __obj = js.Dynamic.literal(deselect = deselect.asInstanceOf[js.Any], dragging = dragging.asInstanceOf[js.Any], select = select.asInstanceOf[js.Any])
    __obj.updateDynamic("drag-end")(`drag-end`.asInstanceOf[js.Any])
    __obj.updateDynamic("drag-start")(`drag-start`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapAnnotationOverlayEvents[T]]
  }
  
  extension [Self <: MapAnnotationOverlayEvents[?], T](x: Self & MapAnnotationOverlayEvents[T]) {
    
    inline def setDeselect(value: EventBase[T] & typings.appleMapkitJsBrowser.anon.Annotation): Self = StObject.set(x, "deselect", value.asInstanceOf[js.Any])
    
    inline def `setDrag-end`(value: EventBase[T] & AnnotationAnnotation): Self = StObject.set(x, "drag-end", value.asInstanceOf[js.Any])
    
    inline def `setDrag-start`(value: EventBase[T] & AnnotationAnnotation): Self = StObject.set(x, "drag-start", value.asInstanceOf[js.Any])
    
    inline def setDragging(value: EventBase[T] & typings.appleMapkitJsBrowser.anon.Coordinate): Self = StObject.set(x, "dragging", value.asInstanceOf[js.Any])
    
    inline def setSelect(value: EventBase[T] & typings.appleMapkitJsBrowser.anon.Annotation): Self = StObject.set(x, "select", value.asInstanceOf[js.Any])
  }
}
