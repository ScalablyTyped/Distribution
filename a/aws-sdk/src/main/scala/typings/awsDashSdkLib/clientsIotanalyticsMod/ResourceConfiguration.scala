package typings
package awsDashSdkLib.clientsIotanalyticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResourceConfiguration extends js.Object {
  /**
    * The type of the compute resource used to execute the "containerAction". Possible values are: ACU_1 (vCPU=4, memory=16GiB) or ACU_2 (vCPU=8, memory=32GiB).
    */
  var computeType: ComputeType
  /**
    * The size (in GB) of the persistent storage available to the resource instance used to execute the "containerAction" (min: 1, max: 50).
    */
  var volumeSizeInGB: VolumeSizeInGB
}

object ResourceConfiguration {
  @scala.inline
  def apply(computeType: ComputeType, volumeSizeInGB: VolumeSizeInGB): ResourceConfiguration = {
    val __obj = js.Dynamic.literal(computeType = computeType.asInstanceOf[js.Any], volumeSizeInGB = volumeSizeInGB)
  
    __obj.asInstanceOf[ResourceConfiguration]
  }
}

