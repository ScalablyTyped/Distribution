package typings.awsDashSdk.clientsCloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CreateChangeSetOutput extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the change set.
    */
  var Id: js.UndefOr[ChangeSetId] = js.undefined
  /**
    * The unique ID of the stack.
    */
  var StackId: js.UndefOr[typings.awsDashSdk.clientsCloudformationMod.StackId] = js.undefined
}

object CreateChangeSetOutput {
  @scala.inline
  def apply(Id: ChangeSetId = null, StackId: StackId = null): CreateChangeSetOutput = {
    val __obj = js.Dynamic.literal()
    if (Id != null) __obj.updateDynamic("Id")(Id)
    if (StackId != null) __obj.updateDynamic("StackId")(StackId)
    __obj.asInstanceOf[CreateChangeSetOutput]
  }
}

