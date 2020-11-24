package typings.antDesignReactNative.gridMod

import typings.antDesignReactNative.carouselMod.CarouselProps
import typings.antDesignReactNative.gridPropsTypeMod.GridPropsType
import typings.antDesignReactNative.gridStyleMod.GridStyle
import typings.antDesignReactNative.libStyleMod.WithThemeStyles
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GridProps
  extends GridPropsType
     with WithThemeStyles[GridStyle] {
  
  var carouselProps: js.UndefOr[CarouselProps] = js.native
  
  var itemStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
}
object GridProps {
  
  @scala.inline
  def apply(carouselMaxRow: Double, columnNum: Double): GridProps = {
    val __obj = js.Dynamic.literal(carouselMaxRow = carouselMaxRow.asInstanceOf[js.Any], columnNum = columnNum.asInstanceOf[js.Any])
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
  }
}
