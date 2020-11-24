package typings.antdMobile.carouselMod

import typings.antdMobile.carouselPropsTypeMod.CarouselPropsType
import typings.react.mod.CSSProperties
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CarouselProps extends CarouselPropsType {
  
  var afterChange: js.UndefOr[js.Function1[/* current */ Double, Unit]] = js.native
  
  var beforeChange: js.UndefOr[js.Function2[/* from */ Double, /* to */ Double, Unit]] = js.native
  
  var cellSpacing: js.UndefOr[Double] = js.native
  
  var className: js.UndefOr[String] = js.native
  
  var dotActiveStyle: js.UndefOr[CSSProperties] = js.native
  
  var dotStyle: js.UndefOr[CSSProperties] = js.native
  
  var easing: js.UndefOr[js.Function0[Unit]] = js.native
  
  var frameOverflow: js.UndefOr[IFrameOverFlow] = js.native
  
  var prefixCls: js.UndefOr[String] = js.native
  
  var slideWidth: js.UndefOr[String | Double] = js.native
  
  var style: js.UndefOr[CSSProperties] = js.native
  
  var swipeSpeed: js.UndefOr[Double] = js.native
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
    def setAfterChange(value: /* current */ Double => Unit): Self = this.set("afterChange", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteAfterChange: Self = this.set("afterChange", js.undefined)
    
    @scala.inline
    def setBeforeChange(value: (/* from */ Double, /* to */ Double) => Unit): Self = this.set("beforeChange", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteBeforeChange: Self = this.set("beforeChange", js.undefined)
    
    @scala.inline
    def setCellSpacing(value: Double): Self = this.set("cellSpacing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCellSpacing: Self = this.set("cellSpacing", js.undefined)
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setDotActiveStyle(value: CSSProperties): Self = this.set("dotActiveStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDotActiveStyle: Self = this.set("dotActiveStyle", js.undefined)
    
    @scala.inline
    def setDotStyle(value: CSSProperties): Self = this.set("dotStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDotStyle: Self = this.set("dotStyle", js.undefined)
    
    @scala.inline
    def setEasing(value: () => Unit): Self = this.set("easing", js.Any.fromFunction0(value))
    
    @scala.inline
    def deleteEasing: Self = this.set("easing", js.undefined)
    
    @scala.inline
    def setFrameOverflow(value: IFrameOverFlow): Self = this.set("frameOverflow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFrameOverflow: Self = this.set("frameOverflow", js.undefined)
    
    @scala.inline
    def setPrefixCls(value: String): Self = this.set("prefixCls", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePrefixCls: Self = this.set("prefixCls", js.undefined)
    
    @scala.inline
    def setSlideWidth(value: String | Double): Self = this.set("slideWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSlideWidth: Self = this.set("slideWidth", js.undefined)
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStyle: Self = this.set("style", js.undefined)
    
    @scala.inline
    def setSwipeSpeed(value: Double): Self = this.set("swipeSpeed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSwipeSpeed: Self = this.set("swipeSpeed", js.undefined)
  }
}
