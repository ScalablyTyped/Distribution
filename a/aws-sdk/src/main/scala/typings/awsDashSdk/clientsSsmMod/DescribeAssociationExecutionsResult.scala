package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeAssociationExecutionsResult extends js.Object {
  /**
    * A list of the executions for the specified association ID.
    */
  var AssociationExecutions: js.UndefOr[AssociationExecutionsList] = js.native
  /**
    * The token for the next set of items to return. Use this token to get the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsSsmMod.NextToken] = js.native
}

object DescribeAssociationExecutionsResult {
  @scala.inline
  def apply(AssociationExecutions: AssociationExecutionsList = null, NextToken: NextToken = null): DescribeAssociationExecutionsResult = {
    val __obj = js.Dynamic.literal()
    if (AssociationExecutions != null) __obj.updateDynamic("AssociationExecutions")(AssociationExecutions.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAssociationExecutionsResult]
  }
}

