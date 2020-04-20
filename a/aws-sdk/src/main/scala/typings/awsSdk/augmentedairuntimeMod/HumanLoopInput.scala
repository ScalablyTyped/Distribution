package typings.awsSdk.augmentedairuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HumanLoopInput extends js.Object {
  /**
    * Serialized input from the human loop. The input must be a string representation of a file in JSON format.
    */
  var InputContent: typings.awsSdk.augmentedairuntimeMod.InputContent = js.native
}

object HumanLoopInput {
  @scala.inline
  def apply(InputContent: InputContent): HumanLoopInput = {
    val __obj = js.Dynamic.literal(InputContent = InputContent.asInstanceOf[js.Any])
    __obj.asInstanceOf[HumanLoopInput]
  }
}

