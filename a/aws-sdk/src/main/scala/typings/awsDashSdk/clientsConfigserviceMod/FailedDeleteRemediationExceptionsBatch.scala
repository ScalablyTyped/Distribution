package typings.awsDashSdk.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FailedDeleteRemediationExceptionsBatch extends js.Object {
  /**
    * Returns remediation exception resource key object of the failed items.
    */
  var FailedItems: js.UndefOr[RemediationExceptionResourceKeys] = js.undefined
  /**
    * Returns a failure message for delete remediation exception. For example, AWS Config creates an exception due to an internal error.
    */
  var FailureMessage: js.UndefOr[String] = js.undefined
}

object FailedDeleteRemediationExceptionsBatch {
  @scala.inline
  def apply(FailedItems: RemediationExceptionResourceKeys = null, FailureMessage: String = null): FailedDeleteRemediationExceptionsBatch = {
    val __obj = js.Dynamic.literal()
    if (FailedItems != null) __obj.updateDynamic("FailedItems")(FailedItems)
    if (FailureMessage != null) __obj.updateDynamic("FailureMessage")(FailureMessage)
    __obj.asInstanceOf[FailedDeleteRemediationExceptionsBatch]
  }
}

