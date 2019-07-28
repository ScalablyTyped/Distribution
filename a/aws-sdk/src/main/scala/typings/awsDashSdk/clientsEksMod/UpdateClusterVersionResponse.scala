package typings.awsDashSdk.clientsEksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateClusterVersionResponse extends js.Object {
  /**
    * The full description of the specified update
    */
  var update: js.UndefOr[Update] = js.undefined
}

object UpdateClusterVersionResponse {
  @scala.inline
  def apply(update: Update = null): UpdateClusterVersionResponse = {
    val __obj = js.Dynamic.literal()
    if (update != null) __obj.updateDynamic("update")(update)
    __obj.asInstanceOf[UpdateClusterVersionResponse]
  }
}

