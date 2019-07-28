package typings.awsDashSdk.clientsSsmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeAssociationExecutionTargetsResult extends js.Object {
  /**
    * Information about the execution.
    */
  var AssociationExecutionTargets: js.UndefOr[AssociationExecutionTargetsList] = js.undefined
  /**
    * The token for the next set of items to return. Use this token to get the next set of results.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsSsmMod.NextToken] = js.undefined
}

object DescribeAssociationExecutionTargetsResult {
  @scala.inline
  def apply(AssociationExecutionTargets: AssociationExecutionTargetsList = null, NextToken: NextToken = null): DescribeAssociationExecutionTargetsResult = {
    val __obj = js.Dynamic.literal()
    if (AssociationExecutionTargets != null) __obj.updateDynamic("AssociationExecutionTargets")(AssociationExecutionTargets)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    __obj.asInstanceOf[DescribeAssociationExecutionTargetsResult]
  }
}

