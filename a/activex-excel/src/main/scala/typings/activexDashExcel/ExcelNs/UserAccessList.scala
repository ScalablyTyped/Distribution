package typings.activexDashExcel.ExcelNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UserAccessList extends js.Object {
  val Count: Double = js.native
  def apply(Index: String): UserAccess = js.native
  def apply(Index: Double): UserAccess = js.native
  def Add(Name: String, AllowEdit: Boolean): UserAccess = js.native
  def DeleteAll(): Unit = js.native
  def Item(Index: String): UserAccess = js.native
  def Item(Index: Double): UserAccess = js.native
  def _Default(Index: js.Any): UserAccess = js.native
}

