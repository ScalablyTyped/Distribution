package typings.activexOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMsoUpBars extends js.Object {
  val Application: js.Any
  val Border: IMsoBorder
  val Creator: Double
  val Fill: ChartFillFormat
  val Format: IMsoChartFormat
  val Interior: IMsoInterior
  val Name: String
  @JSName("Office.IMsoUpBars_typekey")
  var OfficeDotIMsoUpBars_typekey: IMsoUpBars
  val Parent: js.Any
  def Delete(): js.Any
  def Select(): js.Any
}

object IMsoUpBars {
  @scala.inline
  def apply(
    Application: js.Any,
    Border: IMsoBorder,
    Creator: Double,
    Delete: () => js.Any,
    Fill: ChartFillFormat,
    Format: IMsoChartFormat,
    Interior: IMsoInterior,
    Name: String,
    OfficeDotIMsoUpBars_typekey: IMsoUpBars,
    Parent: js.Any,
    Select: () => js.Any
  ): IMsoUpBars = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], Border = Border.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Fill = Fill.asInstanceOf[js.Any], Format = Format.asInstanceOf[js.Any], Interior = Interior.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Select = js.Any.fromFunction0(Select))
    __obj.updateDynamic("Office.IMsoUpBars_typekey")(OfficeDotIMsoUpBars_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMsoUpBars]
  }
}

