package typings.appleMapkitJsBrowser.mapkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Map Display Events
trait MapDisplayEvents[T] extends StObject {
  
  var `map-type-change`: EventBase[T]
  
  var `region-change-end`: EventBase[T]
  
  var `region-change-start`: EventBase[T]
  
  var `rotation-end`: EventBase[T]
  
  var `rotation-start`: EventBase[T]
  
  var `scroll-end`: EventBase[T]
  
  var `scroll-start`: EventBase[T]
  
  var `zoom-end`: EventBase[T]
  
  var `zoom-start`: EventBase[T]
}
object MapDisplayEvents {
  
  inline def apply[T](
    `map-type-change`: EventBase[T],
    `region-change-end`: EventBase[T],
    `region-change-start`: EventBase[T],
    `rotation-end`: EventBase[T],
    `rotation-start`: EventBase[T],
    `scroll-end`: EventBase[T],
    `scroll-start`: EventBase[T],
    `zoom-end`: EventBase[T],
    `zoom-start`: EventBase[T]
  ): MapDisplayEvents[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("map-type-change")(`map-type-change`.asInstanceOf[js.Any])
    __obj.updateDynamic("region-change-end")(`region-change-end`.asInstanceOf[js.Any])
    __obj.updateDynamic("region-change-start")(`region-change-start`.asInstanceOf[js.Any])
    __obj.updateDynamic("rotation-end")(`rotation-end`.asInstanceOf[js.Any])
    __obj.updateDynamic("rotation-start")(`rotation-start`.asInstanceOf[js.Any])
    __obj.updateDynamic("scroll-end")(`scroll-end`.asInstanceOf[js.Any])
    __obj.updateDynamic("scroll-start")(`scroll-start`.asInstanceOf[js.Any])
    __obj.updateDynamic("zoom-end")(`zoom-end`.asInstanceOf[js.Any])
    __obj.updateDynamic("zoom-start")(`zoom-start`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapDisplayEvents[T]]
  }
  
  extension [Self <: MapDisplayEvents[?], T](x: Self & MapDisplayEvents[T]) {
    
    inline def `setMap-type-change`(value: EventBase[T]): Self = StObject.set(x, "map-type-change", value.asInstanceOf[js.Any])
    
    inline def `setRegion-change-end`(value: EventBase[T]): Self = StObject.set(x, "region-change-end", value.asInstanceOf[js.Any])
    
    inline def `setRegion-change-start`(value: EventBase[T]): Self = StObject.set(x, "region-change-start", value.asInstanceOf[js.Any])
    
    inline def `setRotation-end`(value: EventBase[T]): Self = StObject.set(x, "rotation-end", value.asInstanceOf[js.Any])
    
    inline def `setRotation-start`(value: EventBase[T]): Self = StObject.set(x, "rotation-start", value.asInstanceOf[js.Any])
    
    inline def `setScroll-end`(value: EventBase[T]): Self = StObject.set(x, "scroll-end", value.asInstanceOf[js.Any])
    
    inline def `setScroll-start`(value: EventBase[T]): Self = StObject.set(x, "scroll-start", value.asInstanceOf[js.Any])
    
    inline def `setZoom-end`(value: EventBase[T]): Self = StObject.set(x, "zoom-end", value.asInstanceOf[js.Any])
    
    inline def `setZoom-start`(value: EventBase[T]): Self = StObject.set(x, "zoom-start", value.asInstanceOf[js.Any])
  }
}
