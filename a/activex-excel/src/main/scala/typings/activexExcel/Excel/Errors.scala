package typings.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Errors extends js.Object {
  val Application: typings.activexExcel.Excel.Application = js.native
  val Creator: XlCreator = js.native
  val Parent: js.Any = js.native
  def apply(Index: Double): Error = js.native
  def apply(Index: XlErrorChecks): Error = js.native
  def Item(Index: Double): Error = js.native
  def Item(Index: XlErrorChecks): Error = js.native
  def _Default(Index: js.Any): Error = js.native
}

