package typings.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Menus extends js.Object {
  val Application: typings.activexExcel.Excel.Application = js.native
  val Count: Double = js.native
  val Creator: XlCreator = js.native
  val Parent: js.Any = js.native
  def apply(Index: js.Any): Menu = js.native
  def Add(Caption: String): Menu = js.native
  def Add(Caption: String, Before: js.UndefOr[scala.Nothing], Restore: js.Any): Menu = js.native
  def Add(Caption: String, Before: js.Any): Menu = js.native
  def Add(Caption: String, Before: js.Any, Restore: js.Any): Menu = js.native
  def Item(Index: js.Any): Menu = js.native
  def _Default(Index: js.Any): Menu = js.native
}

