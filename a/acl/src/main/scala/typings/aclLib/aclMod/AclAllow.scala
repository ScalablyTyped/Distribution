package typings
package aclLib.aclMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AclAllow extends js.Object {
  var permissions: aclLib.strings
  var resources: aclLib.strings
}

object AclAllow {
  @scala.inline
  def apply(permissions: aclLib.strings, resources: aclLib.strings): AclAllow = {
    val __obj = js.Dynamic.literal(permissions = permissions.asInstanceOf[js.Any], resources = resources.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AclAllow]
  }
}

