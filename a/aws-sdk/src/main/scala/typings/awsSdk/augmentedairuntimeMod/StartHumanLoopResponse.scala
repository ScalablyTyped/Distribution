package typings.awsSdk.augmentedairuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartHumanLoopResponse extends js.Object {
  /**
    * The Amazon Resource Name (ARN) of the human loop.
    */
  var HumanLoopArn: js.UndefOr[typings.awsSdk.augmentedairuntimeMod.HumanLoopArn] = js.native
}

object StartHumanLoopResponse {
  @scala.inline
  def apply(HumanLoopArn: HumanLoopArn = null): StartHumanLoopResponse = {
    val __obj = js.Dynamic.literal()
    if (HumanLoopArn != null) __obj.updateDynamic("HumanLoopArn")(HumanLoopArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartHumanLoopResponse]
  }
}

