package typings.awsDashSdk.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait UpdateInputSecurityGroupRequest extends js.Object {
  /**
    * The id of the Input Security Group to update.
    */
  var InputSecurityGroupId: __string
  /**
    * A collection of key-value pairs.
    */
  var Tags: js.UndefOr[typings.awsDashSdk.clientsMedialiveMod.Tags] = js.undefined
  /**
    * List of IPv4 CIDR addresses to whitelist
    */
  var WhitelistRules: js.UndefOr[__listOfInputWhitelistRuleCidr] = js.undefined
}

object UpdateInputSecurityGroupRequest {
  @scala.inline
  def apply(
    InputSecurityGroupId: __string,
    Tags: Tags = null,
    WhitelistRules: __listOfInputWhitelistRuleCidr = null
  ): UpdateInputSecurityGroupRequest = {
    val __obj = js.Dynamic.literal(InputSecurityGroupId = InputSecurityGroupId)
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    if (WhitelistRules != null) __obj.updateDynamic("WhitelistRules")(WhitelistRules)
    __obj.asInstanceOf[UpdateInputSecurityGroupRequest]
  }
}

