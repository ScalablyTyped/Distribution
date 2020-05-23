package typings.activexOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMsoInterior extends js.Object {
  val Application: js.Any
  var Color: js.Any
  var ColorIndex: js.Any
  val Creator: Double
  var InvertIfNegative: js.Any
  @JSName("Office.IMsoInterior_typekey")
  var OfficeDotIMsoInterior_typekey: IMsoInterior
  val Parent: js.Any
  var Pattern: js.Any
  var PatternColor: js.Any
  var PatternColorIndex: js.Any
}

object IMsoInterior {
  @scala.inline
  def apply(
    Application: js.Any,
    Color: js.Any,
    ColorIndex: js.Any,
    Creator: Double,
    InvertIfNegative: js.Any,
    OfficeDotIMsoInterior_typekey: IMsoInterior,
    Parent: js.Any,
    Pattern: js.Any,
    PatternColor: js.Any,
    PatternColorIndex: js.Any
  ): IMsoInterior = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Color = Color.asInstanceOf[js.Any], ColorIndex = ColorIndex.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], InvertIfNegative = InvertIfNegative.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Pattern = Pattern.asInstanceOf[js.Any], PatternColor = PatternColor.asInstanceOf[js.Any], PatternColorIndex = PatternColorIndex.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.IMsoInterior_typekey")(OfficeDotIMsoInterior_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMsoInterior]
  }
}

