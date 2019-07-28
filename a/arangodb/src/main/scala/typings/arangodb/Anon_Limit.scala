package typings.arangodb

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Limit extends js.Object {
  var limit: js.UndefOr[Double] = js.undefined
  var waitForSync: js.UndefOr[Boolean] = js.undefined
}

object Anon_Limit {
  @scala.inline
  def apply(limit: Int | Double = null, waitForSync: js.UndefOr[Boolean] = js.undefined): Anon_Limit = {
    val __obj = js.Dynamic.literal()
    if (limit != null) __obj.updateDynamic("limit")(limit.asInstanceOf[js.Any])
    if (!js.isUndefined(waitForSync)) __obj.updateDynamic("waitForSync")(waitForSync)
    __obj.asInstanceOf[Anon_Limit]
  }
}

