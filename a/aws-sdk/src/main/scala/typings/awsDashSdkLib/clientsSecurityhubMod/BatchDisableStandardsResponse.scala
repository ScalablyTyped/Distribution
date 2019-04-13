package typings
package awsDashSdkLib.clientsSecurityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchDisableStandardsResponse extends js.Object {
  /**
    * The details of the standards subscriptions that were disabled.
    */
  var StandardsSubscriptions: js.UndefOr[StandardsSubscriptions] = js.undefined
}

object BatchDisableStandardsResponse {
  @scala.inline
  def apply(StandardsSubscriptions: StandardsSubscriptions = null): BatchDisableStandardsResponse = {
    val __obj = js.Dynamic.literal()
    if (StandardsSubscriptions != null) __obj.updateDynamic("StandardsSubscriptions")(StandardsSubscriptions)
    __obj.asInstanceOf[BatchDisableStandardsResponse]
  }
}

