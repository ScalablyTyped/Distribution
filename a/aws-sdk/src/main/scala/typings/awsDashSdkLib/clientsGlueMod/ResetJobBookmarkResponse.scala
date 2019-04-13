package typings
package awsDashSdkLib.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ResetJobBookmarkResponse extends js.Object {
  /**
    * The reset bookmark entry.
    */
  var JobBookmarkEntry: js.UndefOr[JobBookmarkEntry] = js.undefined
}

object ResetJobBookmarkResponse {
  @scala.inline
  def apply(JobBookmarkEntry: JobBookmarkEntry = null): ResetJobBookmarkResponse = {
    val __obj = js.Dynamic.literal()
    if (JobBookmarkEntry != null) __obj.updateDynamic("JobBookmarkEntry")(JobBookmarkEntry)
    __obj.asInstanceOf[ResetJobBookmarkResponse]
  }
}

