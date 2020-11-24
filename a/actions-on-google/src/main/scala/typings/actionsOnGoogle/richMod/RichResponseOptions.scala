package typings.actionsOnGoogle.richMod

import typings.actionsOnGoogle.suggestionMod.Suggestions
import typings.actionsOnGoogle.v2Mod.GoogleActionsV2UiElementsLinkOutSuggestion
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RichResponseOptions extends js.Object {
  
  /**
    * Ordered list of either SimpleResponse objects or BasicCard objects.
    * First item must be SimpleResponse. There can be at most one card.
    * @public
    */
  var items: js.UndefOr[js.Array[RichResponseItem]] = js.native
  
  /**
    * Link Out Suggestion chip for this rich response. Optional.
    * @public
    */
  var link: js.UndefOr[GoogleActionsV2UiElementsLinkOutSuggestion] = js.native
  
  /**
    * Ordered list of text suggestions to display. Optional.
    * @public
    */
  var suggestions: js.UndefOr[js.Array[String] | Suggestions] = js.native
}
object RichResponseOptions {
  
  @scala.inline
  def apply(): RichResponseOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RichResponseOptions]
  }
  
  @scala.inline
  implicit class RichResponseOptionsOps[Self <: RichResponseOptions] (val x: Self) extends AnyVal {
    
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
    def setItemsVarargs(value: RichResponseItem*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[RichResponseItem]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteItems: Self = this.set("items", js.undefined)
    
    @scala.inline
    def setLink(value: GoogleActionsV2UiElementsLinkOutSuggestion): Self = this.set("link", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLink: Self = this.set("link", js.undefined)
    
    @scala.inline
    def setSuggestionsVarargs(value: String*): Self = this.set("suggestions", js.Array(value :_*))
    
    @scala.inline
    def setSuggestions(value: js.Array[String] | Suggestions): Self = this.set("suggestions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuggestions: Self = this.set("suggestions", js.undefined)
  }
}
