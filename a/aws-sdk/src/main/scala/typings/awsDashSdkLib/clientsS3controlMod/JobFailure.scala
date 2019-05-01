package typings
package awsDashSdkLib.clientsS3controlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait JobFailure extends js.Object {
  /**
    * The failure code, if any, for the specified job.
    */
  var FailureCode: js.UndefOr[JobFailureCode] = js.undefined
  /**
    * The failure reason, if any, for the specified job.
    */
  var FailureReason: js.UndefOr[JobFailureReason] = js.undefined
}

object JobFailure {
  @scala.inline
  def apply(FailureCode: JobFailureCode = null, FailureReason: JobFailureReason = null): JobFailure = {
    val __obj = js.Dynamic.literal()
    if (FailureCode != null) __obj.updateDynamic("FailureCode")(FailureCode)
    if (FailureReason != null) __obj.updateDynamic("FailureReason")(FailureReason)
    __obj.asInstanceOf[JobFailure]
  }
}

