package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AddIns extends js.Object {
  val Application: activexDashExcelLib.ExcelNs.Application = js.native
  val Count: scala.Double = js.native
  val Creator: XlCreator = js.native
  val Parent: js.Any = js.native
  def apply(Index: java.lang.String): AddIn = js.native
  def apply(Index: scala.Double): AddIn = js.native
  def Add(Filename: java.lang.String): AddIn = js.native
  def Add(Filename: java.lang.String, CopyFile: scala.Boolean): AddIn = js.native
  def Item(Index: java.lang.String): AddIn = js.native
  def Item(Index: scala.Double): AddIn = js.native
  def _Default(Index: java.lang.String): AddIn = js.native
  def _Default(Index: scala.Double): AddIn = js.native
}

