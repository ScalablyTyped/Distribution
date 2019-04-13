package typings
package awsDashSdkLib.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PutRemediationConfigurationsRequest extends js.Object {
  /**
    * A list of remediation configuration objects.
    */
  var RemediationConfigurations: awsDashSdkLib.clientsConfigserviceMod.RemediationConfigurations
}

object PutRemediationConfigurationsRequest {
  @scala.inline
  def apply(RemediationConfigurations: RemediationConfigurations): PutRemediationConfigurationsRequest = {
    val __obj = js.Dynamic.literal(RemediationConfigurations = RemediationConfigurations)
  
    __obj.asInstanceOf[PutRemediationConfigurationsRequest]
  }
}

