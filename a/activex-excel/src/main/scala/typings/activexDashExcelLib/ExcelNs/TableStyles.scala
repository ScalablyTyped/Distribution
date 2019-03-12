package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableStyles extends js.Object {
  val Application: activexDashExcelLib.ExcelNs.Application = js.native
  val Count: scala.Double = js.native
  val Creator: XlCreator = js.native
  val Parent: js.Any = js.native
  def apply(Index: java.lang.String): TableStyle = js.native
  def apply(Index: scala.Double): TableStyle = js.native
  def Add(TableStyleName: java.lang.String): TableStyle = js.native
  def Item(Index: java.lang.String): TableStyle = js.native
  def Item(Index: scala.Double): TableStyle = js.native
  def _Default(Index: js.Any): TableStyle = js.native
}

