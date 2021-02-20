package typings.askmethatRating

import typings.askmethatRating.amtRatingPopoverMod.AskmethatRatingPopoverOptions
import typings.std.HTMLDivElement
import typings.std.MutationRecord
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("askmethat-rating", "AskmethatRating")
  @js.native
  class AskmethatRating protected () extends StObject {
    /**
      * constructor with div element, default rating value & default options
      *
      * @param element This is the html container for the rating elements
      * @param defaultValue Default value set when the plugin render the rating
      * @param options Default option base on AskmethatRatingOptions type
      */
    def this(element: HTMLDivElement) = this()
    def this(element: HTMLDivElement, defaultValue: Double) = this()
    def this(element: HTMLDivElement, defaultValue: js.UndefOr[scala.Nothing], options: js.Any) = this()
    def this(element: HTMLDivElement, defaultValue: Double, options: js.Any) = this()
    
    /**
      * Default option base on @type IAskmethatRatingOptions
      */
    var _defaultOptions: js.Any = js.native
    
    var changeEvent: js.Any = js.native
    
    /**
      * @function get the default option for the rating
      *
      * @return  options based on @type AskmethatRatingOptions
      */
    /**
      * @function set the default option for the rating
      *
      * @return  options based on @type AskmethatRatingOptions
      */
    var defaultOptions: AskmethatRatingOptions = js.native
    
    /**
      * @function Calculate the value according to the step provided in options
      * @param  {Number} value:number the current value
      * @return {Number} the new value according to step
      */
    /* protected */ def getValueAccordingToStep(value: Double): Double = js.native
    
    /**
      * Init popover if needed
      */
    /* private */ def initPopover(): js.Any = js.native
    
    var mouseMove: js.Any = js.native
    
    /**
      * This is fired by mutation observer when an attribute changed in the hidden input
      * Is protected to have some unit tests
      *
      * @param mutations list of mutations record
      */
    /* protected */ def mutationDisableEvent(mutations: js.Array[MutationRecord]): Unit = js.native
    
    /**
      * Check if disabled attribute is added or removed from the input
      * Update readonly status if needed for the rating
      */
    /* private */ def mutationEvent(): js.Any = js.native
    
    /**
      * @function mouse out event in rating
      * @param  {type} event?: Event {event}
      */
    /* private */ def onMouseLeave(event: js.Any): js.Any = js.native
    
    /**
      * @function mouse event enter in rating
      * @param  {type} event?: Event {event}
      */
    /* private */ def onMouseMove(event: js.Any): js.Any = js.native
    
    /**
      * @function when a rating is clicked
      * @param  {type} event : Event {event object}
      */
    /* private */ def onRatingClick(event: js.Any): js.Any = js.native
    
    var pValue: js.Any = js.native
    
    var parentElement: js.Any = js.native
    
    var ratingClick: js.Any = js.native
    
    /**
      * render a new rating, by default value is the minRating
      *
      * @param value this is the default value set when the plugin is rendered, by default IAskmethatRatingOptions.minRating
      */
    def render(): Unit = js.native
    def render(value: Double): Unit = js.native
    
    /**
      * @function set or unset the active class and color
      * @param  {HTMLSpanElement} current :  current span element
      * @param  {number} current :  value needed for the if
      */
    /* protected */ def setOrUnsetActive(value: Double): Unit = js.native
    
    var styleSheet: js.Any = js.native
    
    /**
      * @function get the current value for the rating
      */
    /**
      * @function set a new value for the rating
      *
      * @param _value this is the new value you want to set to the rating
      * @returns the current number
      */
    var value: Double = js.native
  }
  /* static members */
  object AskmethatRating {
    
    /**
      * @function static method to retrieve with identifier the value
      * @param  {string} identifier: string container identifier
      * @return {number} current rating
      */
    @JSImport("askmethat-rating", "AskmethatRating.value")
    @js.native
    def value(identifier: String): Double = js.native
  }
  
  @js.native
  sealed trait AskmethatRatingSteps extends StObject
  @JSImport("askmethat-rating", "AskmethatRatingSteps")
  @js.native
  object AskmethatRatingSteps extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[AskmethatRatingSteps with Double] = js.native
    
    /**
      * Step 0.1 per 0.1
      */
    @js.native
    sealed trait DecimalStep extends AskmethatRatingSteps
    /* 0 */ val DecimalStep: typings.askmethatRating.mod.AskmethatRatingSteps.DecimalStep with Double = js.native
    
    /**
      * Step 0.5 per 0.5
      */
    @js.native
    sealed trait HalfStep extends AskmethatRatingSteps
    /* 1 */ val HalfStep: typings.askmethatRating.mod.AskmethatRatingSteps.HalfStep with Double = js.native
    
    /**
      * Step 1 per 1
      */
    @js.native
    sealed trait OnePerOneStep extends AskmethatRatingSteps
    /* 2 */ val OnePerOneStep: typings.askmethatRating.mod.AskmethatRatingSteps.OnePerOneStep with Double = js.native
  }
  
  @js.native
  trait AskmethatRatingOptions extends StObject {
    
    /**
      * Color when the rating is not hovered
      */
    var backgroundColor: js.UndefOr[String] = js.native
    
    /**
      * Class to display as rating (FontAwesome or Rating for exemple)
      */
    var fontClass: js.UndefOr[String] = js.native
    
    var hoverColor: js.UndefOr[String] = js.native
    
    /**
      * Input name (Default is AskmethatRating)
      */
    var inputName: js.UndefOr[String] = js.native
    
    /**
      * Maximum rating that the plugin display
      */
    var maxRating: js.UndefOr[Double] = js.native
    
    /**
      * Mininmum rating that the user can set
      */
    var minRating: js.UndefOr[Double] = js.native
    
    /**
      * options if popover is set. Put element as readonly
      */
    var popover: js.UndefOr[AskmethatRatingPopoverOptions] = js.native
    
    /**
      * Set the rating to readonly
      */
    var readonly: js.UndefOr[Boolean] = js.native
    
    /**
      * The stepping for the rating
      */
    var step: js.UndefOr[AskmethatRatingSteps] = js.native
  }
  object AskmethatRatingOptions {
    
    @scala.inline
    def apply(): AskmethatRatingOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AskmethatRatingOptions]
    }
    
    @scala.inline
    implicit class AskmethatRatingOptionsMutableBuilder[Self <: AskmethatRatingOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackgroundColor(value: String): Self = StObject.set(x, "backgroundColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundColorUndefined: Self = StObject.set(x, "backgroundColor", js.undefined)
      
      @scala.inline
      def setFontClass(value: String): Self = StObject.set(x, "fontClass", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFontClassUndefined: Self = StObject.set(x, "fontClass", js.undefined)
      
      @scala.inline
      def setHoverColor(value: String): Self = StObject.set(x, "hoverColor", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHoverColorUndefined: Self = StObject.set(x, "hoverColor", js.undefined)
      
      @scala.inline
      def setInputName(value: String): Self = StObject.set(x, "inputName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setInputNameUndefined: Self = StObject.set(x, "inputName", js.undefined)
      
      @scala.inline
      def setMaxRating(value: Double): Self = StObject.set(x, "maxRating", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxRatingUndefined: Self = StObject.set(x, "maxRating", js.undefined)
      
      @scala.inline
      def setMinRating(value: Double): Self = StObject.set(x, "minRating", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinRatingUndefined: Self = StObject.set(x, "minRating", js.undefined)
      
      @scala.inline
      def setPopover(value: AskmethatRatingPopoverOptions): Self = StObject.set(x, "popover", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPopoverUndefined: Self = StObject.set(x, "popover", js.undefined)
      
      @scala.inline
      def setReadonly(value: Boolean): Self = StObject.set(x, "readonly", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReadonlyUndefined: Self = StObject.set(x, "readonly", js.undefined)
      
      @scala.inline
      def setStep(value: AskmethatRatingSteps): Self = StObject.set(x, "step", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStepUndefined: Self = StObject.set(x, "step", js.undefined)
    }
  }
}
