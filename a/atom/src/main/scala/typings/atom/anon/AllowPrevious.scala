package typings.atom.anon

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AllowPrevious extends js.Object {
  var allowPrevious: js.UndefOr[Boolean] = js.undefined
  var includeNonWordCharacters: js.UndefOr[Boolean] = js.undefined
  var wordRegex: js.UndefOr[RegExp] = js.undefined
}

object AllowPrevious {
  @scala.inline
  def apply(
    allowPrevious: js.UndefOr[Boolean] = js.undefined,
    includeNonWordCharacters: js.UndefOr[Boolean] = js.undefined,
    wordRegex: RegExp = null
  ): AllowPrevious = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowPrevious)) __obj.updateDynamic("allowPrevious")(allowPrevious.get.asInstanceOf[js.Any])
    if (!js.isUndefined(includeNonWordCharacters)) __obj.updateDynamic("includeNonWordCharacters")(includeNonWordCharacters.get.asInstanceOf[js.Any])
    if (wordRegex != null) __obj.updateDynamic("wordRegex")(wordRegex.asInstanceOf[js.Any])
    __obj.asInstanceOf[AllowPrevious]
  }
}

