package typings.angularCore

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonProviders extends js.Object {
  var providers: js.UndefOr[js.Array[_]] = js.undefined
  var useJit: js.UndefOr[Boolean] = js.undefined
}

object AnonProviders {
  @scala.inline
  def apply(providers: js.Array[_] = null, useJit: js.UndefOr[Boolean] = js.undefined): AnonProviders = {
    val __obj = js.Dynamic.literal()
    if (providers != null) __obj.updateDynamic("providers")(providers.asInstanceOf[js.Any])
    if (!js.isUndefined(useJit)) __obj.updateDynamic("useJit")(useJit.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonProviders]
  }
}

