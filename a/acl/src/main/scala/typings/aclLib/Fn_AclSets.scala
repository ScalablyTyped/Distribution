package typings
package aclLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_AclSets extends js.Object {
  def apply(aclSets: aclLib.aclMod.AclSet): bluebirdLib.bluebirdMod.^[scala.Unit] = js.native
  def apply(aclSets: js.Array[aclLib.aclMod.AclSet]): bluebirdLib.bluebirdMod.^[scala.Unit] = js.native
  def apply(roles: aclLib.aclMod.Values, resources: aclLib.aclMod.strings, permissions: aclLib.aclMod.strings): bluebirdLib.bluebirdMod.^[scala.Unit] = js.native
  def apply(
    roles: aclLib.aclMod.Values,
    resources: aclLib.aclMod.strings,
    permissions: aclLib.aclMod.strings,
    cb: aclLib.aclMod.Callback
  ): bluebirdLib.bluebirdMod.^[scala.Unit] = js.native
}

