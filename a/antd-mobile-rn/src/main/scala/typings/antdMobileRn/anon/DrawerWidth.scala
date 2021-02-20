package typings.antdMobileRn.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DrawerWidth extends StObject {
  
  var drawerWidth: Double = js.native
  
  var open: Boolean = js.native
  
  var position: String = js.native
}
object DrawerWidth {
  
  @scala.inline
  def apply(drawerWidth: Double, open: Boolean, position: String): DrawerWidth = {
    val __obj = js.Dynamic.literal(drawerWidth = drawerWidth.asInstanceOf[js.Any], open = open.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any])
    __obj.asInstanceOf[DrawerWidth]
  }
  
  @scala.inline
  implicit class DrawerWidthMutableBuilder[Self <: DrawerWidth] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDrawerWidth(value: Double): Self = StObject.set(x, "drawerWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpen(value: Boolean): Self = StObject.set(x, "open", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPosition(value: String): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
  }
}
