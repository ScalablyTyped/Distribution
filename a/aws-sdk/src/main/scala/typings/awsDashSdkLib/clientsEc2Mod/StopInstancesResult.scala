package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StopInstancesResult extends js.Object {
  /**
    * Information about the stopped instances.
    */
  var StoppingInstances: js.UndefOr[InstanceStateChangeList] = js.undefined
}

object StopInstancesResult {
  @scala.inline
  def apply(StoppingInstances: InstanceStateChangeList = null): StopInstancesResult = {
    val __obj = js.Dynamic.literal()
    if (StoppingInstances != null) __obj.updateDynamic("StoppingInstances")(StoppingInstances)
    __obj.asInstanceOf[StopInstancesResult]
  }
}

