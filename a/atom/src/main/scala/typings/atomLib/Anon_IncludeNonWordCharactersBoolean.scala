package typings
package atomLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IncludeNonWordCharactersBoolean extends js.Object {
  var includeNonWordCharacters: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_IncludeNonWordCharactersBoolean {
  @scala.inline
  def apply(includeNonWordCharacters: js.UndefOr[scala.Boolean] = js.undefined): Anon_IncludeNonWordCharactersBoolean = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(includeNonWordCharacters)) __obj.updateDynamic("includeNonWordCharacters")(includeNonWordCharacters)
    __obj.asInstanceOf[Anon_IncludeNonWordCharactersBoolean]
  }
}

