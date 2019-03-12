package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProtectedViewWindows extends js.Object {
  val Application: activexDashExcelLib.ExcelNs.Application = js.native
  val Count: scala.Double = js.native
  val Creator: XlCreator = js.native
  val Parent: js.Any = js.native
  def apply(Index: java.lang.String): ProtectedViewWindow = js.native
  def apply(Index: scala.Double): ProtectedViewWindow = js.native
  def Item(Index: java.lang.String): ProtectedViewWindow = js.native
  def Item(Index: scala.Double): ProtectedViewWindow = js.native
  def Open(Filename: java.lang.String): ProtectedViewWindow = js.native
  def Open(Filename: java.lang.String, Password: java.lang.String): ProtectedViewWindow = js.native
  def Open(Filename: java.lang.String, Password: java.lang.String, AddToMru: scala.Boolean): ProtectedViewWindow = js.native
  def Open(
    Filename: java.lang.String,
    Password: java.lang.String,
    AddToMru: scala.Boolean,
    RepairMode: scala.Boolean
  ): ProtectedViewWindow = js.native
  def _Default(Index: js.Any): ProtectedViewWindow = js.native
}

