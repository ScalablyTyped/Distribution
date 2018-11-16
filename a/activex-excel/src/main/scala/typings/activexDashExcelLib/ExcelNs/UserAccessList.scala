package typings
package activexDashExcelLib.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserAccessList extends js.Object {
  val Count: scala.Double = js.native
  def apply(Index: java.lang.String): UserAccess = js.native
  def apply(Index: scala.Double): UserAccess = js.native
  def Add(Name: java.lang.String, AllowEdit: scala.Boolean): UserAccess = js.native
  def DeleteAll(): scala.Unit = js.native
  def Item(Index: java.lang.String): UserAccess = js.native
  def Item(Index: scala.Double): UserAccess = js.native
  def _Default(Index: js.Any): UserAccess = js.native
}

