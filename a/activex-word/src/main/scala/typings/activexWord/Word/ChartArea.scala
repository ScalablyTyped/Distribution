package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChartArea extends js.Object {
  val Application: js.Any
  var AutoScaleFont: js.Any
  val Border: ChartBorder
  val Creator: Double
  val Fill: ChartFillFormat
  val Font: ChartFont
  val Format: ChartFormat
  var Height: Double
  val Interior: typings.activexWord.Word.Interior
  var Left: Double
  val Name: String
  val Parent: js.Any
  var Shadow: Boolean
  var Top: Double
  var Width: Double
  @JSName("Word.ChartArea_typekey")
  var WordDotChartArea_typekey: ChartArea
  def Clear(): js.Any
  def ClearContents(): js.Any
  def ClearFormats(): js.Any
  def Copy(): js.Any
  def Select(): js.Any
}

object ChartArea {
  @scala.inline
  def apply(
    Application: js.Any,
    AutoScaleFont: js.Any,
    Border: ChartBorder,
    Clear: () => js.Any,
    ClearContents: () => js.Any,
    ClearFormats: () => js.Any,
    Copy: () => js.Any,
    Creator: Double,
    Fill: ChartFillFormat,
    Font: ChartFont,
    Format: ChartFormat,
    Height: Double,
    Interior: Interior,
    Left: Double,
    Name: String,
    Parent: js.Any,
    Select: () => js.Any,
    Shadow: Boolean,
    Top: Double,
    Width: Double,
    WordDotChartArea_typekey: ChartArea
  ): ChartArea = {
    val __obj = js.Dynamic.literal(Application = Application.asInstanceOf[js.Any], AutoScaleFont = AutoScaleFont.asInstanceOf[js.Any], Border = Border.asInstanceOf[js.Any], Clear = js.Any.fromFunction0(Clear), ClearContents = js.Any.fromFunction0(ClearContents), ClearFormats = js.Any.fromFunction0(ClearFormats), Copy = js.Any.fromFunction0(Copy), Creator = Creator.asInstanceOf[js.Any], Fill = Fill.asInstanceOf[js.Any], Font = Font.asInstanceOf[js.Any], Format = Format.asInstanceOf[js.Any], Height = Height.asInstanceOf[js.Any], Interior = Interior.asInstanceOf[js.Any], Left = Left.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], Select = js.Any.fromFunction0(Select), Shadow = Shadow.asInstanceOf[js.Any], Top = Top.asInstanceOf[js.Any], Width = Width.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.ChartArea_typekey")(WordDotChartArea_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChartArea]
  }
}

