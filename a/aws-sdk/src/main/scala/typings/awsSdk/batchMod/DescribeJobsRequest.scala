package typings.awsSdk.batchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeJobsRequest extends js.Object {
  /**
    * A list of up to 100 job IDs.
    */
  var jobs: StringList = js.native
}

object DescribeJobsRequest {
  @scala.inline
  def apply(jobs: StringList): DescribeJobsRequest = {
    val __obj = js.Dynamic.literal(jobs = jobs.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DescribeJobsRequest]
  }
}

