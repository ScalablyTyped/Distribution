package typings.awsDashSdk.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateInputSecurityGroupRequest extends js.Object {
  /**
    * A collection of key-value pairs.
    */
  var Tags: js.UndefOr[typings.awsDashSdk.clientsMedialiveMod.Tags] = js.native
  /**
    * List of IPv4 CIDR addresses to whitelist
    */
  var WhitelistRules: js.UndefOr[__listOfInputWhitelistRuleCidr] = js.native
}

object CreateInputSecurityGroupRequest {
  @scala.inline
  def apply(Tags: Tags = null, WhitelistRules: __listOfInputWhitelistRuleCidr = null): CreateInputSecurityGroupRequest = {
    val __obj = js.Dynamic.literal()
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    if (WhitelistRules != null) __obj.updateDynamic("WhitelistRules")(WhitelistRules.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateInputSecurityGroupRequest]
  }
}

