package typings.antDesignReactNative

import typings.antDesignReactNative.anon.TargetedEventlayoutLayout
import typings.antDesignReactNative.carouselStyleMod.CarouselStyle
import typings.antDesignReactNative.libStyleMod.Theme
import typings.antDesignReactNative.libStyleMod.WithThemeStyles
import typings.react.mod.PureComponent
import typings.react.mod.ReactNode
import typings.reactNative.mod.NativeScrollEvent
import typings.reactNative.mod.NativeSyntheticEvent
import typings.reactNative.mod.ScrollViewProps
import typings.reactNative.mod.StyleProp
import typings.reactNative.mod.ViewStyle
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object carouselMod {
  
  @JSImport("@ant-design/react-native/lib/carousel", JSImport.Default)
  @js.native
  open class default protected () extends Carousel {
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
    inline def defaultProps_=(x: CarouselProps): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Carousel extends PureComponent[CarouselProps, CarouselState, Any] {
    
    @JSName("UNSAFE_componentWillReceiveProps")
    def UNSAFE_componentWillReceiveProps_MCarousel(nextProps: CarouselProps): Unit = js.native
    
    /* private */ var autoplay: Any = js.native
    
    /* private */ var autoplayTimer: Any = js.native
    
    @JSName("componentDidMount")
    def componentDidMount_MCarousel(): Unit = js.native
    
    @JSName("componentWillUnmount")
    def componentWillUnmount_MCarousel(): Unit = js.native
    
    /* private */ var count: Any = js.native
    
    /**
      * go to index
      * @param index
      * @param animated
      */
    def goTo(index: Double): Unit = js.native
    def goTo(index: Double, animated: Boolean): Unit = js.native
    
    def onLayout(e: NativeSyntheticEvent[TargetedEventlayoutLayout]): Unit = js.native
    
    def onScrollBegin(e: NativeSyntheticEvent[NativeScrollEvent]): Unit = js.native
    
    def onScrollEnd(e: NativeSyntheticEvent[NativeScrollEvent]): Unit = js.native
    
    def onScrollEndDrag(e: NativeSyntheticEvent[NativeScrollEvent]): Unit = js.native
    
    def onScrollForWeb(e: Any): Unit = js.native
    
    def onTouchEndForWeb(): Unit = js.native
    
    def onTouchStartForWeb(): Unit = js.native
    
    /* private */ var renderDots: Any = js.native
    
    /* private */ var renderScroll: Any = js.native
    
    /* private */ var scrollEndTimter: Any = js.native
    
    def scrollNextPage(): Unit = js.native
    
    def scrollToEnd(): Unit = js.native
    
    def scrollToStart(): Unit = js.native
    
    /* private */ var scrollview: Any = js.native
    
    def updateIndex(currentOffset: NativeScrollPoint): Unit = js.native
  }
  
  trait CarouselProps
    extends StObject
       with CarouselPropsType {
    
    var afterChange: js.UndefOr[js.Function1[/* index */ Double, Unit]] = js.undefined
    
    var dotActiveStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var dotStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var pagination: js.UndefOr[js.Function1[/* props */ PaginationProps, ReactNode]] = js.undefined
  }
  object CarouselProps {
    
    inline def apply(): CarouselProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CarouselProps]
    }
    
    extension [Self <: CarouselProps](x: Self) {
      
      inline def setAfterChange(value: /* index */ Double => Unit): Self = StObject.set(x, "afterChange", js.Any.fromFunction1(value))
      
      inline def setAfterChangeUndefined: Self = StObject.set(x, "afterChange", js.undefined)
      
      inline def setDotActiveStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "dotActiveStyle", value.asInstanceOf[js.Any])
      
      inline def setDotActiveStyleNull: Self = StObject.set(x, "dotActiveStyle", null)
      
      inline def setDotActiveStyleUndefined: Self = StObject.set(x, "dotActiveStyle", js.undefined)
      
      inline def setDotStyle(value: StyleProp[ViewStyle]): Self = StObject.set(x, "dotStyle", value.asInstanceOf[js.Any])
      
      inline def setDotStyleNull: Self = StObject.set(x, "dotStyle", null)
      
      inline def setDotStyleUndefined: Self = StObject.set(x, "dotStyle", js.undefined)
      
      inline def setPagination(value: /* props */ PaginationProps => ReactNode): Self = StObject.set(x, "pagination", js.Any.fromFunction1(value))
      
      inline def setPaginationUndefined: Self = StObject.set(x, "pagination", js.undefined)
    }
  }
  
  trait CarouselPropsType
    extends StObject
       with WithThemeStyles[CarouselStyle]
       with ScrollViewProps {
    
    var autoplay: js.UndefOr[Boolean] = js.undefined
    
    var autoplayInterval: js.UndefOr[Double] = js.undefined
    
    var dots: js.UndefOr[Boolean] = js.undefined
    
    var infinite: js.UndefOr[Boolean] = js.undefined
    
    var pageStyle: js.UndefOr[ViewStyle] = js.undefined
    
    var selectedIndex: js.UndefOr[Double] = js.undefined
    
    var vertical: js.UndefOr[Boolean] = js.undefined
  }
  object CarouselPropsType {
    
    inline def apply(): CarouselPropsType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CarouselPropsType]
    }
    
    extension [Self <: CarouselPropsType](x: Self) {
      
      inline def setAutoplay(value: Boolean): Self = StObject.set(x, "autoplay", value.asInstanceOf[js.Any])
      
      inline def setAutoplayInterval(value: Double): Self = StObject.set(x, "autoplayInterval", value.asInstanceOf[js.Any])
      
      inline def setAutoplayIntervalUndefined: Self = StObject.set(x, "autoplayInterval", js.undefined)
      
      inline def setAutoplayUndefined: Self = StObject.set(x, "autoplay", js.undefined)
      
      inline def setDots(value: Boolean): Self = StObject.set(x, "dots", value.asInstanceOf[js.Any])
      
      inline def setDotsUndefined: Self = StObject.set(x, "dots", js.undefined)
      
      inline def setInfinite(value: Boolean): Self = StObject.set(x, "infinite", value.asInstanceOf[js.Any])
      
      inline def setInfiniteUndefined: Self = StObject.set(x, "infinite", js.undefined)
      
      inline def setPageStyle(value: ViewStyle): Self = StObject.set(x, "pageStyle", value.asInstanceOf[js.Any])
      
      inline def setPageStyleUndefined: Self = StObject.set(x, "pageStyle", js.undefined)
      
      inline def setSelectedIndex(value: Double): Self = StObject.set(x, "selectedIndex", value.asInstanceOf[js.Any])
      
      inline def setSelectedIndexUndefined: Self = StObject.set(x, "selectedIndex", js.undefined)
      
      inline def setVertical(value: Boolean): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
      
      inline def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
    }
  }
  
  trait CarouselState extends StObject {
    
    var afterSelectedIndex: Double
    
    var height: Double
    
    var isScrolling: Boolean
    
    var offset: NativeScrollPoint
    
    var selectedIndex: Double
    
    var width: Double
  }
  object CarouselState {
    
    inline def apply(
      afterSelectedIndex: Double,
      height: Double,
      isScrolling: Boolean,
      offset: NativeScrollPoint,
      selectedIndex: Double,
      width: Double
    ): CarouselState = {
      val __obj = js.Dynamic.literal(afterSelectedIndex = afterSelectedIndex.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], isScrolling = isScrolling.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], selectedIndex = selectedIndex.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[CarouselState]
    }
    
    extension [Self <: CarouselState](x: Self) {
      
      inline def setAfterSelectedIndex(value: Double): Self = StObject.set(x, "afterSelectedIndex", value.asInstanceOf[js.Any])
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setIsScrolling(value: Boolean): Self = StObject.set(x, "isScrolling", value.asInstanceOf[js.Any])
      
      inline def setOffset(value: NativeScrollPoint): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      inline def setSelectedIndex(value: Double): Self = StObject.set(x, "selectedIndex", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
  
  trait NativeScrollPoint extends StObject {
    
    var x: Double
    
    var y: Double
  }
  object NativeScrollPoint {
    
    inline def apply(x: Double, y: Double): NativeScrollPoint = {
      val __obj = js.Dynamic.literal(x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
      __obj.asInstanceOf[NativeScrollPoint]
    }
    
    extension [Self <: NativeScrollPoint](x: Self) {
      
      inline def setX(value: Double): Self = StObject.set(x, "x", value.asInstanceOf[js.Any])
      
      inline def setY(value: Double): Self = StObject.set(x, "y", value.asInstanceOf[js.Any])
    }
  }
  
  trait PaginationProps extends StObject {
    
    var count: Double
    
    var current: Double
    
    var dotActiveStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var dotStyle: js.UndefOr[StyleProp[ViewStyle]] = js.undefined
    
    var styles: ReturnType[js.Function1[/* theme */ Theme, CarouselStyle]]
    
    var vertical: js.UndefOr[Boolean] = js.undefined
  }
  object PaginationProps {
    
    inline def apply(count: Double, current: Double, styles: ReturnType[js.Function1[/* theme */ Theme, CarouselStyle]]): PaginationProps = {
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
      
      inline def setStyles(value: ReturnType[js.Function1[/* theme */ Theme, CarouselStyle]]): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setVertical(value: Boolean): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
      
      inline def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
    }
  }
  
  trait TargetedEvent extends StObject {
    
    var target: Double
  }
  object TargetedEvent {
    
    inline def apply(target: Double): TargetedEvent = {
      val __obj = js.Dynamic.literal(target = target.asInstanceOf[js.Any])
      __obj.asInstanceOf[TargetedEvent]
    }
    
    extension [Self <: TargetedEvent](x: Self) {
      
      inline def setTarget(value: Double): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    }
  }
}
