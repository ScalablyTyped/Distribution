package typings.activexDashExcel.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Styles extends js.Object {
  val Application: typings.activexDashExcel.ExcelNs.Application = js.native
  val Count: Double = js.native
  val Creator: XlCreator = js.native
  val Parent: js.Any = js.native
  def apply(Index: js.Any): Style = js.native
  def Add(Name: String): Style = js.native
  def Add(Name: String, BasedOn: js.Any): Style = js.native
  def Item(Index: String): Style = js.native
  def Item(Index: Double): Style = js.native
  def Merge(Workbook: Workbook): js.Any = js.native
  def _Default(Index: js.Any): Style = js.native
}

