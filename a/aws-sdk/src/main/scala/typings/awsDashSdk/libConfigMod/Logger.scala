package typings.awsDashSdk.libConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Logger extends js.Object {
  var log: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.native
  var write: js.UndefOr[
    js.Function3[
      /* chunk */ js.Any, 
      /* encoding */ js.UndefOr[String], 
      /* callback */ js.UndefOr[js.Function0[Unit]], 
      Unit
    ]
  ] = js.native
}

object Logger {
  @scala.inline
  def apply(
    log: /* repeated */ js.Any => Unit = null,
    write: (/* chunk */ js.Any, /* encoding */ js.UndefOr[String], /* callback */ js.UndefOr[js.Function0[Unit]]) => Unit = null
  ): Logger = {
    val __obj = js.Dynamic.literal()
    if (log != null) __obj.updateDynamic("log")(js.Any.fromFunction1(log))
    if (write != null) __obj.updateDynamic("write")(js.Any.fromFunction3(write))
    __obj.asInstanceOf[Logger]
  }
}

