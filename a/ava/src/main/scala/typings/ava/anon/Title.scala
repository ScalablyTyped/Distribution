package typings.ava.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Title[Args /* <: js.Array[_] */] extends js.Object {
  var title: js.UndefOr[js.Function2[/* providedTitle */ js.UndefOr[String], /* args */ Args, String]] = js.undefined
}

object Title {
  @scala.inline
  def apply[/* <: js.Array[_] */ Args](title: (/* providedTitle */ js.UndefOr[String], /* args */ Args) => String = null): Title[Args] = {
    val __obj = js.Dynamic.literal()
    if (title != null) __obj.updateDynamic("title")(js.Any.fromFunction2(title))
    __obj.asInstanceOf[Title[Args]]
  }
}

