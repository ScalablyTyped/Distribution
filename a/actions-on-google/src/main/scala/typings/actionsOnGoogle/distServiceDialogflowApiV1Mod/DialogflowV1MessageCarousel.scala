package typings.actionsOnGoogle.distServiceDialogflowApiV1Mod

import typings.actionsOnGoogle.actionsOnGoogleStrings.carousel_card
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DialogflowV1MessageCarousel
  extends StObject
     with DialogflowV1BaseGoogleMessage[carousel_card]
     with DialogflowV1Message {
  
  var items: js.UndefOr[js.Array[DialogflowV1MessageOptionItem]] = js.undefined
}
object DialogflowV1MessageCarousel {
  
  inline def apply(): DialogflowV1MessageCarousel = {
    val __obj = js.Dynamic.literal(platform = "google")
    __obj.asInstanceOf[DialogflowV1MessageCarousel]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DialogflowV1MessageCarousel] (val x: Self) extends AnyVal {
    
    inline def setItems(value: js.Array[DialogflowV1MessageOptionItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    inline def setItemsVarargs(value: DialogflowV1MessageOptionItem*): Self = StObject.set(x, "items", js.Array(value*))
  }
}
