package typings.activexDashWord.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.TableStyle")
@js.native
class TableStyle protected () extends js.Object {
  var Alignment: WdRowAlignment = js.native
  var AllowBreakAcrossPage: Double = js.native
  var AllowPageBreaks: Boolean = js.native
  val Application: typings.activexDashWord.WordNs.Application = js.native
  var Borders: typings.activexDashWord.WordNs.Borders = js.native
  var BottomPadding: Double = js.native
  var ColumnStripe: Double = js.native
  val Creator: Double = js.native
  var LeftIndent: Double = js.native
  var LeftPadding: Double = js.native
  val Parent: js.Any = js.native
  var RightPadding: Double = js.native
  var RowStripe: Double = js.native
  val Shading: typings.activexDashWord.WordNs.Shading = js.native
  var Spacing: Double = js.native
  var TableDirection: WdTableDirection = js.native
  var TopPadding: Double = js.native
  var `Word.TableStyle_typekey`: TableStyle = js.native
  def Condition(ConditionCode: WdConditionCode): ConditionalStyle = js.native
}

