package typings
package asyncLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Error[E, T] extends js.Object {
  var error: js.UndefOr[E] = js.undefined
  var value: js.UndefOr[T] = js.undefined
}

object Anon_Error {
  @scala.inline
  def apply[E, T](error: E = null, value: T = null): Anon_Error[E, T] = {
    val __obj = js.Dynamic.literal()
    if (error != null) __obj.updateDynamic("error")(error.asInstanceOf[js.Any])
    if (value != null) __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Error[E, T]]
  }
}

