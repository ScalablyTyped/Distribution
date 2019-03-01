package typings
package atomLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IncludeNonWordCharacters extends js.Object {
  var includeNonWordCharacters: js.UndefOr[scala.Boolean] = js.undefined
  var wordRegex: js.UndefOr[stdLib.RegExp] = js.undefined
}

object Anon_IncludeNonWordCharacters {
  @scala.inline
  def apply(
    includeNonWordCharacters: js.UndefOr[scala.Boolean] = js.undefined,
    wordRegex: stdLib.RegExp = null
  ): Anon_IncludeNonWordCharacters = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(includeNonWordCharacters)) __obj.updateDynamic("includeNonWordCharacters")(includeNonWordCharacters)
    if (wordRegex != null) __obj.updateDynamic("wordRegex")(wordRegex)
    __obj.asInstanceOf[Anon_IncludeNonWordCharacters]
  }
}

