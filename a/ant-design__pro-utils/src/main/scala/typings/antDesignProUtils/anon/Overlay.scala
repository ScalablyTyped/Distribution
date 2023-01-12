package typings.antDesignProUtils.anon

import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Overlay extends StObject {
  
  var menu: Unit
  
  var overlay: Element
}
object Overlay {
  
  inline def apply(menu: Unit, overlay: Element): Overlay = {
    val __obj = js.Dynamic.literal(menu = menu.asInstanceOf[js.Any], overlay = overlay.asInstanceOf[js.Any])
    __obj.asInstanceOf[Overlay]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Overlay] (val x: Self) extends AnyVal {
    
    inline def setMenu(value: Unit): Self = StObject.set(x, "menu", value.asInstanceOf[js.Any])
    
    inline def setOverlay(value: Element): Self = StObject.set(x, "overlay", value.asInstanceOf[js.Any])
  }
}
