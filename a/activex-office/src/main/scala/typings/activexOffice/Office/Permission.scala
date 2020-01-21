package typings.activexOffice.Office

import typings.std.VarDate
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Permission extends js.Object {
  val Application: js.Any = js.native
  val Count: Double = js.native
  val Creator: Double = js.native
  var DocumentAuthor: String = js.native
  var EnableTrustedBrowser: Boolean = js.native
  var Enabled: Boolean = js.native
  val Parent: js.Any = js.native
  val PermissionFromPolicy: Boolean = js.native
  val PolicyDescription: String = js.native
  val PolicyName: String = js.native
  var RequestPermissionURL: String = js.native
  var StoreLicenses: Boolean = js.native
  def apply(Index: js.Any): UserPermission = js.native
  def Add(UserId: String): UserPermission = js.native
  def Add(UserId: String, Permission: MsoPermission): UserPermission = js.native
  def Add(UserId: String, Permission: MsoPermission, ExpirationDate: VarDate): UserPermission = js.native
  def ApplyPolicy(FileName: String): Unit = js.native
  def Item(Index: js.Any): UserPermission = js.native
  def RemoveAll(): Unit = js.native
}

