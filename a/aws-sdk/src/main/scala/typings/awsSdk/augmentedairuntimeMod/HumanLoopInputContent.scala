package typings.awsSdk.augmentedairuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HumanLoopInputContent extends js.Object {
  /**
    * Serialized input from the human loop.
    */
  var InputContent: typings.awsSdk.augmentedairuntimeMod.InputContent = js.native
}

object HumanLoopInputContent {
  @scala.inline
  def apply(InputContent: InputContent): HumanLoopInputContent = {
    val __obj = js.Dynamic.literal(InputContent = InputContent.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[HumanLoopInputContent]
  }
}

