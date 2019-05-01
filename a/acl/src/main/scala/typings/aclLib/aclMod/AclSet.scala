package typings
package aclLib.aclMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AclSet extends js.Object {
  var allows: js.Array[AclAllow]
  var roles: strings
}

object AclSet {
  @scala.inline
  def apply(allows: js.Array[AclAllow], roles: strings): AclSet = {
    val __obj = js.Dynamic.literal(allows = allows, roles = roles.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AclSet]
  }
}

