package typings.antd.localeProviderMod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait LocaleProviderProps extends js.Object {
  var _ANT_MARK__ : js.UndefOr[String] = js.native
  var children: js.UndefOr[ReactNode] = js.native
  var locale: Locale = js.native
}

object LocaleProviderProps {
  @scala.inline
  def apply(locale: Locale): LocaleProviderProps = {
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
    def setLocale(value: Locale): Self = this.set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def set_ANT_MARK__(value: String): Self = this.set("_ANT_MARK__", value.asInstanceOf[js.Any])
    @scala.inline
    def delete_ANT_MARK__ : Self = this.set("_ANT_MARK__", js.undefined)
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
  }
  
}

