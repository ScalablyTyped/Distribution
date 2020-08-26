package typings.antdMobileRn.localeProviderMod

import typings.antdMobileRn.anon.DatePicker
import typings.react.mod.ReactElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LocaleProviderProps extends js.Object {
  var children: js.UndefOr[ReactElement] = js.native
  var locale: DatePicker = js.native
}

object LocaleProviderProps {
  @scala.inline
  def apply(locale: DatePicker): LocaleProviderProps = {
    val __obj = js.Dynamic.literal(locale = locale.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocaleProviderProps]
  }
  @scala.inline
  implicit class LocaleProviderPropsOps[Self <: LocaleProviderProps] (val x: Self) extends AnyVal {
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
    def setLocale(value: DatePicker): Self = this.set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def setChildren(value: ReactElement): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
  }
  
}

