package typings.activexOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMsoBorder extends js.Object {
  val Application: js.Any
  var Color: js.Any
  var ColorIndex: js.Any
  val Creator: Double
  var LineStyle: js.Any
  @JSName("Office.IMsoBorder_typekey")
  var OfficeDotIMsoBorder_typekey: IMsoBorder
  val Parent: js.Any
  var Weight: js.Any
}

object IMsoBorder {
  @scala.inline
  def apply(
    Application: js.Any,
    Color: js.Any,
    ColorIndex: js.Any,
    Creator: Double,
    LineStyle: js.Any,
    OfficeDotIMsoBorder_typekey: IMsoBorder,
    Parent: js.Any,
    Weight: js.Any
  ): IMsoBorder = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Color = Color.asInstanceOf[js.Any], ColorIndex = ColorIndex.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], LineStyle = LineStyle.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Weight = Weight.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.IMsoBorder_typekey")(OfficeDotIMsoBorder_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMsoBorder]
  }
}

