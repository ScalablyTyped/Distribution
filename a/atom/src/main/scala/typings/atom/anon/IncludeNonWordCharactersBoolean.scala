package typings.atom.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IncludeNonWordCharactersBoolean extends js.Object {
  var includeNonWordCharacters: js.UndefOr[Boolean] = js.undefined
}

object IncludeNonWordCharactersBoolean {
  @scala.inline
  def apply(includeNonWordCharacters: js.UndefOr[Boolean] = js.undefined): IncludeNonWordCharactersBoolean = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(includeNonWordCharacters)) __obj.updateDynamic("includeNonWordCharacters")(includeNonWordCharacters.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[IncludeNonWordCharactersBoolean]
  }
}

