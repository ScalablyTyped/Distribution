package typings
package aclLib.aclMod.AclStaticNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AclSet extends js.Object {
  var allows: js.Array[AclAllow]
  var roles: aclLib.strings
}

object AclSet {
  @scala.inline
  def apply(allows: js.Array[AclAllow], roles: aclLib.strings): AclSet = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("allows")(allows)
    __obj.updateDynamic("roles")(roles.asInstanceOf[js.Any])
    __obj.asInstanceOf[AclSet]
  }
}

