package typings.atom.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PreserveLeadingWhitespace extends js.Object {
  var preserveLeadingWhitespace: js.UndefOr[Boolean] = js.undefined
}

object PreserveLeadingWhitespace {
  @scala.inline
  def apply(preserveLeadingWhitespace: js.UndefOr[Boolean] = js.undefined): PreserveLeadingWhitespace = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(preserveLeadingWhitespace)) __obj.updateDynamic("preserveLeadingWhitespace")(preserveLeadingWhitespace.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PreserveLeadingWhitespace]
  }
}

