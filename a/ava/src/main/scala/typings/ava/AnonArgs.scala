package typings.ava

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonArgs[Args /* <: js.Array[_] */] extends js.Object {
  var title: js.UndefOr[js.Function2[/* providedTitle */ js.UndefOr[String], /* args */ Args, String]] = js.undefined
}

object AnonArgs {
  @scala.inline
  def apply[Args /* <: js.Array[_] */](title: (/* providedTitle */ js.UndefOr[String], /* args */ Args) => String = null): AnonArgs[Args] = {
    val __obj = js.Dynamic.literal()
    if (title != null) __obj.updateDynamic("title")(js.Any.fromFunction2(title))
    __obj.asInstanceOf[AnonArgs[Args]]
  }
}

