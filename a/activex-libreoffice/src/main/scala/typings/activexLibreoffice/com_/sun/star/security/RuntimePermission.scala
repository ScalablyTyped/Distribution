package typings.activexLibreoffice.com_.sun.star.security

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * This permission grants runtime access to some named functionality. A {@link RuntimePermission} contains a name (also referred to as a "target name")
  * but no actions list; you either have the named permission or you don't.
  * @since OOo 1.1.2
  */
trait RuntimePermission extends js.Object {
  /** name of permission */
  var Name: String
}

object RuntimePermission {
  @scala.inline
  def apply(Name: String): RuntimePermission = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[RuntimePermission]
  }
}

