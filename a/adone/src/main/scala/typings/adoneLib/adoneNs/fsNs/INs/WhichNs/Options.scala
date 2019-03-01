package typings
package adoneLib.adoneNs.fsNs.INs.WhichNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var all: js.UndefOr[scala.Boolean] = js.undefined
  var colon: js.UndefOr[java.lang.String] = js.undefined
  var nothrow: js.UndefOr[scala.Boolean] = js.undefined
  var path: js.UndefOr[java.lang.String] = js.undefined
  var pathExt: js.UndefOr[java.lang.String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    all: js.UndefOr[scala.Boolean] = js.undefined,
    colon: java.lang.String = null,
    nothrow: js.UndefOr[scala.Boolean] = js.undefined,
    path: java.lang.String = null,
    pathExt: java.lang.String = null
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

