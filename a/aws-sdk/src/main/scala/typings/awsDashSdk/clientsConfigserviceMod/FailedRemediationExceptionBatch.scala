package typings.awsDashSdk.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FailedRemediationExceptionBatch extends js.Object {
  /**
    * Returns remediation exception resource key object of the failed items.
    */
  var FailedItems: js.UndefOr[RemediationExceptions] = js.native
  /**
    * Returns a failure message. For example, the auto-remediation has failed.
    */
  var FailureMessage: js.UndefOr[String] = js.native
}

object FailedRemediationExceptionBatch {
  @scala.inline
  def apply(FailedItems: RemediationExceptions = null, FailureMessage: String = null): FailedRemediationExceptionBatch = {
    val __obj = js.Dynamic.literal()
    if (FailedItems != null) __obj.updateDynamic("FailedItems")(FailedItems.asInstanceOf[js.Any])
    if (FailureMessage != null) __obj.updateDynamic("FailureMessage")(FailureMessage.asInstanceOf[js.Any])
    __obj.asInstanceOf[FailedRemediationExceptionBatch]
  }
}

