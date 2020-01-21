package typings.arg.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var argv: js.UndefOr[js.Array[String]] = js.undefined
  var permissive: js.UndefOr[Boolean] = js.undefined
  var stopAtPositional: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    argv: js.Array[String] = null,
    permissive: js.UndefOr[Boolean] = js.undefined,
    stopAtPositional: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (argv != null) __obj.updateDynamic("argv")(argv.asInstanceOf[js.Any])
    if (!js.isUndefined(permissive)) __obj.updateDynamic("permissive")(permissive.asInstanceOf[js.Any])
    if (!js.isUndefined(stopAtPositional)) __obj.updateDynamic("stopAtPositional")(stopAtPositional.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

