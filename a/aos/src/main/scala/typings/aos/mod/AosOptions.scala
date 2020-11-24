package typings.aos.mod

import typings.aos.aosStrings.mobile
import typings.aos.aosStrings.phone
import typings.aos.aosStrings.tablet
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AosOptions extends js.Object {
  
  // #endregion
  // #region Settings that can be overridden on per-element basis, by `data-aos-*` attributes
  /**
    * Defines which position of the element regarding to window should trigger the animation
    */
  var anchorPlacement: js.UndefOr[anchorPlacementOptions] = js.native
  
  // #region Global settings
  /**
    * Class applied on animation
    */
  var animatedClassName: js.UndefOr[String] = js.native
  
  /**
    * The delay on debounce used while resizing window
    */
  var debounceDelay: js.UndefOr[Double] = js.native
  
  /**
    * Values from 0 to 3000, with step 50ms
    */
  var delay: js.UndefOr[Double] = js.native
  
  /**
    * Accepts following values: 'phone', 'tablet', 'mobile', boolean, expression or function
    */
  var disable: js.UndefOr[phone | tablet | mobile | Boolean | js.Function0[Boolean]] = js.native
  
  /**
    * Disables automatic mutations' detections
    */
  var disableMutationObserver: js.UndefOr[Boolean] = js.native
  
  /**
    * Values from 0 to 3000, with step 50ms
    */
  var duration: js.UndefOr[Double] = js.native
  
  /**
    * Default easing for AOS animations
    */
  var easing: js.UndefOr[easingOptions] = js.native
  
  /**
    * Class applied after initialization
    */
  var initClassName: js.UndefOr[String] = js.native
  
  /**
    * Whether elements should animate out while scrolling past them
    */
  var mirror: js.UndefOr[Boolean] = js.native
  
  /**
    * Offset (in px) from the original trigger point
    */
  var offset: js.UndefOr[Double] = js.native
  
  /**
    * Whether animation should happen only once - while scrolling down
    */
  var once: js.UndefOr[Boolean] = js.native
  
  /**
    * Name of the event dispatched on the document, that AOS should initialize on
    */
  var startEvent: js.UndefOr[String] = js.native
  
  /**
    * The delay on throttle used while scrolling the page
    */
  var throttleDelay: js.UndefOr[Double] = js.native
  
  /**
    * If true, will add content of `data-aos` as classes on scroll
    */
  var useClassNames: js.UndefOr[Boolean] = js.native
}
object AosOptions {
  
  @scala.inline
  def apply(): AosOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AosOptions]
  }
  
  @scala.inline
  implicit class AosOptionsOps[Self <: AosOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAnchorPlacement(value: anchorPlacementOptions): Self = this.set("anchorPlacement", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnchorPlacement: Self = this.set("anchorPlacement", js.undefined)
    
    @scala.inline
    def setAnimatedClassName(value: String): Self = this.set("animatedClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnimatedClassName: Self = this.set("animatedClassName", js.undefined)
    
    @scala.inline
    def setDebounceDelay(value: Double): Self = this.set("debounceDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDebounceDelay: Self = this.set("debounceDelay", js.undefined)
    
    @scala.inline
    def setDelay(value: Double): Self = this.set("delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDelay: Self = this.set("delay", js.undefined)
    
    @scala.inline
    def setDisableFunction0(value: () => Boolean): Self = this.set("disable", js.Any.fromFunction0(value))
    
    @scala.inline
    def setDisable(value: phone | tablet | mobile | Boolean | js.Function0[Boolean]): Self = this.set("disable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisable: Self = this.set("disable", js.undefined)
    
    @scala.inline
    def setDisableMutationObserver(value: Boolean): Self = this.set("disableMutationObserver", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableMutationObserver: Self = this.set("disableMutationObserver", js.undefined)
    
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDuration: Self = this.set("duration", js.undefined)
    
    @scala.inline
    def setEasing(value: easingOptions): Self = this.set("easing", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEasing: Self = this.set("easing", js.undefined)
    
    @scala.inline
    def setInitClassName(value: String): Self = this.set("initClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitClassName: Self = this.set("initClassName", js.undefined)
    
    @scala.inline
    def setMirror(value: Boolean): Self = this.set("mirror", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMirror: Self = this.set("mirror", js.undefined)
    
    @scala.inline
    def setOffset(value: Double): Self = this.set("offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOffset: Self = this.set("offset", js.undefined)
    
    @scala.inline
    def setOnce(value: Boolean): Self = this.set("once", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnce: Self = this.set("once", js.undefined)
    
    @scala.inline
    def setStartEvent(value: String): Self = this.set("startEvent", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartEvent: Self = this.set("startEvent", js.undefined)
    
    @scala.inline
    def setThrottleDelay(value: Double): Self = this.set("throttleDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThrottleDelay: Self = this.set("throttleDelay", js.undefined)
    
    @scala.inline
    def setUseClassNames(value: Boolean): Self = this.set("useClassNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseClassNames: Self = this.set("useClassNames", js.undefined)
  }
}
