package typings.awsDashSdk.clientsConfigserviceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RemediationException extends js.Object {
  /**
    * The name of the AWS Config rule.
    */
  var ConfigRuleName: typings.awsDashSdk.clientsConfigserviceMod.ConfigRuleName
  /**
    * The time when the remediation exception will be deleted.
    */
  var ExpirationTime: js.UndefOr[_Date] = js.undefined
  /**
    * An explanation of an remediation exception.
    */
  var Message: js.UndefOr[StringWithCharLimit1024] = js.undefined
  /**
    * The ID of the resource (for example., sg-xxxxxx).
    */
  var ResourceId: StringWithCharLimit1024
  /**
    * The type of a resource.
    */
  var ResourceType: StringWithCharLimit256
}

object RemediationException {
  @scala.inline
  def apply(
    ConfigRuleName: ConfigRuleName,
    ResourceId: StringWithCharLimit1024,
    ResourceType: StringWithCharLimit256,
    ExpirationTime: _Date = null,
    Message: StringWithCharLimit1024 = null
  ): RemediationException = {
    val __obj = js.Dynamic.literal(ConfigRuleName = ConfigRuleName, ResourceId = ResourceId, ResourceType = ResourceType)
    if (ExpirationTime != null) __obj.updateDynamic("ExpirationTime")(ExpirationTime)
    if (Message != null) __obj.updateDynamic("Message")(Message)
    __obj.asInstanceOf[RemediationException]
  }
}

