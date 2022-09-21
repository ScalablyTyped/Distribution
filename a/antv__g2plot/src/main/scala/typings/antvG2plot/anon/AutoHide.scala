package typings.antvG2plot.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AutoHide extends StObject {
  
  var autoHide: Boolean
  
  var autoRotate: Boolean
}
object AutoHide {
  
  inline def apply(autoHide: Boolean, autoRotate: Boolean): AutoHide = {
    val __obj = js.Dynamic.literal(autoHide = autoHide.asInstanceOf[js.Any], autoRotate = autoRotate.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoHide]
  }
  
  extension [Self <: AutoHide](x: Self) {
    
    inline def setAutoHide(value: Boolean): Self = StObject.set(x, "autoHide", value.asInstanceOf[js.Any])
    
    inline def setAutoRotate(value: Boolean): Self = StObject.set(x, "autoRotate", value.asInstanceOf[js.Any])
  }
}
