package typings.antdMobileRn.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NativeEventContentSize extends StObject {
  
  var nativeEvent: ContentSize
}
object NativeEventContentSize {
  
  inline def apply(nativeEvent: ContentSize): NativeEventContentSize = {
    val __obj = js.Dynamic.literal(nativeEvent = nativeEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[NativeEventContentSize]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NativeEventContentSize] (val x: Self) extends AnyVal {
    
    inline def setNativeEvent(value: ContentSize): Self = StObject.set(x, "nativeEvent", value.asInstanceOf[js.Any])
  }
}
