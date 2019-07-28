package typings.awsDashSdk.clientsBatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComputeResourceUpdate extends js.Object {
  /**
    * The desired number of EC2 vCPUS in the compute environment.
    */
  var desiredvCpus: js.UndefOr[Integer] = js.undefined
  /**
    * The maximum number of EC2 vCPUs that an environment can reach.
    */
  var maxvCpus: js.UndefOr[Integer] = js.undefined
  /**
    * The minimum number of EC2 vCPUs that an environment should maintain.
    */
  var minvCpus: js.UndefOr[Integer] = js.undefined
}

object ComputeResourceUpdate {
  @scala.inline
  def apply(
    desiredvCpus: js.UndefOr[Integer] = js.undefined,
    maxvCpus: js.UndefOr[Integer] = js.undefined,
    minvCpus: js.UndefOr[Integer] = js.undefined
  ): ComputeResourceUpdate = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(desiredvCpus)) __obj.updateDynamic("desiredvCpus")(desiredvCpus)
    if (!js.isUndefined(maxvCpus)) __obj.updateDynamic("maxvCpus")(maxvCpus)
    if (!js.isUndefined(minvCpus)) __obj.updateDynamic("minvCpus")(minvCpus)
    __obj.asInstanceOf[ComputeResourceUpdate]
  }
}

