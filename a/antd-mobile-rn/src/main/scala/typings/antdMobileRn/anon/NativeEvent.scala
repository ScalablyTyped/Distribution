package typings.antdMobileRn.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NativeEvent extends StObject {
  
  var nativeEvent: Text
}
object NativeEvent {
  
  inline def apply(nativeEvent: Text): NativeEvent = {
    val __obj = js.Dynamic.literal(nativeEvent = nativeEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[NativeEvent]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NativeEvent] (val x: Self) extends AnyVal {
    
    inline def setNativeEvent(value: Text): Self = StObject.set(x, "nativeEvent", value.asInstanceOf[js.Any])
  }
}
