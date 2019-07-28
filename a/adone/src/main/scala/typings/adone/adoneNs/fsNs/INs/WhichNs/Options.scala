package typings.adone.adoneNs.fsNs.INs.WhichNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var all: js.UndefOr[Boolean] = js.undefined
  var colon: js.UndefOr[String] = js.undefined
  var nothrow: js.UndefOr[Boolean] = js.undefined
  var path: js.UndefOr[String] = js.undefined
  var pathExt: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    all: js.UndefOr[Boolean] = js.undefined,
    colon: String = null,
    nothrow: js.UndefOr[Boolean] = js.undefined,
    path: String = null,
    pathExt: String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(all)) __obj.updateDynamic("all")(all)
    if (colon != null) __obj.updateDynamic("colon")(colon)
    if (!js.isUndefined(nothrow)) __obj.updateDynamic("nothrow")(nothrow)
    if (path != null) __obj.updateDynamic("path")(path)
    if (pathExt != null) __obj.updateDynamic("pathExt")(pathExt)
    __obj.asInstanceOf[Options]
  }
}

