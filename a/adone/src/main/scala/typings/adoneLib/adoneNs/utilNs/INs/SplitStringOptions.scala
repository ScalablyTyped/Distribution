package typings
package adoneLib.adoneNs.utilNs.INs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SplitStringOptions extends js.Object {
  var braces: js.UndefOr[js.Object | scala.Boolean] = js.undefined
  var keepDoubleQuotes: js.UndefOr[scala.Boolean] = js.undefined
  var keepEscaping: js.UndefOr[scala.Boolean] = js.undefined
  var keepQuotes: js.UndefOr[scala.Boolean] = js.undefined
  var keepSingleQuotes: js.UndefOr[scala.Boolean] = js.undefined
  var separator: js.UndefOr[java.lang.String] = js.undefined
  var split: js.UndefOr[SplitStringSplitFunction] = js.undefined
}

object SplitStringOptions {
  @scala.inline
  def apply(
    braces: js.Object | scala.Boolean = null,
    keepDoubleQuotes: js.UndefOr[scala.Boolean] = js.undefined,
    keepEscaping: js.UndefOr[scala.Boolean] = js.undefined,
    keepQuotes: js.UndefOr[scala.Boolean] = js.undefined,
    keepSingleQuotes: js.UndefOr[scala.Boolean] = js.undefined,
    separator: java.lang.String = null,
    split: SplitStringSplitFunction = null
  ): SplitStringOptions = {
    val __obj = js.Dynamic.literal()
    if (braces != null) __obj.updateDynamic("braces")(braces.asInstanceOf[js.Any])
    if (!js.isUndefined(keepDoubleQuotes)) __obj.updateDynamic("keepDoubleQuotes")(keepDoubleQuotes)
    if (!js.isUndefined(keepEscaping)) __obj.updateDynamic("keepEscaping")(keepEscaping)
    if (!js.isUndefined(keepQuotes)) __obj.updateDynamic("keepQuotes")(keepQuotes)
    if (!js.isUndefined(keepSingleQuotes)) __obj.updateDynamic("keepSingleQuotes")(keepSingleQuotes)
    if (separator != null) __obj.updateDynamic("separator")(separator)
    if (split != null) __obj.updateDynamic("split")(split)
    __obj.asInstanceOf[SplitStringOptions]
  }
}

