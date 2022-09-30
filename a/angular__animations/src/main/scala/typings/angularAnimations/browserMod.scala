package typings.angularAnimations

import org.scalablytyped.runtime.StringDictionary
import typings.angularAnimations.angularAnimationsInts.`0`
import typings.angularAnimations.angularAnimationsInts.`1`
import typings.angularAnimations.mod.AnimationMetadata
import typings.angularAnimations.mod.AnimationOptions
import typings.angularAnimations.mod.AnimationPlayer
import typings.angularAnimations.mod.AnimationTriggerMetadata
import typings.angularAnimations.mod.ɵStyleData
import typings.angularAnimations.mod.ɵStyleDataMap
import typings.angularCore.mod.ɵɵFactoryDeclaration
import typings.angularCore.mod.ɵɵInjectableDeclaration
import typings.std.Map
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object browserMod {
  
  @JSImport("@angular/animations/browser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/animations/browser", "AnimationDriver")
  @js.native
  abstract class AnimationDriver () extends StObject {
    
    def animate(element: Any, keyframes: js.Array[Map[String, String | Double]], duration: Double, delay: Double): Any = js.native
    def animate(
      element: Any,
      keyframes: js.Array[Map[String, String | Double]],
      duration: Double,
      delay: Double,
      easing: String
    ): Any = js.native
    def animate(
      element: Any,
      keyframes: js.Array[Map[String, String | Double]],
      duration: Double,
      delay: Double,
      easing: String,
      previousPlayers: js.Array[Any]
    ): Any = js.native
    def animate(
      element: Any,
      keyframes: js.Array[Map[String, String | Double]],
      duration: Double,
      delay: Double,
      easing: String,
      previousPlayers: js.Array[Any],
      scrubberAccessRequested: Boolean
    ): Any = js.native
    def animate(
      element: Any,
      keyframes: js.Array[Map[String, String | Double]],
      duration: Double,
      delay: Double,
      easing: String,
      previousPlayers: Unit,
      scrubberAccessRequested: Boolean
    ): Any = js.native
    def animate(
      element: Any,
      keyframes: js.Array[Map[String, String | Double]],
      duration: Double,
      delay: Double,
      easing: Null,
      previousPlayers: js.Array[Any]
    ): Any = js.native
    def animate(
      element: Any,
      keyframes: js.Array[Map[String, String | Double]],
      duration: Double,
      delay: Double,
      easing: Null,
      previousPlayers: js.Array[Any],
      scrubberAccessRequested: Boolean
    ): Any = js.native
    def animate(
      element: Any,
      keyframes: js.Array[Map[String, String | Double]],
      duration: Double,
      delay: Double,
      easing: Null,
      previousPlayers: Unit,
      scrubberAccessRequested: Boolean
    ): Any = js.native
    def animate(
      element: Any,
      keyframes: js.Array[Map[String, String | Double]],
      duration: Double,
      delay: Double,
      easing: Unit,
      previousPlayers: js.Array[Any]
    ): Any = js.native
    def animate(
      element: Any,
      keyframes: js.Array[Map[String, String | Double]],
      duration: Double,
      delay: Double,
      easing: Unit,
      previousPlayers: js.Array[Any],
      scrubberAccessRequested: Boolean
    ): Any = js.native
    def animate(
      element: Any,
      keyframes: js.Array[Map[String, String | Double]],
      duration: Double,
      delay: Double,
      easing: Unit,
      previousPlayers: Unit,
      scrubberAccessRequested: Boolean
    ): Any = js.native
    
    def computeStyle(element: Any, prop: String): String = js.native
    def computeStyle(element: Any, prop: String, defaultValue: String): String = js.native
    
    def containsElement(elm1: Any, elm2: Any): Boolean = js.native
    
    /**
      * Obtains the parent element, if any. `null` is returned if the element does not have a parent.
      */
    def getParentElement(element: Any): Any = js.native
    
    /**
      * @deprecated No longer in use. Will be removed.
      */
    def matchesElement(element: Any, selector: String): Boolean = js.native
    
    def query(element: Any, selector: String, multi: Boolean): js.Array[Any] = js.native
    
    var validateAnimatableStyleProperty: js.UndefOr[js.Function1[/* prop */ String, Boolean]] = js.native
    
    def validateStyleProperty(prop: String): Boolean = js.native
  }
  /* static members */
  object AnimationDriver {
    
    @JSImport("@angular/animations/browser", "AnimationDriver")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@angular/animations/browser", "AnimationDriver.NOOP")
    @js.native
    def NOOP: AnimationDriver = js.native
    inline def NOOP_=(x: AnimationDriver): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NOOP")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@angular/animations/browser", "\u0275Animation")
  @js.native
  open class ɵAnimation protected () extends StObject {
    def this(_driver: AnimationDriver, input: js.Array[AnimationMetadata]) = this()
    def this(_driver: AnimationDriver, input: AnimationMetadata) = this()
    
    /* private */ var _animationAst: Any = js.native
    
    /* private */ var _driver: Any = js.native
    
    def buildTimelines(
      element: Any,
      startingStyles: js.Array[ɵStyleDataMap],
      destinationStyles: js.Array[ɵStyleDataMap],
      options: AnimationOptions
    ): js.Array[AnimationTimelineInstruction] = js.native
    def buildTimelines(
      element: Any,
      startingStyles: js.Array[ɵStyleDataMap],
      destinationStyles: js.Array[ɵStyleDataMap],
      options: AnimationOptions,
      subInstructions: ElementInstructionMap
    ): js.Array[AnimationTimelineInstruction] = js.native
    def buildTimelines(
      element: Any,
      startingStyles: js.Array[ɵStyleDataMap],
      destinationStyles: ɵStyleDataMap,
      options: AnimationOptions
    ): js.Array[AnimationTimelineInstruction] = js.native
    def buildTimelines(
      element: Any,
      startingStyles: js.Array[ɵStyleDataMap],
      destinationStyles: ɵStyleDataMap,
      options: AnimationOptions,
      subInstructions: ElementInstructionMap
    ): js.Array[AnimationTimelineInstruction] = js.native
    def buildTimelines(
      element: Any,
      startingStyles: ɵStyleDataMap,
      destinationStyles: js.Array[ɵStyleDataMap],
      options: AnimationOptions
    ): js.Array[AnimationTimelineInstruction] = js.native
    def buildTimelines(
      element: Any,
      startingStyles: ɵStyleDataMap,
      destinationStyles: js.Array[ɵStyleDataMap],
      options: AnimationOptions,
      subInstructions: ElementInstructionMap
    ): js.Array[AnimationTimelineInstruction] = js.native
    def buildTimelines(
      element: Any,
      startingStyles: ɵStyleDataMap,
      destinationStyles: ɵStyleDataMap,
      options: AnimationOptions
    ): js.Array[AnimationTimelineInstruction] = js.native
    def buildTimelines(
      element: Any,
      startingStyles: ɵStyleDataMap,
      destinationStyles: ɵStyleDataMap,
      options: AnimationOptions,
      subInstructions: ElementInstructionMap
    ): js.Array[AnimationTimelineInstruction] = js.native
  }
  
  @JSImport("@angular/animations/browser", "\u0275AnimationEngine")
  @js.native
  open class ɵAnimationEngine protected () extends StObject {
    def this(bodyNode: Any, _driver: AnimationDriver, _normalizer: ɵAnimationStyleNormalizer) = this()
    
    /* private */ var _driver: Any = js.native
    
    /* private */ var _normalizer: Any = js.native
    
    /* private */ var _timelineEngine: Any = js.native
    
    /* private */ var _transitionEngine: Any = js.native
    
    /* private */ var _triggerCache: Any = js.native
    
    /* private */ var bodyNode: Any = js.native
    
    def destroy(namespaceId: String, context: Any): Unit = js.native
    
    def disableAnimations(element: Any, disable: Boolean): Unit = js.native
    
    def flush(): Unit = js.native
    def flush(microtaskId: Double): Unit = js.native
    
    def listen(
      namespaceId: String,
      element: Any,
      eventName: String,
      eventPhase: String,
      callback: js.Function1[/* event */ Any, Any]
    ): js.Function0[Any] = js.native
    
    def onInsert(namespaceId: String, element: Any, parent: Any, insertBefore: Boolean): Unit = js.native
    
    def onRemovalComplete(element: Any, context: Any): Unit = js.native
    
    def onRemove(namespaceId: String, element: Any, context: Any): Unit = js.native
    def onRemove(namespaceId: String, element: Any, context: Any, isHostElement: Boolean): Unit = js.native
    
    def players: js.Array[AnimationPlayer] = js.native
    
    def process(namespaceId: String, element: Any, property: String, value: Any): Unit = js.native
    
    def register(namespaceId: String, hostElement: Any): Unit = js.native
    
    def registerTrigger(
      componentId: String,
      namespaceId: String,
      hostElement: Any,
      name: String,
      metadata: AnimationTriggerMetadata
    ): Unit = js.native
    
    def whenRenderingDone(): js.Promise[Any] = js.native
  }
  
  @JSImport("@angular/animations/browser", "\u0275AnimationStyleNormalizer")
  @js.native
  abstract class ɵAnimationStyleNormalizer () extends StObject {
    
    def normalizePropertyName(propertyName: String, errors: js.Array[js.Error]): String = js.native
    
    def normalizeStyleValue(
      userProvidedProperty: String,
      normalizedProperty: String,
      value: String,
      errors: js.Array[js.Error]
    ): String = js.native
    def normalizeStyleValue(
      userProvidedProperty: String,
      normalizedProperty: String,
      value: Double,
      errors: js.Array[js.Error]
    ): String = js.native
  }
  
  @JSImport("@angular/animations/browser", "\u0275NoopAnimationDriver")
  @js.native
  open class ɵNoopAnimationDriver () extends AnimationDriver
  /* static members */
  object ɵNoopAnimationDriver {
    
    @JSImport("@angular/animations/browser", "\u0275NoopAnimationDriver")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@angular/animations/browser", "\u0275NoopAnimationDriver.\u0275fac")
    @js.native
    def ɵfac: ɵɵFactoryDeclaration[ɵNoopAnimationDriver, scala.Nothing] = js.native
    inline def ɵfac_=(x: ɵɵFactoryDeclaration[ɵNoopAnimationDriver, scala.Nothing]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275fac")(x.asInstanceOf[js.Any])
    
    @JSImport("@angular/animations/browser", "\u0275NoopAnimationDriver.\u0275prov")
    @js.native
    def ɵprov: ɵɵInjectableDeclaration[ɵNoopAnimationDriver] = js.native
    inline def ɵprov_=(x: ɵɵInjectableDeclaration[ɵNoopAnimationDriver]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("\u0275prov")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@angular/animations/browser", "\u0275NoopAnimationStyleNormalizer")
  @js.native
  open class ɵNoopAnimationStyleNormalizer () extends StObject {
    
    def normalizePropertyName(propertyName: String, errors: js.Array[js.Error]): String = js.native
    
    def normalizeStyleValue(
      userProvidedProperty: String,
      normalizedProperty: String,
      value: String,
      errors: js.Array[js.Error]
    ): String = js.native
    def normalizeStyleValue(
      userProvidedProperty: String,
      normalizedProperty: String,
      value: Double,
      errors: js.Array[js.Error]
    ): String = js.native
  }
  
  @JSImport("@angular/animations/browser", "\u0275WebAnimationsDriver")
  @js.native
  open class ɵWebAnimationsDriver () extends AnimationDriver {
    
    @JSName("validateAnimatableStyleProperty")
    def validateAnimatableStyleProperty_MɵWebAnimationsDriver(prop: String): Boolean = js.native
  }
  
  @JSImport("@angular/animations/browser", "\u0275WebAnimationsPlayer")
  @js.native
  open class ɵWebAnimationsPlayer protected ()
    extends StObject
       with AnimationPlayer {
    def this(element: Any, keyframes: js.Array[ɵStyleDataMap], options: StringDictionary[String | Double]) = this()
    def this(
      element: Any,
      keyframes: js.Array[ɵStyleDataMap],
      options: StringDictionary[String | Double],
      _specialStyles: SpecialCasedStyles
    ) = this()
    
    /* private */ var _buildPlayer: Any = js.native
    
    /* private */ var _convertKeyframesToObject: Any = js.native
    
    /* private */ var _delay: Any = js.native
    
    /* private */ var _destroyed: Any = js.native
    
    /* private */ var _duration: Any = js.native
    
    /* private */ var _finalKeyframe: Any = js.native
    
    /* private */ var _finished: Any = js.native
    
    /* private */ var _initialized: Any = js.native
    
    /* private */ var _onDestroyFns: Any = js.native
    
    /* private */ var _onDoneFns: Any = js.native
    
    /* private */ var _onFinish: Any = js.native
    
    /* private */ var _onStartFns: Any = js.native
    
    /* private */ var _originalOnDoneFns: Any = js.native
    
    /* private */ var _originalOnStartFns: Any = js.native
    
    /* private */ var _preparePlayerBeforeStart: Any = js.native
    
    /* private */ var _resetDomPlayerState: Any = js.native
    
    /* private */ var _specialStyles: Any = js.native
    
    /* private */ var _started: Any = js.native
    
    @JSName("beforeDestroy")
    def beforeDestroy_MɵWebAnimationsPlayer(): Unit = js.native
    
    var currentSnapshot: ɵStyleDataMap = js.native
    
    /**
      * Destroys the animation, after invoking the `beforeDestroy()` callback.
      * Calls the `onDestroy()` callback when destruction is completed.
      */
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    val domPlayer: DOMAnimation = js.native
    
    var element: Any = js.native
    
    /**
      * Ends the animation, invoking the `onDone()` callback.
      */
    /* CompleteClass */
    override def finish(): Unit = js.native
    
    /**
      * Reports the current position of the animation.
      * @returns A 0-based offset into the duration, in milliseconds.
      */
    /* CompleteClass */
    override def getPosition(): Double = js.native
    
    /**
      * Reports whether the animation has started.
      * @returns True if the animation has started, false otherwise.
      */
    /* CompleteClass */
    override def hasStarted(): Boolean = js.native
    
    /**
      * Initializes the animation.
      */
    /* CompleteClass */
    override def init(): Unit = js.native
    
    var keyframes: js.Array[ɵStyleDataMap] = js.native
    
    /**
      * Provides a callback to invoke after the animation is destroyed.
      * @param fn The callback function.
      * @see `destroy()`
      * @see `beforeDestroy()`
      */
    /* CompleteClass */
    override def onDestroy(fn: js.Function0[Unit]): Unit = js.native
    
    /**
      * Provides a callback to invoke when the animation finishes.
      * @param fn The callback function.
      * @see `finish()`
      */
    /* CompleteClass */
    override def onDone(fn: js.Function0[Unit]): Unit = js.native
    
    /**
      * Provides a callback to invoke when the animation starts.
      * @param fn The callback function.
      * @see `run()`
      */
    /* CompleteClass */
    override def onStart(fn: js.Function0[Unit]): Unit = js.native
    
    var options: StringDictionary[String | Double] = js.native
    
    /**
      * The parent of this player, if any.
      */
    /* CompleteClass */
    var parentPlayer: AnimationPlayer | Null = js.native
    
    /**
      * Pauses the animation.
      */
    /* CompleteClass */
    override def pause(): Unit = js.native
    
    /**
      * Runs the animation, invoking the `onStart()` callback.
      */
    /* CompleteClass */
    override def play(): Unit = js.native
    
    /**
      * Resets the animation to its initial state.
      */
    /* CompleteClass */
    override def reset(): Unit = js.native
    
    /**
      * Restarts the paused animation.
      */
    /* CompleteClass */
    override def restart(): Unit = js.native
    
    /**
      * Sets the position of the animation.
      * @param position A 0-based offset into the duration, in milliseconds.
      */
    /* CompleteClass */
    override def setPosition(position: Any): Unit = js.native
    def setPosition(p: Double): Unit = js.native
    
    var time: Double = js.native
    
    /**
      * The total run time of the animation, in milliseconds.
      */
    /* CompleteClass */
    override val totalTime: Double = js.native
    @JSName("totalTime")
    def totalTime_MɵWebAnimationsPlayer: Double = js.native
  }
  
  @JSImport("@angular/animations/browser", "\u0275WebAnimationsStyleNormalizer")
  @js.native
  open class ɵWebAnimationsStyleNormalizer () extends ɵAnimationStyleNormalizer
  
  inline def ɵallowPreviousPlayerStylesMerge(duration: Double, delay: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275allowPreviousPlayerStylesMerge")(duration.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def ɵcontainsElement(elm1: Any, elm2: Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275containsElement")(elm1.asInstanceOf[js.Any], elm2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  inline def ɵgetParentElement(element: Any): Any | Null = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275getParentElement")(element.asInstanceOf[js.Any]).asInstanceOf[Any | Null]
  
  inline def ɵinvokeQuery(element: Any, selector: String, multi: Boolean): js.Array[Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275invokeQuery")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], multi.asInstanceOf[js.Any])).asInstanceOf[js.Array[Any]]
  
  inline def ɵnormalizeKeyframes(keyframes: js.Array[ɵStyleData | ɵStyleDataMap]): js.Array[ɵStyleDataMap] = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275normalizeKeyframes")(keyframes.asInstanceOf[js.Any]).asInstanceOf[js.Array[ɵStyleDataMap]]
  
  inline def ɵvalidateStyleProperty(prop: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275validateStyleProperty")(prop.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  trait AnimationEngineInstruction extends StObject {
    
    var `type`: AnimationTransitionInstructionType
  }
  object AnimationEngineInstruction {
    
    inline def apply(`type`: AnimationTransitionInstructionType): AnimationEngineInstruction = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[AnimationEngineInstruction]
    }
    
    extension [Self <: AnimationEngineInstruction](x: Self) {
      
      inline def setType(value: AnimationTransitionInstructionType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait AnimationTimelineInstruction
    extends StObject
       with AnimationEngineInstruction {
    
    var delay: Double
    
    var duration: Double
    
    var easing: String | Null
    
    var element: Any
    
    var keyframes: js.Array[ɵStyleDataMap]
    
    var postStyleProps: js.Array[String]
    
    var preStyleProps: js.Array[String]
    
    var stretchStartingKeyframe: js.UndefOr[Boolean] = js.undefined
    
    var subTimeline: Boolean
    
    var totalTime: Double
  }
  object AnimationTimelineInstruction {
    
    inline def apply(
      delay: Double,
      duration: Double,
      element: Any,
      keyframes: js.Array[ɵStyleDataMap],
      postStyleProps: js.Array[String],
      preStyleProps: js.Array[String],
      subTimeline: Boolean,
      totalTime: Double,
      `type`: AnimationTransitionInstructionType
    ): AnimationTimelineInstruction = {
      val __obj = js.Dynamic.literal(delay = delay.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], element = element.asInstanceOf[js.Any], keyframes = keyframes.asInstanceOf[js.Any], postStyleProps = postStyleProps.asInstanceOf[js.Any], preStyleProps = preStyleProps.asInstanceOf[js.Any], subTimeline = subTimeline.asInstanceOf[js.Any], totalTime = totalTime.asInstanceOf[js.Any], easing = null)
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[AnimationTimelineInstruction]
    }
    
    extension [Self <: AnimationTimelineInstruction](x: Self) {
      
      inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setEasing(value: String): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
      
      inline def setEasingNull: Self = StObject.set(x, "easing", null)
      
      inline def setElement(value: Any): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      inline def setKeyframes(value: js.Array[ɵStyleDataMap]): Self = StObject.set(x, "keyframes", value.asInstanceOf[js.Any])
      
      inline def setKeyframesVarargs(value: ɵStyleDataMap*): Self = StObject.set(x, "keyframes", js.Array(value*))
      
      inline def setPostStyleProps(value: js.Array[String]): Self = StObject.set(x, "postStyleProps", value.asInstanceOf[js.Any])
      
      inline def setPostStylePropsVarargs(value: String*): Self = StObject.set(x, "postStyleProps", js.Array(value*))
      
      inline def setPreStyleProps(value: js.Array[String]): Self = StObject.set(x, "preStyleProps", value.asInstanceOf[js.Any])
      
      inline def setPreStylePropsVarargs(value: String*): Self = StObject.set(x, "preStyleProps", js.Array(value*))
      
      inline def setStretchStartingKeyframe(value: Boolean): Self = StObject.set(x, "stretchStartingKeyframe", value.asInstanceOf[js.Any])
      
      inline def setStretchStartingKeyframeUndefined: Self = StObject.set(x, "stretchStartingKeyframe", js.undefined)
      
      inline def setSubTimeline(value: Boolean): Self = StObject.set(x, "subTimeline", value.asInstanceOf[js.Any])
      
      inline def setTotalTime(value: Double): Self = StObject.set(x, "totalTime", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.angularAnimations.angularAnimationsInts.`0`
    - typings.angularAnimations.angularAnimationsInts.`1`
  */
  trait AnimationTransitionInstructionType extends StObject
  object AnimationTransitionInstructionType {
    
    inline def TimelineAnimation: `1` = 1.asInstanceOf[`1`]
    
    inline def TransitionAnimation: `0` = 0.asInstanceOf[`0`]
  }
  
  /**
    * DOMAnimation represents the Animation Web API.
    *
    * It is an external API by the browser, and must thus use "declare interface",
    * to prevent renaming by Closure Compiler.
    *
    * @see https://developer.mozilla.org/de/docs/Web/API/Animation
    */
  trait DOMAnimation extends StObject {
    
    def addEventListener(eventName: String, handler: js.Function1[/* event */ Any, Any]): Any
    
    def cancel(): Unit
    
    var currentTime: Double
    
    def dispatchEvent(eventName: String): Any
    
    def finish(): Unit
    
    var onfinish: js.Function
    
    def pause(): Unit
    
    def play(): Unit
    
    var position: Double
  }
  object DOMAnimation {
    
    inline def apply(
      addEventListener: (String, js.Function1[/* event */ Any, Any]) => Any,
      cancel: () => Unit,
      currentTime: Double,
      dispatchEvent: String => Any,
      finish: () => Unit,
      onfinish: js.Function,
      pause: () => Unit,
      play: () => Unit,
      position: Double
    ): DOMAnimation = {
      val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2(addEventListener), cancel = js.Any.fromFunction0(cancel), currentTime = currentTime.asInstanceOf[js.Any], dispatchEvent = js.Any.fromFunction1(dispatchEvent), finish = js.Any.fromFunction0(finish), onfinish = onfinish.asInstanceOf[js.Any], pause = js.Any.fromFunction0(pause), play = js.Any.fromFunction0(play), position = position.asInstanceOf[js.Any])
      __obj.asInstanceOf[DOMAnimation]
    }
    
    extension [Self <: DOMAnimation](x: Self) {
      
      inline def setAddEventListener(value: (String, js.Function1[/* event */ Any, Any]) => Any): Self = StObject.set(x, "addEventListener", js.Any.fromFunction2(value))
      
      inline def setCancel(value: () => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction0(value))
      
      inline def setCurrentTime(value: Double): Self = StObject.set(x, "currentTime", value.asInstanceOf[js.Any])
      
      inline def setDispatchEvent(value: String => Any): Self = StObject.set(x, "dispatchEvent", js.Any.fromFunction1(value))
      
      inline def setFinish(value: () => Unit): Self = StObject.set(x, "finish", js.Any.fromFunction0(value))
      
      inline def setOnfinish(value: js.Function): Self = StObject.set(x, "onfinish", value.asInstanceOf[js.Any])
      
      inline def setPause(value: () => Unit): Self = StObject.set(x, "pause", js.Any.fromFunction0(value))
      
      inline def setPlay(value: () => Unit): Self = StObject.set(x, "play", js.Any.fromFunction0(value))
      
      inline def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    }
  }
  
  trait ElementInstructionMap extends StObject {
    
    /* private */ var _map: Any
    
    def append(element: Any, instructions: js.Array[AnimationTimelineInstruction]): Unit
    
    def clear(): Unit
    
    def get(element: Any): js.Array[AnimationTimelineInstruction]
    
    def has(element: Any): Boolean
  }
  object ElementInstructionMap {
    
    inline def apply(
      _map: Any,
      append: (Any, js.Array[AnimationTimelineInstruction]) => Unit,
      clear: () => Unit,
      get: Any => js.Array[AnimationTimelineInstruction],
      has: Any => Boolean
    ): ElementInstructionMap = {
      val __obj = js.Dynamic.literal(_map = _map.asInstanceOf[js.Any], append = js.Any.fromFunction2(append), clear = js.Any.fromFunction0(clear), get = js.Any.fromFunction1(get), has = js.Any.fromFunction1(has))
      __obj.asInstanceOf[ElementInstructionMap]
    }
    
    extension [Self <: ElementInstructionMap](x: Self) {
      
      inline def setAppend(value: (Any, js.Array[AnimationTimelineInstruction]) => Unit): Self = StObject.set(x, "append", js.Any.fromFunction2(value))
      
      inline def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
      
      inline def setGet(value: Any => js.Array[AnimationTimelineInstruction]): Self = StObject.set(x, "get", js.Any.fromFunction1(value))
      
      inline def setHas(value: Any => Boolean): Self = StObject.set(x, "has", js.Any.fromFunction1(value))
      
      inline def set_map(value: Any): Self = StObject.set(x, "_map", value.asInstanceOf[js.Any])
    }
  }
  
  /**
    * Designed to be executed during a keyframe-based animation to apply any special-cased styles.
    *
    * When started (when the `start()` method is run) then the provided `startStyles`
    * will be applied. When finished (when the `finish()` method is called) the
    * `endStyles` will be applied as well any any starting styles. Finally when
    * `destroy()` is called then all styles will be removed.
    */
  trait SpecialCasedStyles extends StObject {
    
    /* private */ var _element: Any
    
    /* private */ var _endStyles: Any
    
    /* private */ var _initialStyles: Any
    
    /* private */ var _startStyles: Any
    
    /* private */ var _state: Any
    
    def destroy(): Unit
    
    def finish(): Unit
    
    def start(): Unit
  }
  object SpecialCasedStyles {
    
    inline def apply(
      _element: Any,
      _endStyles: Any,
      _initialStyles: Any,
      _startStyles: Any,
      _state: Any,
      destroy: () => Unit,
      finish: () => Unit,
      start: () => Unit
    ): SpecialCasedStyles = {
      val __obj = js.Dynamic.literal(_element = _element.asInstanceOf[js.Any], _endStyles = _endStyles.asInstanceOf[js.Any], _initialStyles = _initialStyles.asInstanceOf[js.Any], _startStyles = _startStyles.asInstanceOf[js.Any], _state = _state.asInstanceOf[js.Any], destroy = js.Any.fromFunction0(destroy), finish = js.Any.fromFunction0(finish), start = js.Any.fromFunction0(start))
      __obj.asInstanceOf[SpecialCasedStyles]
    }
    
    extension [Self <: SpecialCasedStyles](x: Self) {
      
      inline def setDestroy(value: () => Unit): Self = StObject.set(x, "destroy", js.Any.fromFunction0(value))
      
      inline def setFinish(value: () => Unit): Self = StObject.set(x, "finish", js.Any.fromFunction0(value))
      
      inline def setStart(value: () => Unit): Self = StObject.set(x, "start", js.Any.fromFunction0(value))
      
      inline def set_element(value: Any): Self = StObject.set(x, "_element", value.asInstanceOf[js.Any])
      
      inline def set_endStyles(value: Any): Self = StObject.set(x, "_endStyles", value.asInstanceOf[js.Any])
      
      inline def set_initialStyles(value: Any): Self = StObject.set(x, "_initialStyles", value.asInstanceOf[js.Any])
      
      inline def set_startStyles(value: Any): Self = StObject.set(x, "_startStyles", value.asInstanceOf[js.Any])
      
      inline def set_state(value: Any): Self = StObject.set(x, "_state", value.asInstanceOf[js.Any])
    }
  }
}
