package typings.atom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_PreserveLeadingWhitespace extends js.Object {
  var preserveLeadingWhitespace: js.UndefOr[Boolean] = js.undefined
}

object Anon_PreserveLeadingWhitespace {
  @scala.inline
  def apply(preserveLeadingWhitespace: js.UndefOr[Boolean] = js.undefined): Anon_PreserveLeadingWhitespace = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(preserveLeadingWhitespace)) __obj.updateDynamic("preserveLeadingWhitespace")(preserveLeadingWhitespace)
    __obj.asInstanceOf[Anon_PreserveLeadingWhitespace]
  }
}

