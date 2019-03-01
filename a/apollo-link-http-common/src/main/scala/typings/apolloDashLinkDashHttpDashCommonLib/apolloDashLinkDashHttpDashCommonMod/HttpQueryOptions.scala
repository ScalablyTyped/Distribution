package typings
package apolloDashLinkDashHttpDashCommonLib.apolloDashLinkDashHttpDashCommonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HttpQueryOptions extends js.Object {
  var includeExtensions: js.UndefOr[scala.Boolean] = js.undefined
  var includeQuery: js.UndefOr[scala.Boolean] = js.undefined
}

object HttpQueryOptions {
  @scala.inline
  def apply(
    includeExtensions: js.UndefOr[scala.Boolean] = js.undefined,
    includeQuery: js.UndefOr[scala.Boolean] = js.undefined
  ): HttpQueryOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(includeExtensions)) __obj.updateDynamic("includeExtensions")(includeExtensions)
    if (!js.isUndefined(includeQuery)) __obj.updateDynamic("includeQuery")(includeQuery)
    __obj.asInstanceOf[HttpQueryOptions]
  }
}

