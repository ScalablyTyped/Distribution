package typings.antDesignReactNative

import org.scalablytyped.runtime.Instantiable0
import typings.antDesignReactNative.carouselStyleMod.CarouselStyle
import typings.antDesignReactNative.libStyleMod.Theme
import typings.antDesignReactNative.libStyleMod.WithThemeStyles
import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.react.mod.RefObject
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object carouselMod {
  
  @JSImport("@ant-design/react-native/lib/carousel", JSImport.Default)
  @js.native
  class default protected () extends Carousel {
    def this(props: CarouselProps) = this()
  }
  object default {
    
    @JSImport("@ant-design/react-native/lib/carousel", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("@ant-design/react-native/lib/carousel", "default.defaultProps")
    @js.native
    def defaultProps: CarouselProps = js.native
    @scala.inline
    def defaultProps_=(x: CarouselProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Carousel
    extends Component[CarouselProps, CarouselState, js.Any] {
    
    var autoplay: js.Any = js.native
    
    var autoplayTimer: js.Any = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MCarousel(): Unit = js.native
    
    @JSName("componentDidUpdate")
    def componentDidUpdate_MCarousel(prevProps: CarouselProps): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MCarousel(): Unit = js.native
    
    var getChildrenCount: js.Any = js.native
    
    /**
      * go to index
      * @param index
      */
    def goTo(index: Double): Unit = js.native
    
    var renderDots: js.Any = js.native
    
    var viewPager: RefObject[Instantiable0[typings.reactNativeCommunityViewpager.mod.default]] = js.native
  }
  
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
    implicit class CarouselPropsMutableBuilder[Self <: CarouselProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAfterChange(value: /* index */ Double => Unit): Self = StObject.set(x, "afterChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAfterChangeUndefined: Self = StObject.set(x, "afterChange", js.undefined)
      
      @scala.inline
      def setDotActiveStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "dotActiveStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDotActiveStyleNull: Self = StObject.set(x, "dotActiveStyle", null)
      
      @scala.inline
      def setDotActiveStyleUndefined: Self = StObject.set(x, "dotActiveStyle", js.undefined)
      
      @scala.inline
      def setDotStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "dotStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDotStyleNull: Self = StObject.set(x, "dotStyle", null)
      
      @scala.inline
      def setDotStyleUndefined: Self = StObject.set(x, "dotStyle", js.undefined)
      
      @scala.inline
      def setPagination(value: /* props */ PaginationProps => ReactNode): Self = StObject.set(x, "pagination", js.Any.fromFunction1(value))
      
      @scala.inline
      def setPaginationUndefined: Self = StObject.set(x, "pagination", js.undefined)
      
      @scala.inline
      def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleNull: Self = StObject.set(x, "style", null)
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  @js.native
  trait CarouselPropsType extends WithThemeStyles[CarouselStyle] {
    
    var autoplay: js.UndefOr[Boolean] = js.native
    
    var autoplayInterval: js.UndefOr[Double] = js.native
    
    var dots: js.UndefOr[Boolean] = js.native
    
    var infinite: js.UndefOr[Boolean] = js.native
    
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
    implicit class CarouselPropsTypeMutableBuilder[Self <: CarouselPropsType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoplay(value: Boolean): Self = StObject.set(x, "autoplay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoplayInterval(value: Double): Self = StObject.set(x, "autoplayInterval", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoplayIntervalUndefined: Self = StObject.set(x, "autoplayInterval", js.undefined)
      
      @scala.inline
      def setAutoplayUndefined: Self = StObject.set(x, "autoplay", js.undefined)
      
      @scala.inline
      def setDots(value: Boolean): Self = StObject.set(x, "dots", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDotsUndefined: Self = StObject.set(x, "dots", js.undefined)
      
      @scala.inline
      def setInfinite(value: Boolean): Self = StObject.set(x, "infinite", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInfiniteUndefined: Self = StObject.set(x, "infinite", js.undefined)
      
      @scala.inline
      def setSelectedIndex(value: Double): Self = StObject.set(x, "selectedIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedIndexUndefined: Self = StObject.set(x, "selectedIndex", js.undefined)
      
      @scala.inline
      def setVertical(value: Boolean): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
    }
  }
  
  @js.native
  trait CarouselState extends StObject {
    
    var isScrolling: Boolean = js.native
    
    var selectedIndex: Double = js.native
  }
  object CarouselState {
    
    @scala.inline
    def apply(isScrolling: Boolean, selectedIndex: Double): CarouselState = {
      val __obj = js.Dynamic.literal(isScrolling = isScrolling.asInstanceOf[js.Any], selectedIndex = selectedIndex.asInstanceOf[js.Any])
      __obj.asInstanceOf[CarouselState]
    }
    
    @scala.inline
    implicit class CarouselStateMutableBuilder[Self <: CarouselState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsScrolling(value: Boolean): Self = StObject.set(x, "isScrolling", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedIndex(value: Double): Self = StObject.set(x, "selectedIndex", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PaginationProps extends StObject {
    
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
    implicit class PaginationPropsMutableBuilder[Self <: PaginationProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrent(value: Double): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDotActiveStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "dotActiveStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDotActiveStyleNull: Self = StObject.set(x, "dotActiveStyle", null)
      
      @scala.inline
      def setDotActiveStyleUndefined: Self = StObject.set(x, "dotActiveStyle", js.undefined)
      
      @scala.inline
      def setDotStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "dotStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDotStyleNull: Self = StObject.set(x, "dotStyle", null)
      
      @scala.inline
      def setDotStyleUndefined: Self = StObject.set(x, "dotStyle", js.undefined)
      
      @scala.inline
      def setStyles(value: ReturnType[js.Function1[/* theme */ Theme, CarouselStyle]]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVertical(value: Boolean): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
    }
  }
}
