package typings.acl.aclMod

import typings.acl.Fn_AclSets
import typings.acl.Fn_Cb
import typings.bluebird.bluebirdMod.^
import typings.express.expressMod.RequestHandler
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Acl extends js.Object {
  @JSName("allow")
  var allow_Original: Fn_AclSets = js.native
  @JSName("whatResources")
  var whatResources_Original: Fn_Cb = js.native
  def addRoleParents(role: String, parents: Values): ^[Unit] = js.native
  def addRoleParents(role: String, parents: Values, cb: Callback): ^[Unit] = js.native
  def addUserRoles(userId: Value, roles: strings): ^[Unit] = js.native
  def addUserRoles(userId: Value, roles: strings, cb: Callback): ^[Unit] = js.native
  def allow(aclSets: js.Array[AclSet]): ^[Unit] = js.native
  def allow(aclSets: AclSet): ^[Unit] = js.native
  def allow(roles: Values, resources: strings, permissions: strings): ^[Unit] = js.native
  def allow(roles: Values, resources: strings, permissions: strings, cb: Callback): ^[Unit] = js.native
  def allowedPermissions(userId: Value, resources: strings): ^[Unit] = js.native
  def allowedPermissions(userId: Value, resources: strings, cb: AnyCallback): ^[Unit] = js.native
  def areAnyRolesAllowed(roles: strings, resource: strings, permissions: strings): ^[_] = js.native
  def areAnyRolesAllowed(roles: strings, resource: strings, permissions: strings, cb: AllowedCallback): ^[_] = js.native
  def hasRole(userId: Value, role: String): ^[Boolean] = js.native
  def hasRole(userId: Value, role: String, cb: js.Function2[/* err */ Error, /* isInRole */ Boolean, _]): ^[Boolean] = js.native
  def isAllowed(userId: Value, resources: strings, permissions: strings): ^[Boolean] = js.native
  def isAllowed(userId: Value, resources: strings, permissions: strings, cb: AllowedCallback): ^[Boolean] = js.native
  def middleware(): RequestHandler = js.native
  def middleware(numPathComponents: Double): RequestHandler = js.native
  def middleware(numPathComponents: Double, userId: GetUserId): RequestHandler = js.native
  def middleware(numPathComponents: Double, userId: GetUserId, actions: strings): RequestHandler = js.native
  def middleware(numPathComponents: Double, userId: Value): RequestHandler = js.native
  def middleware(numPathComponents: Double, userId: Value, actions: strings): RequestHandler = js.native
  def permittedResources(roles: strings, permissions: strings): ^[Unit] = js.native
  def permittedResources(roles: strings, permissions: strings, cb: Callback): ^[Unit] = js.native
  def removeAllow(role: String, resources: strings, permissions: strings): ^[Unit] = js.native
  def removeAllow(role: String, resources: strings, permissions: strings, cb: Callback): ^[Unit] = js.native
  def removePermissions(role: String, resources: strings, permissions: strings): ^[Unit] = js.native
  def removePermissions(role: String, resources: strings, permissions: strings, cb: Callback): ^[Unit] = js.native
  def removeResource(resource: String): ^[Unit] = js.native
  def removeResource(resource: String, cb: Callback): ^[Unit] = js.native
  def removeRole(role: String): ^[Unit] = js.native
  def removeRole(role: String, cb: Callback): ^[Unit] = js.native
  def removeUserRoles(userId: Value, roles: strings): ^[Unit] = js.native
  def removeUserRoles(userId: Value, roles: strings, cb: Callback): ^[Unit] = js.native
  def roleUsers(role: Value): ^[_] = js.native
  def roleUsers(role: Value, cb: js.Function2[/* err */ Error, /* users */ Values, _]): ^[_] = js.native
  def userRoles(userId: Value): ^[js.Array[String]] = js.native
  def userRoles(userId: Value, cb: js.Function2[/* err */ Error, /* roles */ js.Array[String], _]): ^[js.Array[String]] = js.native
  def whatResources(roles: strings): ^[_] = js.native
  def whatResources(roles: strings, cb: AnyCallback): ^[_] = js.native
  def whatResources(roles: strings, permissions: strings): ^[_] = js.native
  def whatResources(roles: strings, permissions: strings, cb: AnyCallback): ^[_] = js.native
}

