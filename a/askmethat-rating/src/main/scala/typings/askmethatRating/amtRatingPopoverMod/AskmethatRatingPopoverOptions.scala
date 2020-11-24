package typings.askmethatRating.amtRatingPopoverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AskmethatRatingPopoverOptions extends js.Object {
  
  /**
    * Color used by the font & progress bar inside popover
    */
  var color: String = js.native
  
  /**
    * Display popover at bottom or top
    */
  var direction: js.UndefOr[AskmethatRatingPopoverDirection] = js.native
  
  /**
    * fontClass used by the rating element inside popover
    */
  var fontClass: String = js.native
  
  /**
    * Array of percentage to display
    */
  var values: js.Array[Double] = js.native
}
object AskmethatRatingPopoverOptions {
  
  @scala.inline
  def apply(color: String, fontClass: String, values: js.Array[Double]): AskmethatRatingPopoverOptions = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], fontClass = fontClass.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.asInstanceOf[AskmethatRatingPopoverOptions]
  }
  
  @scala.inline
  implicit class AskmethatRatingPopoverOptionsOps[Self <: AskmethatRatingPopoverOptions] (val x: Self) extends AnyVal {
    
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
    def setColor(value: String): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFontClass(value: String): Self = this.set("fontClass", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValuesVarargs(value: Double*): Self = this.set("values", js.Array(value :_*))
    
    @scala.inline
    def setValues(value: js.Array[Double]): Self = this.set("values", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirection(value: AskmethatRatingPopoverDirection): Self = this.set("direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDirection: Self = this.set("direction", js.undefined)
  }
}
