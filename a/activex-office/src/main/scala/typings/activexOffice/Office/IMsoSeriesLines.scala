package typings.activexOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMsoSeriesLines extends js.Object {
  val Application: js.Any
  val Border: IMsoBorder
  val Creator: Double
  val Format: IMsoChartFormat
  val Name: String
  @JSName("Office.IMsoSeriesLines_typekey")
  var OfficeDotIMsoSeriesLines_typekey: IMsoSeriesLines
  val Parent: js.Any
  def Delete(): js.Any
  def Select(): js.Any
}

object IMsoSeriesLines {
  @scala.inline
  def apply(
    Application: js.Any,
    Border: IMsoBorder,
    Creator: Double,
    Delete: () => js.Any,
    Format: IMsoChartFormat,
    Name: String,
    OfficeDotIMsoSeriesLines_typekey: IMsoSeriesLines,
    Parent: js.Any,
    Select: () => js.Any
  ): IMsoSeriesLines = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Border = Border.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Format = Format.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Select = js.Any.fromFunction0(Select))
    __obj.updateDynamic("Office.IMsoSeriesLines_typekey")(OfficeDotIMsoSeriesLines_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMsoSeriesLines]
  }
}

