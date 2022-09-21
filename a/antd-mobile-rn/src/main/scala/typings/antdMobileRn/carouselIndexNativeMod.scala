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
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object carouselIndexNativeMod {
  
  @JSImport("antd-mobile-rn/lib/carousel/index.native", JSImport.Default)
  @js.native
  open class default protected () extends Carousel {
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
    inline def defaultProps_=(x: CarouselProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Carousel extends Component[CarouselProps, CarouselState, Any] {
    
    /* private */ var androidScrollEndTimer: Any = js.native
    
    def autoplay(): Unit = js.native
    
    /* private */ var autoplayTimer: Any = js.native
    
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
    
    /* private */ var scrollEndTimter: Any = js.native
    
    def scrollNextPage(): Unit = js.native
    
    /* private */ var scrollviewRef: Any = js.native
    
    def updateIndex(offset: CarouselOffset): Unit = js.native
  }
  
  trait CarouselOffset extends StObject {
    
    var x: Double
    
    var y: Double
  }
  object CarouselOffset {
    
    inline def apply(x: Double, y: Double): CarouselOffset = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[CarouselOffset]
    }
    
    extension [Self <: CarouselOffset](x: Self) {
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  trait CarouselProps
    extends StObject
       with CarouselPropsType {
    
    var afterChange: js.UndefOr[js.Function1[/* index */ Double, Unit]] = js.undefined
    
    var bounces: js.UndefOr[Boolean] = js.undefined
    
    var dotActiveStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var dotStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var onMomentumScrollEnd: js.UndefOr[
        js.Function3[
          /* event */ NativeSyntheticEvent[NativeScrollEvent], 
          /* state */ CarouselState, 
          /* carousel */ Carousel, 
          Unit
        ]
      ] = js.undefined
    
    var onScrollBeginDrag: js.UndefOr[
        js.Function3[
          /* event */ NativeSyntheticEvent[NativeScrollEvent], 
          /* state */ CarouselState, 
          /* carousel */ Carousel, 
          Unit
        ]
      ] = js.undefined
    
    var pagination: js.UndefOr[js.Function1[/* props */ PaginationProps, ReactNode]] = js.undefined
    
    var style: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var styles: js.UndefOr[Any] = js.undefined
  }
  object CarouselProps {
    
    inline def apply(): CarouselProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CarouselProps]
    }
    
    extension [Self <: CarouselProps](x: Self) {
      
      inline def setAfterChange(value: /* index */ Double => Unit): Self = StObject.set(x, "afterChange", js.Any.fromFunction1(value))
      
      inline def setAfterChangeUndefined: Self = StObject.set(x, "afterChange", js.undefined)
      
      inline def setBounces(value: Boolean): Self = StObject.set(x, "bounces", value.asInstanceOf[js.Any])
      
      inline def setBouncesUndefined: Self = StObject.set(x, "bounces", js.undefined)
      
      inline def setDotActiveStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "dotActiveStyle", value.asInstanceOf[js.Any])
      
      inline def setDotActiveStyleNull: Self = StObject.set(x, "dotActiveStyle", null)
      
      inline def setDotActiveStyleUndefined: Self = StObject.set(x, "dotActiveStyle", js.undefined)
      
      inline def setDotStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "dotStyle", value.asInstanceOf[js.Any])
      
      inline def setDotStyleNull: Self = StObject.set(x, "dotStyle", null)
      
      inline def setDotStyleUndefined: Self = StObject.set(x, "dotStyle", js.undefined)
      
      inline def setOnMomentumScrollEnd(
        value: (/* event */ NativeSyntheticEvent[NativeScrollEvent], /* state */ CarouselState, /* carousel */ Carousel) => Unit
      ): Self = StObject.set(x, "onMomentumScrollEnd", js.Any.fromFunction3(value))
      
      inline def setOnMomentumScrollEndUndefined: Self = StObject.set(x, "onMomentumScrollEnd", js.undefined)
      
      inline def setOnScrollBeginDrag(
        value: (/* event */ NativeSyntheticEvent[NativeScrollEvent], /* state */ CarouselState, /* carousel */ Carousel) => Unit
      ): Self = StObject.set(x, "onScrollBeginDrag", js.Any.fromFunction3(value))
      
      inline def setOnScrollBeginDragUndefined: Self = StObject.set(x, "onScrollBeginDrag", js.undefined)
      
      inline def setPagination(value: /* props */ PaginationProps => ReactNode): Self = StObject.set(x, "pagination", js.Any.fromFunction1(value))
      
      inline def setPaginationUndefined: Self = StObject.set(x, "pagination", js.undefined)
      
      inline def setStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleNull: Self = StObject.set(x, "style", null)
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setStyles(value: Any): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    }
  }
  
  trait CarouselState extends StObject {
    
    var autoplayEnd: Boolean
    
    var height: Double
    
    var isScrolling: Boolean
    
    var loopJump: Boolean
    
    var offset: CarouselOffset
    
    var selectedIndex: Double
    
    var width: Double
  }
  object CarouselState {
    
    inline def apply(
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
    
    extension [Self <: CarouselState](x: Self) {
      
      inline def setAutoplayEnd(value: Boolean): Self = StObject.set(x, "autoplayEnd", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setIsScrolling(value: Boolean): Self = StObject.set(x, "isScrolling", value.asInstanceOf[js.Any])
      
      inline def setLoopJump(value: Boolean): Self = StObject.set(x, "loopJump", value.asInstanceOf[js.Any])
      
      inline def setOffset(value: CarouselOffset): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setSelectedIndex(value: Double): Self = StObject.set(x, "selectedIndex", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait PaginationProps extends StObject {
    
    var count: Double
    
    var current: Double
    
    var dotActiveStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var dotStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var styles: Any
    
    var vertical: js.UndefOr[Boolean] = js.undefined
  }
  object PaginationProps {
    
    inline def apply(count: Double, current: Double, styles: Any): PaginationProps = {
      val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any], current = current.asInstanceOf[js.Any], styles = styles.asInstanceOf[js.Any])
      __obj.asInstanceOf[PaginationProps]
    }
    
    extension [Self <: PaginationProps](x: Self) {
      
      inline def setCount(value: Double): Self = StObject.set(x, "count", value.asInstanceOf[js.Any])
      
      inline def setCurrent(value: Double): Self = StObject.set(x, "current", value.asInstanceOf[js.Any])
      
      inline def setDotActiveStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "dotActiveStyle", value.asInstanceOf[js.Any])
      
      inline def setDotActiveStyleNull: Self = StObject.set(x, "dotActiveStyle", null)
      
      inline def setDotActiveStyleUndefined: Self = StObject.set(x, "dotActiveStyle", js.undefined)
      
      inline def setDotStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "dotStyle", value.asInstanceOf[js.Any])
      
      inline def setDotStyleNull: Self = StObject.set(x, "dotStyle", null)
      
      inline def setDotStyleUndefined: Self = StObject.set(x, "dotStyle", js.undefined)
      
      inline def setStyles(value: Any): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setVertical(value: Boolean): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
      
      inline def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
    }
  }
}
