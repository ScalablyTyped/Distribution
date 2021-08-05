package typings.antdMobile

import typings.antdMobile.anon.Arrows
import typings.antdMobile.carouselPropsTypeMod.CarouselPropsType
import typings.react.mod.CSSProperties
import typings.react.mod.Component
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
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
    inline def defaultProps_=(x: Arrows): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait Carousel
    extends Component[CarouselProps, CarouselState, js.Any] {
    
    def onChange(index: Double): Unit = js.native
  }
  
  trait CarouselProps
    extends StObject
       with CarouselPropsType {
    
    var afterChange: js.UndefOr[js.Function1[/* current */ Double, Unit]] = js.undefined
    
    var beforeChange: js.UndefOr[js.Function2[/* from */ Double, /* to */ Double, Unit]] = js.undefined
    
    var cellSpacing: js.UndefOr[Double] = js.undefined
    
    var className: js.UndefOr[String] = js.undefined
    
    var dotActiveStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var dotStyle: js.UndefOr[CSSProperties] = js.undefined
    
    var easing: js.UndefOr[js.Function0[Unit]] = js.undefined
    
    var frameOverflow: js.UndefOr[IFrameOverFlow] = js.undefined
    
    var prefixCls: js.UndefOr[String] = js.undefined
    
    var slideWidth: js.UndefOr[String | Double] = js.undefined
    
    var style: js.UndefOr[CSSProperties] = js.undefined
    
    var swipeSpeed: js.UndefOr[Double] = js.undefined
  }
  object CarouselProps {
    
    inline def apply(): CarouselProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CarouselProps]
    }
    
    extension [Self <: CarouselProps](x: Self) {
      
      inline def setAfterChange(value: /* current */ Double => Unit): Self = StObject.set(x, "afterChange", js.Any.fromFunction1(value))
      
      inline def setAfterChangeUndefined: Self = StObject.set(x, "afterChange", js.undefined)
      
      inline def setBeforeChange(value: (/* from */ Double, /* to */ Double) => Unit): Self = StObject.set(x, "beforeChange", js.Any.fromFunction2(value))
      
      inline def setBeforeChangeUndefined: Self = StObject.set(x, "beforeChange", js.undefined)
      
      inline def setCellSpacing(value: Double): Self = StObject.set(x, "cellSpacing", value.asInstanceOf[js.Any])
      
      inline def setCellSpacingUndefined: Self = StObject.set(x, "cellSpacing", js.undefined)
      
      inline def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
      
      inline def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
      
      inline def setDotActiveStyle(value: CSSProperties): Self = StObject.set(x, "dotActiveStyle", value.asInstanceOf[js.Any])
      
      inline def setDotActiveStyleUndefined: Self = StObject.set(x, "dotActiveStyle", js.undefined)
      
      inline def setDotStyle(value: CSSProperties): Self = StObject.set(x, "dotStyle", value.asInstanceOf[js.Any])
      
      inline def setDotStyleUndefined: Self = StObject.set(x, "dotStyle", js.undefined)
      
      inline def setEasing(value: () => Unit): Self = StObject.set(x, "easing", js.Any.fromFunction0(value))
      
      inline def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
      
      inline def setFrameOverflow(value: IFrameOverFlow): Self = StObject.set(x, "frameOverflow", value.asInstanceOf[js.Any])
      
      inline def setFrameOverflowUndefined: Self = StObject.set(x, "frameOverflow", js.undefined)
      
      inline def setPrefixCls(value: String): Self = StObject.set(x, "prefixCls", value.asInstanceOf[js.Any])
      
      inline def setPrefixClsUndefined: Self = StObject.set(x, "prefixCls", js.undefined)
      
      inline def setSlideWidth(value: String | Double): Self = StObject.set(x, "slideWidth", value.asInstanceOf[js.Any])
      
      inline def setSlideWidthUndefined: Self = StObject.set(x, "slideWidth", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
      
      inline def setSwipeSpeed(value: Double): Self = StObject.set(x, "swipeSpeed", value.asInstanceOf[js.Any])
      
      inline def setSwipeSpeedUndefined: Self = StObject.set(x, "swipeSpeed", js.undefined)
    }
  }
  
  trait CarouselState extends StObject {
    
    var selectedIndex: js.UndefOr[Double] = js.undefined
  }
  object CarouselState {
    
    inline def apply(): CarouselState = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CarouselState]
    }
    
    extension [Self <: CarouselState](x: Self) {
      
      inline def setSelectedIndex(value: Double): Self = StObject.set(x, "selectedIndex", value.asInstanceOf[js.Any])
      
      inline def setSelectedIndexUndefined: Self = StObject.set(x, "selectedIndex", js.undefined)
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.antdMobile.antdMobileStrings.visible
    - typings.antdMobile.antdMobileStrings.hidden
  */
  trait IFrameOverFlow extends StObject
  object IFrameOverFlow {
    
    inline def hidden: typings.antdMobile.antdMobileStrings.hidden = "hidden".asInstanceOf[typings.antdMobile.antdMobileStrings.hidden]
    
    inline def visible: typings.antdMobile.antdMobileStrings.visible = "visible".asInstanceOf[typings.antdMobile.antdMobileStrings.visible]
  }
}
