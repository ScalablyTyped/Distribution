package typings.awsDashSdk.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FailedRemediationBatch extends js.Object {
  /**
    * Returns remediation configurations of the failed items.
    */
  var FailedItems: js.UndefOr[RemediationConfigurations] = js.undefined
  /**
    * Returns a failure message. For example, the resource is already compliant.
    */
  var FailureMessage: js.UndefOr[String] = js.undefined
}

object FailedRemediationBatch {
  @scala.inline
  def apply(FailedItems: RemediationConfigurations = null, FailureMessage: String = null): FailedRemediationBatch = {
    val __obj = js.Dynamic.literal()
    if (FailedItems != null) __obj.updateDynamic("FailedItems")(FailedItems)
    if (FailureMessage != null) __obj.updateDynamic("FailureMessage")(FailureMessage)
    __obj.asInstanceOf[FailedRemediationBatch]
  }
}

