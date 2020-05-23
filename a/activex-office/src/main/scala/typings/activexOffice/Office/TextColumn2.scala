package typings.activexOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextColumn2 extends js.Object {
  val Application: js.Any
  val Creator: Double
  var Number: Double
  @JSName("Office.TextColumn2_typekey")
  var OfficeDotTextColumn2_typekey: TextColumn2
  var Spacing: Double
  var TextDirection: MsoTextDirection
}

object TextColumn2 {
  @scala.inline
  def apply(
    Application: js.Any,
    Creator: Double,
    Number: Double,
    OfficeDotTextColumn2_typekey: TextColumn2,
    Spacing: Double,
    TextDirection: MsoTextDirection
  ): TextColumn2 = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Number = Number.asInstanceOf[js.Any], Spacing = Spacing.asInstanceOf[js.Any], TextDirection = TextDirection.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.TextColumn2_typekey")(OfficeDotTextColumn2_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextColumn2]
  }
}

