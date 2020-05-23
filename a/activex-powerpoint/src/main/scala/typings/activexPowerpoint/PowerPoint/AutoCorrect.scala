package typings.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoCorrect extends js.Object {
  var DisplayAutoCorrectOptions: Boolean
  var DisplayAutoLayoutOptions: Boolean
  @JSName("PowerPoint.AutoCorrect_typekey")
  var PowerPointDotAutoCorrect_typekey: AutoCorrect
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
}

