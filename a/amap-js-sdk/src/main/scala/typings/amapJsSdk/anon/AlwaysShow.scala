package typings.amapJsSdk.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AlwaysShow extends StObject {
  
  var alwaysShow: js.UndefOr[Boolean] = js.undefined
  
  var cursor: js.UndefOr[String] = js.undefined
  
  var hideFloorBar: js.UndefOr[Boolean] = js.undefined
  
  var opacity: js.UndefOr[Double] = js.undefined
  
  var zIndex: js.UndefOr[Double] = js.undefined
}
object AlwaysShow {
  
  inline def apply(): AlwaysShow = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AlwaysShow]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AlwaysShow] (val x: Self) extends AnyVal {
    
    inline def setAlwaysShow(value: Boolean): Self = StObject.set(x, "alwaysShow", value.asInstanceOf[js.Any])
    
    inline def setAlwaysShowUndefined: Self = StObject.set(x, "alwaysShow", js.undefined)
    
    inline def setCursor(value: String): Self = StObject.set(x, "cursor", value.asInstanceOf[js.Any])
    
    inline def setCursorUndefined: Self = StObject.set(x, "cursor", js.undefined)
    
    inline def setHideFloorBar(value: Boolean): Self = StObject.set(x, "hideFloorBar", value.asInstanceOf[js.Any])
    
    inline def setHideFloorBarUndefined: Self = StObject.set(x, "hideFloorBar", js.undefined)
    
    inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
    
    inline def setOpacityUndefined: Self = StObject.set(x, "opacity", js.undefined)
    
    inline def setZIndex(value: Double): Self = StObject.set(x, "zIndex", value.asInstanceOf[js.Any])
    
    inline def setZIndexUndefined: Self = StObject.set(x, "zIndex", js.undefined)
  }
}
