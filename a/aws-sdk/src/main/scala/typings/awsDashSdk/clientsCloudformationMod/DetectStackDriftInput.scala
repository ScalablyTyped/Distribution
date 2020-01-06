package typings.awsDashSdk.clientsCloudformationMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DetectStackDriftInput extends js.Object {
  /**
    * The logical names of any resources you want to use as filters.
    */
  var LogicalResourceIds: js.UndefOr[typings.awsDashSdk.clientsCloudformationMod.LogicalResourceIds] = js.native
  /**
    * The name of the stack for which you want to detect drift. 
    */
  var StackName: StackNameOrId = js.native
}

object DetectStackDriftInput {
  @scala.inline
  def apply(StackName: StackNameOrId, LogicalResourceIds: LogicalResourceIds = null): DetectStackDriftInput = {
    val __obj = js.Dynamic.literal(StackName = StackName.asInstanceOf[js.Any])
    if (LogicalResourceIds != null) __obj.updateDynamic("LogicalResourceIds")(LogicalResourceIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[DetectStackDriftInput]
  }
}

