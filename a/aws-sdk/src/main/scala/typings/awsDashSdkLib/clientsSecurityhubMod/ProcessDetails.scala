package typings
package awsDashSdkLib.clientsSecurityhubMod

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
    ParentPid: js.UndefOr[Integer] = js.undefined,
    Path: NonEmptyString = null,
    Pid: js.UndefOr[Integer] = js.undefined,
    TerminatedAt: NonEmptyString = null
  ): ProcessDetails = {
    val __obj = js.Dynamic.literal()
    if (LaunchedAt != null) __obj.updateDynamic("LaunchedAt")(LaunchedAt)
    if (Name != null) __obj.updateDynamic("Name")(Name)
    if (!js.isUndefined(ParentPid)) __obj.updateDynamic("ParentPid")(ParentPid)
    if (Path != null) __obj.updateDynamic("Path")(Path)
    if (!js.isUndefined(Pid)) __obj.updateDynamic("Pid")(Pid)
    if (TerminatedAt != null) __obj.updateDynamic("TerminatedAt")(TerminatedAt)
    __obj.asInstanceOf[ProcessDetails]
  }
}

