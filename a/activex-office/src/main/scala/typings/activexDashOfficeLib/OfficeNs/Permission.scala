package typings
package activexDashOfficeLib.OfficeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Permission extends js.Object {
  val Application: js.Any = js.native
  val Count: scala.Double = js.native
  val Creator: scala.Double = js.native
  var DocumentAuthor: java.lang.String = js.native
  var EnableTrustedBrowser: scala.Boolean = js.native
  var Enabled: scala.Boolean = js.native
  val Parent: js.Any = js.native
  val PermissionFromPolicy: scala.Boolean = js.native
  val PolicyDescription: java.lang.String = js.native
  val PolicyName: java.lang.String = js.native
  var RequestPermissionURL: java.lang.String = js.native
  var StoreLicenses: scala.Boolean = js.native
  def apply(Index: js.Any): UserPermission = js.native
  def Add(UserId: java.lang.String): UserPermission = js.native
  def Add(UserId: java.lang.String, Permission: MsoPermission): UserPermission = js.native
  def Add(UserId: java.lang.String, Permission: MsoPermission, ExpirationDate: stdLib.VarDate): UserPermission = js.native
  def ApplyPolicy(FileName: java.lang.String): scala.Unit = js.native
  def Item(Index: js.Any): UserPermission = js.native
  def RemoveAll(): scala.Unit = js.native
}

