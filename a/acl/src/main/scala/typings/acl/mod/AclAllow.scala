package typings.acl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AclAllow extends js.Object {
  var permissions: strings
  var resources: strings
}

object AclAllow {
  @scala.inline
  def apply(permissions: strings, resources: strings): AclAllow = {
    val __obj = js.Dynamic.literal(permissions = permissions.asInstanceOf[js.Any], resources = resources.asInstanceOf[js.Any])
    __obj.asInstanceOf[AclAllow]
  }
}

