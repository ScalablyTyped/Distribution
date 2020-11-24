package typings.antDesignReactNative.carouselMod

import typings.antDesignReactNative.carouselStyleMod.CarouselStyle
import typings.antDesignReactNative.libStyleMod.Theme
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import typings.std.ReturnType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PaginationProps extends js.Object {
  
  var count: Double = js.native
  
  var current: Double = js.native
  
  var dotActiveStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var dotStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
  
  var styles: ReturnType[js.Function1[/* theme */ Theme, CarouselStyle]] = js.native
  
  var vertical: js.UndefOr[Boolean] = js.native
}
object PaginationProps {
  
  @scala.inline
  def apply(count: Double, current: Double, styles: ReturnType[js.Function1[/* theme */ Theme, CarouselStyle]]): PaginationProps = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], current = current.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaginationProps]
  }
  
  @scala.inline
  implicit class PaginationPropsOps[Self <: PaginationProps] (val x: Self) extends AnyVal {
    
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
    def setCount(value: Double): Self = this.set("count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrent(value: Double): Self = this.set("current", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyles(value: ReturnType[js.Function1[/* theme */ Theme, CarouselStyle]]): Self = this.set("styles", value.asInstanceOf[js.Any])
    
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
    def setVertical(value: Boolean): Self = this.set("vertical", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVertical: Self = this.set("vertical", js.undefined)
  }
}
