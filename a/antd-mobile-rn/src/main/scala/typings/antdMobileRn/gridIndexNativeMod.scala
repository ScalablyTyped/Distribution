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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gridIndexNativeMod {
  
  @JSImport("antd-mobile-rn/lib/grid/index.native", JSImport.Default)
  @js.native
  class default () extends Grid
  /* static members */
  object default {
    
    @JSImport("antd-mobile-rn/lib/grid/index.native", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile-rn/lib/grid/index.native", "default.defaultProps")
    @js.native
    def defaultProps: CarouselMaxRow = js.native
    @scala.inline
    def defaultProps_=(x: CarouselMaxRow): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Grid
    extends Component[GridProps, js.Any, js.Any] {
    
    def getFlexItemStyle(columnNum: Double): BorderRightWidth = js.native
  }
  
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
    implicit class GridPropsMutableBuilder[Self <: GridProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCarouselProps(value: CarouselProps): Self = StObject.set(x, "carouselProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCarouselPropsUndefined: Self = StObject.set(x, "carouselProps", js.undefined)
      
      @scala.inline
      def setItemStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "itemStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setItemStyleNull: Self = StObject.set(x, "itemStyle", null)
      
      @scala.inline
      def setItemStyleUndefined: Self = StObject.set(x, "itemStyle", js.undefined)
      
      @scala.inline
      def setStyles(value: js.Any): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    }
  }
}
