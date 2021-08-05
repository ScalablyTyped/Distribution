package typings.activexShdocvw.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MenuBar extends StObject {
  
  val MenuBar: Boolean
}
object MenuBar {
  
  inline def apply(MenuBar: Boolean): MenuBar = {
    val __obj = js.Dynamic.literal(MenuBar = MenuBar.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuBar]
  }
  
  extension [Self <: MenuBar](x: Self) {
    
    inline def setMenuBar(value: Boolean): Self = StObject.set(x, "MenuBar", value.asInstanceOf[js.Any])
  }
}
