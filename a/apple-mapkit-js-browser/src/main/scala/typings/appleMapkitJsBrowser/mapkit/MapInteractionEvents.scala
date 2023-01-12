package typings.appleMapkitJsBrowser.mapkit

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// Map Interaction Events
trait MapInteractionEvents[T] extends StObject {
  
  var `double-tap`: EventBase[T]
  
  var `long-press`: EventBase[T]
  
  var `single-tap`: EventBase[T]
}
object MapInteractionEvents {
  
  inline def apply[T](`double-tap`: EventBase[T], `long-press`: EventBase[T], `single-tap`: EventBase[T]): MapInteractionEvents[T] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("double-tap")(`double-tap`.asInstanceOf[js.Any])
    __obj.updateDynamic("long-press")(`long-press`.asInstanceOf[js.Any])
    __obj.updateDynamic("single-tap")(`single-tap`.asInstanceOf[js.Any])
    __obj.asInstanceOf[MapInteractionEvents[T]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: MapInteractionEvents[?], T] (val x: Self & MapInteractionEvents[T]) extends AnyVal {
    
    inline def `setDouble-tap`(value: EventBase[T]): Self = StObject.set(x, "double-tap", value.asInstanceOf[js.Any])
    
    inline def `setLong-press`(value: EventBase[T]): Self = StObject.set(x, "long-press", value.asInstanceOf[js.Any])
    
    inline def `setSingle-tap`(value: EventBase[T]): Self = StObject.set(x, "single-tap", value.asInstanceOf[js.Any])
  }
}
