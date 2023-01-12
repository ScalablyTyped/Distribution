package typings.amapJsSdk.AMap

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Scale
  extends StObject
     with EventBindable
     with MapControl {
  
  var offset: Pixel
  
  var position: String
}
object Scale {
  
  inline def apply(
    hide: () => Unit,
    off: (String, EventCallback) => Unit,
    offset: Pixel,
    on: (String, EventCallback) => Unit,
    position: String,
    show: () => Unit
  ): Scale = {
    val __obj = js.Dynamic.literal(hide = js.Any.fromFunction0(hide), off = js.Any.fromFunction2(off), offset = offset.asInstanceOf[js.Any], on = js.Any.fromFunction2(on), position = position.asInstanceOf[js.Any], show = js.Any.fromFunction0(show))
    __obj.asInstanceOf[Scale]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Scale] (val x: Self) extends AnyVal {
    
    inline def setOffset(value: Pixel): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
  }
}
