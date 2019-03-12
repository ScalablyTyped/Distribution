package typings
package activexDashWordLib.WordNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Word.TableStyle")
@js.native
class TableStyle protected () extends js.Object {
  var Alignment: WdRowAlignment = js.native
  var AllowBreakAcrossPage: scala.Double = js.native
  var AllowPageBreaks: scala.Boolean = js.native
  val Application: activexDashWordLib.WordNs.Application = js.native
  var Borders: activexDashWordLib.WordNs.Borders = js.native
  var BottomPadding: scala.Double = js.native
  var ColumnStripe: scala.Double = js.native
  val Creator: scala.Double = js.native
  var LeftIndent: scala.Double = js.native
  var LeftPadding: scala.Double = js.native
  val Parent: js.Any = js.native
  var RightPadding: scala.Double = js.native
  var RowStripe: scala.Double = js.native
  val Shading: activexDashWordLib.WordNs.Shading = js.native
  var Spacing: scala.Double = js.native
  var TableDirection: WdTableDirection = js.native
  var TopPadding: scala.Double = js.native
  var `Word.TableStyle_typekey`: TableStyle = js.native
  def Condition(ConditionCode: WdConditionCode): ConditionalStyle = js.native
}

