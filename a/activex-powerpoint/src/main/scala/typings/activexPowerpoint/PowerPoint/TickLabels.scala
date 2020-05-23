package typings.activexPowerpoint.PowerPoint

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TickLabels extends js.Object {
  var Alignment: Double
  val Application: typings.activexPowerpoint.PowerPoint.Application
  var AutoScaleFont: js.Any
  val Creator: Double
  val Depth: Double
  val Font: ChartFont
  val Format: ChartFormat
  var MultiLevel: Boolean
  val Name: String
  var NumberFormat: String
  var NumberFormatLinked: Boolean
  var NumberFormatLocal: js.Any
  var Offset: Double
  var Orientation: XlTickLabelOrientation
  val Parent: js.Any
  @JSName("PowerPoint.TickLabels_typekey")
  var PowerPointDotTickLabels_typekey: TickLabels
  var ReadingOrder: Double
  def Delete(): js.Any
  def Select(): js.Any
}

object TickLabels {
  @scala.inline
  def apply(
    Alignment: Double,
    Application: Application,
    AutoScaleFont: js.Any,
    Creator: Double,
    Delete: () => js.Any,
    Depth: Double,
    Font: ChartFont,
    Format: ChartFormat,
    MultiLevel: Boolean,
    Name: String,
    NumberFormat: String,
    NumberFormatLinked: Boolean,
    NumberFormatLocal: js.Any,
    Offset: Double,
    Orientation: XlTickLabelOrientation,
    Parent: js.Any,
    PowerPointDotTickLabels_typekey: TickLabels,
    ReadingOrder: Double,
    Select: () => js.Any
  ): TickLabels = {
    val __obj = js.Dynamic.literal(Alignment = Alignment.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], AutoScaleFont = AutoScaleFont.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Depth = Depth.asInstanceOf[js.Any], Font = Font.asInstanceOf[js.Any], Format = Format.asInstanceOf[js.Any], MultiLevel = MultiLevel.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], NumberFormat = NumberFormat.asInstanceOf[js.Any], NumberFormatLinked = NumberFormatLinked.asInstanceOf[js.Any], NumberFormatLocal = NumberFormatLocal.asInstanceOf[js.Any], Offset = Offset.asInstanceOf[js.Any], Orientation = Orientation.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], ReadingOrder = ReadingOrder.asInstanceOf[js.Any], Select = js.Any.fromFunction0(Select))
    __obj.updateDynamic("PowerPoint.TickLabels_typekey")(PowerPointDotTickLabels_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[TickLabels]
  }
}

