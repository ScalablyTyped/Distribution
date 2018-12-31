package typings
package avoscloudDashSdkLib.avoscloudDashSdkMod.AVNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Creates a new ACL.
  * If no argument is given, the ACL has no permissions for anyone.
  * If the argument is a AV.User, the ACL will have read and write
  *   permission for only that user.
  * If the argument is any other JSON object, that object will be interpretted
  *   as a serialized ACL created with toJSON().
  * @see AV.Object#setACL
  * @class
  *
  * <p>An ACL, or Access Control List can be added to any
  * <code>AV.Object</code> to restrict access to only a subset of users
  * of your application.</p>
  */
@js.native
trait ACL extends BaseObject {
  var permissionsById: js.Any = js.native
  def getPublicReadAccess(): scala.Boolean = js.native
  def getPublicWriteAccess(): scala.Boolean = js.native
  def getReadAccess(userId: User): scala.Boolean = js.native
  def getReadAccess(userId: java.lang.String): scala.Boolean = js.native
  def getRoleReadAccess(role: Role): scala.Boolean = js.native
  def getRoleReadAccess(role: java.lang.String): scala.Boolean = js.native
  def getRoleWriteAccess(role: Role): scala.Boolean = js.native
  def getRoleWriteAccess(role: java.lang.String): scala.Boolean = js.native
  def getWriteAccess(userId: User): scala.Boolean = js.native
  def getWriteAccess(userId: java.lang.String): scala.Boolean = js.native
  def setPublicReadAccess(allowed: scala.Boolean): scala.Unit = js.native
  def setPublicWriteAccess(allowed: scala.Boolean): scala.Unit = js.native
  def setReadAccess(userId: User, allowed: scala.Boolean): scala.Unit = js.native
  def setReadAccess(userId: java.lang.String, allowed: scala.Boolean): scala.Unit = js.native
  def setRoleReadAccess(role: Role, allowed: scala.Boolean): scala.Unit = js.native
  def setRoleReadAccess(role: java.lang.String, allowed: scala.Boolean): scala.Unit = js.native
  def setRoleWriteAccess(role: Role, allowed: scala.Boolean): scala.Unit = js.native
  def setRoleWriteAccess(role: java.lang.String, allowed: scala.Boolean): scala.Unit = js.native
  def setWriteAccess(userId: User, allowed: scala.Boolean): scala.Unit = js.native
  def setWriteAccess(userId: java.lang.String, allowed: scala.Boolean): scala.Unit = js.native
}

