package typings.aos

import org.scalablytyped.runtime.Shortcut
import typings.aos.aosStrings.mobile
import typings.aos.aosStrings.phone
import typings.aos.aosStrings.tablet
import typings.std.AddEventListenerOptions
import typings.std.Element
import typings.std.Event
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("aos", JSImport.Namespace)
  @js.native
  val ^ : Aos = js.native
  
  @js.native
  trait Aos extends StObject {
    
    /**
      * Initializing AOS
      * - Create options merging defaults with user defined options
      * - Set attributes on <body> as global setting - css relies on it
      * - Attach preparing elements to options.startEvent,
      *   window resize and orientation change
      * - Attach function that handle scroll and everything connected to it
      *   to window scroll event and fire once document is ready to set initial state
      *  @param options options
      */
    def init(): Unit = js.native
    def init(options: AosOptions): Unit = js.native
    
    /**
      * Refresh AOS
      */
    def refresh(): Unit = js.native
    
    /**
      * Hard refresh
      * create array with new elements and trigger refresh
      */
    def refreshHard(): Unit = js.native
  }
  
  @js.native
  trait AosEvent
    extends StObject
       with Event {
    
    var detail: Element = js.native
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.aos.aosStrings.aosColonin
    - typings.aos.aosStrings.aosColonout
  */
  trait AosEventType extends StObject
  object AosEventType {
    
    @scala.inline
    def aosColonin: typings.aos.aosStrings.aosColonin = "aos:in".asInstanceOf[typings.aos.aosStrings.aosColonin]
    
    @scala.inline
    def aosColonout: typings.aos.aosStrings.aosColonout = "aos:out".asInstanceOf[typings.aos.aosStrings.aosColonout]
  }
  
  trait AosOptions extends StObject {
    
    // #endregion
    // #region Settings that can be overridden on per-element basis, by `data-aos-*` attributes
    /**
      * Defines which position of the element regarding to window should trigger the animation
      */
    var anchorPlacement: js.UndefOr[anchorPlacementOptions] = js.undefined
    
    // #region Global settings
    /**
      * Class applied on animation
      */
    var animatedClassName: js.UndefOr[String] = js.undefined
    
    /**
      * The delay on debounce used while resizing window
      */
    var debounceDelay: js.UndefOr[Double] = js.undefined
    
    /**
      * Values from 0 to 3000, with step 50ms
      */
    var delay: js.UndefOr[Double] = js.undefined
    
    /**
      * Accepts following values: 'phone', 'tablet', 'mobile', boolean, expression or function
      */
    var disable: js.UndefOr[phone | tablet | mobile | Boolean | js.Function0[Boolean]] = js.undefined
    
    /**
      * Disables automatic mutations' detections
      */
    var disableMutationObserver: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Values from 0 to 3000, with step 50ms
      */
    var duration: js.UndefOr[Double] = js.undefined
    
    /**
      * Default easing for AOS animations
      */
    var easing: js.UndefOr[easingOptions] = js.undefined
    
    /**
      * Class applied after initialization
      */
    var initClassName: js.UndefOr[String] = js.undefined
    
    /**
      * Whether elements should animate out while scrolling past them
      */
    var mirror: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Offset (in px) from the original trigger point
      */
    var offset: js.UndefOr[Double] = js.undefined
    
    /**
      * Whether animation should happen only once - while scrolling down
      */
    var once: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Name of the event dispatched on the document, that AOS should initialize on
      */
    var startEvent: js.UndefOr[String] = js.undefined
    
    /**
      * The delay on throttle used while scrolling the page
      */
    var throttleDelay: js.UndefOr[Double] = js.undefined
    
    /**
      * If true, will add content of `data-aos` as classes on scroll
      */
    var useClassNames: js.UndefOr[Boolean] = js.undefined
  }
  object AosOptions {
    
    @scala.inline
    def apply(): AosOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AosOptions]
    }
    
    @scala.inline
    implicit class AosOptionsMutableBuilder[Self <: AosOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnchorPlacement(value: anchorPlacementOptions): Self = StObject.set(x, "anchorPlacement", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnchorPlacementUndefined: Self = StObject.set(x, "anchorPlacement", js.undefined)
      
      @scala.inline
      def setAnimatedClassName(value: String): Self = StObject.set(x, "animatedClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimatedClassNameUndefined: Self = StObject.set(x, "animatedClassName", js.undefined)
      
      @scala.inline
      def setDebounceDelay(value: Double): Self = StObject.set(x, "debounceDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDebounceDelayUndefined: Self = StObject.set(x, "debounceDelay", js.undefined)
      
      @scala.inline
      def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      @scala.inline
      def setDisable(value: phone | tablet | mobile | Boolean | js.Function0[Boolean]): Self = StObject.set(x, "disable", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableFunction0(value: () => Boolean): Self = StObject.set(x, "disable", js.Any.fromFunction0(value))
      
      @scala.inline
      def setDisableMutationObserver(value: Boolean): Self = StObject.set(x, "disableMutationObserver", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDisableMutationObserverUndefined: Self = StObject.set(x, "disableMutationObserver", js.undefined)
      
      @scala.inline
      def setDisableUndefined: Self = StObject.set(x, "disable", js.undefined)
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      @scala.inline
      def setEasing(value: easingOptions): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
      
      @scala.inline
      def setInitClassName(value: String): Self = StObject.set(x, "initClassName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInitClassNameUndefined: Self = StObject.set(x, "initClassName", js.undefined)
      
      @scala.inline
      def setMirror(value: Boolean): Self = StObject.set(x, "mirror", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMirrorUndefined: Self = StObject.set(x, "mirror", js.undefined)
      
      @scala.inline
      def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOffsetUndefined: Self = StObject.set(x, "offset", js.undefined)
      
      @scala.inline
      def setOnce(value: Boolean): Self = StObject.set(x, "once", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnceUndefined: Self = StObject.set(x, "once", js.undefined)
      
      @scala.inline
      def setStartEvent(value: String): Self = StObject.set(x, "startEvent", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartEventUndefined: Self = StObject.set(x, "startEvent", js.undefined)
      
      @scala.inline
      def setThrottleDelay(value: Double): Self = StObject.set(x, "throttleDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setThrottleDelayUndefined: Self = StObject.set(x, "throttleDelay", js.undefined)
      
      @scala.inline
      def setUseClassNames(value: Boolean): Self = StObject.set(x, "useClassNames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setUseClassNamesUndefined: Self = StObject.set(x, "useClassNames", js.undefined)
    }
  }
  
  type _To = Aos
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: Aos = ^
  
  /* Rewritten from type alias, can be one of: 
    - typings.aos.aosStrings.`top-bottom`
    - typings.aos.aosStrings.`top-center`
    - typings.aos.aosStrings.`top-top`
    - typings.aos.aosStrings.`center-bottom`
    - typings.aos.aosStrings.`center-center`
    - typings.aos.aosStrings.`center-top`
    - typings.aos.aosStrings.`bottom-bottom`
    - typings.aos.aosStrings.`bottom-center`
    - typings.aos.aosStrings.`bottom-top`
  */
  trait anchorPlacementOptions extends StObject
  object anchorPlacementOptions {
    
    @scala.inline
    def `bottom-bottom`: typings.aos.aosStrings.`bottom-bottom` = "bottom-bottom".asInstanceOf[typings.aos.aosStrings.`bottom-bottom`]
    
    @scala.inline
    def `bottom-center`: typings.aos.aosStrings.`bottom-center` = "bottom-center".asInstanceOf[typings.aos.aosStrings.`bottom-center`]
    
    @scala.inline
    def `bottom-top`: typings.aos.aosStrings.`bottom-top` = "bottom-top".asInstanceOf[typings.aos.aosStrings.`bottom-top`]
    
    @scala.inline
    def `center-bottom`: typings.aos.aosStrings.`center-bottom` = "center-bottom".asInstanceOf[typings.aos.aosStrings.`center-bottom`]
    
    @scala.inline
    def `center-center`: typings.aos.aosStrings.`center-center` = "center-center".asInstanceOf[typings.aos.aosStrings.`center-center`]
    
    @scala.inline
    def `center-top`: typings.aos.aosStrings.`center-top` = "center-top".asInstanceOf[typings.aos.aosStrings.`center-top`]
    
    @scala.inline
    def `top-bottom`: typings.aos.aosStrings.`top-bottom` = "top-bottom".asInstanceOf[typings.aos.aosStrings.`top-bottom`]
    
    @scala.inline
    def `top-center`: typings.aos.aosStrings.`top-center` = "top-center".asInstanceOf[typings.aos.aosStrings.`top-center`]
    
    @scala.inline
    def `top-top`: typings.aos.aosStrings.`top-top` = "top-top".asInstanceOf[typings.aos.aosStrings.`top-top`]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.aos.aosStrings.linear
    - typings.aos.aosStrings.ease
    - typings.aos.aosStrings.`ease-in`
    - typings.aos.aosStrings.`ease-out`
    - typings.aos.aosStrings.`ease-in-out`
    - typings.aos.aosStrings.`ease-in-back`
    - typings.aos.aosStrings.`ease-out-back`
    - typings.aos.aosStrings.`ease-in-out-back`
    - typings.aos.aosStrings.`ease-in-sine`
    - typings.aos.aosStrings.`ease-out-sine`
    - typings.aos.aosStrings.`ease-in-out-sine`
    - typings.aos.aosStrings.`ease-in-quad`
    - typings.aos.aosStrings.`ease-out-quad`
    - typings.aos.aosStrings.`ease-in-out-quad`
    - typings.aos.aosStrings.`ease-in-cubic`
    - typings.aos.aosStrings.`ease-out-cubic`
    - typings.aos.aosStrings.`ease-in-out-cubic`
    - typings.aos.aosStrings.`ease-in-quart`
    - typings.aos.aosStrings.`ease-out-quart`
    - typings.aos.aosStrings.`ease-in-out-quart`
  */
  trait easingOptions extends StObject
  object easingOptions {
    
    @scala.inline
    def ease: typings.aos.aosStrings.ease = "ease".asInstanceOf[typings.aos.aosStrings.ease]
    
    @scala.inline
    def `ease-in`: typings.aos.aosStrings.`ease-in` = "ease-in".asInstanceOf[typings.aos.aosStrings.`ease-in`]
    
    @scala.inline
    def `ease-in-back`: typings.aos.aosStrings.`ease-in-back` = "ease-in-back".asInstanceOf[typings.aos.aosStrings.`ease-in-back`]
    
    @scala.inline
    def `ease-in-cubic`: typings.aos.aosStrings.`ease-in-cubic` = "ease-in-cubic".asInstanceOf[typings.aos.aosStrings.`ease-in-cubic`]
    
    @scala.inline
    def `ease-in-out`: typings.aos.aosStrings.`ease-in-out` = "ease-in-out".asInstanceOf[typings.aos.aosStrings.`ease-in-out`]
    
    @scala.inline
    def `ease-in-out-back`: typings.aos.aosStrings.`ease-in-out-back` = "ease-in-out-back".asInstanceOf[typings.aos.aosStrings.`ease-in-out-back`]
    
    @scala.inline
    def `ease-in-out-cubic`: typings.aos.aosStrings.`ease-in-out-cubic` = "ease-in-out-cubic".asInstanceOf[typings.aos.aosStrings.`ease-in-out-cubic`]
    
    @scala.inline
    def `ease-in-out-quad`: typings.aos.aosStrings.`ease-in-out-quad` = "ease-in-out-quad".asInstanceOf[typings.aos.aosStrings.`ease-in-out-quad`]
    
    @scala.inline
    def `ease-in-out-quart`: typings.aos.aosStrings.`ease-in-out-quart` = "ease-in-out-quart".asInstanceOf[typings.aos.aosStrings.`ease-in-out-quart`]
    
    @scala.inline
    def `ease-in-out-sine`: typings.aos.aosStrings.`ease-in-out-sine` = "ease-in-out-sine".asInstanceOf[typings.aos.aosStrings.`ease-in-out-sine`]
    
    @scala.inline
    def `ease-in-quad`: typings.aos.aosStrings.`ease-in-quad` = "ease-in-quad".asInstanceOf[typings.aos.aosStrings.`ease-in-quad`]
    
    @scala.inline
    def `ease-in-quart`: typings.aos.aosStrings.`ease-in-quart` = "ease-in-quart".asInstanceOf[typings.aos.aosStrings.`ease-in-quart`]
    
    @scala.inline
    def `ease-in-sine`: typings.aos.aosStrings.`ease-in-sine` = "ease-in-sine".asInstanceOf[typings.aos.aosStrings.`ease-in-sine`]
    
    @scala.inline
    def `ease-out`: typings.aos.aosStrings.`ease-out` = "ease-out".asInstanceOf[typings.aos.aosStrings.`ease-out`]
    
    @scala.inline
    def `ease-out-back`: typings.aos.aosStrings.`ease-out-back` = "ease-out-back".asInstanceOf[typings.aos.aosStrings.`ease-out-back`]
    
    @scala.inline
    def `ease-out-cubic`: typings.aos.aosStrings.`ease-out-cubic` = "ease-out-cubic".asInstanceOf[typings.aos.aosStrings.`ease-out-cubic`]
    
    @scala.inline
    def `ease-out-quad`: typings.aos.aosStrings.`ease-out-quad` = "ease-out-quad".asInstanceOf[typings.aos.aosStrings.`ease-out-quad`]
    
    @scala.inline
    def `ease-out-quart`: typings.aos.aosStrings.`ease-out-quart` = "ease-out-quart".asInstanceOf[typings.aos.aosStrings.`ease-out-quart`]
    
    @scala.inline
    def `ease-out-sine`: typings.aos.aosStrings.`ease-out-sine` = "ease-out-sine".asInstanceOf[typings.aos.aosStrings.`ease-out-sine`]
    
    @scala.inline
    def linear: typings.aos.aosStrings.linear = "linear".asInstanceOf[typings.aos.aosStrings.linear]
  }
  
  object global {
    
    @js.native
    trait Document extends StObject {
      
      def addEventListener(`type`: AosEventType, listener: js.Function1[/* event */ AosEvent, Unit]): Unit = js.native
      def addEventListener(`type`: AosEventType, listener: js.Function1[/* event */ AosEvent, Unit], options: Boolean): Unit = js.native
      def addEventListener(
        `type`: AosEventType,
        listener: js.Function1[/* event */ AosEvent, Unit],
        options: AddEventListenerOptions
      ): Unit = js.native
    }
  }
}
