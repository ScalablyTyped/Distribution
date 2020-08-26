package typings.amplifier.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AjaxSettings
  extends typings.jquery.JQuery.AjaxSettings[js.Any] {
  var dataMap: js.UndefOr[js.Object | (js.Function1[/* data */ js.Any, js.Object])] = js.native
  var decoder: js.UndefOr[js.Any] = js.native
}

object AjaxSettings {
  @scala.inline
  def apply(): AjaxSettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AjaxSettings]
  }
  @scala.inline
  implicit class AjaxSettingsOps[Self <: AjaxSettings] (val x: Self) extends AnyVal {
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
    def setDataMapFunction1(value: /* data */ js.Any => js.Object): Self = this.set("dataMap", js.Any.fromFunction1(value))
    @scala.inline
    def setDataMap(value: js.Object | (js.Function1[/* data */ js.Any, js.Object])): Self = this.set("dataMap", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDataMap: Self = this.set("dataMap", js.undefined)
    @scala.inline
    def setDecoder(value: js.Any): Self = this.set("decoder", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDecoder: Self = this.set("decoder", js.undefined)
  }
  
}

