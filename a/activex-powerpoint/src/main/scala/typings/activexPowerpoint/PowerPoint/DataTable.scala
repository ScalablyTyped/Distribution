package typings.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DataTable extends js.Object {
  val Application: typings.activexPowerpoint.PowerPoint.Application
  var AutoScaleFont: js.Any
  val Border: ChartBorder
  val Creator: Double
  val Font: ChartFont
  val Format: ChartFormat
  var HasBorderHorizontal: Boolean
  var HasBorderOutline: Boolean
  var HasBorderVertical: Boolean
  val Parent: js.Any
  @JSName("PowerPoint.DataTable_typekey")
  var PowerPointDotDataTable_typekey: DataTable
  var ShowLegendKey: Boolean
  def Delete(): Unit
  def Select(): Unit
}

object DataTable {
  @scala.inline
  def apply(
    Application: Application,
    AutoScaleFont: js.Any,
    Border: ChartBorder,
    Creator: Double,
    Delete: () => Unit,
    Font: ChartFont,
    Format: ChartFormat,
    HasBorderHorizontal: Boolean,
    HasBorderOutline: Boolean,
    HasBorderVertical: Boolean,
    Parent: js.Any,
    PowerPointDotDataTable_typekey: DataTable,
    Select: () => Unit,
    ShowLegendKey: Boolean
  ): DataTable = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], AutoScaleFont = AutoScaleFont.asInstanceOf[js.Any], Border = Border.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Font = Font.asInstanceOf[js.Any], Format = Format.asInstanceOf[js.Any], HasBorderHorizontal = HasBorderHorizontal.asInstanceOf[js.Any], HasBorderOutline = HasBorderOutline.asInstanceOf[js.Any], HasBorderVertical = HasBorderVertical.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Select = js.Any.fromFunction0(Select), ShowLegendKey = ShowLegendKey.asInstanceOf[js.Any])
    __obj.updateDynamic("PowerPoint.DataTable_typekey")(PowerPointDotDataTable_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[DataTable]
  }
}

