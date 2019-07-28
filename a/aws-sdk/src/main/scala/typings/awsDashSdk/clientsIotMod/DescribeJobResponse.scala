package typings.awsDashSdk.clientsIotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DescribeJobResponse extends js.Object {
  /**
    * An S3 link to the job document.
    */
  var documentSource: js.UndefOr[JobDocumentSource] = js.undefined
  /**
    * Information about the job.
    */
  var job: js.UndefOr[Job] = js.undefined
}

object DescribeJobResponse {
  @scala.inline
  def apply(documentSource: JobDocumentSource = null, job: Job = null): DescribeJobResponse = {
    val __obj = js.Dynamic.literal()
    if (documentSource != null) __obj.updateDynamic("documentSource")(documentSource)
    if (job != null) __obj.updateDynamic("job")(job)
    __obj.asInstanceOf[DescribeJobResponse]
  }
}

