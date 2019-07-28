package typings.audiosprite.audiospriteMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Logger extends js.Object {
  var debug: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.undefined
  var info: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.undefined
  var log: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.undefined
}

object Logger {
  @scala.inline
  def apply(
    debug: /* repeated */ js.Any => Unit = null,
    info: /* repeated */ js.Any => Unit = null,
    log: /* repeated */ js.Any => Unit = null
  ): Logger = {
    val __obj = js.Dynamic.literal()
    if (debug != null) __obj.updateDynamic("debug")(js.Any.fromFunction1(debug))
    if (info != null) __obj.updateDynamic("info")(js.Any.fromFunction1(info))
    if (log != null) __obj.updateDynamic("log")(js.Any.fromFunction1(log))
    __obj.asInstanceOf[Logger]
  }
}

