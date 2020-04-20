package typings.awsSdk.athenaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetWorkGroupInput extends js.Object {
  /**
    * The name of the workgroup.
    */
  var WorkGroup: WorkGroupName = js.native
}

object GetWorkGroupInput {
  @scala.inline
  def apply(WorkGroup: WorkGroupName): GetWorkGroupInput = {
    val __obj = js.Dynamic.literal(WorkGroup = WorkGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetWorkGroupInput]
  }
}

