package typings.awsDashSdk.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartRemediationExecutionRequest extends js.Object {
  /**
    * The list of names of AWS Config rules that you want to run remediation execution for.
    */
  var ConfigRuleName: typings.awsDashSdk.clientsConfigserviceMod.ConfigRuleName
  /**
    * A list of resource keys to be processed with the current request. Each element in the list consists of the resource type and resource ID. 
    */
  var ResourceKeys: typings.awsDashSdk.clientsConfigserviceMod.ResourceKeys
}

object StartRemediationExecutionRequest {
  @scala.inline
  def apply(ConfigRuleName: ConfigRuleName, ResourceKeys: ResourceKeys): StartRemediationExecutionRequest = {
    val __obj = js.Dynamic.literal(ConfigRuleName = ConfigRuleName, ResourceKeys = ResourceKeys)
  
    __obj.asInstanceOf[StartRemediationExecutionRequest]
  }
}

