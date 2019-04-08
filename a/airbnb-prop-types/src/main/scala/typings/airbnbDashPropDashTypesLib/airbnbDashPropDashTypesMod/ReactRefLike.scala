package typings
package airbnbDashPropDashTypesLib.airbnbDashPropDashTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactRefLike[T] extends js.Object {
  val current: T | scala.Null
}

object ReactRefLike {
  @scala.inline
  def apply[T](current: T = null): ReactRefLike[T] = {
    val __obj = js.Dynamic.literal()
    if (current != null) __obj.updateDynamic("current")(current.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactRefLike[T]]
  }
}

