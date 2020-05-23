package typings.airbnbPropTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReactRefLike[T] extends js.Object {
  val current: T | Null
}

object ReactRefLike {
  @scala.inline
  def apply[T](current: T = null): ReactRefLike[T] = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReactRefLike[T]]
  }
}

