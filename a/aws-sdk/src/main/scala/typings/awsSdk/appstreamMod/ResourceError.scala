package typings.awsSdk.appstreamMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ResourceError extends js.Object {
  /**
    * The error code.
    */
  var ErrorCode: js.UndefOr[FleetErrorCode] = js.native
  /**
    * The error message.
    */
  var ErrorMessage: js.UndefOr[String] = js.native
  /**
    * The time the error occurred.
    */
  var ErrorTimestamp: js.UndefOr[Timestamp] = js.native
}

object ResourceError {
  @scala.inline
  def apply(): ResourceError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ResourceError]
  }
  @scala.inline
  implicit class ResourceErrorOps[Self <: ResourceError] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setErrorCode(value: FleetErrorCode): Self = this.set("ErrorCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorCode: Self = this.set("ErrorCode", js.undefined)
    @scala.inline
    def setErrorMessage(value: String): Self = this.set("ErrorMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorMessage: Self = this.set("ErrorMessage", js.undefined)
    @scala.inline
    def setErrorTimestamp(value: Timestamp): Self = this.set("ErrorTimestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorTimestamp: Self = this.set("ErrorTimestamp", js.undefined)
  }
  
}

