package typings.archy.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var unicode: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(unicode: js.UndefOr[Boolean] = js.undefined): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(unicode)) __obj.updateDynamic("unicode")(unicode.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

