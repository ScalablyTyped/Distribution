package typings.awsDashSdk.clientsResourcegroupsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ListGroupsOutput extends js.Object {
  /**
    * A list of GroupIdentifier objects. Each identifier is an object that contains both the GroupName and the GroupArn.
    */
  var GroupIdentifiers: js.UndefOr[GroupIdentifierList] = js.undefined
  /**
    * A list of resource groups.
    */
  var Groups: js.UndefOr[GroupList] = js.undefined
  /**
    * The NextToken value to include in a subsequent ListGroups request, to get more results.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsResourcegroupsMod.NextToken] = js.undefined
}

object ListGroupsOutput {
  @scala.inline
  def apply(
    GroupIdentifiers: GroupIdentifierList = null,
    Groups: GroupList = null,
    NextToken: NextToken = null
  ): ListGroupsOutput = {
    val __obj = js.Dynamic.literal()
    if (GroupIdentifiers != null) __obj.updateDynamic("GroupIdentifiers")(GroupIdentifiers)
    if (Groups != null) __obj.updateDynamic("Groups")(Groups)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[ListGroupsOutput]
  }
}

