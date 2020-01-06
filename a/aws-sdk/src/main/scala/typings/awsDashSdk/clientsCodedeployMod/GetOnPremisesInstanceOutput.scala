package typings.awsDashSdk.clientsCodedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetOnPremisesInstanceOutput extends js.Object {
  /**
    *  Information about the on-premises instance. 
    */
  var instanceInfo: js.UndefOr[InstanceInfo] = js.native
}

object GetOnPremisesInstanceOutput {
  @scala.inline
  def apply(instanceInfo: InstanceInfo = null): GetOnPremisesInstanceOutput = {
    val __obj = js.Dynamic.literal()
    if (instanceInfo != null) __obj.updateDynamic("instanceInfo")(instanceInfo.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetOnPremisesInstanceOutput]
  }
}

