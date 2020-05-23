package typings.activexOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SmartArtColor extends js.Object {
  val Application: js.Any
  val Category: String
  val Creator: Double
  val Description: String
  val Id: String
  val Name: String
  @JSName("Office.SmartArtColor_typekey")
  var OfficeDotSmartArtColor_typekey: SmartArtColor
  val Parent: js.Any
}

object SmartArtColor {
  @scala.inline
  def apply(
    Application: js.Any,
    Category: String,
    Creator: Double,
    Description: String,
    Id: String,
    Name: String,
    OfficeDotSmartArtColor_typekey: SmartArtColor,
    Parent: js.Any
  ): SmartArtColor = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Category = Category.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Description = Description.asInstanceOf[js.Any], Id = Id.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.SmartArtColor_typekey")(OfficeDotSmartArtColor_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SmartArtColor]
  }
}

