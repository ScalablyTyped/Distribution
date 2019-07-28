package typings.activexDashExcel.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServerViewableItems extends js.Object {
  val Application: typings.activexDashExcel.ExcelNs.Application = js.native
  val Count: Double = js.native
  val Creator: XlCreator = js.native
  val Parent: js.Any = js.native
  def apply(Index: Double): js.Any = js.native
  def Add(Obj: js.Any): js.Any = js.native
  def Delete(Index: Double): Unit = js.native
  def DeleteAll(): Unit = js.native
  def Item(Index: Double): js.Any = js.native
  def _Default(Index: js.Any): js.Any = js.native
}

