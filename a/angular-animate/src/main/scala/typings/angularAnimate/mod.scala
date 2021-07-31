package typings.angularAnimate

import org.scalablytyped.runtime.Shortcut
import typings.angular.JQuery
import typings.angular.mod.IPromise
import typings.angular.mod.global.Function
import typings.angularAnimate.mod.angularAugmentingMod.animate.IAnimateFactory
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod extends Shortcut {
  
  @JSImport("angular-animate", JSImport.Namespace)
  @js.native
  val ^ : String = js.native
  
  type _To = String
  
  /* This means you don't have to write `^`, but can instead just say `mod.foo` */
  override def _to: String = ^
  
  /* augmented module */
  object angularAugmentingMod {
    
    @js.native
    trait IModule extends StObject {
      
      def animation(name: String, animationFactory: IAnimateFactory): IModule = js.native
      def animation(name: String, inlineAnnotatedFunction: js.Array[js.Any]): IModule = js.native
      def animation(`object`: js.Object): IModule = js.native
    }
    
    /**
      * ngAnimate module (angular-animate.js)
      */
    object animate {
      
      trait IAnimateCallbackObject extends StObject {
        
        var addClass: js.UndefOr[
                js.Function4[
                  /* element */ JQuery, 
                  /* addedClasses */ String, 
                  /* doneFunction */ Function, 
                  /* options */ IAnimationOptions, 
                  js.Any
                ]
              ] = js.undefined
        
        var animate: js.UndefOr[
                js.Function5[
                  /* element */ JQuery, 
                  /* fromStyles */ String, 
                  /* toStyles */ String, 
                  /* doneFunction */ Function, 
                  /* options */ IAnimationOptions, 
                  js.Any
                ]
              ] = js.undefined
        
        var beforeAddClass: js.UndefOr[
                js.Function4[
                  /* element */ JQuery, 
                  /* addedClasses */ String, 
                  /* doneFunction */ Function, 
                  /* options */ IAnimationOptions, 
                  js.Any
                ]
              ] = js.undefined
        
        var beforeRemoveClass: js.UndefOr[
                js.Function4[
                  /* element */ JQuery, 
                  /* removedClasses */ String, 
                  /* doneFunction */ Function, 
                  /* options */ IAnimationOptions, 
                  js.Any
                ]
              ] = js.undefined
        
        var beforeSetClass: js.UndefOr[
                js.Function5[
                  /* element */ JQuery, 
                  /* addedClasses */ String, 
                  /* removedClasses */ String, 
                  /* doneFunction */ Function, 
                  /* options */ IAnimationOptions, 
                  js.Any
                ]
              ] = js.undefined
        
        var enter: js.UndefOr[
                js.Function3[
                  /* element */ JQuery, 
                  /* doneFunction */ Function, 
                  /* options */ IAnimationOptions, 
                  js.Any
                ]
              ] = js.undefined
        
        var eventFn: js.UndefOr[
                js.Function3[
                  /* element */ JQuery, 
                  /* doneFunction */ Function, 
                  /* options */ IAnimationOptions, 
                  js.Any
                ]
              ] = js.undefined
        
        var leave: js.UndefOr[
                js.Function3[
                  /* element */ JQuery, 
                  /* doneFunction */ Function, 
                  /* options */ IAnimationOptions, 
                  js.Any
                ]
              ] = js.undefined
        
        var move: js.UndefOr[
                js.Function3[
                  /* element */ JQuery, 
                  /* doneFunction */ Function, 
                  /* options */ IAnimationOptions, 
                  js.Any
                ]
              ] = js.undefined
        
        var removeClass: js.UndefOr[
                js.Function4[
                  /* element */ JQuery, 
                  /* removedClasses */ String, 
                  /* doneFunction */ Function, 
                  /* options */ IAnimationOptions, 
                  js.Any
                ]
              ] = js.undefined
        
        var setClass: js.UndefOr[
                js.Function5[
                  /* element */ JQuery, 
                  /* addedClasses */ String, 
                  /* removedClasses */ String, 
                  /* doneFunction */ Function, 
                  /* options */ IAnimationOptions, 
                  js.Any
                ]
              ] = js.undefined
      }
      object IAnimateCallbackObject {
        
        @scala.inline
        def apply(): IAnimateCallbackObject = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[IAnimateCallbackObject]
        }
        
        @scala.inline
        implicit class IAnimateCallbackObjectMutableBuilder[Self <: IAnimateCallbackObject] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setAddClass(
            value: (/* element */ JQuery, /* addedClasses */ String, /* doneFunction */ Function, /* options */ IAnimationOptions) => js.Any
          ): Self = StObject.set(x, "addClass", js.Any.fromFunction4(value))
          
          @scala.inline
          def setAddClassUndefined: Self = StObject.set(x, "addClass", js.undefined)
          
          @scala.inline
          def setAnimate(
            value: (/* element */ JQuery, /* fromStyles */ String, /* toStyles */ String, /* doneFunction */ Function, /* options */ IAnimationOptions) => js.Any
          ): Self = StObject.set(x, "animate", js.Any.fromFunction5(value))
          
          @scala.inline
          def setAnimateUndefined: Self = StObject.set(x, "animate", js.undefined)
          
          @scala.inline
          def setBeforeAddClass(
            value: (/* element */ JQuery, /* addedClasses */ String, /* doneFunction */ Function, /* options */ IAnimationOptions) => js.Any
          ): Self = StObject.set(x, "beforeAddClass", js.Any.fromFunction4(value))
          
          @scala.inline
          def setBeforeAddClassUndefined: Self = StObject.set(x, "beforeAddClass", js.undefined)
          
          @scala.inline
          def setBeforeRemoveClass(
            value: (/* element */ JQuery, /* removedClasses */ String, /* doneFunction */ Function, /* options */ IAnimationOptions) => js.Any
          ): Self = StObject.set(x, "beforeRemoveClass", js.Any.fromFunction4(value))
          
          @scala.inline
          def setBeforeRemoveClassUndefined: Self = StObject.set(x, "beforeRemoveClass", js.undefined)
          
          @scala.inline
          def setBeforeSetClass(
            value: (/* element */ JQuery, /* addedClasses */ String, /* removedClasses */ String, /* doneFunction */ Function, /* options */ IAnimationOptions) => js.Any
          ): Self = StObject.set(x, "beforeSetClass", js.Any.fromFunction5(value))
          
          @scala.inline
          def setBeforeSetClassUndefined: Self = StObject.set(x, "beforeSetClass", js.undefined)
          
          @scala.inline
          def setEnter(
            value: (/* element */ JQuery, /* doneFunction */ Function, /* options */ IAnimationOptions) => js.Any
          ): Self = StObject.set(x, "enter", js.Any.fromFunction3(value))
          
          @scala.inline
          def setEnterUndefined: Self = StObject.set(x, "enter", js.undefined)
          
          @scala.inline
          def setEventFn(
            value: (/* element */ JQuery, /* doneFunction */ Function, /* options */ IAnimationOptions) => js.Any
          ): Self = StObject.set(x, "eventFn", js.Any.fromFunction3(value))
          
          @scala.inline
          def setEventFnUndefined: Self = StObject.set(x, "eventFn", js.undefined)
          
          @scala.inline
          def setLeave(
            value: (/* element */ JQuery, /* doneFunction */ Function, /* options */ IAnimationOptions) => js.Any
          ): Self = StObject.set(x, "leave", js.Any.fromFunction3(value))
          
          @scala.inline
          def setLeaveUndefined: Self = StObject.set(x, "leave", js.undefined)
          
          @scala.inline
          def setMove(
            value: (/* element */ JQuery, /* doneFunction */ Function, /* options */ IAnimationOptions) => js.Any
          ): Self = StObject.set(x, "move", js.Any.fromFunction3(value))
          
          @scala.inline
          def setMoveUndefined: Self = StObject.set(x, "move", js.undefined)
          
          @scala.inline
          def setRemoveClass(
            value: (/* element */ JQuery, /* removedClasses */ String, /* doneFunction */ Function, /* options */ IAnimationOptions) => js.Any
          ): Self = StObject.set(x, "removeClass", js.Any.fromFunction4(value))
          
          @scala.inline
          def setRemoveClassUndefined: Self = StObject.set(x, "removeClass", js.undefined)
          
          @scala.inline
          def setSetClass(
            value: (/* element */ JQuery, /* addedClasses */ String, /* removedClasses */ String, /* doneFunction */ Function, /* options */ IAnimationOptions) => js.Any
          ): Self = StObject.set(x, "setClass", js.Any.fromFunction5(value))
          
          @scala.inline
          def setSetClassUndefined: Self = StObject.set(x, "setClass", js.undefined)
        }
      }
      
      trait IAnimateCssRunner extends StObject {
        
        /**
          * Ends (aborts) the animation
          */
        def end(): Unit
        
        /**
          * Starts the animation
          *
          * @returns The animation runner with a done function for supplying a callback.
          */
        def start(): IAnimateCssRunnerStart
      }
      object IAnimateCssRunner {
        
        @scala.inline
        def apply(end: () => Unit, start: () => IAnimateCssRunnerStart): IAnimateCssRunner = {
          val __obj = js.Dynamic.literal(end = js.Any.fromFunction0(end), start = js.Any.fromFunction0(start))
          __obj.asInstanceOf[IAnimateCssRunner]
        }
        
        @scala.inline
        implicit class IAnimateCssRunnerMutableBuilder[Self <: IAnimateCssRunner] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setEnd(value: () => Unit): Self = StObject.set(x, "end", js.Any.fromFunction0(value))
          
          @scala.inline
          def setStart(value: () => IAnimateCssRunnerStart): Self = StObject.set(x, "start", js.Any.fromFunction0(value))
        }
      }
      
      @js.native
      trait IAnimateCssRunnerStart
        extends StObject
           with IPromise[Unit] {
        
        /**
          * Allows you to add done callbacks to the running animation
          *
          * @param callbackFn: the callback function to be run
          */
        def done(callbackFn: js.Function1[/* animationFinished */ Boolean, Unit]): Unit = js.native
      }
      
      /**
        * AnimateCssService
        * see http://docs.angularjs.org/api/ngAnimate/service/$animateCss
        */
      type IAnimateCssService = js.Function2[/* element */ JQuery, /* animateCssOptions */ IAnimationOptions, IAnimateCssRunner]
      
      type IAnimateFactory = js.Function1[/* repeated */ js.Any, IAnimateCallbackObject]
      
      /**
        * AnimateProvider
        * see http://docs.angularjs.org/api/ngAnimate/provider/$animateProvider
        */
      @js.native
      trait IAnimateProvider extends StObject {
        
        /**
          * Gets and/or sets the CSS class expression that is checked when performing an animation.
          *
          * @param expression The className expression which will be checked against all animations.
          * @returns The current CSS className expression value. If null then there is no expression value.
          */
        def classNameFilter(): RegExp = js.native
        def classNameFilter(expression: RegExp): RegExp = js.native
        
        /**
          * Registers a new injectable animation factory function.
          *
          * @param name The name of the animation.
          * @param factory The factory function that will be executed to return the animation object.
          */
        def register(name: String, factory: IAnimateFactory): Unit = js.native
      }
      
      /**
        * AnimateService
        * see http://docs.angularjs.org/api/ngAnimate/service/$animate
        */
      @js.native
      trait IAnimateService extends StObject {
        
        /**
          * Triggers a custom animation event based off the className variable and then attaches the className
          * value to the element as a CSS class.
          *
          * @param element the element that will be animated
          * @param className the CSS class that will be added to the element and then animated
          * @param options an optional collection of styles that will be picked up by the CSS transition/animation
          * @returns the animation callback promise
          */
        def addClass(element: JQuery, className: String): IAnimationPromise = js.native
        def addClass(element: JQuery, className: String, options: IAnimationOptions): IAnimationPromise = js.native
        
        /**
          * Performs an inline animation on the element.
          *
          * @param element the element that will be the focus of the animation
          * @param from a collection of CSS styles that will be applied to the element at the start of the animation
          * @param to a collection of CSS styles that the element will animate towards
          * @param className an optional CSS class that will be added to the element for the duration of the animation (the default class is 'ng-inline-animate')
          * @param options an optional collection of styles that will be picked up by the CSS transition/animation
          * @returns the animation callback promise
          */
        def animate(element: JQuery, from: js.Any, to: js.Any): IAnimationPromise = js.native
        def animate(element: JQuery, from: js.Any, to: js.Any, className: String): IAnimationPromise = js.native
        def animate(element: JQuery, from: js.Any, to: js.Any, className: String, options: IAnimationOptions): IAnimationPromise = js.native
        def animate(element: JQuery, from: js.Any, to: js.Any, className: Unit, options: IAnimationOptions): IAnimationPromise = js.native
        
        /**
          * Cancels the provided animation.
          */
        def cancel(animationPromise: IAnimationPromise): Unit = js.native
        
        def enabled(): Boolean = js.native
        /**
          * Globally enables / disables animations.
          *
          * @param element If provided then the element will be used to represent the enable/disable operation.
          * @param value If provided then set the animation on or off.
          * @returns current animation state
          */
        def enabled(element: JQuery): Boolean = js.native
        def enabled(element: JQuery, value: Boolean): Boolean = js.native
        def enabled(value: Boolean): Boolean = js.native
        
        /**
          * Appends the element to the parentElement element that resides in the document and then runs the enter animation.
          *
          * @param element the element that will be the focus of the enter animation
          * @param parentElement the parent element of the element that will be the focus of the enter animation
          * @param afterElement the sibling element (which is the previous element) of the element that will be the focus of the enter animation
          * @param options an optional collection of styles that will be picked up by the CSS transition/animation
          * @returns the animation callback promise
          */
        def enter(element: JQuery, parentElement: JQuery): IAnimationPromise = js.native
        def enter(element: JQuery, parentElement: JQuery, afterElement: Unit, options: IAnimationOptions): IAnimationPromise = js.native
        def enter(element: JQuery, parentElement: JQuery, afterElement: JQuery): IAnimationPromise = js.native
        def enter(element: JQuery, parentElement: JQuery, afterElement: JQuery, options: IAnimationOptions): IAnimationPromise = js.native
        
        /**
          * Runs the leave animation operation and, upon completion, removes the element from the DOM.
          *
          * @param element the element that will be the focus of the leave animation
          * @param options an optional collection of styles that will be picked up by the CSS transition/animation
          * @returns the animation callback promise
          */
        def leave(element: JQuery): IAnimationPromise = js.native
        def leave(element: JQuery, options: IAnimationOptions): IAnimationPromise = js.native
        
        /**
          * Fires the move DOM operation. Just before the animation starts, the animate service will either append
          * it into the parentElement container or add the element directly after the afterElement element if present.
          * Then the move animation will be run.
          *
          * @param element the element that will be the focus of the move animation
          * @param parentElement the parent element of the element that will be the focus of the move animation
          * @param afterElement the sibling element (which is the previous element) of the element that will be the focus of the move animation
          * @returns the animation callback promise
          */
        def move(element: JQuery, parentElement: JQuery): IAnimationPromise = js.native
        def move(element: JQuery, parentElement: JQuery, afterElement: JQuery): IAnimationPromise = js.native
        
        /**
          * Deregisters an event listener based on the event which has been associated with the provided element.
          *
          * @param event the animation event (e.g. enter, leave, move, addClass, removeClass, etc...)
          * @param container the container element the event listener was placed on
          * @param callback the callback function that was registered as the listener
          */
        def off(event: String): Unit = js.native
        def off(
          event: String,
          container: Unit,
          callback: js.Function2[/* element */ js.UndefOr[JQuery], /* phase */ js.UndefOr[String], js.Any]
        ): Unit = js.native
        def off(event: String, container: JQuery): Unit = js.native
        def off(
          event: String,
          container: JQuery,
          callback: js.Function2[/* element */ js.UndefOr[JQuery], /* phase */ js.UndefOr[String], js.Any]
        ): Unit = js.native
        
        /**
          * Sets up an event listener to fire whenever the animation event has fired on the given element or among any of its children.
          *
          * @param event the animation event that will be captured (e.g. enter, leave, move, addClass, removeClass, etc...)
          * @param container the container element that will capture each of the animation events that are fired on itself as well as among its children
          * @param callback the callback function that will be fired when the listener is triggered
          */
        def on(
          event: String,
          container: JQuery,
          callback: js.Function2[/* element */ js.UndefOr[JQuery], /* phase */ js.UndefOr[String], js.Any]
        ): Unit = js.native
        
        /**
          * Associates the provided element with a host parent element to allow the element to be animated even if it exists outside of the DOM structure of the Angular application.
          *
          * @param element the external element that will be pinned
          * @param parentElement the host parent element that will be associated with the external element
          */
        def pin(element: JQuery, parentElement: JQuery): Unit = js.native
        
        /**
          * Triggers a custom animation event based off the className variable and then removes the CSS class
          * provided by the className value from the element.
          *
          * @param element the element that will be animated
          * @param className the CSS class that will be animated and then removed from the element
          * @param options an optional collection of styles that will be picked up by the CSS transition/animation
          * @returns the animation callback promise
          */
        def removeClass(element: JQuery, className: String): IAnimationPromise = js.native
        def removeClass(element: JQuery, className: String, options: IAnimationOptions): IAnimationPromise = js.native
        
        /**
          * Adds and/or removes the given CSS classes to and from the element. Once complete, the done() callback
          * will be fired (if provided).
          *
          * @param element the element which will have its CSS classes changed removed from it
          * @param add the CSS classes which will be added to the element
          * @param remove the CSS class which will be removed from the element CSS classes have been set on the element
          * @param options an optional collection of styles that will be picked up by the CSS transition/animation
          * @returns the animation callback promise
          */
        def setClass(element: JQuery, add: String, remove: String): IAnimationPromise = js.native
        def setClass(element: JQuery, add: String, remove: String, options: IAnimationOptions): IAnimationPromise = js.native
      }
      
      /**
        * Angular Animation Options
        * see https://docs.angularjs.org/api/ngAnimate/#applying-directive-specific-styles-to-an-animation
        */
      trait IAnimationOptions extends StObject {
        
        /**
          * A space separated list of CSS classes that will be added to the element and spread across the animation.
          */
        var addClass: js.UndefOr[String] = js.undefined
        
        /**
          * Whether or not the provided from and to styles will be removed once the animation is closed. This is useful for
          * when the styles are used purely for the sake of the animation and do not have a lasting visual effect on the element
          * (e.g. a colapse and open animation). By default this value is set to false.
          */
        var cleanupStyles: js.UndefOr[Boolean] = js.undefined
        
        /**
          * A number value representing the total delay of the transition and/or keyframe (note that a value of
          * 1 is 1000ms). If a value of true is used then whatever delay value is detected from the CSS classes will be
          * mirrored on the elements styles (e.g. by setting delay true then the style value of the element will be
          * transition-delay: DETECTED_VALUE). Using true is useful when you want the CSS classes and inline styles to
          * all share the same CSS delay value.
          */
        var delay: js.UndefOr[Double] = js.undefined
        
        /**
          * A number value representing the total duration of the transition and/or keyframe (note that a value
          * of 1 is 1000ms). If a value of 0 is provided then the animation will be skipped entirely.
          */
        var duration: js.UndefOr[Double] = js.undefined
        
        /**
          * The CSS easing value that will be applied to the transition or keyframe animation (or both).
          */
        var easing: js.UndefOr[String] = js.undefined
        
        /**
          * The DOM event (e.g. enter, leave, move). When used, a generated CSS class of ng-EVENT and
          * ng-EVENT-active will be applied to the element during the animation. Multiple events can be provided when
          * spaces are used as a separator. (Note that this will not perform any DOM operation.)
          */
        var event: js.UndefOr[String] = js.undefined
        
        /**
          * The starting CSS styles (a key/value object) that will be applied at the start of the animation.
          */
        var from: js.UndefOr[js.Object] = js.undefined
        
        /**
          * The raw CSS keyframe animation style that will be used (e.g. 1s my_animation linear).
          */
        var keyframeStyle: js.UndefOr[String] = js.undefined
        
        /**
          * A space separated list of CSS classes that will be removed from the element and spread across
          * the animation.
          */
        var removeClass: js.UndefOr[String] = js.undefined
        
        /**
          * A numeric time value representing the delay between successively animated elements (Click here to
          * learn how CSS-based staggering works in ngAnimate.)
          */
        var stagger: js.UndefOr[Double] = js.undefined
        
        /**
          * The numeric index representing the stagger item (e.g. a value of 5 is equal to the sixth item
          * in the stagger; therefore when a stagger option value of 0.1 is used then there will be a stagger delay of 600ms)
          *
          */
        var staggerIndex: js.UndefOr[Double] = js.undefined
        
        /**
          * Indicates that the ng-prefix will be added to the event class. Setting to false or
          * omitting will turn ng-EVENT and ng-EVENT-active in EVENT and EVENT-active. Unused if event is omitted.
          */
        var structural: js.UndefOr[Boolean] = js.undefined
        
        /**
          * The ending CSS styles (a key/value object) that will be applied across the animation via a CSS transition.
          */
        var to: js.UndefOr[js.Object] = js.undefined
        
        /**
          * The raw CSS transition style that will be used (e.g. 1s linear all).
          */
        var transitionStyle: js.UndefOr[String] = js.undefined
      }
      object IAnimationOptions {
        
        @scala.inline
        def apply(): IAnimationOptions = {
          val __obj = js.Dynamic.literal()
          __obj.asInstanceOf[IAnimationOptions]
        }
        
        @scala.inline
        implicit class IAnimationOptionsMutableBuilder[Self <: IAnimationOptions] (val x: Self) extends AnyVal {
          
          @scala.inline
          def setAddClass(value: String): Self = StObject.set(x, "addClass", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setAddClassUndefined: Self = StObject.set(x, "addClass", js.undefined)
          
          @scala.inline
          def setCleanupStyles(value: Boolean): Self = StObject.set(x, "cleanupStyles", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setCleanupStylesUndefined: Self = StObject.set(x, "cleanupStyles", js.undefined)
          
          @scala.inline
          def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
          
          @scala.inline
          def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
          
          @scala.inline
          def setEasing(value: String): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
          
          @scala.inline
          def setEvent(value: String): Self = StObject.set(x, "event", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setEventUndefined: Self = StObject.set(x, "event", js.undefined)
          
          @scala.inline
          def setFrom(value: js.Object): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
          
          @scala.inline
          def setKeyframeStyle(value: String): Self = StObject.set(x, "keyframeStyle", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setKeyframeStyleUndefined: Self = StObject.set(x, "keyframeStyle", js.undefined)
          
          @scala.inline
          def setRemoveClass(value: String): Self = StObject.set(x, "removeClass", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setRemoveClassUndefined: Self = StObject.set(x, "removeClass", js.undefined)
          
          @scala.inline
          def setStagger(value: Double): Self = StObject.set(x, "stagger", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setStaggerIndex(value: Double): Self = StObject.set(x, "staggerIndex", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setStaggerIndexUndefined: Self = StObject.set(x, "staggerIndex", js.undefined)
          
          @scala.inline
          def setStaggerUndefined: Self = StObject.set(x, "stagger", js.undefined)
          
          @scala.inline
          def setStructural(value: Boolean): Self = StObject.set(x, "structural", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setStructuralUndefined: Self = StObject.set(x, "structural", js.undefined)
          
          @scala.inline
          def setTo(value: js.Object): Self = StObject.set(x, "to", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setToUndefined: Self = StObject.set(x, "to", js.undefined)
          
          @scala.inline
          def setTransitionStyle(value: String): Self = StObject.set(x, "transitionStyle", value.asInstanceOf[js.Any])
          
          @scala.inline
          def setTransitionStyleUndefined: Self = StObject.set(x, "transitionStyle", js.undefined)
        }
      }
      
      type IAnimationPromise = IPromise[Unit]
    }
  }
}
