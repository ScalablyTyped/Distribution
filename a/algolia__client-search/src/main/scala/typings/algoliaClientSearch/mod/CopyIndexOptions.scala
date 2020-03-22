package typings.algoliaClientSearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CopyIndexOptions extends js.Object {
  val scope: js.UndefOr[js.Array[ScopeType]] = js.undefined
}

object CopyIndexOptions {
  @scala.inline
  def apply(scope: js.Array[ScopeType] = null): CopyIndexOptions = {
    val __obj = js.Dynamic.literal()
    if (scope != null) __obj.updateDynamic("scope")(scope.asInstanceOf[js.Any])
    __obj.asInstanceOf[CopyIndexOptions]
  }
}

