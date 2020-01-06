package typings.awsDashSdk.clientsDirectconnectMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeLagsRequest extends js.Object {
  /**
    * The ID of the LAG.
    */
  var lagId: js.UndefOr[LagId] = js.native
}

object DescribeLagsRequest {
  @scala.inline
  def apply(lagId: LagId = null): DescribeLagsRequest = {
    val __obj = js.Dynamic.literal()
    if (lagId != null) __obj.updateDynamic("lagId")(lagId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeLagsRequest]
  }
}

