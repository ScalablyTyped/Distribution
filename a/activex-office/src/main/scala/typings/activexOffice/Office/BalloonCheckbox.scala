package typings.activexOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BalloonCheckbox extends js.Object {
  val Application: js.Any
  var Checked: Boolean
  val Creator: Double
  val Item: String
  val Name: String
  @JSName("Office.BalloonCheckbox_typekey")
  var OfficeDotBalloonCheckbox_typekey: BalloonCheckbox
  val Parent: js.Any
  var Text: String
}

object BalloonCheckbox {
  @scala.inline
  def apply(
    Application: js.Any,
    Checked: Boolean,
    Creator: Double,
    Item: String,
    Name: String,
    OfficeDotBalloonCheckbox_typekey: BalloonCheckbox,
    Parent: js.Any,
    Text: String
  ): BalloonCheckbox = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Checked = Checked.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Item = Item.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Text = Text.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.BalloonCheckbox_typekey")(OfficeDotBalloonCheckbox_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[BalloonCheckbox]
  }
}

