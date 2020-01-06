package typings.awsDashSdk.clientsDataexchangeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait JobError extends js.Object {
  /**
    * The code for the job error.
    */
  var Code: typings.awsDashSdk.clientsDataexchangeMod.Code = js.native
  var Details: js.UndefOr[typings.awsDashSdk.clientsDataexchangeMod.Details] = js.native
  /**
    * The name of the limit that was reached.
    */
  var LimitName: js.UndefOr[JobErrorLimitName] = js.native
  /**
    * The value of the exceeded limit.
    */
  var LimitValue: js.UndefOr[__double] = js.native
  /**
    * The message related to the job error.
    */
  var Message: __string = js.native
  /**
    * The unqiue identifier for the resource related to the error.
    */
  var ResourceId: js.UndefOr[__string] = js.native
  /**
    * The type of resource related to the error.
    */
  var ResourceType: js.UndefOr[JobErrorResourceTypes] = js.native
}

object JobError {
  @scala.inline
  def apply(
    Code: Code,
    Message: __string,
    Details: Details = null,
    LimitName: JobErrorLimitName = null,
    LimitValue: Int | Double = null,
    ResourceId: __string = null,
    ResourceType: JobErrorResourceTypes = null
  ): JobError = {
    val __obj = js.Dynamic.literal(Code = Code.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any])
    if (Details != null) __obj.updateDynamic("Details")(Details.asInstanceOf[js.Any])
    if (LimitName != null) __obj.updateDynamic("LimitName")(LimitName.asInstanceOf[js.Any])
    if (LimitValue != null) __obj.updateDynamic("LimitValue")(LimitValue.asInstanceOf[js.Any])
    if (ResourceId != null) __obj.updateDynamic("ResourceId")(ResourceId.asInstanceOf[js.Any])
    if (ResourceType != null) __obj.updateDynamic("ResourceType")(ResourceType.asInstanceOf[js.Any])
    __obj.asInstanceOf[JobError]
  }
}

