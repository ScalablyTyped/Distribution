package typings.awsDashSdk.clientsSagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HumanLoopActivationConditionsConfig extends js.Object {
  /**
    * JSON expressing use-case specific conditions declaratively. If any condition is matched, atomic tasks are created against the configured work team. The set of conditions is different for Rekognition and Textract.
    */
  var HumanLoopActivationConditions: typings.awsDashSdk.clientsSagemakerMod.HumanLoopActivationConditions = js.native
}

object HumanLoopActivationConditionsConfig {
  @scala.inline
  def apply(HumanLoopActivationConditions: HumanLoopActivationConditions): HumanLoopActivationConditionsConfig = {
    val __obj = js.Dynamic.literal(HumanLoopActivationConditions = HumanLoopActivationConditions.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[HumanLoopActivationConditionsConfig]
  }
}

