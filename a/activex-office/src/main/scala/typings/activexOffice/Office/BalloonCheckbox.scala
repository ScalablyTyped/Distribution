package typings.activexOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BalloonCheckbox extends js.Object {
  val Application: js.Any = js.native
  var Checked: Boolean = js.native
  val Creator: Double = js.native
  val Item: String = js.native
  val Name: String = js.native
  @JSName("Office.BalloonCheckbox_typekey")
  var OfficeDotBalloonCheckbox_typekey: BalloonCheckbox = js.native
  val Parent: js.Any = js.native
  var Text: String = js.native
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
  @scala.inline
  implicit class BalloonCheckboxOps[Self <: BalloonCheckbox] (val x: Self) extends AnyVal {
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
    def setApplication(value: js.Any): Self = this.set("Application", value.asInstanceOf[js.Any])
    @scala.inline
    def setChecked(value: Boolean): Self = this.set("Checked", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreator(value: Double): Self = this.set("Creator", value.asInstanceOf[js.Any])
    @scala.inline
    def setItem(value: String): Self = this.set("Item", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setOfficeDotBalloonCheckbox_typekey(value: BalloonCheckbox): Self = this.set("Office.BalloonCheckbox_typekey", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: js.Any): Self = this.set("Parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setText(value: String): Self = this.set("Text", value.asInstanceOf[js.Any])
  }
  
}

