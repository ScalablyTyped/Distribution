package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ElasticGpuHealth extends js.Object {
  /**
    * The health status.
    */
  var Status: js.UndefOr[ElasticGpuStatus] = js.undefined
}

object ElasticGpuHealth {
  @scala.inline
  def apply(Status: ElasticGpuStatus = null): ElasticGpuHealth = {
    val __obj = js.Dynamic.literal()
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElasticGpuHealth]
  }
}

