package typings
package antdLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Direction extends js.Object {
  var direction: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Direction {
  @scala.inline
  def apply(direction: java.lang.String = null): Anon_Direction = {
    val __obj = js.Dynamic.literal()
    if (direction != null) __obj.updateDynamic("direction")(direction)
    __obj.asInstanceOf[Anon_Direction]
  }
}

