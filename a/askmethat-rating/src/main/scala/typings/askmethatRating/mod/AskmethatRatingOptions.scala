package typings.askmethatRating.mod

import typings.askmethatRating.amtRatingPopoverMod.AskmethatRatingPopoverOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AskmethatRatingOptions extends js.Object {
  
  /**
    * Color when the rating is not hovered
    */
  var backgroundColor: js.UndefOr[String] = js.native
  
  /**
    * Class to display as rating (FontAwesome or Rating for exemple)
    */
  var fontClass: js.UndefOr[String] = js.native
  
  var hoverColor: js.UndefOr[String] = js.native
  
  /**
    * Input name (Default is AskmethatRating)
    */
  var inputName: js.UndefOr[String] = js.native
  
  /**
    * Maximum rating that the plugin display
    */
  var maxRating: js.UndefOr[Double] = js.native
  
  /**
    * Mininmum rating that the user can set
    */
  var minRating: js.UndefOr[Double] = js.native
  
  /**
    * options if popover is set. Put element as readonly
    */
  var popover: js.UndefOr[AskmethatRatingPopoverOptions] = js.native
  
  /**
    * Set the rating to readonly
    */
  var readonly: js.UndefOr[Boolean] = js.native
  
  /**
    * The stepping for the rating
    */
  var step: js.UndefOr[AskmethatRatingSteps] = js.native
}
object AskmethatRatingOptions {
  
  @scala.inline
  def apply(): AskmethatRatingOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AskmethatRatingOptions]
  }
  
  @scala.inline
  implicit class AskmethatRatingOptionsOps[Self <: AskmethatRatingOptions] (val x: Self) extends AnyVal {
    
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
    def setBackgroundColor(value: String): Self = this.set("backgroundColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBackgroundColor: Self = this.set("backgroundColor", js.undefined)
    
    @scala.inline
    def setFontClass(value: String): Self = this.set("fontClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFontClass: Self = this.set("fontClass", js.undefined)
    
    @scala.inline
    def setHoverColor(value: String): Self = this.set("hoverColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteHoverColor: Self = this.set("hoverColor", js.undefined)
    
    @scala.inline
    def setInputName(value: String): Self = this.set("inputName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInputName: Self = this.set("inputName", js.undefined)
    
    @scala.inline
    def setMaxRating(value: Double): Self = this.set("maxRating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxRating: Self = this.set("maxRating", js.undefined)
    
    @scala.inline
    def setMinRating(value: Double): Self = this.set("minRating", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMinRating: Self = this.set("minRating", js.undefined)
    
    @scala.inline
    def setPopover(value: AskmethatRatingPopoverOptions): Self = this.set("popover", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePopover: Self = this.set("popover", js.undefined)
    
    @scala.inline
    def setReadonly(value: Boolean): Self = this.set("readonly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteReadonly: Self = this.set("readonly", js.undefined)
    
    @scala.inline
    def setStep(value: AskmethatRatingSteps): Self = this.set("step", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStep: Self = this.set("step", js.undefined)
  }
}
