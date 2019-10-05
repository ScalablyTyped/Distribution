package typings.awsDashSdk.clientsS3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestProgress extends js.Object {
  /**
    * Specifies whether periodic QueryProgress frames should be sent. Valid values: TRUE, FALSE. Default value: FALSE.
    */
  var Enabled: js.UndefOr[EnableRequestProgress] = js.undefined
}

object RequestProgress {
  @scala.inline
  def apply(Enabled: js.UndefOr[Boolean] = js.undefined): RequestProgress = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Enabled)) __obj.updateDynamic("Enabled")(Enabled)
    __obj.asInstanceOf[RequestProgress]
  }
}

