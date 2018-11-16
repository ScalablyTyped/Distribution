package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Styles extends js.Object {
  val Application: Application = js.native
  val Count: scala.Double = js.native
  val Creator: XlCreator = js.native
  val Parent: js.Any = js.native
  def apply(Index: js.Any): Style = js.native
  def Add(Name: java.lang.String): Style = js.native
  def Add(Name: java.lang.String, BasedOn: js.Any): Style = js.native
  def Item(Index: java.lang.String): Style = js.native
  def Item(Index: scala.Double): Style = js.native
  def Merge(Workbook: Workbook): js.Any = js.native
  def _Default(Index: js.Any): Style = js.native
}

