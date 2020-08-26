package typings.antDesignReactNative.listMod

import typings.antDesignReactNative.libStyleMod.WithThemeStyles
import typings.antDesignReactNative.listPropsTypeMod.ListPropsType
import typings.antDesignReactNative.listStyleMod.ListStyle
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ListProps
  extends ListPropsType
     with WithThemeStyles[ListStyle] {
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.native
}

object ListProps {
  @scala.inline
  def apply(): ListProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListProps]
  }
  @scala.inline
  implicit class ListPropsOps[Self <: ListProps] (val x: Self) extends AnyVal {
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
    def setStyle(value: StyleProp[ViewStyle]): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setStyleNull: Self = this.set("style", null)
  }
  
}

