package typings.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RecentFiles extends js.Object {
  val Application: typings.activexExcel.Excel.Application = js.native
  val Count: Double = js.native
  val Creator: XlCreator = js.native
  var Maximum: Double = js.native
  val Parent: js.Any = js.native
  def apply(Index: Double): RecentFile = js.native
  def Add(Name: String): RecentFile = js.native
  def Item(Index: Double): RecentFile = js.native
  def _Default(Index: Double): RecentFile = js.native
}

