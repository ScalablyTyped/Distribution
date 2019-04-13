package typings
package awsDashSdkLib.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeJobRequest extends js.Object {
  /**
    * The unique identifier you assigned to this job when it was created.
    */
  var jobId: JobId
}

object DescribeJobRequest {
  @scala.inline
  def apply(jobId: JobId): DescribeJobRequest = {
    val __obj = js.Dynamic.literal(jobId = jobId)
  
    __obj.asInstanceOf[DescribeJobRequest]
  }
}

