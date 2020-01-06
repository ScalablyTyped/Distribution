package typings.awsDashSdk.clientsMedialiveMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListInputSecurityGroupsResponse extends js.Object {
  /**
    * List of input security groups
    */
  var InputSecurityGroups: js.UndefOr[__listOfInputSecurityGroup] = js.native
  var NextToken: js.UndefOr[__string] = js.native
}

object ListInputSecurityGroupsResponse {
  @scala.inline
  def apply(InputSecurityGroups: __listOfInputSecurityGroup = null, NextToken: __string = null): ListInputSecurityGroupsResponse = {
    val __obj = js.Dynamic.literal()
    if (InputSecurityGroups != null) __obj.updateDynamic("InputSecurityGroups")(InputSecurityGroups.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListInputSecurityGroupsResponse]
  }
}

