package typings.atom

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAllowPrevious extends js.Object {
  var allowPrevious: js.UndefOr[Boolean] = js.undefined
  var includeNonWordCharacters: js.UndefOr[Boolean] = js.undefined
  var wordRegex: js.UndefOr[RegExp] = js.undefined
}

object AnonAllowPrevious {
  @scala.inline
  def apply(
    allowPrevious: js.UndefOr[Boolean] = js.undefined,
    includeNonWordCharacters: js.UndefOr[Boolean] = js.undefined,
    wordRegex: RegExp = null
  ): AnonAllowPrevious = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowPrevious)) __obj.updateDynamic("allowPrevious")(allowPrevious.asInstanceOf[js.Any])
    if (!js.isUndefined(includeNonWordCharacters)) __obj.updateDynamic("includeNonWordCharacters")(includeNonWordCharacters.asInstanceOf[js.Any])
    if (wordRegex != null) __obj.updateDynamic("wordRegex")(wordRegex.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAllowPrevious]
  }
}

