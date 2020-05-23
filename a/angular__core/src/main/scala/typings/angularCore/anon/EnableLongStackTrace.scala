package typings.angularCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EnableLongStackTrace extends js.Object {
  var enableLongStackTrace: js.UndefOr[Boolean] = js.undefined
  var shouldCoalesceEventChangeDetection: js.UndefOr[Boolean] = js.undefined
}

object EnableLongStackTrace {
  @scala.inline
  def apply(
    enableLongStackTrace: js.UndefOr[Boolean] = js.undefined,
    shouldCoalesceEventChangeDetection: js.UndefOr[Boolean] = js.undefined
  ): EnableLongStackTrace = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enableLongStackTrace)) __obj.updateDynamic("enableLongStackTrace")(enableLongStackTrace.get.asInstanceOf[js.Any])
    if (!js.isUndefined(shouldCoalesceEventChangeDetection)) __obj.updateDynamic("shouldCoalesceEventChangeDetection")(shouldCoalesceEventChangeDetection.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[EnableLongStackTrace]
  }
}

