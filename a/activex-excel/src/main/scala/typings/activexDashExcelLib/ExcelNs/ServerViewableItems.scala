package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ServerViewableItems extends js.Object {
  val Application: Application = js.native
  val Count: scala.Double = js.native
  val Creator: XlCreator = js.native
  val Parent: js.Any = js.native
  def apply(Index: scala.Double): js.Any = js.native
  def Add(Obj: js.Any): js.Any = js.native
  def Delete(Index: scala.Double): scala.Unit = js.native
  def DeleteAll(): scala.Unit = js.native
  def Item(Index: scala.Double): js.Any = js.native
  def _Default(Index: js.Any): js.Any = js.native
}

