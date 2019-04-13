package typings
package awsDashSdkLib.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateInputSecurityGroupRequest extends js.Object {
  /**
    * A collection of key-value pairs.
    */
  var Tags: js.UndefOr[Tags] = js.undefined
  /**
    * List of IPv4 CIDR addresses to whitelist
    */
  var WhitelistRules: js.UndefOr[__listOfInputWhitelistRuleCidr] = js.undefined
}

object CreateInputSecurityGroupRequest {
  @scala.inline
  def apply(Tags: Tags = null, WhitelistRules: __listOfInputWhitelistRuleCidr = null): CreateInputSecurityGroupRequest = {
    val __obj = js.Dynamic.literal()
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    if (WhitelistRules != null) __obj.updateDynamic("WhitelistRules")(WhitelistRules)
    __obj.asInstanceOf[CreateInputSecurityGroupRequest]
  }
}

