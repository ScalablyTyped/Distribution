package typings.activexDashExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Parameters extends js.Object {
  val Application: typings.activexDashExcel.Excel.Application = js.native
  val Count: Double = js.native
  val Creator: XlCreator = js.native
  val Parent: js.Any = js.native
  def apply(Index: String): Parameter = js.native
  def apply(Index: Double): Parameter = js.native
  def Add(Name: String): Parameter = js.native
  def Add(Name: String, iDataType: XlParameterDataType): Parameter = js.native
  def Delete(): Unit = js.native
  def Item(Index: String): Parameter = js.native
  def Item(Index: Double): Parameter = js.native
  def _Default(Index: js.Any): Parameter = js.native
}

