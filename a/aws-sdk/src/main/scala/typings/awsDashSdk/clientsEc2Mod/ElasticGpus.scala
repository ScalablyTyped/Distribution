package typings.awsDashSdk.clientsEc2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ElasticGpus extends js.Object {
  /**
    * The Availability Zone in the which the Elastic Graphics accelerator resides.
    */
  var AvailabilityZone: js.UndefOr[String] = js.native
  /**
    * The status of the Elastic Graphics accelerator.
    */
  var ElasticGpuHealth: js.UndefOr[typings.awsDashSdk.clientsEc2Mod.ElasticGpuHealth] = js.native
  /**
    * The ID of the Elastic Graphics accelerator.
    */
  var ElasticGpuId: js.UndefOr[String] = js.native
  /**
    * The state of the Elastic Graphics accelerator.
    */
  var ElasticGpuState: js.UndefOr[typings.awsDashSdk.clientsEc2Mod.ElasticGpuState] = js.native
  /**
    * The type of Elastic Graphics accelerator.
    */
  var ElasticGpuType: js.UndefOr[String] = js.native
  /**
    * The ID of the instance to which the Elastic Graphics accelerator is attached.
    */
  var InstanceId: js.UndefOr[String] = js.native
  /**
    * The tags assigned to the Elastic Graphics accelerator.
    */
  var Tags: js.UndefOr[TagList] = js.native
}

object ElasticGpus {
  @scala.inline
  def apply(
    AvailabilityZone: String = null,
    ElasticGpuHealth: ElasticGpuHealth = null,
    ElasticGpuId: String = null,
    ElasticGpuState: ElasticGpuState = null,
    ElasticGpuType: String = null,
    InstanceId: String = null,
    Tags: TagList = null
  ): ElasticGpus = {
    val __obj = js.Dynamic.literal()
    if (AvailabilityZone != null) __obj.updateDynamic("AvailabilityZone")(AvailabilityZone.asInstanceOf[js.Any])
    if (ElasticGpuHealth != null) __obj.updateDynamic("ElasticGpuHealth")(ElasticGpuHealth.asInstanceOf[js.Any])
    if (ElasticGpuId != null) __obj.updateDynamic("ElasticGpuId")(ElasticGpuId.asInstanceOf[js.Any])
    if (ElasticGpuState != null) __obj.updateDynamic("ElasticGpuState")(ElasticGpuState.asInstanceOf[js.Any])
    if (ElasticGpuType != null) __obj.updateDynamic("ElasticGpuType")(ElasticGpuType.asInstanceOf[js.Any])
    if (InstanceId != null) __obj.updateDynamic("InstanceId")(InstanceId.asInstanceOf[js.Any])
    if (Tags != null) __obj.updateDynamic("Tags")(Tags.asInstanceOf[js.Any])
    __obj.asInstanceOf[ElasticGpus]
  }
}

