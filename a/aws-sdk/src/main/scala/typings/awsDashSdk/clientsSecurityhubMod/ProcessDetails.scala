package typings.awsDashSdk.clientsSecurityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProcessDetails extends js.Object {
  /**
    * The date/time that the process was launched.
    */
  var LaunchedAt: js.UndefOr[NonEmptyString] = js.undefined
  /**
    * The name of the process.
    */
  var Name: js.UndefOr[NonEmptyString] = js.undefined
  /**
    * The parent process ID.
    */
  var ParentPid: js.UndefOr[Integer] = js.undefined
  /**
    * The path to the process executable.
    */
  var Path: js.UndefOr[NonEmptyString] = js.undefined
  /**
    * The process ID.
    */
  var Pid: js.UndefOr[Integer] = js.undefined
  /**
    * The date and time when the process was terminated.
    */
  var TerminatedAt: js.UndefOr[NonEmptyString] = js.undefined
}

object ProcessDetails {
  @scala.inline
  def apply(
    LaunchedAt: NonEmptyString = null,
    Name: NonEmptyString = null,
    ParentPid: Int | scala.Double = null,
    Path: NonEmptyString = null,
    Pid: Int | scala.Double = null,
    TerminatedAt: NonEmptyString = null
  ): ProcessDetails = {
    val __obj = js.Dynamic.literal()
    if (LaunchedAt != null) __obj.updateDynamic("LaunchedAt")(LaunchedAt)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (ParentPid != null) __obj.updateDynamic("ParentPid")(ParentPid.asInstanceOf[js.Any])
    if (Path != null) __obj.updateDynamic("Path")(Path)
    if (Pid != null) __obj.updateDynamic("Pid")(Pid.asInstanceOf[js.Any])
    if (TerminatedAt != null) __obj.updateDynamic("TerminatedAt")(TerminatedAt)
    __obj.asInstanceOf[ProcessDetails]
  }
}

