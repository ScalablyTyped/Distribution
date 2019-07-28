package typings.activexDashExcel.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomProperties extends js.Object {
  val Application: typings.activexDashExcel.ExcelNs.Application = js.native
  val Count: Double = js.native
  val Creator: XlCreator = js.native
  val Parent: js.Any = js.native
  def apply(Index: String): CustomProperty = js.native
  def apply(Index: Double): CustomProperty = js.native
  def Add(Name: String, Value: js.Any): CustomProperty = js.native
  def Item(Index: String): CustomProperty = js.native
  def Item(Index: Double): CustomProperty = js.native
  def _Default(Index: js.Any): CustomProperty = js.native
}

