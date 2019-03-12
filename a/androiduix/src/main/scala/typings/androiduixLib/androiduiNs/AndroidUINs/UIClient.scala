package typings
package androiduixLib.androiduiNs.AndroidUINs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UIClient extends js.Object {
  var shouldShowAppClosed: js.UndefOr[js.Function1[/* androidUI */ androiduixLib.androiduiNs.AndroidUI, _]] = js.undefined
}

object UIClient {
  @scala.inline
  def apply(shouldShowAppClosed: /* androidUI */ androiduixLib.androiduiNs.AndroidUI => _ = null): UIClient = {
    val __obj = js.Dynamic.literal()
    if (shouldShowAppClosed != null) __obj.updateDynamic("shouldShowAppClosed")(js.Any.fromFunction1(shouldShowAppClosed))
    __obj.asInstanceOf[UIClient]
  }
}

