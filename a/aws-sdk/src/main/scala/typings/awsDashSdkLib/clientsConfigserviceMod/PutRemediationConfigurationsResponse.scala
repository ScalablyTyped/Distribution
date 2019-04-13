package typings
package awsDashSdkLib.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutRemediationConfigurationsResponse extends js.Object {
  /**
    * Returns a list of failed remediation batch objects.
    */
  var FailedBatches: js.UndefOr[FailedRemediationBatches] = js.undefined
}

object PutRemediationConfigurationsResponse {
  @scala.inline
  def apply(FailedBatches: FailedRemediationBatches = null): PutRemediationConfigurationsResponse = {
    val __obj = js.Dynamic.literal()
    if (FailedBatches != null) __obj.updateDynamic("FailedBatches")(FailedBatches)
    __obj.asInstanceOf[PutRemediationConfigurationsResponse]
  }
}

