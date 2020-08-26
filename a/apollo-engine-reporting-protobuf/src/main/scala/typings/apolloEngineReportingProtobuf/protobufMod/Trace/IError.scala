package typings.apolloEngineReportingProtobuf.protobufMod.Trace

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Properties of an Error. */
@js.native
trait IError extends js.Object {
  /** Error json */
  var json: js.UndefOr[String | Null] = js.native
  /** Error location */
  var location: js.UndefOr[js.Array[ILocation] | Null] = js.native
  /** Error message */
  var message: js.UndefOr[String | Null] = js.native
  /** Error timeNs */
  var timeNs: js.UndefOr[Double | Null] = js.native
}

object IError {
  @scala.inline
  def apply(): IError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IError]
  }
  @scala.inline
  implicit class IErrorOps[Self <: IError] (val x: Self) extends AnyVal {
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
    def setJson(value: String): Self = this.set("json", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteJson: Self = this.set("json", js.undefined)
    @scala.inline
    def setJsonNull: Self = this.set("json", null)
    @scala.inline
    def setLocationVarargs(value: ILocation*): Self = this.set("location", js.Array(value :_*))
    @scala.inline
    def setLocation(value: js.Array[ILocation]): Self = this.set("location", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocation: Self = this.set("location", js.undefined)
    @scala.inline
    def setLocationNull: Self = this.set("location", null)
    @scala.inline
    def setMessage(value: String): Self = this.set("message", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessage: Self = this.set("message", js.undefined)
    @scala.inline
    def setMessageNull: Self = this.set("message", null)
    @scala.inline
    def setTimeNs(value: Double): Self = this.set("timeNs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeNs: Self = this.set("timeNs", js.undefined)
    @scala.inline
    def setTimeNsNull: Self = this.set("timeNs", null)
  }
  
}

