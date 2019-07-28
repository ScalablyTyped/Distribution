package typings.awsDashSdk.clientsGlueMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobBookmarkEntry extends js.Object {
  /**
    * The attempt ID number.
    */
  var Attempt: js.UndefOr[IntegerValue] = js.undefined
  /**
    * The bookmark itself.
    */
  var JobBookmark: js.UndefOr[JsonValue] = js.undefined
  /**
    * The name of the job in question.
    */
  var JobName: js.UndefOr[typings.awsDashSdk.clientsGlueMod.JobName] = js.undefined
  /**
    * The unique run identifier associated with the previous job run..
    */
  var PreviousRunId: js.UndefOr[RunId] = js.undefined
  /**
    * The run ID number.
    */
  var Run: js.UndefOr[IntegerValue] = js.undefined
  /**
    * The unique run identifier associated with this job run.
    */
  var RunId: js.UndefOr[typings.awsDashSdk.clientsGlueMod.RunId] = js.undefined
  /**
    * The version of the job.
    */
  var Version: js.UndefOr[IntegerValue] = js.undefined
}

object JobBookmarkEntry {
  @scala.inline
  def apply(
    Attempt: js.UndefOr[IntegerValue] = js.undefined,
    JobBookmark: JsonValue = null,
    JobName: JobName = null,
    PreviousRunId: RunId = null,
    Run: js.UndefOr[IntegerValue] = js.undefined,
    RunId: RunId = null,
    Version: js.UndefOr[IntegerValue] = js.undefined
  ): JobBookmarkEntry = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Attempt)) __obj.updateDynamic("Attempt")(Attempt)
    if (JobBookmark != null) __obj.updateDynamic("JobBookmark")(JobBookmark)
    if (JobName != null) __obj.updateDynamic("JobName")(JobName)
    if (PreviousRunId != null) __obj.updateDynamic("PreviousRunId")(PreviousRunId)
    if (!js.isUndefined(Run)) __obj.updateDynamic("Run")(Run)
    if (RunId != null) __obj.updateDynamic("RunId")(RunId)
    if (!js.isUndefined(Version)) __obj.updateDynamic("Version")(Version)
    __obj.asInstanceOf[JobBookmarkEntry]
  }
}

