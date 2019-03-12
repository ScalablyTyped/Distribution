package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Parameters extends js.Object {
  val Application: activexDashExcelLib.ExcelNs.Application = js.native
  val Count: scala.Double = js.native
  val Creator: XlCreator = js.native
  val Parent: js.Any = js.native
  def apply(Index: java.lang.String): Parameter = js.native
  def apply(Index: scala.Double): Parameter = js.native
  def Add(Name: java.lang.String): Parameter = js.native
  def Add(Name: java.lang.String, iDataType: XlParameterDataType): Parameter = js.native
  def Delete(): scala.Unit = js.native
  def Item(Index: java.lang.String): Parameter = js.native
  def Item(Index: scala.Double): Parameter = js.native
  def _Default(Index: js.Any): Parameter = js.native
}

