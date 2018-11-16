package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Excel.TableStyleElement")
@js.native
class TableStyleElement protected () extends js.Object {
  val Application: Application = js.native
  @JSName("Borders")
  val Borders_Original: Borders = js.native
  val Creator: XlCreator = js.native
  var `Excel.TableStyleElement_typekey`: TableStyleElement = js.native
  val Font: Font = js.native
  val HasFormat: scala.Boolean = js.native
  val Interior: Interior = js.native
  val Parent: js.Any = js.native
  var StripeSize: scala.Double = js.native
  def Borders(Index: XlBordersIndex): Border = js.native
  def Clear(): scala.Unit = js.native
}

