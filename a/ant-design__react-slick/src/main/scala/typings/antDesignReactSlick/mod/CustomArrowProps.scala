package typings.antDesignReactSlick.mod

import typings.react.mod.CSSProperties
import typings.react.mod.MouseEvent
import typings.react.mod.MouseEventHandler
import typings.react.mod.NativeMouseEvent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CustomArrowProps extends js.Object {
  var className: js.UndefOr[String] = js.native
  var currentSlide: js.UndefOr[Double] = js.native
  var onClick: js.UndefOr[MouseEventHandler[_]] = js.native
  var slideCount: js.UndefOr[Double] = js.native
  var style: js.UndefOr[CSSProperties] = js.native
}

object CustomArrowProps {
  @scala.inline
  def apply(): CustomArrowProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CustomArrowProps]
  }
  @scala.inline
  implicit class CustomArrowPropsOps[Self <: CustomArrowProps] (val x: Self) extends AnyVal {
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
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    @scala.inline
    def setCurrentSlide(value: Double): Self = this.set("currentSlide", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCurrentSlide: Self = this.set("currentSlide", js.undefined)
    @scala.inline
    def setOnClick(value: MouseEvent[_, NativeMouseEvent] => Unit): Self = this.set("onClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnClick: Self = this.set("onClick", js.undefined)
    @scala.inline
    def setSlideCount(value: Double): Self = this.set("slideCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSlideCount: Self = this.set("slideCount", js.undefined)
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
  }
  
}

