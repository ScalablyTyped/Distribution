package typings.algoliaClientSearch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReplaceAllObjectsOptions extends js.Object {
  /**
    * If the all objects should be replaced using wait operations. Keep
    * in mind that, when the `safe` option is used, the operation may
    * take a little more than expected.
    */
  val safe: js.UndefOr[Boolean] = js.undefined
}

object ReplaceAllObjectsOptions {
  @scala.inline
  def apply(safe: js.UndefOr[Boolean] = js.undefined): ReplaceAllObjectsOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(safe)) __obj.updateDynamic("safe")(safe.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReplaceAllObjectsOptions]
  }
}

