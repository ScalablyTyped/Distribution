package typings.antdMobileRn.gridIndexNativeMod

import typings.antdMobileRn.carouselIndexNativeMod.CarouselProps
import typings.antdMobileRn.gridPropsTypeMod.GridPropsType
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GridProps extends GridPropsType {
  var carouselProps: js.UndefOr[CarouselProps] = js.native
  var itemStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  var styles: js.UndefOr[js.Any] = js.native
}

object GridProps {
  @scala.inline
  def apply(): GridProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GridProps]
  }
  @scala.inline
  implicit class GridPropsOps[Self <: GridProps] (val x: Self) extends AnyVal {
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
    def setCarouselProps(value: CarouselProps): Self = this.set("carouselProps", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCarouselProps: Self = this.set("carouselProps", js.undefined)
    @scala.inline
    def setItemStyle(value: StyleProp[ViewStyle]): Self = this.set("itemStyle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteItemStyle: Self = this.set("itemStyle", js.undefined)
    @scala.inline
    def setItemStyleNull: Self = this.set("itemStyle", null)
    @scala.inline
    def setStyles(value: js.Any): Self = this.set("styles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyles: Self = this.set("styles", js.undefined)
  }
  
}

