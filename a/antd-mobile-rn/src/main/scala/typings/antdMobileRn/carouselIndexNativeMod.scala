package typings.antdMobileRn

import typings.antdMobileRn.carouselPropsTypeMod.CarouselPropsType
import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.reactNative.mod.LayoutChangeEvent
import typings.reactNative.mod.NativeScrollEvent
import typings.reactNative.mod.NativeSyntheticEvent
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object carouselIndexNativeMod {
  
  @JSImport("antd-mobile-rn/lib/carousel/index.native", JSImport.Default)
  @js.native
  class default protected () extends Carousel {
    def this(props: CarouselProps) = this()
  }
  object default {
    
    @JSImport("antd-mobile-rn/lib/carousel/index.native", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /* static member */
    @JSImport("antd-mobile-rn/lib/carousel/index.native", "default.defaultProps")
    @js.native
    def defaultProps: CarouselProps = js.native
    @scala.inline
    def defaultProps_=(x: CarouselProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Carousel
    extends Component[CarouselProps, CarouselState, js.Any] {
    
    var androidScrollEndTimer: js.Any = js.native
    
    def autoplay(): Unit = js.native
    
    var autoplayTimer: js.Any = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MCarousel(): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MCarousel(): Unit = js.native
    
    def getChildrenCount(children: ReactNode): Double = js.native
    
    def loopJump(): Unit = js.native
    
    def onChildLayout(e: LayoutChangeEvent): Unit = js.native
    
    def onLayout(e: LayoutChangeEvent): Unit = js.native
    
    def onScrollBegin(e: NativeSyntheticEvent[NativeScrollEvent]): Unit = js.native
    
    def onScrollEnd(e: NativeSyntheticEvent[NativeScrollEvent]): Unit = js.native
    
    def onScrollEndDrag(e: NativeSyntheticEvent[NativeScrollEvent]): Unit = js.native
    
    def paging(offsetY: Double): Unit = js.native
    
    def renderContent(pages: ReactNode): Element = js.native
    
    def renderDots(index: Double): js.UndefOr[js.Object | Null] = js.native
    
    var scrollEndTimter: js.Any = js.native
    
    def scrollNextPage(): Unit = js.native
    
    var scrollviewRef: js.Any = js.native
    
    def updateIndex(offset: CarouselOffset): Unit = js.native
  }
  
  @js.native
  trait CarouselOffset extends StObject {
    
    var x: Double = js.native
    
    var y: Double = js.native
  }
  object CarouselOffset {
    
    @scala.inline
    def apply(x: Double, y: Double): CarouselOffset = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[CarouselOffset]
    }
    
    @scala.inline
    implicit class CarouselOffsetMutableBuilder[Self <: CarouselOffset] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait CarouselProps extends CarouselPropsType {
    
    var afterChange: js.UndefOr[js.Function1[/* index */ Double, Unit]] = js.native
    
    var bounces: js.UndefOr[Boolean] = js.native
    
    var dotActiveStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
    
    var dotStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
    
    var onMomentumScrollEnd: js.UndefOr[
        js.Function3[
          /* event */ NativeSyntheticEvent[NativeScrollEvent], 
          /* state */ CarouselState, 
          /* carousel */ Carousel, 
          Unit
        ]
      ] = js.native
    
    var onScrollBeginDrag: js.UndefOr[
        js.Function3[
          /* event */ NativeSyntheticEvent[NativeScrollEvent], 
          /* state */ CarouselState, 
          /* carousel */ Carousel, 
          Unit
        ]
      ] = js.native
    
    var pagination: js.UndefOr[js.Function1[/* props */ PaginationProps, ReactNode]] = js.native
    
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.native
    
    var styles: js.UndefOr[js.Any] = js.native
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
      def setBounces(value: Boolean): Self = StObject.set(x, "bounces", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBouncesUndefined: Self = StObject.set(x, "bounces", js.undefined)
      
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
      def setOnMomentumScrollEnd(
        value: (/* event */ NativeSyntheticEvent[NativeScrollEvent], /* state */ CarouselState, /* carousel */ Carousel) => Unit
      ): Self = StObject.set(x, "onMomentumScrollEnd", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnMomentumScrollEndUndefined: Self = StObject.set(x, "onMomentumScrollEnd", js.undefined)
      
      @scala.inline
      def setOnScrollBeginDrag(
        value: (/* event */ NativeSyntheticEvent[NativeScrollEvent], /* state */ CarouselState, /* carousel */ Carousel) => Unit
      ): Self = StObject.set(x, "onScrollBeginDrag", js.Any.fromFunction3(value))
      
      @scala.inline
      def setOnScrollBeginDragUndefined: Self = StObject.set(x, "onScrollBeginDrag", js.undefined)
      
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
      
      @scala.inline
      def setStyles(value: js.Any): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    }
  }
  
  @js.native
  trait CarouselState extends StObject {
    
    var autoplayEnd: Boolean = js.native
    
    var height: Double = js.native
    
    var isScrolling: Boolean = js.native
    
    var loopJump: Boolean = js.native
    
    var offset: CarouselOffset = js.native
    
    var selectedIndex: Double = js.native
    
    var width: Double = js.native
  }
  object CarouselState {
    
    @scala.inline
    def apply(
      autoplayEnd: Boolean,
      height: Double,
      isScrolling: Boolean,
      loopJump: Boolean,
      offset: CarouselOffset,
      selectedIndex: Double,
      width: Double
    ): CarouselState = {
      val __obj = js.Dynamic.literal(autoplayEnd = autoplayEnd.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], isScrolling = isScrolling.asInstanceOf[js.Any], loopJump = loopJump.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], selectedIndex = selectedIndex.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[CarouselState]
    }
    
    @scala.inline
    implicit class CarouselStateMutableBuilder[Self <: CarouselState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoplayEnd(value: Boolean): Self = StObject.set(x, "autoplayEnd", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsScrolling(value: Boolean): Self = StObject.set(x, "isScrolling", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoopJump(value: Boolean): Self = StObject.set(x, "loopJump", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffset(value: CarouselOffset): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedIndex(value: Double): Self = StObject.set(x, "selectedIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait PaginationProps extends StObject {
    
    var count: Double = js.native
    
    var current: Double = js.native
    
    var dotActiveStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
    
    var dotStyle: js.UndefOr[StyleProp[ViewStyle]] = js.native
    
    var styles: js.Any = js.native
    
    var vertical: js.UndefOr[Boolean] = js.native
  }
  object PaginationProps {
    
    @scala.inline
    def apply(count: Double, current: Double, styles: js.Any): PaginationProps = {
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
      def setStyles(value: js.Any): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVertical(value: Boolean): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
    }
  }
}
