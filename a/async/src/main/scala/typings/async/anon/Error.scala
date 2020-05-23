package typings.async.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Error[E, T] extends js.Object {
  var error: js.UndefOr[E] = js.undefined
  var value: js.UndefOr[T] = js.undefined
}

object Error {
  @scala.inline
  def apply[E, T](error: E = null, value: T = null): Error[E, T] = {
    val __obj = js.Dynamic.literal()
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Error[E, T]]
  }
}

