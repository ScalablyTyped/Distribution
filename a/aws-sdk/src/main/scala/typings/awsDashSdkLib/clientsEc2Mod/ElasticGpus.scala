package typings
package awsDashSdkLib.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ElasticGpus extends js.Object {
  /**
    * The Availability Zone in the which the Elastic Graphics accelerator resides.
    */
  var AvailabilityZone: js.UndefOr[String] = js.undefined
  /**
    * The status of the Elastic Graphics accelerator.
    */
  var ElasticGpuHealth: js.UndefOr[ElasticGpuHealth] = js.undefined
  /**
    * The ID of the Elastic Graphics accelerator.
    */
  var ElasticGpuId: js.UndefOr[String] = js.undefined
  /**
    * The state of the Elastic Graphics accelerator.
    */
  var ElasticGpuState: js.UndefOr[ElasticGpuState] = js.undefined
  /**
    * The type of Elastic Graphics accelerator.
    */
  var ElasticGpuType: js.UndefOr[String] = js.undefined
  /**
    * The ID of the instance to which the Elastic Graphics accelerator is attached.
    */
  var InstanceId: js.UndefOr[String] = js.undefined
}

object ElasticGpus {
  @scala.inline
  def apply(
    AvailabilityZone: String = null,
    ElasticGpuHealth: ElasticGpuHealth = null,
    ElasticGpuId: String = null,
    ElasticGpuState: ElasticGpuState = null,
    ElasticGpuType: String = null,
    InstanceId: String = null
  ): ElasticGpus = {
    val __obj = js.Dynamic.literal()
    if (AvailabilityZone != null) __obj.updateDynamic("AvailabilityZone")(AvailabilityZone)
    if (ElasticGpuHealth != null) __obj.updateDynamic("ElasticGpuHealth")(ElasticGpuHealth)
    if (ElasticGpuId != null) __obj.updateDynamic("ElasticGpuId")(ElasticGpuId)
    if (ElasticGpuState != null) __obj.updateDynamic("ElasticGpuState")(ElasticGpuState.asInstanceOf[js.Any])
    if (ElasticGpuType != null) __obj.updateDynamic("ElasticGpuType")(ElasticGpuType)
    if (InstanceId != null) __obj.updateDynamic("InstanceId")(InstanceId)
    __obj.asInstanceOf[ElasticGpus]
  }
}

