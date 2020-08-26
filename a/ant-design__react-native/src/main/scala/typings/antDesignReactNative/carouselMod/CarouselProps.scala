package typings.antDesignReactNative.carouselMod

import typings.react.mod.ReactNode
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CarouselProps extends CarouselPropsType {
  var afterChange: js.UndefOr[js.Function1[/* index */ Double, Unit]] = js.native
  var dotActiveStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var dotStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var pagination: js.UndefOr[js.Function1[/* props */ PaginationProps, ReactNode]] = js.native
  var style: js.UndefOr[StyleProp[ViewStyle]] = js.native
}

object CarouselProps {
  @scala.inline
  def apply(): CarouselProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CarouselProps]
  }
  @scala.inline
  implicit class CarouselPropsOps[Self <: CarouselProps] (val x: Self) extends AnyVal {
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
    def setAfterChange(value: /* index */ Double => Unit): Self = this.set("afterChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteAfterChange: Self = this.set("afterChange", js.undefined)
    @scala.inline
    def setDotActiveStyle(value: StyleProp[ViewStyle]): Self = this.set("dotActiveStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDotActiveStyle: Self = this.set("dotActiveStyle", js.undefined)
    @scala.inline
    def setDotActiveStyleNull: Self = this.set("dotActiveStyle", null)
    @scala.inline
    def setDotStyle(value: StyleProp[ViewStyle]): Self = this.set("dotStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDotStyle: Self = this.set("dotStyle", js.undefined)
    @scala.inline
    def setDotStyleNull: Self = this.set("dotStyle", null)
    @scala.inline
    def setPagination(value: /* props */ PaginationProps => ReactNode): Self = this.set("pagination", js.Any.fromFunction1(value))
    @scala.inline
    def deletePagination: Self = this.set("pagination", js.undefined)
    @scala.inline
    def setStyle(value: StyleProp[ViewStyle]): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    @scala.inline
    def setStyleNull: Self = this.set("style", null)
  }
  
}

