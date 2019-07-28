package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GetJobBookmarkResponse extends js.Object {
  /**
    * A structure that defines a point that a job can resume processing.
    */
  var JobBookmarkEntry: js.UndefOr[typings.awsDashSdk.clientsGlueMod.JobBookmarkEntry] = js.undefined
}

object GetJobBookmarkResponse {
  @scala.inline
  def apply(JobBookmarkEntry: JobBookmarkEntry = null): GetJobBookmarkResponse = {
    val __obj = js.Dynamic.literal()
    if (JobBookmarkEntry != null) __obj.updateDynamic("JobBookmarkEntry")(JobBookmarkEntry)
    __obj.asInstanceOf[GetJobBookmarkResponse]
  }
}

