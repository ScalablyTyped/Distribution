package typings.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleActionsV2UiElementsBasicCard extends js.Object {
  
  /**
    * Buttons.
    * Currently at most 1 button is supported.
    * Optional.
    */
  var buttons: js.UndefOr[js.Array[GoogleActionsV2UiElementsButton]] = js.native
  
  /**
    * Body text of the card.
    * Supports a limited set of markdown syntax for formatting.
    * Required, unless image is present.
    */
  var formattedText: js.UndefOr[String] = js.native
  
  /**
    * A hero image for the card. The height is fixed to 192dp.
    * Optional.
    */
  var image: js.UndefOr[GoogleActionsV2UiElementsImage] = js.native
  
  /**
    * Type of image display option. Optional.
    */
  var imageDisplayOptions: js.UndefOr[GoogleActionsV2UiElementsBasicCardImageDisplayOptions] = js.native
  
  /**
    * Optional.
    */
  var subtitle: js.UndefOr[String] = js.native
  
  /**
    * Overall title of the card.
    * Optional.
    */
  var title: js.UndefOr[String] = js.native
}
object GoogleActionsV2UiElementsBasicCard {
  
  @scala.inline
  def apply(): GoogleActionsV2UiElementsBasicCard = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2UiElementsBasicCard]
  }
  
  @scala.inline
  implicit class GoogleActionsV2UiElementsBasicCardOps[Self <: GoogleActionsV2UiElementsBasicCard] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setButtonsVarargs(value: GoogleActionsV2UiElementsButton*): Self = this.set("buttons", js.Array(value :_*))
    
    @scala.inline
    def setButtons(value: js.Array[GoogleActionsV2UiElementsButton]): Self = this.set("buttons", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteButtons: Self = this.set("buttons", js.undefined)
    
    @scala.inline
    def setFormattedText(value: String): Self = this.set("formattedText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFormattedText: Self = this.set("formattedText", js.undefined)
    
    @scala.inline
    def setImage(value: GoogleActionsV2UiElementsImage): Self = this.set("image", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImage: Self = this.set("image", js.undefined)
    
    @scala.inline
    def setImageDisplayOptions(value: GoogleActionsV2UiElementsBasicCardImageDisplayOptions): Self = this.set("imageDisplayOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteImageDisplayOptions: Self = this.set("imageDisplayOptions", js.undefined)
    
    @scala.inline
    def setSubtitle(value: String): Self = this.set("subtitle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSubtitle: Self = this.set("subtitle", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTitle: Self = this.set("title", js.undefined)
  }
}
