package typings
package aclLib.aclMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Acl extends js.Object {
  @JSName("allow")
  var allow_Original: aclLib.Anon_RolesResources = js.native
  @JSName("whatResources")
  var whatResources_Original: aclLib.Anon_Roles = js.native
  def addRoleParents(role: java.lang.String, parents: aclLib.Values): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  def addRoleParents(role: java.lang.String, parents: aclLib.Values, cb: aclLib.Callback): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  def addUserRoles(userId: aclLib.Value, roles: aclLib.strings): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  def addUserRoles(userId: aclLib.Value, roles: aclLib.strings, cb: aclLib.Callback): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  def allow(aclSets: AclSet): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  def allow(aclSets: js.Array[AclSet]): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  def allow(roles: aclLib.Values, resources: aclLib.strings, permissions: aclLib.strings): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  def allow(roles: aclLib.Values, resources: aclLib.strings, permissions: aclLib.strings, cb: aclLib.Callback): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  def allowedPermissions(userId: aclLib.Value, resources: aclLib.strings): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  def allowedPermissions(userId: aclLib.Value, resources: aclLib.strings, cb: aclLib.AnyCallback): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  def areAnyRolesAllowed(roles: aclLib.strings, resource: aclLib.strings, permissions: aclLib.strings): bluebirdLib.bluebirdMod.namespaced[_] = js.native
  def areAnyRolesAllowed(
    roles: aclLib.strings,
    resource: aclLib.strings,
    permissions: aclLib.strings,
    cb: aclLib.AllowedCallback
  ): bluebirdLib.bluebirdMod.namespaced[_] = js.native
  def hasRole(userId: aclLib.Value, role: java.lang.String): bluebirdLib.bluebirdMod.namespaced[scala.Boolean] = js.native
  def hasRole(
    userId: aclLib.Value,
    role: java.lang.String,
    cb: js.Function2[/* err */ nodeLib.Error, /* isInRole */ scala.Boolean, _]
  ): bluebirdLib.bluebirdMod.namespaced[scala.Boolean] = js.native
  def isAllowed(userId: aclLib.Value, resources: aclLib.strings, permissions: aclLib.strings): bluebirdLib.bluebirdMod.namespaced[scala.Boolean] = js.native
  def isAllowed(
    userId: aclLib.Value,
    resources: aclLib.strings,
    permissions: aclLib.strings,
    cb: aclLib.AllowedCallback
  ): bluebirdLib.bluebirdMod.namespaced[scala.Boolean] = js.native
  def middleware(): expressLib.expressMod.eNs.RequestHandler = js.native
  def middleware(numPathComponents: scala.Double): expressLib.expressMod.eNs.RequestHandler = js.native
  def middleware(numPathComponents: scala.Double, userId: aclLib.GetUserId): expressLib.expressMod.eNs.RequestHandler = js.native
  def middleware(numPathComponents: scala.Double, userId: aclLib.GetUserId, actions: aclLib.strings): expressLib.expressMod.eNs.RequestHandler = js.native
  def middleware(numPathComponents: scala.Double, userId: aclLib.Value): expressLib.expressMod.eNs.RequestHandler = js.native
  def middleware(numPathComponents: scala.Double, userId: aclLib.Value, actions: aclLib.strings): expressLib.expressMod.eNs.RequestHandler = js.native
  def permittedResources(roles: aclLib.strings, permissions: aclLib.strings): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  def permittedResources(roles: aclLib.strings, permissions: aclLib.strings, cb: js.Function): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  def removeAllow(role: java.lang.String, resources: aclLib.strings, permissions: aclLib.strings): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  def removeAllow(
    role: java.lang.String,
    resources: aclLib.strings,
    permissions: aclLib.strings,
    cb: aclLib.Callback
  ): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  def removePermissions(role: java.lang.String, resources: aclLib.strings, permissions: aclLib.strings): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  def removePermissions(role: java.lang.String, resources: aclLib.strings, permissions: aclLib.strings, cb: js.Function): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  def removeResource(resource: java.lang.String): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  def removeResource(resource: java.lang.String, cb: aclLib.Callback): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  def removeRole(role: java.lang.String): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  def removeRole(role: java.lang.String, cb: aclLib.Callback): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  def removeUserRoles(userId: aclLib.Value, roles: aclLib.strings): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  def removeUserRoles(userId: aclLib.Value, roles: aclLib.strings, cb: aclLib.Callback): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  def roleUsers(role: aclLib.Value): bluebirdLib.bluebirdMod.namespaced[_] = js.native
  def roleUsers(role: aclLib.Value, cb: js.Function2[/* err */ nodeLib.Error, /* users */ aclLib.Values, _]): bluebirdLib.bluebirdMod.namespaced[_] = js.native
  def userRoles(userId: aclLib.Value): bluebirdLib.bluebirdMod.namespaced[js.Array[java.lang.String]] = js.native
  def userRoles(
    userId: aclLib.Value,
    cb: js.Function2[/* err */ nodeLib.Error, /* roles */ js.Array[java.lang.String], _]
  ): bluebirdLib.bluebirdMod.namespaced[js.Array[java.lang.String]] = js.native
  def whatResources(roles: aclLib.strings): bluebirdLib.bluebirdMod.namespaced[_] = js.native
  def whatResources(roles: aclLib.strings, cb: aclLib.AnyCallback): bluebirdLib.bluebirdMod.namespaced[_] = js.native
  def whatResources(roles: aclLib.strings, permissions: aclLib.strings): bluebirdLib.bluebirdMod.namespaced[_] = js.native
  def whatResources(roles: aclLib.strings, permissions: aclLib.strings, cb: aclLib.AnyCallback): bluebirdLib.bluebirdMod.namespaced[_] = js.native
}

