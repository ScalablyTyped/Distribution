package typings.apolloClient.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Data[T] extends js.Object {
  var data: js.UndefOr[T] = js.undefined
  var partial: Boolean
}

object Data {
  @scala.inline
  def apply[T](partial: Boolean, data: T = null): Data[T] = {
    val __obj = js.Dynamic.literal(partial = partial.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.asInstanceOf[Data[T]]
  }
}

