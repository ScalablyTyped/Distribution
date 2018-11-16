package typings
package activexDashInfopathLib.InfoPathNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("InfoPath.PermissionObject")
@js.native
class PermissionObject protected () extends js.Object {
  val Count: scala.Double = js.native
  var DocumentAuthor: java.lang.String = js.native
  var Enabled: scala.Boolean = js.native
  var `InfoPath.PermissionObject_typekey`: PermissionObject = js.native
  val PermissionFromPolicy: scala.Boolean = js.native
  val PolicyDescription: java.lang.String = js.native
  val PolicyName: java.lang.String = js.native
  var RequestPermissionURL: java.lang.String = js.native
  var StoreLicenses: scala.Boolean = js.native
  def Add(bstrUserId: java.lang.String): UserPermissionObject = js.native
  def Add(bstrUserId: java.lang.String, varPermission: js.Any): UserPermissionObject = js.native
  def Add(bstrUserId: java.lang.String, varPermission: js.Any, varExpirationDate: js.Any): UserPermissionObject = js.native
  def ApplyPolicy(bstrFileName: java.lang.String): scala.Unit = js.native
  def Item(varIndex: js.Any): UserPermissionObject = js.native
  def RemoveAll(): scala.Unit = js.native
}

