package typings.atom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IncludeNewline extends js.Object {
  var includeNewline: js.UndefOr[Boolean] = js.undefined
}

object Anon_IncludeNewline {
  @scala.inline
  def apply(includeNewline: js.UndefOr[Boolean] = js.undefined): Anon_IncludeNewline = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(includeNewline)) __obj.updateDynamic("includeNewline")(includeNewline.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_IncludeNewline]
  }
}

