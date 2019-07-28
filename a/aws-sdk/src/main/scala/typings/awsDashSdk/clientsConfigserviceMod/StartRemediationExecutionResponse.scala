package typings.awsDashSdk.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartRemediationExecutionResponse extends js.Object {
  /**
    * For resources that have failed to start execution, the API returns a resource key object.
    */
  var FailedItems: js.UndefOr[ResourceKeys] = js.undefined
  /**
    * Returns a failure message. For example, the resource is already compliant.
    */
  var FailureMessage: js.UndefOr[String] = js.undefined
}

object StartRemediationExecutionResponse {
  @scala.inline
  def apply(FailedItems: ResourceKeys = null, FailureMessage: String = null): StartRemediationExecutionResponse = {
    val __obj = js.Dynamic.literal()
    if (FailedItems != null) __obj.updateDynamic("FailedItems")(FailedItems)
    if (FailureMessage != null) __obj.updateDynamic("FailureMessage")(FailureMessage)
    __obj.asInstanceOf[StartRemediationExecutionResponse]
  }
}

