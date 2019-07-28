package typings.atom

import typings.std.RegExp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IncludeNonWordCharacters extends js.Object {
  var includeNonWordCharacters: js.UndefOr[Boolean] = js.undefined
  var wordRegex: js.UndefOr[RegExp] = js.undefined
}

object Anon_IncludeNonWordCharacters {
  @scala.inline
  def apply(includeNonWordCharacters: js.UndefOr[Boolean] = js.undefined, wordRegex: RegExp = null): Anon_IncludeNonWordCharacters = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(includeNonWordCharacters)) __obj.updateDynamic("includeNonWordCharacters")(includeNonWordCharacters)
    if (wordRegex != null) __obj.updateDynamic("wordRegex")(wordRegex)
    __obj.asInstanceOf[Anon_IncludeNonWordCharacters]
  }
}

