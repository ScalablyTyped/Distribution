package typings.awsDashSdk.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FailedRemediationExceptionBatch extends js.Object {
  /**
    * Returns remediation exception resource key object of the failed items.
    */
  var FailedItems: js.UndefOr[RemediationExceptions] = js.undefined
  /**
    * Returns a failure message. For example, the auto-remediation has failed.
    */
  var FailureMessage: js.UndefOr[String] = js.undefined
}

object FailedRemediationExceptionBatch {
  @scala.inline
  def apply(FailedItems: RemediationExceptions = null, FailureMessage: String = null): FailedRemediationExceptionBatch = {
    val __obj = js.Dynamic.literal()
    if (FailedItems != null) __obj.updateDynamic("FailedItems")(FailedItems)
    if (FailureMessage != null) __obj.updateDynamic("FailureMessage")(FailureMessage)
    __obj.asInstanceOf[FailedRemediationExceptionBatch]
  }
}

