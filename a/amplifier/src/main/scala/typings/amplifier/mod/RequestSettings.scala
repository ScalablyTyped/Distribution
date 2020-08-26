package typings.amplifier.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RequestSettings extends js.Object {
  var data: js.UndefOr[js.Any] = js.native
  var error: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.native
  var resourceId: String = js.native
  var success: js.UndefOr[js.Function1[/* repeated */ js.Any, Unit]] = js.native
}

object RequestSettings {
  @scala.inline
  def apply(resourceId: String): RequestSettings = {
    val __obj = js.Dynamic.literal(resourceId = resourceId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestSettings]
  }
  @scala.inline
  implicit class RequestSettingsOps[Self <: RequestSettings] (val x: Self) extends AnyVal {
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
    def setResourceId(value: String): Self = this.set("resourceId", value.asInstanceOf[js.Any])
    @scala.inline
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
    @scala.inline
    def setError(value: /* repeated */ js.Any => Unit): Self = this.set("error", js.Any.fromFunction1(value))
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    @scala.inline
    def setSuccess(value: /* repeated */ js.Any => Unit): Self = this.set("success", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
  }
  
}

