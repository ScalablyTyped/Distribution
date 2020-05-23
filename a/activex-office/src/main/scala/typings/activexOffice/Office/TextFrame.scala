package typings.activexOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TextFrame extends js.Object {
  val Application: js.Any
  val Creator: Double
  var MarginBottom: Double
  var MarginLeft: Double
  var MarginRight: Double
  var MarginTop: Double
  @JSName("Office.TextFrame_typekey")
  var OfficeDotTextFrame_typekey: TextFrame
  var Orientation: MsoTextOrientation
  val Parent: js.Any
}

object TextFrame {
  @scala.inline
  def apply(
    Application: js.Any,
    Creator: Double,
    MarginBottom: Double,
    MarginLeft: Double,
    MarginRight: Double,
    MarginTop: Double,
    OfficeDotTextFrame_typekey: TextFrame,
    Orientation: MsoTextOrientation,
    Parent: js.Any
  ): TextFrame = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], MarginBottom = MarginBottom.asInstanceOf[js.Any], MarginLeft = MarginLeft.asInstanceOf[js.Any], MarginRight = MarginRight.asInstanceOf[js.Any], MarginTop = MarginTop.asInstanceOf[js.Any], Orientation = Orientation.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.TextFrame_typekey")(OfficeDotTextFrame_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextFrame]
  }
}

