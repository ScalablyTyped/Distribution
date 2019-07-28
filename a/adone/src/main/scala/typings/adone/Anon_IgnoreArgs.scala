package typings.adone

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IgnoreArgs extends js.Object {
  var ignoreArgs: js.UndefOr[Boolean] = js.undefined
}

object Anon_IgnoreArgs {
  @scala.inline
  def apply(ignoreArgs: js.UndefOr[Boolean] = js.undefined): Anon_IgnoreArgs = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(ignoreArgs)) __obj.updateDynamic("ignoreArgs")(ignoreArgs)
    __obj.asInstanceOf[Anon_IgnoreArgs]
  }
}

