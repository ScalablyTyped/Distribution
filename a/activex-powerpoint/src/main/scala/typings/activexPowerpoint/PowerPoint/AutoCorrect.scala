package typings.activexPowerpoint.PowerPoint

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AutoCorrect extends StObject {
  
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
  implicit class AutoCorrectMutableBuilder[Self <: AutoCorrect] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisplayAutoCorrectOptions(value: Boolean): Self = StObject.set(x, "DisplayAutoCorrectOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDisplayAutoLayoutOptions(value: Boolean): Self = StObject.set(x, "DisplayAutoLayoutOptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPowerPointDotAutoCorrect_typekey(value: AutoCorrect): Self = StObject.set(x, "PowerPoint.AutoCorrect_typekey", value.asInstanceOf[js.Any])
  }
}
