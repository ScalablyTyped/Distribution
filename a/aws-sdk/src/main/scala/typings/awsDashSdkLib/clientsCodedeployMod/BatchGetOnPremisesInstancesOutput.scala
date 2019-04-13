package typings
package awsDashSdkLib.clientsCodedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchGetOnPremisesInstancesOutput extends js.Object {
  /**
    * Information about the on-premises instances.
    */
  var instanceInfos: js.UndefOr[InstanceInfoList] = js.undefined
}

object BatchGetOnPremisesInstancesOutput {
  @scala.inline
  def apply(instanceInfos: InstanceInfoList = null): BatchGetOnPremisesInstancesOutput = {
    val __obj = js.Dynamic.literal()
    if (instanceInfos != null) __obj.updateDynamic("instanceInfos")(instanceInfos)
    __obj.asInstanceOf[BatchGetOnPremisesInstancesOutput]
  }
}

