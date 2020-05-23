package typings.activexOffice.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMsoDataTable extends js.Object {
  val Application: js.Any
  var AutoScaleFont: js.Any
  val Border: IMsoBorder
  val Creator: Double
  val Font: ChartFont
  val Format: IMsoChartFormat
  var HasBorderHorizontal: Boolean
  var HasBorderOutline: Boolean
  var HasBorderVertical: Boolean
  @JSName("Office.IMsoDataTable_typekey")
  var OfficeDotIMsoDataTable_typekey: IMsoDataTable
  val Parent: js.Any
  var ShowLegendKey: Boolean
  def Delete(): Unit
  def Select(): Unit
}

object IMsoDataTable {
  @scala.inline
  def apply(
    Application: js.Any,
    AutoScaleFont: js.Any,
    Border: IMsoBorder,
    Creator: Double,
    Delete: () => Unit,
    Font: ChartFont,
    Format: IMsoChartFormat,
    HasBorderHorizontal: Boolean,
    HasBorderOutline: Boolean,
    HasBorderVertical: Boolean,
    OfficeDotIMsoDataTable_typekey: IMsoDataTable,
    Parent: js.Any,
    Select: () => Unit,
    ShowLegendKey: Boolean
  ): IMsoDataTable = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], AutoScaleFont = AutoScaleFont.asInstanceOf[js.Any], Border = Border.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Font = Font.asInstanceOf[js.Any], Format = Format.asInstanceOf[js.Any], HasBorderHorizontal = HasBorderHorizontal.asInstanceOf[js.Any], HasBorderOutline = HasBorderOutline.asInstanceOf[js.Any], HasBorderVertical = HasBorderVertical.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Select = js.Any.fromFunction0(Select), ShowLegendKey = ShowLegendKey.asInstanceOf[js.Any])
    __obj.updateDynamic("Office.IMsoDataTable_typekey")(OfficeDotIMsoDataTable_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMsoDataTable]
  }
}

