package typings.awsKcl.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CheckpointInput extends js.Object {
  var checkpointer: Checkpointer
}

object CheckpointInput {
  @scala.inline
  def apply(checkpointer: Checkpointer): CheckpointInput = {
    val __obj = js.Dynamic.literal(checkpointer = checkpointer.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[CheckpointInput]
  }
}

