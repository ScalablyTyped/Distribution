package typings.antDesignReactNative.libStyleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UseThemeContextProps extends js.Object {
  var theme: js.UndefOr[PartialTheme] = js.native
}

object UseThemeContextProps {
  @scala.inline
  def apply(): UseThemeContextProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UseThemeContextProps]
  }
  @scala.inline
  implicit class UseThemeContextPropsOps[Self <: UseThemeContextProps] (val x: Self) extends AnyVal {
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
    def setTheme(value: PartialTheme): Self = this.set("theme", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
  }
  
}

