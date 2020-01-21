package typings.atom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonPreserveLeadingWhitespace extends js.Object {
  var preserveLeadingWhitespace: js.UndefOr[Boolean] = js.undefined
}

object AnonPreserveLeadingWhitespace {
  @scala.inline
  def apply(preserveLeadingWhitespace: js.UndefOr[Boolean] = js.undefined): AnonPreserveLeadingWhitespace = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(preserveLeadingWhitespace)) __obj.updateDynamic("preserveLeadingWhitespace")(preserveLeadingWhitespace.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonPreserveLeadingWhitespace]
  }
}

