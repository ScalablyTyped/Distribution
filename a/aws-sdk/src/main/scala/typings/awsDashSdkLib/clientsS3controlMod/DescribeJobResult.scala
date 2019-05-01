package typings
package awsDashSdkLib.clientsS3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeJobResult extends js.Object {
  /**
    * Contains the configuration parameters and status for the job specified in the Describe Job request.
    */
  var Job: js.UndefOr[JobDescriptor] = js.undefined
}

object DescribeJobResult {
  @scala.inline
  def apply(Job: JobDescriptor = null): DescribeJobResult = {
    val __obj = js.Dynamic.literal()
    if (Job != null) __obj.updateDynamic("Job")(Job)
    __obj.asInstanceOf[DescribeJobResult]
  }
}

