package typings.awsDashSdk.clientsResourcegroupsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListGroupsOutput extends js.Object {
  /**
    * A list of GroupIdentifier objects. Each identifier is an object that contains both the GroupName and the GroupArn.
    */
  var GroupIdentifiers: js.UndefOr[GroupIdentifierList] = js.native
  /**
    * A list of resource groups.
    */
  var Groups: js.UndefOr[GroupList] = js.native
  /**
    * The NextToken value to include in a subsequent ListGroups request, to get more results.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsResourcegroupsMod.NextToken] = js.native
}

object ListGroupsOutput {
  @scala.inline
  def apply(
    GroupIdentifiers: GroupIdentifierList = null,
    Groups: GroupList = null,
    NextToken: NextToken = null
  ): ListGroupsOutput = {
    val __obj = js.Dynamic.literal()
    if (GroupIdentifiers != null) __obj.updateDynamic("GroupIdentifiers")(GroupIdentifiers.asInstanceOf[js.Any])
    if (Groups != null) __obj.updateDynamic("Groups")(Groups.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListGroupsOutput]
  }
}

