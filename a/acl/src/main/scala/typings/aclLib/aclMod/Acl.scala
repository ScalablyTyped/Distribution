package typings
package aclLib.aclMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Acl extends js.Object {
  @JSName("allow")
  var allow_Original: aclLib.Anon_AclSets = js.native
  @JSName("whatResources")
  var whatResources_Original: aclLib.Anon_Cb = js.native
  def addRoleParents(role: java.lang.String, parents: Values): bluebirdLib.bluebirdMod.^[scala.Unit] = js.native
  def addRoleParents(role: java.lang.String, parents: Values, cb: Callback): bluebirdLib.bluebirdMod.^[scala.Unit] = js.native
  def addUserRoles(userId: Value, roles: strings): bluebirdLib.bluebirdMod.^[scala.Unit] = js.native
  def addUserRoles(userId: Value, roles: strings, cb: Callback): bluebirdLib.bluebirdMod.^[scala.Unit] = js.native
  def allow(aclSets: AclSet): bluebirdLib.bluebirdMod.^[scala.Unit] = js.native
  def allow(aclSets: js.Array[AclSet]): bluebirdLib.bluebirdMod.^[scala.Unit] = js.native
  def allow(roles: Values, resources: strings, permissions: strings): bluebirdLib.bluebirdMod.^[scala.Unit] = js.native
  def allow(roles: Values, resources: strings, permissions: strings, cb: Callback): bluebirdLib.bluebirdMod.^[scala.Unit] = js.native
  def allowedPermissions(userId: Value, resources: strings): bluebirdLib.bluebirdMod.^[scala.Unit] = js.native
  def allowedPermissions(userId: Value, resources: strings, cb: AnyCallback): bluebirdLib.bluebirdMod.^[scala.Unit] = js.native
  def areAnyRolesAllowed(roles: strings, resource: strings, permissions: strings): bluebirdLib.bluebirdMod.^[_] = js.native
  def areAnyRolesAllowed(roles: strings, resource: strings, permissions: strings, cb: AllowedCallback): bluebirdLib.bluebirdMod.^[_] = js.native
  def hasRole(userId: Value, role: java.lang.String): bluebirdLib.bluebirdMod.^[scala.Boolean] = js.native
  def hasRole(
    userId: Value,
    role: java.lang.String,
    cb: js.Function2[/* err */ stdLib.Error, /* isInRole */ scala.Boolean, _]
  ): bluebirdLib.bluebirdMod.^[scala.Boolean] = js.native
  def isAllowed(userId: Value, resources: strings, permissions: strings): bluebirdLib.bluebirdMod.^[scala.Boolean] = js.native
  def isAllowed(userId: Value, resources: strings, permissions: strings, cb: AllowedCallback): bluebirdLib.bluebirdMod.^[scala.Boolean] = js.native
  def middleware(): expressLib.expressMod.RequestHandler = js.native
  def middleware(numPathComponents: scala.Double): expressLib.expressMod.RequestHandler = js.native
  def middleware(numPathComponents: scala.Double, userId: GetUserId): expressLib.expressMod.RequestHandler = js.native
  def middleware(numPathComponents: scala.Double, userId: GetUserId, actions: strings): expressLib.expressMod.RequestHandler = js.native
  def middleware(numPathComponents: scala.Double, userId: Value): expressLib.expressMod.RequestHandler = js.native
  def middleware(numPathComponents: scala.Double, userId: Value, actions: strings): expressLib.expressMod.RequestHandler = js.native
  def permittedResources(roles: strings, permissions: strings): bluebirdLib.bluebirdMod.^[scala.Unit] = js.native
  def permittedResources(roles: strings, permissions: strings, cb: Callback): bluebirdLib.bluebirdMod.^[scala.Unit] = js.native
  def removeAllow(role: java.lang.String, resources: strings, permissions: strings): bluebirdLib.bluebirdMod.^[scala.Unit] = js.native
  def removeAllow(role: java.lang.String, resources: strings, permissions: strings, cb: Callback): bluebirdLib.bluebirdMod.^[scala.Unit] = js.native
  def removePermissions(role: java.lang.String, resources: strings, permissions: strings): bluebirdLib.bluebirdMod.^[scala.Unit] = js.native
  def removePermissions(role: java.lang.String, resources: strings, permissions: strings, cb: Callback): bluebirdLib.bluebirdMod.^[scala.Unit] = js.native
  def removeResource(resource: java.lang.String): bluebirdLib.bluebirdMod.^[scala.Unit] = js.native
  def removeResource(resource: java.lang.String, cb: Callback): bluebirdLib.bluebirdMod.^[scala.Unit] = js.native
  def removeRole(role: java.lang.String): bluebirdLib.bluebirdMod.^[scala.Unit] = js.native
  def removeRole(role: java.lang.String, cb: Callback): bluebirdLib.bluebirdMod.^[scala.Unit] = js.native
  def removeUserRoles(userId: Value, roles: strings): bluebirdLib.bluebirdMod.^[scala.Unit] = js.native
  def removeUserRoles(userId: Value, roles: strings, cb: Callback): bluebirdLib.bluebirdMod.^[scala.Unit] = js.native
  def roleUsers(role: Value): bluebirdLib.bluebirdMod.^[_] = js.native
  def roleUsers(role: Value, cb: js.Function2[/* err */ stdLib.Error, /* users */ Values, _]): bluebirdLib.bluebirdMod.^[_] = js.native
  def userRoles(userId: Value): bluebirdLib.bluebirdMod.^[js.Array[java.lang.String]] = js.native
  def userRoles(userId: Value, cb: js.Function2[/* err */ stdLib.Error, /* roles */ js.Array[java.lang.String], _]): bluebirdLib.bluebirdMod.^[js.Array[java.lang.String]] = js.native
  def whatResources(roles: strings): bluebirdLib.bluebirdMod.^[_] = js.native
  def whatResources(roles: strings, cb: AnyCallback): bluebirdLib.bluebirdMod.^[_] = js.native
  def whatResources(roles: strings, permissions: strings): bluebirdLib.bluebirdMod.^[_] = js.native
  def whatResources(roles: strings, permissions: strings, cb: AnyCallback): bluebirdLib.bluebirdMod.^[_] = js.native
}

