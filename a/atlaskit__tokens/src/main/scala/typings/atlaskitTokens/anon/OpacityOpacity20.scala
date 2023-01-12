package typings.atlaskitTokens.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpacityOpacity20 extends StObject {
  
  var opacity: Opacity20
}
object OpacityOpacity20 {
  
  inline def apply(opacity: Opacity20): OpacityOpacity20 = {
    val __obj = js.Dynamic.literal(opacity = opacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpacityOpacity20]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OpacityOpacity20] (val x: Self) extends AnyVal {
    
    inline def setOpacity(value: Opacity20): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
  }
}
