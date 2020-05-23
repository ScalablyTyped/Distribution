package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TickLabels extends js.Object {
  var Alignment: Double
  val Application: js.Any
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
  var ReadingOrder: Double
  @JSName("Word.TickLabels_typekey")
  var WordDotTickLabels_typekey: TickLabels
  def Delete(): js.Any
  def Select(): js.Any
}

object TickLabels {
  @scala.inline
  def apply(
    Alignment: Double,
    Application: js.Any,
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
    ReadingOrder: Double,
    Select: () => js.Any,
    WordDotTickLabels_typekey: TickLabels
  ): TickLabels = {
    val __obj = js.Dynamic.literal(Alignment = Alignment.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], AutoScaleFont = AutoScaleFont.asInstanceOf[js.Any], Creator = Creator.asInstanceOf[js.Any], Delete = js.Any.fromFunction0(Delete), Depth = Depth.asInstanceOf[js.Any], Font = Font.asInstanceOf[js.Any], Format = Format.asInstanceOf[js.Any], MultiLevel = MultiLevel.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], NumberFormat = NumberFormat.asInstanceOf[js.Any], NumberFormatLinked = NumberFormatLinked.asInstanceOf[js.Any], NumberFormatLocal = NumberFormatLocal.asInstanceOf[js.Any], Offset = Offset.asInstanceOf[js.Any], Orientation = Orientation.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], ReadingOrder = ReadingOrder.asInstanceOf[js.Any], Select = js.Any.fromFunction0(Select))
    __obj.updateDynamic("Word.TickLabels_typekey")(WordDotTickLabels_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[TickLabels]
  }
}

