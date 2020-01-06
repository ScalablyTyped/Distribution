package typings.awsDashSdk.clientsSecurityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchEnableStandardsResponse extends js.Object {
  /**
    * The details of the standards subscriptions that were enabled.
    */
  var StandardsSubscriptions: js.UndefOr[typings.awsDashSdk.clientsSecurityhubMod.StandardsSubscriptions] = js.native
}

object BatchEnableStandardsResponse {
  @scala.inline
  def apply(StandardsSubscriptions: StandardsSubscriptions = null): BatchEnableStandardsResponse = {
    val __obj = js.Dynamic.literal()
    if (StandardsSubscriptions != null) __obj.updateDynamic("StandardsSubscriptions")(StandardsSubscriptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchEnableStandardsResponse]
  }
}

