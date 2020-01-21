package typings.activexExcel.Excel

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line:interface-name
@js.native
trait IconSet extends js.Object {
  val Application: typings.activexExcel.Excel.Application = js.native
  val Count: Double = js.native
  val Creator: XlCreator = js.native
  val ID: XlIconSet = js.native
  val Parent: js.Any = js.native
  def apply(Index: Double): Icon = js.native
  def Item(Index: Double): Icon = js.native
  def _Default(Index: js.Any): Icon = js.native
}

