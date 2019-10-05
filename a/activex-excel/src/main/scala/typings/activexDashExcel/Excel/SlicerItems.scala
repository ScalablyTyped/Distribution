package typings.activexDashExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SlicerItems extends js.Object {
  val Application: typings.activexDashExcel.Excel.Application = js.native
  val Count: Double = js.native
  val Creator: XlCreator = js.native
  val Parent: js.Any = js.native
  def apply(Index: String): SlicerItem = js.native
  def apply(Index: Double): SlicerItem = js.native
  def Item(Index: String): SlicerItem = js.native
  def Item(Index: Double): SlicerItem = js.native
  def _Default(Index: js.Any): SlicerItem = js.native
}

