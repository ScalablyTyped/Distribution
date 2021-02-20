package typings.antDesignReactNative

import typings.antDesignReactNative.anon.BorderRightWidth
import typings.antDesignReactNative.carouselMod.CarouselProps
import typings.antDesignReactNative.gridPropsTypeMod.GridPropsType
import typings.antDesignReactNative.gridStyleMod.GridStyle
import typings.antDesignReactNative.libStyleMod.WithThemeStyles
import typings.react.mod.Component
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object gridMod {
  
  @JSImport("@ant-design/react-native/lib/grid", JSImport.Default)
  @js.native
  class default () extends Grid
  /* static members */
  object default {
    
    @JSImport("@ant-design/react-native/lib/grid", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@ant-design/react-native/lib/grid", "default.defaultProps")
    @js.native
    def defaultProps: GridProps = js.native
    @scala.inline
    def defaultProps_=(x: GridProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Grid
    extends Component[GridProps, js.Any, js.Any] {
    
    def getFlexItemStyle(columnNum: Double): BorderRightWidth = js.native
  }
  
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
    }
  }
}
