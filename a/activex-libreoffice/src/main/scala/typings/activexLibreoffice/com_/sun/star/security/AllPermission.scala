package typings.activexLibreoffice.com_.sun.star.security

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The {@link AllPermission} is a permission that implies all other permissions.
  * @since OOo 1.1.2
  */
trait AllPermission extends js.Object {
  var dummy: Double
}

object AllPermission {
  @scala.inline
  def apply(dummy: Double): AllPermission = {
    val __obj = js.Dynamic.literal(dummy = dummy.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllPermission]
  }
}

