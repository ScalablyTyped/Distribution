package typings.awsDashSdk.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutRemediationConfigurationsRequest extends js.Object {
  /**
    * A list of remediation configuration objects.
    */
  var RemediationConfigurations: typings.awsDashSdk.clientsConfigserviceMod.RemediationConfigurations = js.native
}

object PutRemediationConfigurationsRequest {
  @scala.inline
  def apply(RemediationConfigurations: RemediationConfigurations): PutRemediationConfigurationsRequest = {
    val __obj = js.Dynamic.literal(RemediationConfigurations = RemediationConfigurations.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[PutRemediationConfigurationsRequest]
  }
}

