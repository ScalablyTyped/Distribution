package typings
package aclLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_AclSets extends js.Object {
  def apply(aclSets: aclLib.aclMod.AclStaticNs.AclSet): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  def apply(aclSets: js.Array[aclLib.aclMod.AclStaticNs.AclSet]): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  def apply(roles: Values, resources: strings, permissions: strings): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
  def apply(roles: Values, resources: strings, permissions: strings, cb: Callback): bluebirdLib.bluebirdMod.namespaced[scala.Unit] = js.native
}

