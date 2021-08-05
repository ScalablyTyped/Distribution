package typings.antdMobileRn.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NativeEventContentSizeHeightWidth extends StObject {
  
  var nativeEvent: ContentSizeHeightWidth
}
object NativeEventContentSizeHeightWidth {
  
  inline def apply(nativeEvent: ContentSizeHeightWidth): NativeEventContentSizeHeightWidth = {
    val __obj = js.Dynamic.literal(nativeEvent = nativeEvent.asInstanceOf[js.Any])
    __obj.asInstanceOf[NativeEventContentSizeHeightWidth]
  }
  
  extension [Self <: NativeEventContentSizeHeightWidth](x: Self) {
    
    inline def setNativeEvent(value: ContentSizeHeightWidth): Self = StObject.set(x, "nativeEvent", value.asInstanceOf[js.Any])
  }
}
