package typings.awsDashSdk.clientsCloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CancelUpdateStackInput extends js.Object {
  /**
    * A unique identifier for this CancelUpdateStack request. Specify this token if you plan to retry requests so that AWS CloudFormation knows that you're not attempting to cancel an update on a stack with the same name. You might retry CancelUpdateStack requests to ensure that AWS CloudFormation successfully received them.
    */
  var ClientRequestToken: js.UndefOr[typings.awsDashSdk.clientsCloudformationMod.ClientRequestToken] = js.undefined
  /**
    * The name or the unique stack ID that is associated with the stack.
    */
  var StackName: typings.awsDashSdk.clientsCloudformationMod.StackName
}

object CancelUpdateStackInput {
  @scala.inline
  def apply(StackName: StackName, ClientRequestToken: ClientRequestToken = null): CancelUpdateStackInput = {
    val __obj = js.Dynamic.literal(StackName = StackName)
    if (ClientRequestToken != null) __obj.updateDynamic("ClientRequestToken")(ClientRequestToken)
    __obj.asInstanceOf[CancelUpdateStackInput]
  }
}

