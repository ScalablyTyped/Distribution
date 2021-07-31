package typings.athenajs.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait MenuOptions extends StObject {
  
  var color: String
  
  var menuItems: js.Array[MenuItem]
  
  var title: String
}
object MenuOptions {
  
  @scala.inline
  def apply(color: String, menuItems: js.Array[MenuItem], title: String): MenuOptions = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], menuItems = menuItems.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuOptions]
  }
  
  @scala.inline
  implicit class MenuOptionsMutableBuilder[Self <: MenuOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setColor(value: String): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMenuItems(value: js.Array[MenuItem]): Self = StObject.set(x, "menuItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMenuItemsVarargs(value: MenuItem*): Self = StObject.set(x, "menuItems", js.Array(value :_*))
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
