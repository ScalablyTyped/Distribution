package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeJobResponse extends js.Object {
  /**
    * An S3 link to the job document.
    */
  var documentSource: js.UndefOr[JobDocumentSource] = js.native
  /**
    * Information about the job.
    */
  var job: js.UndefOr[Job] = js.native
}

object DescribeJobResponse {
  @scala.inline
  def apply(documentSource: JobDocumentSource = null, job: Job = null): DescribeJobResponse = {
    val __obj = js.Dynamic.literal()
    if (documentSource != null) __obj.updateDynamic("documentSource")(documentSource.asInstanceOf[js.Any])
    if (job != null) __obj.updateDynamic("job")(job.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeJobResponse]
  }
}

