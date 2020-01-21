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
  def apply(desiredvCpus: Int | Double = null, maxvCpus: Int | Double = null, minvCpus: Int | Double = null): ComputeResourceUpdate = {
    val __obj = js.Dynamic.literal()
    if (desiredvCpus != null) __obj.updateDynamic("desiredvCpus")(desiredvCpus.asInstanceOf[js.Any])
    if (maxvCpus != null) __obj.updateDynamic("maxvCpus")(maxvCpus.asInstanceOf[js.Any])
    if (minvCpus != null) __obj.updateDynamic("minvCpus")(minvCpus.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComputeResourceUpdate]
  }
}

