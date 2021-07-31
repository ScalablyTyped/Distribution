package typings.antd

import org.scalablytyped.runtime.Shortcut
import typings.antDesignReactSlick.mod.LazyLoadTypes
import typings.antDesignReactSlick.mod.ResponsiveObject
import typings.antDesignReactSlick.mod.Slider
import typings.antDesignReactSlick.mod.SwipeDirection
import typings.antd.anon.ClassName
import typings.react.mod.CSSProperties
import typings.react.mod.ForwardRefExoticComponent
import typings.react.mod.ReactNode
import typings.react.mod.RefAttributes
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object carouselMod extends Shortcut {
  
  @JSImport("antd/lib/carousel", JSImport.Default)
  @js.native
  val default: ForwardRefExoticComponent[CarouselProps & RefAttributes[js.Any]] = js.native
  
  /* Rewritten from type alias, can be one of: 
    - typings.antd.antdStrings.scrollx
    - typings.antd.antdStrings.fade
  */
  trait CarouselEffect extends StObject
  object CarouselEffect {
    
    @scala.inline
    def fade: typings.antd.antdStrings.fade = "fade".asInstanceOf[typings.antd.antdStrings.fade]
    
    @scala.inline
    def scrollx: typings.antd.antdStrings.scrollx = "scrollx".asInstanceOf[typings.antd.antdStrings.scrollx]
  }
  
  /* Inlined parent std.Omit<@ant-design/react-slick.@ant-design/react-slick.Settings, 'dots' | 'dotsClass'> */
  trait CarouselProps extends StObject {
    
    var accessibility: js.UndefOr[Boolean] = js.undefined
    
    var adaptiveHeight: js.UndefOr[Boolean] = js.undefined
    
    var afterChange: js.UndefOr[js.Function1[/* currentSlide */ Double, Unit]] = js.undefined
    
    var appendDots: js.UndefOr[js.Function1[/* dots */ ReactNode, Element]] = js.undefined
    
    var arrows: js.UndefOr[Boolean] = js.undefined
    
    var asNavFor: js.UndefOr[Slider] = js.undefined
    
    var autoplay: js.UndefOr[Boolean] = js.undefined
    
    var autoplaySpeed: js.UndefOr[Double] = js.undefined
    
    var beforeChange: js.UndefOr[js.Function2[/* currentSlide */ Double, /* nextSlide */ Double, Unit]] = js.undefined
    
    var centerMode: js.UndefOr[Boolean] = js.undefined
    
    var centerPadding: js.UndefOr[String] = js.undefined
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var cssEase: js.UndefOr[String] = js.undefined
    
    var customPaging: js.UndefOr[js.Function1[/* index */ Double, Element]] = js.undefined
    
    var dotPosition: js.UndefOr[DotPosition] = js.undefined
    
    var dots: js.UndefOr[Boolean | ClassName] = js.undefined
    
    var draggable: js.UndefOr[Boolean] = js.undefined
    
    var easing: js.UndefOr[String] = js.undefined
    
    var edgeFriction: js.UndefOr[Double] = js.undefined
    
    var effect: js.UndefOr[CarouselEffect] = js.undefined
    
    var fade: js.UndefOr[Boolean] = js.undefined
    
    var focusOnSelect: js.UndefOr[Boolean] = js.undefined
    
    var infinite: js.UndefOr[Boolean] = js.undefined
    
    var initialSlide: js.UndefOr[Double] = js.undefined
    
    var lazyLoad: js.UndefOr[LazyLoadTypes] = js.undefined
    
    var nextArrow: js.UndefOr[Element] = js.undefined
    
    var onEdge: js.UndefOr[js.Function1[/* swipeDirection */ SwipeDirection, Unit]] = js.undefined
    
    var onInit: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onLazyLoad: js.UndefOr[js.Function1[/* slidesToLoad */ js.Array[Double], Unit]] = js.undefined
    
    var onReInit: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var onSwipe: js.UndefOr[js.Function1[/* swipeDirection */ SwipeDirection, Unit]] = js.undefined
    
    var pauseOnDotsHover: js.UndefOr[Boolean] = js.undefined
    
    var pauseOnFocus: js.UndefOr[Boolean] = js.undefined
    
    var pauseOnHover: js.UndefOr[Boolean] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var prevArrow: js.UndefOr[Element] = js.undefined
    
    var responsive: js.UndefOr[js.Array[ResponsiveObject]] = js.undefined
    
    var rows: js.UndefOr[Double] = js.undefined
    
    var rtl: js.UndefOr[Boolean] = js.undefined
    
    var slickGoTo: js.UndefOr[Double] = js.undefined
    
    var slide: js.UndefOr[String] = js.undefined
    
    var slidesPerRow: js.UndefOr[Double] = js.undefined
    
    var slidesToScroll: js.UndefOr[Double] = js.undefined
    
    var slidesToShow: js.UndefOr[Double] = js.undefined
    
    var speed: js.UndefOr[Double] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var swipe: js.UndefOr[Boolean] = js.undefined
    
    var swipeEvent: js.UndefOr[js.Function1[/* swipeDirection */ SwipeDirection, Unit]] = js.undefined
    
    var swipeToSlide: js.UndefOr[Boolean] = js.undefined
    
    var touchMove: js.UndefOr[Boolean] = js.undefined
    
    var touchThreshold: js.UndefOr[Double] = js.undefined
    
    var useCSS: js.UndefOr[Boolean] = js.undefined
    
    var useTransform: js.UndefOr[Boolean] = js.undefined
    
    var variableWidth: js.UndefOr[Boolean] = js.undefined
    
    var vertical: js.UndefOr[Boolean] = js.undefined
    
    var verticalSwiping: js.UndefOr[Boolean] = js.undefined
    
    var waitForAnimate: js.UndefOr[Boolean] = js.undefined
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
      def setAccessibility(value: Boolean): Self = StObject.set(x, "accessibility", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAccessibilityUndefined: Self = StObject.set(x, "accessibility", js.undefined)
      
      @scala.inline
      def setAdaptiveHeight(value: Boolean): Self = StObject.set(x, "adaptiveHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAdaptiveHeightUndefined: Self = StObject.set(x, "adaptiveHeight", js.undefined)
      
      @scala.inline
      def setAfterChange(value: /* currentSlide */ Double => Unit): Self = StObject.set(x, "afterChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAfterChangeUndefined: Self = StObject.set(x, "afterChange", js.undefined)
      
      @scala.inline
      def setAppendDots(value: /* dots */ ReactNode => Element): Self = StObject.set(x, "appendDots", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAppendDotsUndefined: Self = StObject.set(x, "appendDots", js.undefined)
      
      @scala.inline
      def setArrows(value: Boolean): Self = StObject.set(x, "arrows", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setArrowsUndefined: Self = StObject.set(x, "arrows", js.undefined)
      
      @scala.inline
      def setAsNavFor(value: Slider): Self = StObject.set(x, "asNavFor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsNavForUndefined: Self = StObject.set(x, "asNavFor", js.undefined)
      
      @scala.inline
      def setAutoplay(value: Boolean): Self = StObject.set(x, "autoplay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoplaySpeed(value: Double): Self = StObject.set(x, "autoplaySpeed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoplaySpeedUndefined: Self = StObject.set(x, "autoplaySpeed", js.undefined)
      
      @scala.inline
      def setAutoplayUndefined: Self = StObject.set(x, "autoplay", js.undefined)
      
      @scala.inline
      def setBeforeChange(value: (/* currentSlide */ Double, /* nextSlide */ Double) => Unit): Self = StObject.set(x, "beforeChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setBeforeChangeUndefined: Self = StObject.set(x, "beforeChange", js.undefined)
      
      @scala.inline
      def setCenterMode(value: Boolean): Self = StObject.set(x, "centerMode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCenterModeUndefined: Self = StObject.set(x, "centerMode", js.undefined)
      
      @scala.inline
      def setCenterPadding(value: String): Self = StObject.set(x, "centerPadding", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCenterPaddingUndefined: Self = StObject.set(x, "centerPadding", js.undefined)
      
      @scala.inline
      def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setCssEase(value: String): Self = StObject.set(x, "cssEase", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCssEaseUndefined: Self = StObject.set(x, "cssEase", js.undefined)
      
      @scala.inline
      def setCustomPaging(value: /* index */ Double => Element): Self = StObject.set(x, "customPaging", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCustomPagingUndefined: Self = StObject.set(x, "customPaging", js.undefined)
      
      @scala.inline
      def setDotPosition(value: DotPosition): Self = StObject.set(x, "dotPosition", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDotPositionUndefined: Self = StObject.set(x, "dotPosition", js.undefined)
      
      @scala.inline
      def setDots(value: Boolean | ClassName): Self = StObject.set(x, "dots", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDotsUndefined: Self = StObject.set(x, "dots", js.undefined)
      
      @scala.inline
      def setDraggable(value: Boolean): Self = StObject.set(x, "draggable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDraggableUndefined: Self = StObject.set(x, "draggable", js.undefined)
      
      @scala.inline
      def setEasing(value: String): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
      
      @scala.inline
      def setEdgeFriction(value: Double): Self = StObject.set(x, "edgeFriction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEdgeFrictionUndefined: Self = StObject.set(x, "edgeFriction", js.undefined)
      
      @scala.inline
      def setEffect(value: CarouselEffect): Self = StObject.set(x, "effect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEffectUndefined: Self = StObject.set(x, "effect", js.undefined)
      
      @scala.inline
      def setFade(value: Boolean): Self = StObject.set(x, "fade", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFadeUndefined: Self = StObject.set(x, "fade", js.undefined)
      
      @scala.inline
      def setFocusOnSelect(value: Boolean): Self = StObject.set(x, "focusOnSelect", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocusOnSelectUndefined: Self = StObject.set(x, "focusOnSelect", js.undefined)
      
      @scala.inline
      def setInfinite(value: Boolean): Self = StObject.set(x, "infinite", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInfiniteUndefined: Self = StObject.set(x, "infinite", js.undefined)
      
      @scala.inline
      def setInitialSlide(value: Double): Self = StObject.set(x, "initialSlide", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitialSlideUndefined: Self = StObject.set(x, "initialSlide", js.undefined)
      
      @scala.inline
      def setLazyLoad(value: LazyLoadTypes): Self = StObject.set(x, "lazyLoad", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLazyLoadUndefined: Self = StObject.set(x, "lazyLoad", js.undefined)
      
      @scala.inline
      def setNextArrow(value: Element): Self = StObject.set(x, "nextArrow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNextArrowUndefined: Self = StObject.set(x, "nextArrow", js.undefined)
      
      @scala.inline
      def setOnEdge(value: /* swipeDirection */ SwipeDirection => Unit): Self = StObject.set(x, "onEdge", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnEdgeUndefined: Self = StObject.set(x, "onEdge", js.undefined)
      
      @scala.inline
      def setOnInit(value: () => Unit): Self = StObject.set(x, "onInit", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnInitUndefined: Self = StObject.set(x, "onInit", js.undefined)
      
      @scala.inline
      def setOnLazyLoad(value: /* slidesToLoad */ js.Array[Double] => Unit): Self = StObject.set(x, "onLazyLoad", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnLazyLoadUndefined: Self = StObject.set(x, "onLazyLoad", js.undefined)
      
      @scala.inline
      def setOnReInit(value: () => Unit): Self = StObject.set(x, "onReInit", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnReInitUndefined: Self = StObject.set(x, "onReInit", js.undefined)
      
      @scala.inline
      def setOnSwipe(value: /* swipeDirection */ SwipeDirection => Unit): Self = StObject.set(x, "onSwipe", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSwipeUndefined: Self = StObject.set(x, "onSwipe", js.undefined)
      
      @scala.inline
      def setPauseOnDotsHover(value: Boolean): Self = StObject.set(x, "pauseOnDotsHover", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPauseOnDotsHoverUndefined: Self = StObject.set(x, "pauseOnDotsHover", js.undefined)
      
      @scala.inline
      def setPauseOnFocus(value: Boolean): Self = StObject.set(x, "pauseOnFocus", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPauseOnFocusUndefined: Self = StObject.set(x, "pauseOnFocus", js.undefined)
      
      @scala.inline
      def setPauseOnHover(value: Boolean): Self = StObject.set(x, "pauseOnHover", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPauseOnHoverUndefined: Self = StObject.set(x, "pauseOnHover", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setPrevArrow(value: Element): Self = StObject.set(x, "prevArrow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrevArrowUndefined: Self = StObject.set(x, "prevArrow", js.undefined)
      
      @scala.inline
      def setResponsive(value: js.Array[ResponsiveObject]): Self = StObject.set(x, "responsive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResponsiveUndefined: Self = StObject.set(x, "responsive", js.undefined)
      
      @scala.inline
      def setResponsiveVarargs(value: ResponsiveObject*): Self = StObject.set(x, "responsive", js.Array(value :_*))
      
      @scala.inline
      def setRows(value: Double): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
      
      @scala.inline
      def setRtl(value: Boolean): Self = StObject.set(x, "rtl", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRtlUndefined: Self = StObject.set(x, "rtl", js.undefined)
      
      @scala.inline
      def setSlickGoTo(value: Double): Self = StObject.set(x, "slickGoTo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlickGoToUndefined: Self = StObject.set(x, "slickGoTo", js.undefined)
      
      @scala.inline
      def setSlide(value: String): Self = StObject.set(x, "slide", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlideUndefined: Self = StObject.set(x, "slide", js.undefined)
      
      @scala.inline
      def setSlidesPerRow(value: Double): Self = StObject.set(x, "slidesPerRow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlidesPerRowUndefined: Self = StObject.set(x, "slidesPerRow", js.undefined)
      
      @scala.inline
      def setSlidesToScroll(value: Double): Self = StObject.set(x, "slidesToScroll", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlidesToScrollUndefined: Self = StObject.set(x, "slidesToScroll", js.undefined)
      
      @scala.inline
      def setSlidesToShow(value: Double): Self = StObject.set(x, "slidesToShow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlidesToShowUndefined: Self = StObject.set(x, "slidesToShow", js.undefined)
      
      @scala.inline
      def setSpeed(value: Double): Self = StObject.set(x, "speed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSpeedUndefined: Self = StObject.set(x, "speed", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setSwipe(value: Boolean): Self = StObject.set(x, "swipe", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSwipeEvent(value: /* swipeDirection */ SwipeDirection => Unit): Self = StObject.set(x, "swipeEvent", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSwipeEventUndefined: Self = StObject.set(x, "swipeEvent", js.undefined)
      
      @scala.inline
      def setSwipeToSlide(value: Boolean): Self = StObject.set(x, "swipeToSlide", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSwipeToSlideUndefined: Self = StObject.set(x, "swipeToSlide", js.undefined)
      
      @scala.inline
      def setSwipeUndefined: Self = StObject.set(x, "swipe", js.undefined)
      
      @scala.inline
      def setTouchMove(value: Boolean): Self = StObject.set(x, "touchMove", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTouchMoveUndefined: Self = StObject.set(x, "touchMove", js.undefined)
      
      @scala.inline
      def setTouchThreshold(value: Double): Self = StObject.set(x, "touchThreshold", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTouchThresholdUndefined: Self = StObject.set(x, "touchThreshold", js.undefined)
      
      @scala.inline
      def setUseCSS(value: Boolean): Self = StObject.set(x, "useCSS", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseCSSUndefined: Self = StObject.set(x, "useCSS", js.undefined)
      
      @scala.inline
      def setUseTransform(value: Boolean): Self = StObject.set(x, "useTransform", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseTransformUndefined: Self = StObject.set(x, "useTransform", js.undefined)
      
      @scala.inline
      def setVariableWidth(value: Boolean): Self = StObject.set(x, "variableWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVariableWidthUndefined: Self = StObject.set(x, "variableWidth", js.undefined)
      
      @scala.inline
      def setVertical(value: Boolean): Self = StObject.set(x, "vertical", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerticalSwiping(value: Boolean): Self = StObject.set(x, "verticalSwiping", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVerticalSwipingUndefined: Self = StObject.set(x, "verticalSwiping", js.undefined)
      
      @scala.inline
      def setVerticalUndefined: Self = StObject.set(x, "vertical", js.undefined)
      
      @scala.inline
      def setWaitForAnimate(value: Boolean): Self = StObject.set(x, "waitForAnimate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setWaitForAnimateUndefined: Self = StObject.set(x, "waitForAnimate", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.antd.antdStrings.top
    - typings.antd.antdStrings.bottom
    - typings.antd.antdStrings.left
    - typings.antd.antdStrings.right
  */
  trait DotPosition extends StObject
  object DotPosition {
    
    @scala.inline
    def bottom: typings.antd.antdStrings.bottom = "bottom".asInstanceOf[typings.antd.antdStrings.bottom]
    
    @scala.inline
    def left: typings.antd.antdStrings.left = "left".asInstanceOf[typings.antd.antdStrings.left]
    
    @scala.inline
    def right: typings.antd.antdStrings.right = "right".asInstanceOf[typings.antd.antdStrings.right]
    
    @scala.inline
    def top: typings.antd.antdStrings.top = "top".asInstanceOf[typings.antd.antdStrings.top]
  }
  
  type _To = ForwardRefExoticComponent[CarouselProps & RefAttributes[js.Any]]
  
  /* This means you don't have to write `default`, but can instead just say `carouselMod.foo` */
  override def _to: ForwardRefExoticComponent[CarouselProps & RefAttributes[js.Any]] = default
}
