package typings
package awsDashSdkLib.clientsResourcegroupsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SearchResourcesOutput extends js.Object {
  /**
    * The NextToken value to include in a subsequent SearchResources request, to get more results.
    */
  var NextToken: js.UndefOr[NextToken] = js.undefined
  /**
    * A list of QueryError objects. Each error is an object that contains ErrorCode and Message structures. Possible values for ErrorCode are CLOUDFORMATION_STACK_INACTIVE and CLOUDFORMATION_STACK_NOT_EXISTING.
    */
  var QueryErrors: js.UndefOr[QueryErrorList] = js.undefined
  /**
    * The ARNs and resource types of resources that are members of the group that you specified.
    */
  var ResourceIdentifiers: js.UndefOr[ResourceIdentifierList] = js.undefined
}

object SearchResourcesOutput {
  @scala.inline
  def apply(
    NextToken: NextToken = null,
    QueryErrors: QueryErrorList = null,
    ResourceIdentifiers: ResourceIdentifierList = null
  ): SearchResourcesOutput = {
    val __obj = js.Dynamic.literal()
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (QueryErrors != null) __obj.updateDynamic("QueryErrors")(QueryErrors)
    if (ResourceIdentifiers != null) __obj.updateDynamic("ResourceIdentifiers")(ResourceIdentifiers)
    __obj.asInstanceOf[SearchResourcesOutput]
  }
}

