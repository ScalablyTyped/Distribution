package typings.acl.aclMod

import typings.express.expressMod.RequestHandler
import typings.expressDashServeDashStaticDashCore.expressDashServeDashStaticDashCoreMod.ParamsDictionary
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Acl extends js.Object {
  def addRoleParents(role: String, parents: Values): typings.bluebird.bluebirdMod.^[Unit] = js.native
  def addRoleParents(role: String, parents: Values, cb: Callback): typings.bluebird.bluebirdMod.^[Unit] = js.native
  def addUserRoles(userId: Value, roles: strings): typings.bluebird.bluebirdMod.^[Unit] = js.native
  def addUserRoles(userId: Value, roles: strings, cb: Callback): typings.bluebird.bluebirdMod.^[Unit] = js.native
  def allow(aclSets: js.Array[AclSet]): typings.bluebird.bluebirdMod.^[Unit] = js.native
  def allow(aclSets: AclSet): typings.bluebird.bluebirdMod.^[Unit] = js.native
  def allow(roles: Values, resources: strings, permissions: strings): typings.bluebird.bluebirdMod.^[Unit] = js.native
  def allow(roles: Values, resources: strings, permissions: strings, cb: Callback): typings.bluebird.bluebirdMod.^[Unit] = js.native
  def allowedPermissions(userId: Value, resources: strings): typings.bluebird.bluebirdMod.^[Unit] = js.native
  def allowedPermissions(userId: Value, resources: strings, cb: AnyCallback): typings.bluebird.bluebirdMod.^[Unit] = js.native
  def areAnyRolesAllowed(roles: strings, resource: strings, permissions: strings): typings.bluebird.bluebirdMod.^[_] = js.native
  def areAnyRolesAllowed(roles: strings, resource: strings, permissions: strings, cb: AllowedCallback): typings.bluebird.bluebirdMod.^[_] = js.native
  def hasRole(userId: Value, role: String): typings.bluebird.bluebirdMod.^[Boolean] = js.native
  def hasRole(userId: Value, role: String, cb: js.Function2[/* err */ Error, /* isInRole */ Boolean, _]): typings.bluebird.bluebirdMod.^[Boolean] = js.native
  def isAllowed(userId: Value, resources: strings, permissions: strings): typings.bluebird.bluebirdMod.^[Boolean] = js.native
  def isAllowed(userId: Value, resources: strings, permissions: strings, cb: AllowedCallback): typings.bluebird.bluebirdMod.^[Boolean] = js.native
  def middleware(): RequestHandler[ParamsDictionary] = js.native
  def middleware(numPathComponents: Double): RequestHandler[ParamsDictionary] = js.native
  def middleware(numPathComponents: Double, userId: GetUserId): RequestHandler[ParamsDictionary] = js.native
  def middleware(numPathComponents: Double, userId: GetUserId, actions: strings): RequestHandler[ParamsDictionary] = js.native
  def middleware(numPathComponents: Double, userId: Value): RequestHandler[ParamsDictionary] = js.native
  def middleware(numPathComponents: Double, userId: Value, actions: strings): RequestHandler[ParamsDictionary] = js.native
  def permittedResources(roles: strings, permissions: strings): typings.bluebird.bluebirdMod.^[Unit] = js.native
  def permittedResources(roles: strings, permissions: strings, cb: Callback): typings.bluebird.bluebirdMod.^[Unit] = js.native
  def removeAllow(role: String, resources: strings, permissions: strings): typings.bluebird.bluebirdMod.^[Unit] = js.native
  def removeAllow(role: String, resources: strings, permissions: strings, cb: Callback): typings.bluebird.bluebirdMod.^[Unit] = js.native
  def removePermissions(role: String, resources: strings, permissions: strings): typings.bluebird.bluebirdMod.^[Unit] = js.native
  def removePermissions(role: String, resources: strings, permissions: strings, cb: Callback): typings.bluebird.bluebirdMod.^[Unit] = js.native
  def removeResource(resource: String): typings.bluebird.bluebirdMod.^[Unit] = js.native
  def removeResource(resource: String, cb: Callback): typings.bluebird.bluebirdMod.^[Unit] = js.native
  def removeRole(role: String): typings.bluebird.bluebirdMod.^[Unit] = js.native
  def removeRole(role: String, cb: Callback): typings.bluebird.bluebirdMod.^[Unit] = js.native
  def removeUserRoles(userId: Value, roles: strings): typings.bluebird.bluebirdMod.^[Unit] = js.native
  def removeUserRoles(userId: Value, roles: strings, cb: Callback): typings.bluebird.bluebirdMod.^[Unit] = js.native
  def roleUsers(role: Value): typings.bluebird.bluebirdMod.^[_] = js.native
  def roleUsers(role: Value, cb: js.Function2[/* err */ Error, /* users */ Values, _]): typings.bluebird.bluebirdMod.^[_] = js.native
  def userRoles(userId: Value): typings.bluebird.bluebirdMod.^[js.Array[String]] = js.native
  def userRoles(userId: Value, cb: js.Function2[/* err */ Error, /* roles */ js.Array[String], _]): typings.bluebird.bluebirdMod.^[js.Array[String]] = js.native
  def whatResources(roles: strings): typings.bluebird.bluebirdMod.^[_] = js.native
  def whatResources(roles: strings, cb: AnyCallback): typings.bluebird.bluebirdMod.^[_] = js.native
  def whatResources(roles: strings, permissions: strings): typings.bluebird.bluebirdMod.^[_] = js.native
  def whatResources(roles: strings, permissions: strings, cb: AnyCallback): typings.bluebird.bluebirdMod.^[_] = js.native
}

