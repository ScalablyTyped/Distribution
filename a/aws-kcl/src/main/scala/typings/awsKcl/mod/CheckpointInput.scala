package typings.awsKcl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CheckpointInput extends js.Object {
  var checkpointer: Checkpointer = js.native
}

object CheckpointInput {
  @scala.inline
  def apply(checkpointer: Checkpointer): CheckpointInput = {
    val __obj = js.Dynamic.literal(checkpointer = checkpointer.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckpointInput]
  }
  @scala.inline
  implicit class CheckpointInputOps[Self <: CheckpointInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCheckpointer(value: Checkpointer): Self = this.set("checkpointer", value.asInstanceOf[js.Any])
  }
  
}

