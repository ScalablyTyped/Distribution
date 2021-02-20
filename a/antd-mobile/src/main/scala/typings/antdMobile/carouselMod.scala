package typings.antdMobile

import typings.antdMobile.anon.Arrows
import typings.antdMobile.carouselPropsTypeMod.CarouselPropsType
import typings.react.mod.CSSProperties
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object carouselMod {
  
  @JSImport("antd-mobile/lib/carousel", JSImport.Default)
  @js.native
  class default protected () extends Carousel {
    def this(props: CarouselProps) = this()
  }
  /* static members */
  object default {
    
    @JSImport("antd-mobile/lib/carousel", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("antd-mobile/lib/carousel", "default.defaultProps")
    @js.native
    def defaultProps: Arrows = js.native
    @scala.inline
    def defaultProps_=(x: Arrows): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Carousel
    extends Component[CarouselProps, CarouselState, js.Any] {
    
    def onChange(index: Double): Unit = js.native
  }
  
  @js.native
  trait CarouselProps extends CarouselPropsType {
    
    var afterChange: js.UndefOr[js.Function1[/* current */ Double, Unit]] = js.native
    
    var beforeChange: js.UndefOr[js.Function2[/* from */ Double, /* to */ Double, Unit]] = js.native
    
    var cellSpacing: js.UndefOr[Double] = js.native
    
    var className: js.UndefOr[String] = js.native
    
    var dotActiveStyle: js.UndefOr[CSSProperties] = js.native
    
    var dotStyle: js.UndefOr[CSSProperties] = js.native
    
    var easing: js.UndefOr[js.Function0[Unit]] = js.native
    
    var frameOverflow: js.UndefOr[IFrameOverFlow] = js.native
    
    var prefixCls: js.UndefOr[String] = js.native
    
    var slideWidth: js.UndefOr[String | Double] = js.native
    
    var style: js.UndefOr[CSSProperties] = js.native
    
    var swipeSpeed: js.UndefOr[Double] = js.native
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
      def setAfterChange(value: /* current */ Double => Unit): Self = StObject.set(x, "afterChange", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAfterChangeUndefined: Self = StObject.set(x, "afterChange", js.undefined)
      
      @scala.inline
      def setBeforeChange(value: (/* from */ Double, /* to */ Double) => Unit): Self = StObject.set(x, "beforeChange", js.Any.fromFunction2(value))
      
      @scala.inline
      def setBeforeChangeUndefined: Self = StObject.set(x, "beforeChange", js.undefined)
      
      @scala.inline
      def setCellSpacing(value: Double): Self = StObject.set(x, "cellSpacing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCellSpacingUndefined: Self = StObject.set(x, "cellSpacing", js.undefined)
      
      @scala.inline
      def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      @scala.inline
      def setDotActiveStyle(value: CSSProperties): Self = StObject.set(x, "dotActiveStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDotActiveStyleUndefined: Self = StObject.set(x, "dotActiveStyle", js.undefined)
      
      @scala.inline
      def setDotStyle(value: CSSProperties): Self = StObject.set(x, "dotStyle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDotStyleUndefined: Self = StObject.set(x, "dotStyle", js.undefined)
      
      @scala.inline
      def setEasing(value: () => Unit): Self = StObject.set(x, "easing", js.Any.fromFunction0(value))
      
      @scala.inline
      def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
      
      @scala.inline
      def setFrameOverflow(value: IFrameOverFlow): Self = StObject.set(x, "frameOverflow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFrameOverflowUndefined: Self = StObject.set(x, "frameOverflow", js.undefined)
      
      @scala.inline
      def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      @scala.inline
      def setSlideWidth(value: String | Double): Self = StObject.set(x, "slideWidth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSlideWidthUndefined: Self = StObject.set(x, "slideWidth", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      @scala.inline
      def setSwipeSpeed(value: Double): Self = StObject.set(x, "swipeSpeed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSwipeSpeedUndefined: Self = StObject.set(x, "swipeSpeed", js.undefined)
    }
  }
  
  @js.native
  trait CarouselState extends StObject {
    
    var selectedIndex: js.UndefOr[Double] = js.native
  }
  object CarouselState {
    
    @scala.inline
    def apply(): CarouselState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CarouselState]
    }
    
    @scala.inline
    implicit class CarouselStateMutableBuilder[Self <: CarouselState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setSelectedIndex(value: Double): Self = StObject.set(x, "selectedIndex", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedIndexUndefined: Self = StObject.set(x, "selectedIndex", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.antdMobile.antdMobileStrings.visible
    - typings.antdMobile.antdMobileStrings.hidden
  */
  trait IFrameOverFlow extends StObject
  object IFrameOverFlow {
    
    @scala.inline
    def hidden: typings.antdMobile.antdMobileStrings.hidden = "hidden".asInstanceOf[typings.antdMobile.antdMobileStrings.hidden]
    
    @scala.inline
    def visible: typings.antdMobile.antdMobileStrings.visible = "visible".asInstanceOf[typings.antdMobile.antdMobileStrings.visible]
  }
}
