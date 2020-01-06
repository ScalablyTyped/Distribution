package typings.awsDashSdk.clientsCloudwatchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PartialFailure extends js.Object {
  /**
    * The type of error.
    */
  var ExceptionType: js.UndefOr[typings.awsDashSdk.clientsCloudwatchMod.ExceptionType] = js.native
  /**
    * The code of the error.
    */
  var FailureCode: js.UndefOr[typings.awsDashSdk.clientsCloudwatchMod.FailureCode] = js.native
  /**
    * A description of the error.
    */
  var FailureDescription: js.UndefOr[typings.awsDashSdk.clientsCloudwatchMod.FailureDescription] = js.native
  /**
    * The specified rule that could not be deleted.
    */
  var FailureResource: js.UndefOr[typings.awsDashSdk.clientsCloudwatchMod.FailureResource] = js.native
}

object PartialFailure {
  @scala.inline
  def apply(
    ExceptionType: ExceptionType = null,
    FailureCode: FailureCode = null,
    FailureDescription: FailureDescription = null,
    FailureResource: FailureResource = null
  ): PartialFailure = {
    val __obj = js.Dynamic.literal()
    if (ExceptionType != null) __obj.updateDynamic("ExceptionType")(ExceptionType.asInstanceOf[js.Any])
    if (FailureCode != null) __obj.updateDynamic("FailureCode")(FailureCode.asInstanceOf[js.Any])
    if (FailureDescription != null) __obj.updateDynamic("FailureDescription")(FailureDescription.asInstanceOf[js.Any])
    if (FailureResource != null) __obj.updateDynamic("FailureResource")(FailureResource.asInstanceOf[js.Any])
    __obj.asInstanceOf[PartialFailure]
  }
}

