package typings
package awsDashSdkLib.clientsGlueMod

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
    * Name of the job in question.
    */
  var JobName: js.UndefOr[JobName] = js.undefined
  /**
    * The run ID number.
    */
  var Run: js.UndefOr[IntegerValue] = js.undefined
  /**
    * Version of the job.
    */
  var Version: js.UndefOr[IntegerValue] = js.undefined
}

object JobBookmarkEntry {
  @scala.inline
  def apply(
    Attempt: js.UndefOr[IntegerValue] = js.undefined,
    JobBookmark: JsonValue = null,
    JobName: JobName = null,
    Run: js.UndefOr[IntegerValue] = js.undefined,
    Version: js.UndefOr[IntegerValue] = js.undefined
  ): JobBookmarkEntry = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Attempt)) __obj.updateDynamic("Attempt")(Attempt)
    if (JobBookmark != null) __obj.updateDynamic("JobBookmark")(JobBookmark)
    if (JobName != null) __obj.updateDynamic("JobName")(JobName)
    if (!js.isUndefined(Run)) __obj.updateDynamic("Run")(Run)
    if (!js.isUndefined(Version)) __obj.updateDynamic("Version")(Version)
    __obj.asInstanceOf[JobBookmarkEntry]
  }
}

