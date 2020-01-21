package typings.apolloClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonData[T] extends js.Object {
  var data: js.UndefOr[T] = js.undefined
  var partial: Boolean
}

object AnonData {
  @scala.inline
  def apply[T](partial: Boolean, data: T = null): AnonData[T] = {
    val __obj = js.Dynamic.literal(partial = partial.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonData[T]]
  }
}

