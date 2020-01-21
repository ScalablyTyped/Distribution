package typings.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dialogs extends js.Object {
  val Application: typings.activexExcel.Excel.Application = js.native
  val Count: Double = js.native
  val Creator: XlCreator = js.native
  val Parent: js.Any = js.native
  def apply(Index: XlBuiltInDialog): Dialog = js.native
  def Item(Index: XlBuiltInDialog): Dialog = js.native
  def _Default(Index: XlBuiltInDialog): Dialog = js.native
}

