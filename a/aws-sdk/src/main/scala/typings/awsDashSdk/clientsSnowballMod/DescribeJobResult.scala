package typings.awsDashSdk.clientsSnowballMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeJobResult extends js.Object {
  /**
    * Information about a specific job, including shipping information, job status, and other important metadata.
    */
  var JobMetadata: js.UndefOr[typings.awsDashSdk.clientsSnowballMod.JobMetadata] = js.undefined
  /**
    * Information about a specific job part (in the case of an export job), including shipping information, job status, and other important metadata.
    */
  var SubJobMetadata: js.UndefOr[JobMetadataList] = js.undefined
}

object DescribeJobResult {
  @scala.inline
  def apply(JobMetadata: JobMetadata = null, SubJobMetadata: JobMetadataList = null): DescribeJobResult = {
    val __obj = js.Dynamic.literal()
    if (JobMetadata != null) __obj.updateDynamic("JobMetadata")(JobMetadata)
    if (SubJobMetadata != null) __obj.updateDynamic("SubJobMetadata")(SubJobMetadata)
    __obj.asInstanceOf[DescribeJobResult]
  }
}

