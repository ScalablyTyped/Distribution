package typings.ahooks

import typings.ahooks.domTargetMod.BasicTarget
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object useMouseMod {
  
  @JSImport("ahooks/lib/useMouse", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default(): CursorState = ^.asInstanceOf[js.Dynamic].applyDynamic("default")().asInstanceOf[CursorState]
  inline def default(target: BasicTarget[Element]): CursorState = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(target.asInstanceOf[js.Any]).asInstanceOf[CursorState]
  
  trait CursorState extends StObject {
    
    var clientX: Double
    
    var clientY: Double
    
    var elementH: Double
    
    var elementPosX: Double
    
    var elementPosY: Double
    
    var elementW: Double
    
    var elementX: Double
    
    var elementY: Double
    
    var pageX: Double
    
    var pageY: Double
    
    var screenX: Double
    
    var screenY: Double
  }
  object CursorState {
    
    inline def apply(
      clientX: Double,
      clientY: Double,
      elementH: Double,
      elementPosX: Double,
      elementPosY: Double,
      elementW: Double,
      elementX: Double,
      elementY: Double,
      pageX: Double,
      pageY: Double,
      screenX: Double,
      screenY: Double
    ): CursorState = {
      val __obj = js.Dynamic.literal(clientX = clientX.asInstanceOf[js.Any], clientY = clientY.asInstanceOf[js.Any], elementH = elementH.asInstanceOf[js.Any], elementPosX = elementPosX.asInstanceOf[js.Any], elementPosY = elementPosY.asInstanceOf[js.Any], elementW = elementW.asInstanceOf[js.Any], elementX = elementX.asInstanceOf[js.Any], elementY = elementY.asInstanceOf[js.Any], pageX = pageX.asInstanceOf[js.Any], pageY = pageY.asInstanceOf[js.Any], screenX = screenX.asInstanceOf[js.Any], screenY = screenY.asInstanceOf[js.Any])
      __obj.asInstanceOf[CursorState]
    }
    
    extension [Self <: CursorState](x: Self) {
      
      inline def setClientX(value: Double): Self = StObject.set(x, "clientX", value.asInstanceOf[js.Any])
      
      inline def setClientY(value: Double): Self = StObject.set(x, "clientY", value.asInstanceOf[js.Any])
      
      inline def setElementH(value: Double): Self = StObject.set(x, "elementH", value.asInstanceOf[js.Any])
      
      inline def setElementPosX(value: Double): Self = StObject.set(x, "elementPosX", value.asInstanceOf[js.Any])
      
      inline def setElementPosY(value: Double): Self = StObject.set(x, "elementPosY", value.asInstanceOf[js.Any])
      
      inline def setElementW(value: Double): Self = StObject.set(x, "elementW", value.asInstanceOf[js.Any])
      
      inline def setElementX(value: Double): Self = StObject.set(x, "elementX", value.asInstanceOf[js.Any])
      
      inline def setElementY(value: Double): Self = StObject.set(x, "elementY", value.asInstanceOf[js.Any])
      
      inline def setPageX(value: Double): Self = StObject.set(x, "pageX", value.asInstanceOf[js.Any])
      
      inline def setPageY(value: Double): Self = StObject.set(x, "pageY", value.asInstanceOf[js.Any])
      
      inline def setScreenX(value: Double): Self = StObject.set(x, "screenX", value.asInstanceOf[js.Any])
      
      inline def setScreenY(value: Double): Self = StObject.set(x, "screenY", value.asInstanceOf[js.Any])
    }
  }
}
