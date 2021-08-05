package typings.atom.mod

import typings.atom.anon.ClassName
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotificationOptions extends StObject {
  
  var buttons: js.UndefOr[js.Array[ClassName]] = js.undefined
  
  var description: js.UndefOr[String] = js.undefined
  
  var detail: js.UndefOr[String] = js.undefined
  
  var dismissable: js.UndefOr[Boolean] = js.undefined
  
  var icon: js.UndefOr[String] = js.undefined
}
object NotificationOptions {
  
  inline def apply(): NotificationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[NotificationOptions]
  }
  
  extension [Self <: NotificationOptions](x: Self) {
    
    inline def setButtons(value: js.Array[ClassName]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
    
    inline def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
    
    inline def setButtonsVarargs(value: ClassName*): Self = StObject.set(x, "buttons", js.Array(value :_*))
    
    inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setDetail(value: String): Self = StObject.set(x, "detail", value.asInstanceOf[js.Any])
    
    inline def setDetailUndefined: Self = StObject.set(x, "detail", js.undefined)
    
    inline def setDismissable(value: Boolean): Self = StObject.set(x, "dismissable", value.asInstanceOf[js.Any])
    
    inline def setDismissableUndefined: Self = StObject.set(x, "dismissable", js.undefined)
    
    inline def setIcon(value: String): Self = StObject.set(x, "icon", value.asInstanceOf[js.Any])
    
    inline def setIconUndefined: Self = StObject.set(x, "icon", js.undefined)
  }
}
