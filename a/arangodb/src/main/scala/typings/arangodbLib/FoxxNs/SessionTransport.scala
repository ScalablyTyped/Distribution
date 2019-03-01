package typings
package arangodbLib.FoxxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SessionTransport extends js.Object {
  var clear: js.UndefOr[js.Function1[/* res */ Response, scala.Unit]] = js.undefined
  var get: js.UndefOr[js.Function1[/* req */ Request, java.lang.String | scala.Null]] = js.undefined
  var set: js.UndefOr[js.Function2[/* res */ Response, /* sid */ java.lang.String, scala.Unit]] = js.undefined
}

object SessionTransport {
  @scala.inline
  def apply(
    clear: js.Function1[/* res */ Response, scala.Unit] = null,
    get: js.Function1[/* req */ Request, java.lang.String | scala.Null] = null,
    set: js.Function2[/* res */ Response, /* sid */ java.lang.String, scala.Unit] = null
  ): SessionTransport = {
    val __obj = js.Dynamic.literal()
    if (clear != null) __obj.updateDynamic("clear")(clear)
    if (get != null) __obj.updateDynamic("get")(get)
    if (set != null) __obj.updateDynamic("set")(set)
    __obj.asInstanceOf[SessionTransport]
  }
}

