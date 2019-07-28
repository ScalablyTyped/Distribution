package typings.awsDashSdk.clientsEksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateClusterConfigResponse extends js.Object {
  var update: js.UndefOr[Update] = js.undefined
}

object UpdateClusterConfigResponse {
  @scala.inline
  def apply(update: Update = null): UpdateClusterConfigResponse = {
    val __obj = js.Dynamic.literal()
    if (update != null) __obj.updateDynamic("update")(update)
    __obj.asInstanceOf[UpdateClusterConfigResponse]
  }
}

