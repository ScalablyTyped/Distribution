package typings.actionsOnGoogle

import typings.actionsOnGoogle.v2Mod.GoogleActionsV2UiElementsBasicCard
import typings.actionsOnGoogle.v2Mod.GoogleActionsV2UiElementsBasicCardImageDisplayOptions
import typings.actionsOnGoogle.v2Mod.GoogleActionsV2UiElementsButton
import typings.actionsOnGoogle.v2Mod.GoogleActionsV2UiElementsImage
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object basicMod {
  
  @JSImport("actions-on-google/dist/service/actionssdk/conversation/response/card/basic", "BasicCard")
  @js.native
  open class BasicCard protected ()
    extends StObject
       with GoogleActionsV2UiElementsBasicCard {
    /** @public */
    def this(options: BasicCardOptions) = this()
  }
  
  trait BasicCardOptions extends StObject {
    
    /** @public */
    var buttons: js.UndefOr[GoogleActionsV2UiElementsButton | js.Array[GoogleActionsV2UiElementsButton]] = js.undefined
    
    /** @public */
    var display: js.UndefOr[GoogleActionsV2UiElementsBasicCardImageDisplayOptions] = js.undefined
    
    /** @public */
    var image: js.UndefOr[GoogleActionsV2UiElementsImage] = js.undefined
    
    /** @public */
    var subtitle: js.UndefOr[String] = js.undefined
    
    /** @public */
    var text: js.UndefOr[String] = js.undefined
    
    /** @public */
    var title: js.UndefOr[String] = js.undefined
  }
  object BasicCardOptions {
    
    inline def apply(): BasicCardOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[BasicCardOptions]
    }
    
    extension [Self <: BasicCardOptions](x: Self) {
      
      inline def setButtons(value: GoogleActionsV2UiElementsButton | js.Array[GoogleActionsV2UiElementsButton]): Self = StObject.set(x, "buttons", value.asInstanceOf[js.Any])
      
      inline def setButtonsUndefined: Self = StObject.set(x, "buttons", js.undefined)
      
      inline def setButtonsVarargs(value: GoogleActionsV2UiElementsButton*): Self = StObject.set(x, "buttons", js.Array(value*))
      
      inline def setDisplay(value: GoogleActionsV2UiElementsBasicCardImageDisplayOptions): Self = StObject.set(x, "display", value.asInstanceOf[js.Any])
      
      inline def setDisplayUndefined: Self = StObject.set(x, "display", js.undefined)
      
      inline def setImage(value: GoogleActionsV2UiElementsImage): Self = StObject.set(x, "image", value.asInstanceOf[js.Any])
      
      inline def setImageUndefined: Self = StObject.set(x, "image", js.undefined)
      
      inline def setSubtitle(value: String): Self = StObject.set(x, "subtitle", value.asInstanceOf[js.Any])
      
      inline def setSubtitleUndefined: Self = StObject.set(x, "subtitle", js.undefined)
      
      inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
      
      inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
      
      inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
}
