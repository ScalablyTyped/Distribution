package typings.awsDashSdk.clientsCloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeChangeSetInput extends js.Object {
  /**
    * The name or Amazon Resource Name (ARN) of the change set that you want to describe.
    */
  var ChangeSetName: ChangeSetNameOrId
  /**
    * A string (provided by the DescribeChangeSet response output) that identifies the next page of information that you want to retrieve.
    */
  var NextToken: js.UndefOr[typings.awsDashSdk.clientsCloudformationMod.NextToken] = js.undefined
  /**
    * If you specified the name of a change set, specify the stack name or ID (ARN) of the change set you want to describe.
    */
  var StackName: js.UndefOr[StackNameOrId] = js.undefined
}

object DescribeChangeSetInput {
  @scala.inline
  def apply(ChangeSetName: ChangeSetNameOrId, NextToken: NextToken = null, StackName: StackNameOrId = null): DescribeChangeSetInput = {
    val __obj = js.Dynamic.literal(ChangeSetName = ChangeSetName)
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken)
    if (StackName != null) __obj.updateDynamic("StackName")(StackName)
    __obj.asInstanceOf[DescribeChangeSetInput]
  }
}

