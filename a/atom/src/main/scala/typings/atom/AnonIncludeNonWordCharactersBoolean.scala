package typings.atom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonIncludeNonWordCharactersBoolean extends js.Object {
  var includeNonWordCharacters: js.UndefOr[Boolean] = js.undefined
}

object AnonIncludeNonWordCharactersBoolean {
  @scala.inline
  def apply(includeNonWordCharacters: js.UndefOr[Boolean] = js.undefined): AnonIncludeNonWordCharactersBoolean = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(includeNonWordCharacters)) __obj.updateDynamic("includeNonWordCharacters")(includeNonWordCharacters.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonIncludeNonWordCharactersBoolean]
  }
}

