package typings.awsSdk.augmentedairuntimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait StartHumanLoopResponse extends js.Object {
  /**
    * An object containing information about the human loop activation.
    */
  var HumanLoopActivationResults: js.UndefOr[typings.awsSdk.augmentedairuntimeMod.HumanLoopActivationResults] = js.native
  /**
    * The Amazon Resource Name (ARN) of the human loop.
    */
  var HumanLoopArn: js.UndefOr[typings.awsSdk.augmentedairuntimeMod.HumanLoopArn] = js.native
}

object StartHumanLoopResponse {
  @scala.inline
  def apply(HumanLoopActivationResults: HumanLoopActivationResults = null, HumanLoopArn: HumanLoopArn = null): StartHumanLoopResponse = {
    val __obj = js.Dynamic.literal()
    if (HumanLoopActivationResults != null) __obj.updateDynamic("HumanLoopActivationResults")(HumanLoopActivationResults.asInstanceOf[js.Any])
    if (HumanLoopArn != null) __obj.updateDynamic("HumanLoopArn")(HumanLoopArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[StartHumanLoopResponse]
  }
}

