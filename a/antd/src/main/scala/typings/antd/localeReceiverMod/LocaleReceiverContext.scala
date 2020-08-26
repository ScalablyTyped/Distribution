package typings.antd.localeReceiverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocaleReceiverContext extends js.Object {
  var antLocale: js.UndefOr[LocaleInterface] = js.native
}

object LocaleReceiverContext {
  @scala.inline
  def apply(): LocaleReceiverContext = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LocaleReceiverContext]
  }
  @scala.inline
  implicit class LocaleReceiverContextOps[Self <: LocaleReceiverContext] (val x: Self) extends AnyVal {
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
    def setAntLocale(value: LocaleInterface): Self = this.set("antLocale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAntLocale: Self = this.set("antLocale", js.undefined)
  }
  
}

