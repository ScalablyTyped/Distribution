package typings.awsDashSdk.clientsAthenaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteWorkGroupInput extends js.Object {
  /**
    * The option to delete the workgroup and its contents even if the workgroup contains any named queries.
    */
  var RecursiveDeleteOption: js.UndefOr[BoxedBoolean] = js.native
  /**
    * The unique name of the workgroup to delete.
    */
  var WorkGroup: WorkGroupName = js.native
}

object DeleteWorkGroupInput {
  @scala.inline
  def apply(WorkGroup: WorkGroupName, RecursiveDeleteOption: js.UndefOr[scala.Boolean] = js.undefined): DeleteWorkGroupInput = {
    val __obj = js.Dynamic.literal(WorkGroup = WorkGroup.asInstanceOf[js.Any])
    if (!js.isUndefined(RecursiveDeleteOption)) __obj.updateDynamic("RecursiveDeleteOption")(RecursiveDeleteOption.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteWorkGroupInput]
  }
}

