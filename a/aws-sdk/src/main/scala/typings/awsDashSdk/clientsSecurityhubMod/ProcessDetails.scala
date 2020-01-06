package typings.awsDashSdk.clientsSecurityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ProcessDetails extends js.Object {
  /**
    * The date/time that the process was launched.
    */
  var LaunchedAt: js.UndefOr[NonEmptyString] = js.native
  /**
    * The name of the process.
    */
  var Name: js.UndefOr[NonEmptyString] = js.native
  /**
    * The parent process ID.
    */
  var ParentPid: js.UndefOr[Integer] = js.native
  /**
    * The path to the process executable.
    */
  var Path: js.UndefOr[NonEmptyString] = js.native
  /**
    * The process ID.
    */
  var Pid: js.UndefOr[Integer] = js.native
  /**
    * The date and time when the process was terminated.
    */
  var TerminatedAt: js.UndefOr[NonEmptyString] = js.native
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
    if (LaunchedAt != null) __obj.updateDynamic("LaunchedAt")(LaunchedAt.asInstanceOf[js.Any])
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (ParentPid != null) __obj.updateDynamic("ParentPid")(ParentPid.asInstanceOf[js.Any])
    if (Path != null) __obj.updateDynamic("Path")(Path.asInstanceOf[js.Any])
    if (Pid != null) __obj.updateDynamic("Pid")(Pid.asInstanceOf[js.Any])
    if (TerminatedAt != null) __obj.updateDynamic("TerminatedAt")(TerminatedAt.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProcessDetails]
  }
}

