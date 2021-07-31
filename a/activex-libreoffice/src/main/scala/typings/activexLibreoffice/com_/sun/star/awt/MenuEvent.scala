package typings.activexLibreoffice.com_.sun.star.awt

import typings.activexLibreoffice.com_.sun.star.lang.EventObject
import typings.activexLibreoffice.com_.sun.star.uno.XInterface
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** specifies a menu event. */
trait MenuEvent
  extends StObject
     with EventObject {
  
  /** contains the item ID. */
  var MenuId: Double
}
object MenuEvent {
  
  @scala.inline
  def apply(MenuId: Double, Source: XInterface): MenuEvent = {
    val __obj = js.Dynamic.literal(MenuId = MenuId.asInstanceOf[js.Any], Source = Source.asInstanceOf[js.Any])
    __obj.asInstanceOf[MenuEvent]
  }
  
  @scala.inline
  implicit class MenuEventMutableBuilder[Self <: MenuEvent] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMenuId(value: Double): Self = StObject.set(x, "MenuId", value.asInstanceOf[js.Any])
  }
}
