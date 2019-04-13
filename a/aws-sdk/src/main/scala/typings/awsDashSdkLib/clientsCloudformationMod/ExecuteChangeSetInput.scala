package typings
package awsDashSdkLib.clientsCloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExecuteChangeSetInput extends js.Object {
  /**
    * The name or ARN of the change set that you want use to update the specified stack.
    */
  var ChangeSetName: ChangeSetNameOrId
  /**
    * A unique identifier for this ExecuteChangeSet request. Specify this token if you plan to retry requests so that AWS CloudFormation knows that you're not attempting to execute a change set to update a stack with the same name. You might retry ExecuteChangeSet requests to ensure that AWS CloudFormation successfully received them.
    */
  var ClientRequestToken: js.UndefOr[ClientRequestToken] = js.undefined
  /**
    * If you specified the name of a change set, specify the stack name or ID (ARN) that is associated with the change set you want to execute.
    */
  var StackName: js.UndefOr[StackNameOrId] = js.undefined
}

object ExecuteChangeSetInput {
  @scala.inline
  def apply(
    ChangeSetName: ChangeSetNameOrId,
    ClientRequestToken: ClientRequestToken = null,
    StackName: StackNameOrId = null
  ): ExecuteChangeSetInput = {
    val __obj = js.Dynamic.literal(ChangeSetName = ChangeSetName)
    if (ClientRequestToken != null) __obj.updateDynamic("ClientRequestToken")(ClientRequestToken)
    if (StackName != null) __obj.updateDynamic("StackName")(StackName)
    __obj.asInstanceOf[ExecuteChangeSetInput]
  }
}

