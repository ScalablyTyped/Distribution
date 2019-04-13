package typings
package awsDashSdkLib.clientsDevicefarmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Problem extends js.Object {
  /**
    * Information about the associated device.
    */
  var device: js.UndefOr[Device] = js.undefined
  /**
    * Information about the associated job.
    */
  var job: js.UndefOr[ProblemDetail] = js.undefined
  /**
    * A message about the problem's result.
    */
  var message: js.UndefOr[Message] = js.undefined
  /**
    * The problem's result. Allowed values include:   PENDING: A pending condition.   PASSED: A passing condition.   WARNED: A warning condition.   FAILED: A failed condition.   SKIPPED: A skipped condition.   ERRORED: An error condition.   STOPPED: A stopped condition.  
    */
  var result: js.UndefOr[ExecutionResult] = js.undefined
  /**
    * Information about the associated run.
    */
  var run: js.UndefOr[ProblemDetail] = js.undefined
  /**
    * Information about the associated suite.
    */
  var suite: js.UndefOr[ProblemDetail] = js.undefined
  /**
    * Information about the associated test.
    */
  var test: js.UndefOr[ProblemDetail] = js.undefined
}

object Problem {
  @scala.inline
  def apply(
    device: Device = null,
    job: ProblemDetail = null,
    message: Message = null,
    result: ExecutionResult = null,
    run: ProblemDetail = null,
    suite: ProblemDetail = null,
    test: ProblemDetail = null
  ): Problem = {
    val __obj = js.Dynamic.literal()
    if (device != null) __obj.updateDynamic("device")(device)
    if (job != null) __obj.updateDynamic("job")(job)
    if (message != null) __obj.updateDynamic("message")(message)
    if (result != null) __obj.updateDynamic("result")(result.asInstanceOf[js.Any])
    if (run != null) __obj.updateDynamic("run")(run)
    if (suite != null) __obj.updateDynamic("suite")(suite)
    if (test != null) __obj.updateDynamic("test")(test)
    __obj.asInstanceOf[Problem]
  }
}

