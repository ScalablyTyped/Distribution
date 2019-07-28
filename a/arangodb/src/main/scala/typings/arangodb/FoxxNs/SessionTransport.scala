package typings.arangodb.FoxxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SessionTransport extends js.Object {
  var clear: js.UndefOr[js.Function1[/* res */ Response, Unit]] = js.undefined
  var get: js.UndefOr[js.Function1[/* req */ Request, String | Null]] = js.undefined
  var set: js.UndefOr[js.Function2[/* res */ Response, /* sid */ String, Unit]] = js.undefined
}

object SessionTransport {
  @scala.inline
  def apply(
    clear: /* res */ Response => Unit = null,
    get: /* req */ Request => String | Null = null,
    set: (/* res */ Response, /* sid */ String) => Unit = null
  ): SessionTransport = {
    val __obj = js.Dynamic.literal()
    if (clear != null) __obj.updateDynamic("clear")(js.Any.fromFunction1(clear))
    if (get != null) __obj.updateDynamic("get")(js.Any.fromFunction1(get))
    if (set != null) __obj.updateDynamic("set")(js.Any.fromFunction2(set))
    __obj.asInstanceOf[SessionTransport]
  }
}

