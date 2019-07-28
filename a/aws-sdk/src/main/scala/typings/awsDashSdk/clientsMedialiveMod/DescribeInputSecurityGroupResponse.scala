package typings.awsDashSdk.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeInputSecurityGroupResponse extends js.Object {
  /**
    * Unique ARN of Input Security Group
    */
  var Arn: js.UndefOr[__string] = js.undefined
  /**
    * The Id of the Input Security Group
    */
  var Id: js.UndefOr[__string] = js.undefined
  /**
    * The list of inputs currently using this Input Security Group.
    */
  var Inputs: js.UndefOr[__listOf__string] = js.undefined
  /**
    * The current state of the Input Security Group.
    */
  var State: js.UndefOr[InputSecurityGroupState] = js.undefined
  /**
    * A collection of key-value pairs.
    */
  var Tags: js.UndefOr[typings.awsDashSdk.clientsMedialiveMod.Tags] = js.undefined
  /**
    * Whitelist rules and their sync status
    */
  var WhitelistRules: js.UndefOr[__listOfInputWhitelistRule] = js.undefined
}

object DescribeInputSecurityGroupResponse {
  @scala.inline
  def apply(
    Arn: __string = null,
    Id: __string = null,
    Inputs: __listOf__string = null,
    State: InputSecurityGroupState = null,
    Tags: Tags = null,
    WhitelistRules: __listOfInputWhitelistRule = null
  ): DescribeInputSecurityGroupResponse = {
    val __obj = js.Dynamic.literal()
    if (Arn != null) __obj.updateDynamic("Arn")(Arn)
    if (Id != null) __obj.updateDynamic("Id")(Id)
    if (Inputs != null) __obj.updateDynamic("Inputs")(Inputs)
    if (State != null) __obj.updateDynamic("State")(State.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags)
    if (WhitelistRules != null) __obj.updateDynamic("WhitelistRules")(WhitelistRules)
    __obj.asInstanceOf[DescribeInputSecurityGroupResponse]
  }
}

