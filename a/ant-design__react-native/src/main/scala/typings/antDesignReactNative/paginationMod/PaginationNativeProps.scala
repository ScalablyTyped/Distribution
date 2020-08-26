package typings.antDesignReactNative.paginationMod

import typings.antDesignReactNative.anon.NextText
import typings.antDesignReactNative.libStyleMod.WithThemeStyles
import typings.antDesignReactNative.paginationPropsTypeMod.PaginationPropsType
import typings.antDesignReactNative.paginationStyleMod.PaginationStyle
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PaginationNativeProps
  extends PaginationPropsType
     with WithThemeStyles[PaginationStyle] {
  var indicatorStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var locale: js.UndefOr[NextText] = js.native
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.native
}

object PaginationNativeProps {
  @scala.inline
  def apply(current: Double, total: Double): PaginationNativeProps = {
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaginationNativeProps]
  }
  @scala.inline
  implicit class PaginationNativePropsOps[Self <: PaginationNativeProps] (val x: Self) extends AnyVal {
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
    def setIndicatorStyle(value: StyleProp[ViewStyle]): Self = this.set("indicatorStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndicatorStyle: Self = this.set("indicatorStyle", js.undefined)
    @scala.inline
    def setIndicatorStyleNull: Self = this.set("indicatorStyle", null)
    @scala.inline
    def setLocale(value: NextText): Self = this.set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    @scala.inline
    def setStyle(value: StyleProp[ViewStyle]): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setStyleNull: Self = this.set("style", null)
  }
  
}

