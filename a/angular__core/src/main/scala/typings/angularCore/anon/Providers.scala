package typings.angularCore.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Providers extends js.Object {
  var providers: js.UndefOr[js.Array[_]] = js.undefined
  var useJit: js.UndefOr[Boolean] = js.undefined
}

object Providers {
  @scala.inline
  def apply(providers: js.Array[_] = null, useJit: js.UndefOr[Boolean] = js.undefined): Providers = {
    val __obj = js.Dynamic.literal()
    if (providers != null) __obj.updateDynamic("providers")(providers.asInstanceOf[js.Any])
    if (!js.isUndefined(useJit)) __obj.updateDynamic("useJit")(useJit.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Providers]
  }
}

