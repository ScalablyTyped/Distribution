package typings
package awsDashSdkLib.libConfigMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Logger extends js.Object {
  var log: js.UndefOr[js.Function1[/* repeated */ js.Any, scala.Unit]] = js.undefined
  var write: js.UndefOr[
    js.Function3[
      /* chunk */ js.Any, 
      /* encoding */ js.UndefOr[java.lang.String], 
      /* callback */ js.UndefOr[js.Function0[scala.Unit]], 
      scala.Unit
    ]
  ] = js.undefined
}

object Logger {
  @scala.inline
  def apply(
    log: /* repeated */ js.Any => scala.Unit = null,
    write: (/* chunk */ js.Any, /* encoding */ js.UndefOr[java.lang.String], /* callback */ js.UndefOr[js.Function0[scala.Unit]]) => scala.Unit = null
  ): Logger = {
    val __obj = js.Dynamic.literal()
    if (log != null) __obj.updateDynamic("log")(js.Any.fromFunction1(log))
    if (write != null) __obj.updateDynamic("write")(js.Any.fromFunction3(write))
    __obj.asInstanceOf[Logger]
  }
}

