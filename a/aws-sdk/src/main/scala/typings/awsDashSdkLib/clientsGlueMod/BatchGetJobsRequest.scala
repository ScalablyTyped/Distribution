package typings
package awsDashSdkLib.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BatchGetJobsRequest extends js.Object {
  /**
    * A list of job names, which may be the names returned from the ListJobs operation.
    */
  var JobNames: JobNameList
}

object BatchGetJobsRequest {
  @scala.inline
  def apply(JobNames: JobNameList): BatchGetJobsRequest = {
    val __obj = js.Dynamic.literal(JobNames = JobNames)
  
    __obj.asInstanceOf[BatchGetJobsRequest]
  }
}

