package typings.awsDashSdk.clientsCodedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Diagnostics extends js.Object {
  /**
    * The associated error code:   Success: The specified script ran.   ScriptMissing: The specified script was not found in the specified location.   ScriptNotExecutable: The specified script is not a recognized executable file type.   ScriptTimedOut: The specified script did not finish running in the specified time period.   ScriptFailed: The specified script failed to run as expected.   UnknownError: The specified script did not run for an unknown reason.  
    */
  var errorCode: js.UndefOr[LifecycleErrorCode] = js.undefined
  /**
    * The last portion of the diagnostic log. If available, AWS CodeDeploy returns up to the last 4 KB of the diagnostic log.
    */
  var logTail: js.UndefOr[LogTail] = js.undefined
  /**
    * The message associated with the error.
    */
  var message: js.UndefOr[LifecycleMessage] = js.undefined
  /**
    * The name of the script.
    */
  var scriptName: js.UndefOr[ScriptName] = js.undefined
}

object Diagnostics {
  @scala.inline
  def apply(
    errorCode: LifecycleErrorCode = null,
    logTail: LogTail = null,
    message: LifecycleMessage = null,
    scriptName: ScriptName = null
  ): Diagnostics = {
    val __obj = js.Dynamic.literal()
    if (errorCode != null) __obj.updateDynamic("errorCode")(errorCode.asInstanceOf[js.Any])
    if (logTail != null) __obj.updateDynamic("logTail")(logTail)
    if (message != null) __obj.updateDynamic("message")(message)
    if (scriptName != null) __obj.updateDynamic("scriptName")(scriptName)
    __obj.asInstanceOf[Diagnostics]
  }
}

