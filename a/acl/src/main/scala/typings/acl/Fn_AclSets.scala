package typings.acl

import typings.acl.aclMod.AclSet
import typings.acl.aclMod.Callback
import typings.acl.aclMod.Values
import typings.acl.aclMod.strings
import typings.bluebird.bluebirdMod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_AclSets extends js.Object {
  def apply(aclSets: js.Array[AclSet]): ^[Unit] = js.native
  def apply(aclSets: AclSet): ^[Unit] = js.native
  def apply(roles: Values, resources: strings, permissions: strings): ^[Unit] = js.native
  def apply(roles: Values, resources: strings, permissions: strings, cb: Callback): ^[Unit] = js.native
}

