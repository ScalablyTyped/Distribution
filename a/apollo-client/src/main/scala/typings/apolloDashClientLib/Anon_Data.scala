package typings
package apolloDashClientLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Data[T] extends js.Object {
  var data: js.UndefOr[T] = js.undefined
  var partial: scala.Boolean
}

object Anon_Data {
  @scala.inline
  def apply[T](partial: scala.Boolean, data: T = null): Anon_Data[T] = {
    val __obj = js.Dynamic.literal(partial = partial)
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Data[T]]
  }
}

