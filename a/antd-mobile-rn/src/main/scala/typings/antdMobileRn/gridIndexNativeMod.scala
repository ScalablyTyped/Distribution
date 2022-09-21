package typings.antdMobileRn

import typings.antdMobileRn.anon.BorderRightWidth
import typings.antdMobileRn.anon.CarouselMaxRow
import typings.antdMobileRn.carouselIndexNativeMod.CarouselProps
import typings.antdMobileRn.gridPropsTypeMod.GridPropsType
import typings.react.mod.Component
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gridIndexNativeMod {
  
  @JSImport("antd-mobile-rn/lib/grid/index.native", JSImport.Default)
  @js.native
  open class default () extends Grid
  /* static members */
  object default {
    
    @JSImport("antd-mobile-rn/lib/grid/index.native", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile-rn/lib/grid/index.native", "default.defaultProps")
    @js.native
    def defaultProps: CarouselMaxRow = js.native
    inline def defaultProps_=(x: CarouselMaxRow): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Grid extends Component[GridProps, Any, Any] {
    
    def getFlexItemStyle(columnNum: Double): BorderRightWidth = js.native
  }
  
  trait GridProps
    extends StObject
       with GridPropsType {
    
    var carouselProps: js.UndefOr[CarouselProps] = js.undefined
    
    var itemStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var styles: js.UndefOr[Any] = js.undefined
  }
  object GridProps {
    
    inline def apply(): GridProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GridProps]
    }
    
    extension [Self <: GridProps](x: Self) {
      
      inline def setCarouselProps(value: CarouselProps): Self = StObject.set(x, "carouselProps", value.asInstanceOf[js.Any])
      
      inline def setCarouselPropsUndefined: Self = StObject.set(x, "carouselProps", js.undefined)
      
      inline def setItemStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "itemStyle", value.asInstanceOf[js.Any])
      
      inline def setItemStyleNull: Self = StObject.set(x, "itemStyle", null)
      
      inline def setItemStyleUndefined: Self = StObject.set(x, "itemStyle", js.undefined)
      
      inline def setStyles(value: Any): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    }
  }
}
