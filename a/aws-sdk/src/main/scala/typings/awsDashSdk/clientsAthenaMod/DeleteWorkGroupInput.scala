package typings.awsDashSdk.clientsAthenaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeleteWorkGroupInput extends js.Object {
  /**
    * The option to delete the workgroup and its contents even if the workgroup contains any named queries.
    */
  var RecursiveDeleteOption: js.UndefOr[BoxedBoolean] = js.undefined
  /**
    * The unique name of the workgroup to delete.
    */
  var WorkGroup: WorkGroupName
}

object DeleteWorkGroupInput {
  @scala.inline
  def apply(WorkGroup: WorkGroupName, RecursiveDeleteOption: js.UndefOr[BoxedBoolean] = js.undefined): DeleteWorkGroupInput = {
    val __obj = js.Dynamic.literal(WorkGroup = WorkGroup)
    if (!js.isUndefined(RecursiveDeleteOption)) __obj.updateDynamic("RecursiveDeleteOption")(RecursiveDeleteOption)
    __obj.asInstanceOf[DeleteWorkGroupInput]
  }
}

