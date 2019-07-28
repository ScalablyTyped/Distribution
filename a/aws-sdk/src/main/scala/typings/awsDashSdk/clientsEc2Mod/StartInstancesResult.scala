package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StartInstancesResult extends js.Object {
  /**
    * Information about the started instances.
    */
  var StartingInstances: js.UndefOr[InstanceStateChangeList] = js.undefined
}

object StartInstancesResult {
  @scala.inline
  def apply(StartingInstances: InstanceStateChangeList = null): StartInstancesResult = {
    val __obj = js.Dynamic.literal()
    if (StartingInstances != null) __obj.updateDynamic("StartingInstances")(StartingInstances)
    __obj.asInstanceOf[StartInstancesResult]
  }
}

