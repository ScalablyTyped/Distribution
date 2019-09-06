package typings.awsDashSdk.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteRemediationConfigurationRequest extends js.Object {
  /**
    * The name of the AWS Config rule for which you want to delete remediation configuration.
    */
  var ConfigRuleName: typings.awsDashSdk.clientsConfigserviceMod.ConfigRuleName
  /**
    * The type of a resource.
    */
  var ResourceType: js.UndefOr[String] = js.undefined
}

object DeleteRemediationConfigurationRequest {
  @scala.inline
  def apply(ConfigRuleName: ConfigRuleName, ResourceType: String = null): DeleteRemediationConfigurationRequest = {
    val __obj = js.Dynamic.literal(ConfigRuleName = ConfigRuleName)
    if (ResourceType != null) __obj.updateDynamic("ResourceType")(ResourceType)
    __obj.asInstanceOf[DeleteRemediationConfigurationRequest]
  }
}

