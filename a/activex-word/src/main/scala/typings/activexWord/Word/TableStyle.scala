package typings.activexWord.Word

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TableStyle extends js.Object {
  var Alignment: WdRowAlignment
  var AllowBreakAcrossPage: Double
  var AllowPageBreaks: Boolean
  val Application: typings.activexWord.Word.Application
  var Borders: typings.activexWord.Word.Borders
  var BottomPadding: Double
  var ColumnStripe: Double
  val Creator: Double
  var LeftIndent: Double
  var LeftPadding: Double
  val Parent: js.Any
  var RightPadding: Double
  var RowStripe: Double
  val Shading: typings.activexWord.Word.Shading
  var Spacing: Double
  var TableDirection: WdTableDirection
  var TopPadding: Double
  @JSName("Word.TableStyle_typekey")
  var WordDotTableStyle_typekey: TableStyle
  def Condition(ConditionCode: WdConditionCode): ConditionalStyle
}

object TableStyle {
  @scala.inline
  def apply(
    Alignment: WdRowAlignment,
    AllowBreakAcrossPage: Double,
    AllowPageBreaks: Boolean,
    Application: Application,
    Borders: Borders,
    BottomPadding: Double,
    ColumnStripe: Double,
    Condition: WdConditionCode => ConditionalStyle,
    Creator: Double,
    LeftIndent: Double,
    LeftPadding: Double,
    Parent: js.Any,
    RightPadding: Double,
    RowStripe: Double,
    Shading: Shading,
    Spacing: Double,
    TableDirection: WdTableDirection,
    TopPadding: Double,
    WordDotTableStyle_typekey: TableStyle
  ): TableStyle = {
    val __obj = js.Dynamic.literal(Alignment = Alignment.asInstanceOf[js.Any], AllowBreakAcrossPage = AllowBreakAcrossPage.asInstanceOf[js.Any], AllowPageBreaks = AllowPageBreaks.asInstanceOf[js.Any], Application = Application.asInstanceOf[js.Any], Borders = Borders.asInstanceOf[js.Any], BottomPadding = BottomPadding.asInstanceOf[js.Any], ColumnStripe = ColumnStripe.asInstanceOf[js.Any], Condition = js.Any.fromFunction1(Condition), Creator = Creator.asInstanceOf[js.Any], LeftIndent = LeftIndent.asInstanceOf[js.Any], LeftPadding = LeftPadding.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], RightPadding = RightPadding.asInstanceOf[js.Any], RowStripe = RowStripe.asInstanceOf[js.Any], Shading = Shading.asInstanceOf[js.Any], Spacing = Spacing.asInstanceOf[js.Any], TableDirection = TableDirection.asInstanceOf[js.Any], TopPadding = TopPadding.asInstanceOf[js.Any])
    __obj.updateDynamic("Word.TableStyle_typekey")(WordDotTableStyle_typekey.asInstanceOf[js.Any])
    __obj.asInstanceOf[TableStyle]
  }
}

