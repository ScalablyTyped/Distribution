package typings.adone.adoneNs.utilNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeysOptions extends js.Object {
  var all: js.UndefOr[Boolean] = js.undefined
  var followProto: js.UndefOr[Boolean] = js.undefined
  var onlyEnumerable: js.UndefOr[Boolean] = js.undefined
}

object KeysOptions {
  @scala.inline
  def apply(
    all: js.UndefOr[Boolean] = js.undefined,
    followProto: js.UndefOr[Boolean] = js.undefined,
    onlyEnumerable: js.UndefOr[Boolean] = js.undefined
  ): KeysOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(all)) __obj.updateDynamic("all")(all)
    if (!js.isUndefined(followProto)) __obj.updateDynamic("followProto")(followProto)
    if (!js.isUndefined(onlyEnumerable)) __obj.updateDynamic("onlyEnumerable")(onlyEnumerable)
    __obj.asInstanceOf[KeysOptions]
  }
}

