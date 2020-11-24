package typings.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutoCorrect extends js.Object {
  
  var DisplayAutoCorrectOptions: Boolean = js.native
  
  var DisplayAutoLayoutOptions: Boolean = js.native
  
  @JSName("PowerPoint.AutoCorrect_typekey")
  var PowerPointDotAutoCorrect_typekey: AutoCorrect = js.native
}
object AutoCorrect {
  
  @scala.inline
  def apply(
    DisplayAutoCorrectOptions: Boolean,
    DisplayAutoLayoutOptions: Boolean,
    PowerPointDotAutoCorrect_typekey: AutoCorrect
  ): AutoCorrect = {
    val __obj = js.Dynamic.literal(DisplayAutoCorrectOptions = DisplayAutoCorrectOptions.asInstanceOf[js.Any], DisplayAutoLayoutOptions = DisplayAutoLayoutOptions.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.AutoCorrect_typekey")(PowerPointDotAutoCorrect_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[AutoCorrect]
  }
  
  @scala.inline
  implicit class AutoCorrectOps[Self <: AutoCorrect] (val x: Self) extends AnyVal {
    
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
    def setDisplayAutoCorrectOptions(value: Boolean): Self = this.set("DisplayAutoCorrectOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayAutoLayoutOptions(value: Boolean): Self = this.set("DisplayAutoLayoutOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPowerPointDotAutoCorrect_typekey(value: AutoCorrect): Self = this.set("PowerPoint.AutoCorrect_typekey", value.asInstanceOf[js.Any])
  }
}
