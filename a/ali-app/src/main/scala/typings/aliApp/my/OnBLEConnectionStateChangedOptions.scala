package typings.aliApp.my

import typings.aliApp.anon.Connected
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OnBLEConnectionStateChangedOptions
  extends BaseOptions[js.Any, js.Any] {
  @JSName("success")
  var success_OnBLEConnectionStateChangedOptions: js.UndefOr[js.Function1[/* res */ Connected, Unit]] = js.native
}

object OnBLEConnectionStateChangedOptions {
  @scala.inline
  def apply(): OnBLEConnectionStateChangedOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnBLEConnectionStateChangedOptions]
  }
  @scala.inline
  implicit class OnBLEConnectionStateChangedOptionsOps[Self <: OnBLEConnectionStateChangedOptions] (val x: Self) extends AnyVal {
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
    def setSuccess(value: /* res */ Connected => Unit): Self = this.set("success", js.Any.fromFunction1(value))
    @scala.inline
    def deleteSuccess: Self = this.set("success", js.undefined)
  }
  
}

