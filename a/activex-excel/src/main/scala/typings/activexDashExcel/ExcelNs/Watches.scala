package typings.activexDashExcel.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Watches extends js.Object {
  val Application: typings.activexDashExcel.ExcelNs.Application = js.native
  val Count: Double = js.native
  val Creator: XlCreator = js.native
  val Parent: js.Any = js.native
  def apply(Index: String): Watch = js.native
  def apply(Index: Double): Watch = js.native
  def Add(Source: js.Any): Watch = js.native
  def Delete(): Unit = js.native
  def Item(Index: String): Watch = js.native
  def Item(Index: Double): Watch = js.native
  def _Default(Index: js.Any): Watch = js.native
}

