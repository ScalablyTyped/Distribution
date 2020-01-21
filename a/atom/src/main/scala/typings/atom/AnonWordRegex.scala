package typings.atom

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonWordRegex extends js.Object {
  var wordRegex: js.UndefOr[RegExp] = js.undefined
}

object AnonWordRegex {
  @scala.inline
  def apply(wordRegex: RegExp = null): AnonWordRegex = {
    val __obj = js.Dynamic.literal()
    if (wordRegex != null) __obj.updateDynamic("wordRegex")(wordRegex.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonWordRegex]
  }
}

