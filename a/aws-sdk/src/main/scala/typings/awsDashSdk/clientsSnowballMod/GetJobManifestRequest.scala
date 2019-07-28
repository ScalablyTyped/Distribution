package typings.awsDashSdk.clientsSnowballMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetJobManifestRequest extends js.Object {
  /**
    * The ID for a job that you want to get the manifest file for, for example JID123e4567-e89b-12d3-a456-426655440000.
    */
  var JobId: typings.awsDashSdk.clientsSnowballMod.JobId
}

object GetJobManifestRequest {
  @scala.inline
  def apply(JobId: JobId): GetJobManifestRequest = {
    val __obj = js.Dynamic.literal(JobId = JobId)
  
    __obj.asInstanceOf[GetJobManifestRequest]
  }
}

