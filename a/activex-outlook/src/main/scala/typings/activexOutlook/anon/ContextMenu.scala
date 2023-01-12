package typings.activexOutlook.anon

import typings.activexOutlook.Outlook.OlContextMenu
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ContextMenu extends StObject {
  
  val ContextMenu: OlContextMenu
}
object ContextMenu {
  
  inline def apply(ContextMenu: OlContextMenu): ContextMenu = {
    val __obj = js.Dynamic.literal(ContextMenu = ContextMenu.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContextMenu]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ContextMenu] (val x: Self) extends AnyVal {
    
    inline def setContextMenu(value: OlContextMenu): Self = StObject.set(x, "ContextMenu", value.asInstanceOf[js.Any])
  }
}
