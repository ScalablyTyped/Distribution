package typings
package awsDashSdkLib.clientsSignerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeSigningJobRequest extends js.Object {
  /**
    * The ID of the signing job on input.
    */
  var jobId: JobId
}

object DescribeSigningJobRequest {
  @scala.inline
  def apply(jobId: JobId): DescribeSigningJobRequest = {
    val __obj = js.Dynamic.literal(jobId = jobId)
  
    __obj.asInstanceOf[DescribeSigningJobRequest]
  }
}

