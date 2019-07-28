package typings.activexDashInfopath.InfoPathNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("InfoPath.PermissionObject")
@js.native
class PermissionObject protected () extends js.Object {
  val Count: Double = js.native
  var DocumentAuthor: String = js.native
  var Enabled: Boolean = js.native
  var `InfoPath.PermissionObject_typekey`: PermissionObject = js.native
  val PermissionFromPolicy: Boolean = js.native
  val PolicyDescription: String = js.native
  val PolicyName: String = js.native
  var RequestPermissionURL: String = js.native
  var StoreLicenses: Boolean = js.native
  def Add(bstrUserId: String): UserPermissionObject = js.native
  def Add(bstrUserId: String, varPermission: js.Any): UserPermissionObject = js.native
  def Add(bstrUserId: String, varPermission: js.Any, varExpirationDate: js.Any): UserPermissionObject = js.native
  def ApplyPolicy(bstrFileName: String): Unit = js.native
  def Item(varIndex: js.Any): UserPermissionObject = js.native
  def RemoveAll(): Unit = js.native
}

