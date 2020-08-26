package typings.awsSdk.autoscalingMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FailedScheduledUpdateGroupActionRequest extends js.Object {
  /**
    * The error code.
    */
  var ErrorCode: js.UndefOr[XmlStringMaxLen64] = js.native
  /**
    * The error message accompanying the error code.
    */
  var ErrorMessage: js.UndefOr[XmlString] = js.native
  /**
    * The name of the scheduled action.
    */
  var ScheduledActionName: XmlStringMaxLen255 = js.native
}

object FailedScheduledUpdateGroupActionRequest {
  @scala.inline
  def apply(ScheduledActionName: XmlStringMaxLen255): FailedScheduledUpdateGroupActionRequest = {
    val __obj = js.Dynamic.literal(ScheduledActionName = ScheduledActionName.asInstanceOf[js.Any])
    __obj.asInstanceOf[FailedScheduledUpdateGroupActionRequest]
  }
  @scala.inline
  implicit class FailedScheduledUpdateGroupActionRequestOps[Self <: FailedScheduledUpdateGroupActionRequest] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setScheduledActionName(value: XmlStringMaxLen255): Self = this.set("ScheduledActionName", value.asInstanceOf[js.Any])
    @scala.inline
    def setErrorCode(value: XmlStringMaxLen64): Self = this.set("ErrorCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorCode: Self = this.set("ErrorCode", js.undefined)
    @scala.inline
    def setErrorMessage(value: XmlString): Self = this.set("ErrorMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorMessage: Self = this.set("ErrorMessage", js.undefined)
  }
  
}

