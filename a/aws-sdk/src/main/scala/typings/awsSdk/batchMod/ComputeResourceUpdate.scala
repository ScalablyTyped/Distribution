package typings.awsSdk.batchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ComputeResourceUpdate extends js.Object {
  /**
    * The desired number of Amazon EC2 vCPUS in the compute environment.
    */
  var desiredvCpus: js.UndefOr[Integer] = js.native
  /**
    * The maximum number of Amazon EC2 vCPUs that an environment can reach.
    */
  var maxvCpus: js.UndefOr[Integer] = js.native
  /**
    * The minimum number of Amazon EC2 vCPUs that an environment should maintain.
    */
  var minvCpus: js.UndefOr[Integer] = js.native
}

object ComputeResourceUpdate {
  @scala.inline
  def apply(
    desiredvCpus: js.UndefOr[Integer] = js.undefined,
    maxvCpus: js.UndefOr[Integer] = js.undefined,
    minvCpus: js.UndefOr[Integer] = js.undefined
  ): ComputeResourceUpdate = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(desiredvCpus)) __obj.updateDynamic("desiredvCpus")(desiredvCpus.get.asInstanceOf[js.Any])
    if (!js.isUndefined(maxvCpus)) __obj.updateDynamic("maxvCpus")(maxvCpus.get.asInstanceOf[js.Any])
    if (!js.isUndefined(minvCpus)) __obj.updateDynamic("minvCpus")(minvCpus.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComputeResourceUpdate]
  }
}

