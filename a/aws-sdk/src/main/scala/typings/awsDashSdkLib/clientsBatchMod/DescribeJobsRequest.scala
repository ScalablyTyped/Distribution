package typings
package awsDashSdkLib.clientsBatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeJobsRequest extends js.Object {
  /**
    * A list of up to 100 job IDs.
    */
  var jobs: StringList
}

object DescribeJobsRequest {
  @scala.inline
  def apply(jobs: StringList): DescribeJobsRequest = {
    val __obj = js.Dynamic.literal(jobs = jobs)
  
    __obj.asInstanceOf[DescribeJobsRequest]
  }
}

