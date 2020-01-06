package typings.awsDashSdk.clientsEksMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateNodegroupVersionResponse extends js.Object {
  var update: js.UndefOr[Update] = js.native
}

object UpdateNodegroupVersionResponse {
  @scala.inline
  def apply(update: Update = null): UpdateNodegroupVersionResponse = {
    val __obj = js.Dynamic.literal()
    if (update != null) __obj.updateDynamic("update")(update.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateNodegroupVersionResponse]
  }
}

