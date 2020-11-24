package typings.actionsOnGoogle.v2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GoogleActionsV2OptionValueSpec extends js.Object {
  
  /**
    * A select with a card carousel GUI, use collection_select instead.
    */
  var carouselSelect: js.UndefOr[GoogleActionsV2UiElementsCarouselSelect] = js.native
  
  /**
    * A select with a card collection GUI
    */
  var collectionSelect: js.UndefOr[GoogleActionsV2UiElementsCollectionSelect] = js.native
  
  /**
    * A select with a list card GUI
    */
  var listSelect: js.UndefOr[GoogleActionsV2UiElementsListSelect] = js.native
  
  /**
    * A simple select with no associated GUI
    */
  var simpleSelect: js.UndefOr[GoogleActionsV2SimpleSelect] = js.native
}
object GoogleActionsV2OptionValueSpec {
  
  @scala.inline
  def apply(): GoogleActionsV2OptionValueSpec = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GoogleActionsV2OptionValueSpec]
  }
  
  @scala.inline
  implicit class GoogleActionsV2OptionValueSpecOps[Self <: GoogleActionsV2OptionValueSpec] (val x: Self) extends AnyVal {
    
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
    def setCarouselSelect(value: GoogleActionsV2UiElementsCarouselSelect): Self = this.set("carouselSelect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCarouselSelect: Self = this.set("carouselSelect", js.undefined)
    
    @scala.inline
    def setCollectionSelect(value: GoogleActionsV2UiElementsCollectionSelect): Self = this.set("collectionSelect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCollectionSelect: Self = this.set("collectionSelect", js.undefined)
    
    @scala.inline
    def setListSelect(value: GoogleActionsV2UiElementsListSelect): Self = this.set("listSelect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteListSelect: Self = this.set("listSelect", js.undefined)
    
    @scala.inline
    def setSimpleSelect(value: GoogleActionsV2SimpleSelect): Self = this.set("simpleSelect", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSimpleSelect: Self = this.set("simpleSelect", js.undefined)
  }
}
