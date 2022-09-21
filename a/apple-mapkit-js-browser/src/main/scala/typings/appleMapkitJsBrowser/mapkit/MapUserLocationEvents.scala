package typings.appleMapkitJsBrowser.mapkit

import typings.appleMapkitJsBrowser.anon.Code
import typings.appleMapkitJsBrowser.anon.Timestamp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// User Location Events
trait MapUserLocationEvents[T] extends StObject {
  
  var `user-location-change`: EventBase[T] & Timestamp
  
  var `user-location-error`: EventBase[T] & Code
}
object MapUserLocationEvents {
  
  inline def apply[T](`user-location-change`: EventBase[T] & Timestamp, `user-location-error`: EventBase[T] & Code): MapUserLocationEvents[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("user-location-change")(`user-location-change`.asInstanceOf[js.Any])
    __obj.updateDynamic("user-location-error")(`user-location-error`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapUserLocationEvents[T]]
  }
  
  extension [Self <: MapUserLocationEvents[?], T](x: Self & MapUserLocationEvents[T]) {
    
    inline def `setUser-location-change`(value: EventBase[T] & Timestamp): Self = StObject.set(x, "user-location-change", value.asInstanceOf[js.Any])
    
    inline def `setUser-location-error`(value: EventBase[T] & Code): Self = StObject.set(x, "user-location-error", value.asInstanceOf[js.Any])
  }
}
