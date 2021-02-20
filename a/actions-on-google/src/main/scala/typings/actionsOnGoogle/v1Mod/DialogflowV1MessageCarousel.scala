package typings.actionsOnGoogle.v1Mod

import typings.actionsOnGoogle.actionsOnGoogleStrings.carousel_card
import typings.actionsOnGoogle.actionsOnGoogleStrings.google
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DialogflowV1MessageCarousel
  extends DialogflowV1BaseGoogleMessage[carousel_card]
     with DialogflowV1Message {
  
  var items: js.UndefOr[js.Array[DialogflowV1MessageOptionItem]] = js.native
}
object DialogflowV1MessageCarousel {
  
  @scala.inline
  def apply(platform: google): DialogflowV1MessageCarousel = {
    val __obj = js.Dynamic.literal(platform = platform.asInstanceOf[js.Any])
    __obj.asInstanceOf[DialogflowV1MessageCarousel]
  }
  
  @scala.inline
  implicit class DialogflowV1MessageCarouselMutableBuilder[Self <: DialogflowV1MessageCarousel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setItems(value: js.Array[DialogflowV1MessageOptionItem]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsUndefined: Self = StObject.set(x, "items", js.undefined)
    
    @scala.inline
    def setItemsVarargs(value: DialogflowV1MessageOptionItem*): Self = StObject.set(x, "items", js.Array(value :_*))
  }
}
