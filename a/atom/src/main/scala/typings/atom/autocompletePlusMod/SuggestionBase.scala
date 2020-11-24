package typings.atom.autocompletePlusMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SuggestionBase extends js.Object {
  
  /**
    *  Class name for the suggestion in the suggestion list. Allows you to style your
    *  suggestion via CSS, if desired.
    */
  var className: js.UndefOr[String] = js.native
  
  /**
    *  A doc-string summary or short description of the suggestion. When specified, it
    *  will be displayed at the bottom of the suggestions list.
    */
  var description: js.UndefOr[String] = js.native
  
  /**
    *  (experimental) Description with Markdown formatting.
    *  Takes precedence over plaintext description.
    */
  var descriptionMarkdown: js.UndefOr[String] = js.native
  
  /**
    *  A url to the documentation or more information about this suggestion.
    *  When specified, a More.. link will be displayed in the description area.
    */
  var descriptionMoreURL: js.UndefOr[String] = js.native
  
  /**
    *  A string that will show in the UI for this suggestion.
    *  When not set, snippet || text is displayed.
    */
  var displayText: js.UndefOr[String] = js.native
  
  /**
    *  If you want complete control over the icon shown against the suggestion.
    *  e.g. iconHTML: <i class="icon-move-right"></i>
    */
  var iconHTML: js.UndefOr[String] = js.native
  
  /** This is shown before the suggestion. Useful for return values. */
  var leftLabel: js.UndefOr[String] = js.native
  
  /** Use this instead of leftLabel if you want to use html for the left label. */
  var leftLabelHTML: js.UndefOr[String] = js.native
  
  /**
    *  The text immediately preceding the cursor, which will be replaced by the text.
    *  If not provided, the prefix passed into getSuggestions will be used.
    */
  var replacementPrefix: js.UndefOr[String] = js.native
  
  /**
    *  An indicator (e.g. function, variable) denoting the "kind" of suggestion this
    *  represents.
    */
  var rightLabel: js.UndefOr[String] = js.native
  
  /** Use this instead of rightLabel if you want to use html for the right label. */
  var rightLabelHTML: js.UndefOr[String] = js.native
  
  /**
    *  The suggestion type. It will be converted into an icon shown against the
    *  suggestion.
    */
  var `type`: js.UndefOr[String] = js.native
}
object SuggestionBase {
  
  @scala.inline
  def apply(): SuggestionBase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SuggestionBase]
  }
  
  @scala.inline
  implicit class SuggestionBaseOps[Self <: SuggestionBase] (val x: Self) extends AnyVal {
    
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
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setDescriptionMarkdown(value: String): Self = this.set("descriptionMarkdown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescriptionMarkdown: Self = this.set("descriptionMarkdown", js.undefined)
    
    @scala.inline
    def setDescriptionMoreURL(value: String): Self = this.set("descriptionMoreURL", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescriptionMoreURL: Self = this.set("descriptionMoreURL", js.undefined)
    
    @scala.inline
    def setDisplayText(value: String): Self = this.set("displayText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisplayText: Self = this.set("displayText", js.undefined)
    
    @scala.inline
    def setIconHTML(value: String): Self = this.set("iconHTML", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconHTML: Self = this.set("iconHTML", js.undefined)
    
    @scala.inline
    def setLeftLabel(value: String): Self = this.set("leftLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeftLabel: Self = this.set("leftLabel", js.undefined)
    
    @scala.inline
    def setLeftLabelHTML(value: String): Self = this.set("leftLabelHTML", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLeftLabelHTML: Self = this.set("leftLabelHTML", js.undefined)
    
    @scala.inline
    def setReplacementPrefix(value: String): Self = this.set("replacementPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReplacementPrefix: Self = this.set("replacementPrefix", js.undefined)
    
    @scala.inline
    def setRightLabel(value: String): Self = this.set("rightLabel", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRightLabel: Self = this.set("rightLabel", js.undefined)
    
    @scala.inline
    def setRightLabelHTML(value: String): Self = this.set("rightLabelHTML", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRightLabelHTML: Self = this.set("rightLabelHTML", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
