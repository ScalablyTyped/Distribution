package typings
package audiospriteLib.audiospriteMod.audiospriteNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Logger extends js.Object {
  var debug: js.UndefOr[js.Function1[/* repeated */ js.Any, scala.Unit]] = js.undefined
  var info: js.UndefOr[js.Function1[/* repeated */ js.Any, scala.Unit]] = js.undefined
  var log: js.UndefOr[js.Function1[/* repeated */ js.Any, scala.Unit]] = js.undefined
}

object Logger {
  @scala.inline
  def apply(
    debug: js.Function1[/* repeated */ js.Any, scala.Unit] = null,
    info: js.Function1[/* repeated */ js.Any, scala.Unit] = null,
    log: js.Function1[/* repeated */ js.Any, scala.Unit] = null
  ): Logger = {
    val __obj = js.Dynamic.literal()
    if (debug != null) __obj.updateDynamic("debug")(debug)
    if (info != null) __obj.updateDynamic("info")(info)
    if (log != null) __obj.updateDynamic("log")(log)
    __obj.asInstanceOf[Logger]
  }
}

