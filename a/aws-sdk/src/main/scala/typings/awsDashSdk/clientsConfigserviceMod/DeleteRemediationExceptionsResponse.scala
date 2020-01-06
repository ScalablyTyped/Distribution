package typings.awsDashSdk.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteRemediationExceptionsResponse extends js.Object {
  /**
    * Returns a list of failed delete remediation exceptions batch objects. Each object in the batch consists of a list of failed items and failure messages.
    */
  var FailedBatches: js.UndefOr[FailedDeleteRemediationExceptionsBatches] = js.native
}

object DeleteRemediationExceptionsResponse {
  @scala.inline
  def apply(FailedBatches: FailedDeleteRemediationExceptionsBatches = null): DeleteRemediationExceptionsResponse = {
    val __obj = js.Dynamic.literal()
    if (FailedBatches != null) __obj.updateDynamic("FailedBatches")(FailedBatches.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteRemediationExceptionsResponse]
  }
}

