package typings.androiduix.androidui.AndroidUI

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UIClient extends js.Object {
  var shouldShowAppClosed: js.UndefOr[js.Function1[/* androidUI */ typings.androiduix.androidui.AndroidUI, _]] = js.undefined
}

object UIClient {
  @scala.inline
  def apply(shouldShowAppClosed: /* androidUI */ typings.androiduix.androidui.AndroidUI => _ = null): UIClient = {
    val __obj = js.Dynamic.literal()
    if (shouldShowAppClosed != null) __obj.updateDynamic("shouldShowAppClosed")(js.Any.fromFunction1(shouldShowAppClosed))
    __obj.asInstanceOf[UIClient]
  }
}

