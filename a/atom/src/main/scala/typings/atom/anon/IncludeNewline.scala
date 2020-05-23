package typings.atom.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IncludeNewline extends js.Object {
  var includeNewline: js.UndefOr[Boolean] = js.undefined
}

object IncludeNewline {
  @scala.inline
  def apply(includeNewline: js.UndefOr[Boolean] = js.undefined): IncludeNewline = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(includeNewline)) __obj.updateDynamic("includeNewline")(includeNewline.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncludeNewline]
  }
}

