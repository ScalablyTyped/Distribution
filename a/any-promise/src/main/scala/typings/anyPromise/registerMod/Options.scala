package typings.anyPromise.registerMod

import typings.anyPromise.TypeofPromise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var Promise: js.UndefOr[TypeofPromise] = js.undefined
  var global: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(Promise: TypeofPromise = null, global: js.UndefOr[Boolean] = js.undefined): Options = {
    val __obj = js.Dynamic.literal()
    if (Promise != null) __obj.updateDynamic("Promise")(Promise.asInstanceOf[js.Any])
    if (!js.isUndefined(global)) __obj.updateDynamic("global")(global.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

