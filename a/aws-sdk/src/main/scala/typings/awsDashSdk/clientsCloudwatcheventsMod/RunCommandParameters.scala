package typings.awsDashSdk.clientsCloudwatcheventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RunCommandParameters extends js.Object {
  /**
    * Currently, we support including only one RunCommandTarget block, which specifies either an array of InstanceIds or a tag.
    */
  var RunCommandTargets: typings.awsDashSdk.clientsCloudwatcheventsMod.RunCommandTargets
}

object RunCommandParameters {
  @scala.inline
  def apply(RunCommandTargets: RunCommandTargets): RunCommandParameters = {
    val __obj = js.Dynamic.literal(RunCommandTargets = RunCommandTargets)
  
    __obj.asInstanceOf[RunCommandParameters]
  }
}

