package typings.activexOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BalloonLabel extends js.Object {
  val Application: js.Any
  val Creator: Double
  val Item: String
  val Name: String
  @JSName("Office.BalloonLabel_typekey")
  var OfficeDotBalloonLabel_typekey: BalloonLabel
  val Parent: js.Any
  var Text: String
}

object BalloonLabel {
  @scala.inline
  def apply(
    Application: js.Any,
    Creator: Double,
    Item: String,
    Name: String,
    OfficeDotBalloonLabel_typekey: BalloonLabel,
    Parent: js.Any,
    Text: String
  ): BalloonLabel = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Item = Item.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Text = Text.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.BalloonLabel_typekey")(OfficeDotBalloonLabel_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[BalloonLabel]
  }
}

