package typings.awsDashSdk.clientsResourcegroupsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListGroupResourcesOutput extends js.Object {
  /**
    * The NextToken value to include in a subsequent ListGroupResources request, to get more results.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsResourcegroupsMod.NextToken] = js.native
  /**
    * A list of QueryError objects. Each error is an object that contains ErrorCode and Message structures. Possible values for ErrorCode are CLOUDFORMATION_STACK_INACTIVE and CLOUDFORMATION_STACK_NOT_EXISTING.
    */
  var QueryErrors: js.UndefOr[QueryErrorList] = js.native
  /**
    * The ARNs and resource types of resources that are members of the group that you specified.
    */
  var ResourceIdentifiers: js.UndefOr[ResourceIdentifierList] = js.native
}

object ListGroupResourcesOutput {
  @scala.inline
  def apply(
    NextToken: NextToken = null,
    QueryErrors: QueryErrorList = null,
    ResourceIdentifiers: ResourceIdentifierList = null
  ): ListGroupResourcesOutput = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (QueryErrors != null) __obj.updateDynamic("QueryErrors")(QueryErrors.asInstanceOf[js.Any])
    if (ResourceIdentifiers != null) __obj.updateDynamic("ResourceIdentifiers")(ResourceIdentifiers.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListGroupResourcesOutput]
  }
}

