package typings.awsDashSdk.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemediationConfiguration extends js.Object {
  /**
    * The name of the AWS Config rule.
    */
  var ConfigRuleName: StringWithCharLimit64
  /**
    * An object of the RemediationParameterValue.
    */
  var Parameters: js.UndefOr[RemediationParameters] = js.undefined
  /**
    * The type of a resource. 
    */
  var ResourceType: js.UndefOr[String] = js.undefined
  /**
    * Target ID is the name of the public document.
    */
  var TargetId: StringWithCharLimit256
  /**
    * The type of the target. Target executes remediation. For example, SSM document.
    */
  var TargetType: RemediationTargetType
  /**
    * Version of the target. For example, version of the SSM document.
    */
  var TargetVersion: js.UndefOr[String] = js.undefined
}

object RemediationConfiguration {
  @scala.inline
  def apply(
    ConfigRuleName: StringWithCharLimit64,
    TargetId: StringWithCharLimit256,
    TargetType: RemediationTargetType,
    Parameters: RemediationParameters = null,
    ResourceType: String = null,
    TargetVersion: String = null
  ): RemediationConfiguration = {
    val __obj = js.Dynamic.literal(ConfigRuleName = ConfigRuleName, TargetId = TargetId, TargetType = TargetType.asInstanceOf[js.Any])
    if (Parameters != null) __obj.updateDynamic("Parameters")(Parameters)
    if (ResourceType != null) __obj.updateDynamic("ResourceType")(ResourceType)
    if (TargetVersion != null) __obj.updateDynamic("TargetVersion")(TargetVersion)
    __obj.asInstanceOf[RemediationConfiguration]
  }
}

