package typings.atom.anon

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IncludeNonWordCharacters extends js.Object {
  var includeNonWordCharacters: js.UndefOr[Boolean] = js.undefined
  var wordRegex: js.UndefOr[RegExp] = js.undefined
}

object IncludeNonWordCharacters {
  @scala.inline
  def apply(includeNonWordCharacters: js.UndefOr[Boolean] = js.undefined, wordRegex: RegExp = null): IncludeNonWordCharacters = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(includeNonWordCharacters)) __obj.updateDynamic("includeNonWordCharacters")(includeNonWordCharacters.get.asInstanceOf[js.Any])
    if (wordRegex != null) __obj.updateDynamic("wordRegex")(wordRegex.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncludeNonWordCharacters]
  }
}

