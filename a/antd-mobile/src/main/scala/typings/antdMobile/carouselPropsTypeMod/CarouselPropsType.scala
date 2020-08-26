package typings.antdMobile.carouselPropsTypeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CarouselPropsType extends js.Object {
  var autoplay: js.UndefOr[Boolean] = js.native
  var autoplayInterval: js.UndefOr[Double] = js.native
  var dots: js.UndefOr[Boolean] = js.native
  var infinite: js.UndefOr[Boolean] = js.native
  var initialSlideWidth: js.UndefOr[Double] = js.native
  var selectedIndex: js.UndefOr[Double] = js.native
  var vertical: js.UndefOr[Boolean] = js.native
}

object CarouselPropsType {
  @scala.inline
  def apply(): CarouselPropsType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CarouselPropsType]
  }
  @scala.inline
  implicit class CarouselPropsTypeOps[Self <: CarouselPropsType] (val x: Self) extends AnyVal {
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
    def setAutoplay(value: Boolean): Self = this.set("autoplay", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoplay: Self = this.set("autoplay", js.undefined)
    @scala.inline
    def setAutoplayInterval(value: Double): Self = this.set("autoplayInterval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAutoplayInterval: Self = this.set("autoplayInterval", js.undefined)
    @scala.inline
    def setDots(value: Boolean): Self = this.set("dots", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDots: Self = this.set("dots", js.undefined)
    @scala.inline
    def setInfinite(value: Boolean): Self = this.set("infinite", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInfinite: Self = this.set("infinite", js.undefined)
    @scala.inline
    def setInitialSlideWidth(value: Double): Self = this.set("initialSlideWidth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteInitialSlideWidth: Self = this.set("initialSlideWidth", js.undefined)
    @scala.inline
    def setSelectedIndex(value: Double): Self = this.set("selectedIndex", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSelectedIndex: Self = this.set("selectedIndex", js.undefined)
    @scala.inline
    def setVertical(value: Boolean): Self = this.set("vertical", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVertical: Self = this.set("vertical", js.undefined)
  }
  
}

