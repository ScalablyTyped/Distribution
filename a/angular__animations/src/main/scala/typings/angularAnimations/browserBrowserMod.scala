package typings.angularAnimations

import org.scalablytyped.runtime.StringDictionary
import typings.angularAnimations.angularAnimationsNumbers.`0`
import typings.angularAnimations.angularAnimationsNumbers.`1`
import typings.angularAnimations.mod.AnimationMetadata
import typings.angularAnimations.mod.AnimationOptions
import typings.angularAnimations.mod.AnimationPlayer
import typings.angularAnimations.mod.AnimationTriggerMetadata
import typings.angularAnimations.mod.ɵStyleData
import typings.std.WeakMap
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object browserBrowserMod {
  
  @JSImport("@angular/animations/browser/browser", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@angular/animations/browser/browser", "AnimationDriver")
  @js.native
  abstract class AnimationDriver () extends StObject {
    
    def animate(
      element: js.Any,
      keyframes: js.Array[StringDictionary[String | Double]],
      duration: Double,
      delay: Double
    ): js.Any = js.native
    def animate(
      element: js.Any,
      keyframes: js.Array[StringDictionary[String | Double]],
      duration: Double,
      delay: Double,
      easing: String
    ): js.Any = js.native
    def animate(
      element: js.Any,
      keyframes: js.Array[StringDictionary[String | Double]],
      duration: Double,
      delay: Double,
      easing: String,
      previousPlayers: js.Array[js.Any]
    ): js.Any = js.native
    def animate(
      element: js.Any,
      keyframes: js.Array[StringDictionary[String | Double]],
      duration: Double,
      delay: Double,
      easing: String,
      previousPlayers: js.Array[js.Any],
      scrubberAccessRequested: Boolean
    ): js.Any = js.native
    def animate(
      element: js.Any,
      keyframes: js.Array[StringDictionary[String | Double]],
      duration: Double,
      delay: Double,
      easing: String,
      previousPlayers: Unit,
      scrubberAccessRequested: Boolean
    ): js.Any = js.native
    def animate(
      element: js.Any,
      keyframes: js.Array[StringDictionary[String | Double]],
      duration: Double,
      delay: Double,
      easing: Null,
      previousPlayers: js.Array[js.Any]
    ): js.Any = js.native
    def animate(
      element: js.Any,
      keyframes: js.Array[StringDictionary[String | Double]],
      duration: Double,
      delay: Double,
      easing: Null,
      previousPlayers: js.Array[js.Any],
      scrubberAccessRequested: Boolean
    ): js.Any = js.native
    def animate(
      element: js.Any,
      keyframes: js.Array[StringDictionary[String | Double]],
      duration: Double,
      delay: Double,
      easing: Null,
      previousPlayers: Unit,
      scrubberAccessRequested: Boolean
    ): js.Any = js.native
    def animate(
      element: js.Any,
      keyframes: js.Array[StringDictionary[String | Double]],
      duration: Double,
      delay: Double,
      easing: Unit,
      previousPlayers: js.Array[js.Any]
    ): js.Any = js.native
    def animate(
      element: js.Any,
      keyframes: js.Array[StringDictionary[String | Double]],
      duration: Double,
      delay: Double,
      easing: Unit,
      previousPlayers: js.Array[js.Any],
      scrubberAccessRequested: Boolean
    ): js.Any = js.native
    def animate(
      element: js.Any,
      keyframes: js.Array[StringDictionary[String | Double]],
      duration: Double,
      delay: Double,
      easing: Unit,
      previousPlayers: Unit,
      scrubberAccessRequested: Boolean
    ): js.Any = js.native
    
    def computeStyle(element: js.Any, prop: String): String = js.native
    def computeStyle(element: js.Any, prop: String, defaultValue: String): String = js.native
    
    def containsElement(elm1: js.Any, elm2: js.Any): Boolean = js.native
    
    def matchesElement(element: js.Any, selector: String): Boolean = js.native
    
    def query(element: js.Any, selector: String, multi: Boolean): js.Array[js.Any] = js.native
    
    def validateStyleProperty(prop: String): Boolean = js.native
  }
  /* static members */
  object AnimationDriver {
    
    @JSImport("@angular/animations/browser/browser", "AnimationDriver")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@angular/animations/browser/browser", "AnimationDriver.NOOP")
    @js.native
    def NOOP: AnimationDriver = js.native
    @scala.inline
    def NOOP_=(x: AnimationDriver): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("NOOP")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@angular/animations/browser/browser", "\u0275Animation")
  @js.native
  class ɵAnimation protected () extends StObject {
    def this(_driver: AnimationDriver, input: js.Array[AnimationMetadata]) = this()
    def this(_driver: AnimationDriver, input: AnimationMetadata) = this()
    
    var _animationAst: js.Any = js.native
    
    var _driver: js.Any = js.native
    
    def buildTimelines(
      element: js.Any,
      startingStyles: js.Array[ɵStyleData],
      destinationStyles: js.Array[ɵStyleData],
      options: AnimationOptions
    ): js.Array[AnimationTimelineInstruction] = js.native
    def buildTimelines(
      element: js.Any,
      startingStyles: js.Array[ɵStyleData],
      destinationStyles: js.Array[ɵStyleData],
      options: AnimationOptions,
      subInstructions: ElementInstructionMap
    ): js.Array[AnimationTimelineInstruction] = js.native
    def buildTimelines(
      element: js.Any,
      startingStyles: js.Array[ɵStyleData],
      destinationStyles: ɵStyleData,
      options: AnimationOptions
    ): js.Array[AnimationTimelineInstruction] = js.native
    def buildTimelines(
      element: js.Any,
      startingStyles: js.Array[ɵStyleData],
      destinationStyles: ɵStyleData,
      options: AnimationOptions,
      subInstructions: ElementInstructionMap
    ): js.Array[AnimationTimelineInstruction] = js.native
    def buildTimelines(
      element: js.Any,
      startingStyles: ɵStyleData,
      destinationStyles: js.Array[ɵStyleData],
      options: AnimationOptions
    ): js.Array[AnimationTimelineInstruction] = js.native
    def buildTimelines(
      element: js.Any,
      startingStyles: ɵStyleData,
      destinationStyles: js.Array[ɵStyleData],
      options: AnimationOptions,
      subInstructions: ElementInstructionMap
    ): js.Array[AnimationTimelineInstruction] = js.native
    def buildTimelines(
      element: js.Any,
      startingStyles: ɵStyleData,
      destinationStyles: ɵStyleData,
      options: AnimationOptions
    ): js.Array[AnimationTimelineInstruction] = js.native
    def buildTimelines(
      element: js.Any,
      startingStyles: ɵStyleData,
      destinationStyles: ɵStyleData,
      options: AnimationOptions,
      subInstructions: ElementInstructionMap
    ): js.Array[AnimationTimelineInstruction] = js.native
  }
  
  @JSImport("@angular/animations/browser/browser", "\u0275AnimationEngine")
  @js.native
  class ɵAnimationEngine protected () extends StObject {
    def this(bodyNode: js.Any, _driver: AnimationDriver, normalizer: ɵAnimationStyleNormalizer) = this()
    
    var _driver: js.Any = js.native
    
    var _timelineEngine: js.Any = js.native
    
    var _transitionEngine: js.Any = js.native
    
    var _triggerCache: js.Any = js.native
    
    var bodyNode: js.Any = js.native
    
    def destroy(namespaceId: String, context: js.Any): Unit = js.native
    
    def disableAnimations(element: js.Any, disable: Boolean): Unit = js.native
    
    def flush(): Unit = js.native
    def flush(microtaskId: Double): Unit = js.native
    
    def listen(
      namespaceId: String,
      element: js.Any,
      eventName: String,
      eventPhase: String,
      callback: js.Function1[/* event */ js.Any, js.Any]
    ): js.Function0[js.Any] = js.native
    
    def onInsert(namespaceId: String, element: js.Any, parent: js.Any, insertBefore: Boolean): Unit = js.native
    
    def onRemovalComplete(element: js.Any, context: js.Any): Unit = js.native
    
    def onRemove(namespaceId: String, element: js.Any, context: js.Any): Unit = js.native
    def onRemove(namespaceId: String, element: js.Any, context: js.Any, isHostElement: Boolean): Unit = js.native
    
    def players: js.Array[AnimationPlayer] = js.native
    
    def process(namespaceId: String, element: js.Any, property: String, value: js.Any): Unit = js.native
    
    def register(namespaceId: String, hostElement: js.Any): Unit = js.native
    
    def registerTrigger(
      componentId: String,
      namespaceId: String,
      hostElement: js.Any,
      name: String,
      metadata: AnimationTriggerMetadata
    ): Unit = js.native
    
    def whenRenderingDone(): js.Promise[js.Any] = js.native
  }
  
  @JSImport("@angular/animations/browser/browser", "\u0275AnimationStyleNormalizer")
  @js.native
  abstract class ɵAnimationStyleNormalizer () extends StObject {
    
    def normalizePropertyName(propertyName: String, errors: js.Array[String]): String = js.native
    
    def normalizeStyleValue(userProvidedProperty: String, normalizedProperty: String, value: String, errors: js.Array[String]): String = js.native
    def normalizeStyleValue(userProvidedProperty: String, normalizedProperty: String, value: Double, errors: js.Array[String]): String = js.native
  }
  
  @JSImport("@angular/animations/browser/browser", "\u0275CssKeyframesDriver")
  @js.native
  class ɵCssKeyframesDriver () extends AnimationDriver {
    
    var _count: js.Any = js.native
    
    val _head: js.Any = js.native
    
    var _notifyFaultyScrubber: js.Any = js.native
    
    var _warningIssued: js.Any = js.native
    
    def buildKeyframeElement(element: js.Any, name: String, keyframes: js.Array[StringDictionary[js.Any]]): js.Any = js.native
  }
  
  @JSImport("@angular/animations/browser/browser", "\u0275CssKeyframesPlayer")
  @js.native
  class ɵCssKeyframesPlayer protected ()
    extends StObject
       with AnimationPlayer {
    def this(
      element: js.Any,
      keyframes: js.Array[StringDictionary[String | Double]],
      animationName: String,
      _duration: Double,
      _delay: Double,
      easing: String,
      _finalStyles: StringDictionary[js.Any]
    ) = this()
    def this(
      element: js.Any,
      keyframes: js.Array[StringDictionary[String | Double]],
      animationName: String,
      _duration: Double,
      _delay: Double,
      easing: String,
      _finalStyles: StringDictionary[js.Any],
      _specialStyles: ɵangularPackagesAnimationsBrowserBrowserA
    ) = this()
    
    var _buildStyler: js.Any = js.native
    
    val _delay: js.Any = js.native
    
    val _duration: js.Any = js.native
    
    val _finalStyles: js.Any = js.native
    
    var _flushDoneFns: js.Any = js.native
    
    var _flushStartFns: js.Any = js.native
    
    var _onDestroyFns: js.Any = js.native
    
    var _onDoneFns: js.Any = js.native
    
    var _onStartFns: js.Any = js.native
    
    val _specialStyles: js.Any = js.native
    
    var _started: js.Any = js.native
    
    var _state: js.Any = js.native
    
    var _styler: js.Any = js.native
    
    val animationName: String = js.native
    
    @JSName("beforeDestroy")
    def beforeDestroy_MɵCssKeyframesPlayer(): Unit = js.native
    
    var currentSnapshot: StringDictionary[String] = js.native
    
    /**
      * Destroys the animation, after invoking the `beforeDestroy()` callback.
      * Calls the `onDestroy()` callback when destruction is completed.
      */
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    val easing: String = js.native
    
    val element: js.Any = js.native
    
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
    
    val keyframes: js.Array[StringDictionary[String | Double]] = js.native
    
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
    
    /**
      * The parent of this player, if any.
      */
    /* CompleteClass */
    var parentPlayer: AnimationPlayer | Null = js.native
    @JSName("parentPlayer")
    var parentPlayer_ɵCssKeyframesPlayer: AnimationPlayer = js.native
    
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
    override def setPosition(position: js.Any): Unit = js.native
    def setPosition(value: Double): Unit = js.native
    
    /**
      * The total run time of the animation, in milliseconds.
      */
    /* CompleteClass */
    override val totalTime: Double = js.native
  }
  
  @JSImport("@angular/animations/browser/browser", "\u0275NoopAnimationDriver")
  @js.native
  class ɵNoopAnimationDriver () extends AnimationDriver
  
  @JSImport("@angular/animations/browser/browser", "\u0275NoopAnimationStyleNormalizer")
  @js.native
  class ɵNoopAnimationStyleNormalizer () extends StObject {
    
    def normalizePropertyName(propertyName: String, errors: js.Array[String]): String = js.native
    
    def normalizeStyleValue(userProvidedProperty: String, normalizedProperty: String, value: String, errors: js.Array[String]): String = js.native
    def normalizeStyleValue(userProvidedProperty: String, normalizedProperty: String, value: Double, errors: js.Array[String]): String = js.native
  }
  
  @JSImport("@angular/animations/browser/browser", "\u0275WebAnimationsDriver")
  @js.native
  class ɵWebAnimationsDriver () extends AnimationDriver {
    
    var _cssKeyframesDriver: js.Any = js.native
    
    var _isNativeImpl: js.Any = js.native
    
    def overrideWebAnimationsSupport(supported: Boolean): Unit = js.native
  }
  
  @JSImport("@angular/animations/browser/browser", "\u0275WebAnimationsPlayer")
  @js.native
  class ɵWebAnimationsPlayer protected ()
    extends StObject
       with AnimationPlayer {
    def this(
      element: js.Any,
      keyframes: js.Array[StringDictionary[String | Double]],
      options: StringDictionary[String | Double]
    ) = this()
    def this(
      element: js.Any,
      keyframes: js.Array[StringDictionary[String | Double]],
      options: StringDictionary[String | Double],
      _specialStyles: ɵangularPackagesAnimationsBrowserBrowserA
    ) = this()
    
    var _buildPlayer: js.Any = js.native
    
    var _delay: js.Any = js.native
    
    var _destroyed: js.Any = js.native
    
    var _duration: js.Any = js.native
    
    var _finalKeyframe: js.Any = js.native
    
    var _finished: js.Any = js.native
    
    var _initialized: js.Any = js.native
    
    var _onDestroyFns: js.Any = js.native
    
    var _onDoneFns: js.Any = js.native
    
    var _onFinish: js.Any = js.native
    
    var _onStartFns: js.Any = js.native
    
    var _preparePlayerBeforeStart: js.Any = js.native
    
    var _resetDomPlayerState: js.Any = js.native
    
    var _specialStyles: js.Any = js.native
    
    var _started: js.Any = js.native
    
    @JSName("beforeDestroy")
    def beforeDestroy_MɵWebAnimationsPlayer(): Unit = js.native
    
    var currentSnapshot: StringDictionary[String | Double] = js.native
    
    /**
      * Destroys the animation, after invoking the `beforeDestroy()` callback.
      * Calls the `onDestroy()` callback when destruction is completed.
      */
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    val domPlayer: DOMAnimation = js.native
    
    var element: js.Any = js.native
    
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
    
    var keyframes: js.Array[StringDictionary[String | Double]] = js.native
    
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
    override def setPosition(position: js.Any): Unit = js.native
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
  
  @JSImport("@angular/animations/browser/browser", "\u0275WebAnimationsStyleNormalizer")
  @js.native
  class ɵWebAnimationsStyleNormalizer () extends ɵAnimationStyleNormalizer
  
  @scala.inline
  def ɵallowPreviousPlayerStylesMerge(duration: Double, delay: Double): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275allowPreviousPlayerStylesMerge")(duration.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @JSImport("@angular/animations/browser/browser", "\u0275angular_packages_animations_browser_browser_a")
  @js.native
  class ɵangularPackagesAnimationsBrowserBrowserA protected () extends StObject {
    def this(_element: js.Any) = this()
    def this(_element: js.Any, _startStyles: StringDictionary[js.Any]) = this()
    def this(_element: js.Any, _startStyles: StringDictionary[js.Any], _endStyles: StringDictionary[js.Any]) = this()
    def this(_element: js.Any, _startStyles: Null, _endStyles: StringDictionary[js.Any]) = this()
    
    var _element: js.Any = js.native
    
    var _endStyles: js.Any = js.native
    
    var _initialStyles: js.Any = js.native
    
    var _startStyles: js.Any = js.native
    
    var _state: js.Any = js.native
    
    def destroy(): Unit = js.native
    
    def finish(): Unit = js.native
    
    def start(): Unit = js.native
  }
  /* static members */
  object ɵangularPackagesAnimationsBrowserBrowserA {
    
    @JSImport("@angular/animations/browser/browser", "\u0275angular_packages_animations_browser_browser_a")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@angular/animations/browser/browser", "\u0275angular_packages_animations_browser_browser_a.initialStylesByElement")
    @js.native
    def initialStylesByElement: WeakMap[js.Any, StringDictionary[js.Any]] = js.native
    @scala.inline
    def initialStylesByElement_=(x: WeakMap[js.Any, StringDictionary[js.Any]]): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("initialStylesByElement")(x.asInstanceOf[js.Any])
  }
  
  @scala.inline
  def ɵcontainsElement(elm1: js.Any, elm2: js.Any): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275containsElement")(elm1.asInstanceOf[js.Any], elm2.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def ɵinvokeQuery(element: js.Any, selector: String, multi: Boolean): js.Array[js.Any] = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275invokeQuery")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any], multi.asInstanceOf[js.Any])).asInstanceOf[js.Array[js.Any]]
  
  @scala.inline
  def ɵmatchesElement(element: js.Any, selector: String): Boolean = (^.asInstanceOf[js.Dynamic].applyDynamic("\u0275matchesElement")(element.asInstanceOf[js.Any], selector.asInstanceOf[js.Any])).asInstanceOf[Boolean]
  
  @scala.inline
  def ɵsupportsWebAnimations(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275supportsWebAnimations")().asInstanceOf[Boolean]
  
  @scala.inline
  def ɵvalidateStyleProperty(prop: String): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("\u0275validateStyleProperty")(prop.asInstanceOf[js.Any]).asInstanceOf[Boolean]
  
  trait AnimationEngineInstruction extends StObject {
    
    var `type`: AnimationTransitionInstructionType
  }
  object AnimationEngineInstruction {
    
    @scala.inline
    def apply(`type`: AnimationTransitionInstructionType): AnimationEngineInstruction = {
      val __obj = js.Dynamic.literal()
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[AnimationEngineInstruction]
    }
    
    @scala.inline
    implicit class AnimationEngineInstructionMutableBuilder[Self <: AnimationEngineInstruction] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setType(value: AnimationTransitionInstructionType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait AnimationTimelineInstruction
    extends StObject
       with AnimationEngineInstruction {
    
    var delay: Double
    
    var duration: Double
    
    var easing: String | Null
    
    var element: js.Any
    
    var keyframes: js.Array[ɵStyleData]
    
    var postStyleProps: js.Array[String]
    
    var preStyleProps: js.Array[String]
    
    var stretchStartingKeyframe: js.UndefOr[Boolean] = js.undefined
    
    var subTimeline: Boolean
    
    var totalTime: Double
  }
  object AnimationTimelineInstruction {
    
    @scala.inline
    def apply(
      delay: Double,
      duration: Double,
      element: js.Any,
      keyframes: js.Array[ɵStyleData],
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
    
    @scala.inline
    implicit class AnimationTimelineInstructionMutableBuilder[Self <: AnimationTimelineInstruction] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEasing(value: String): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEasingNull: Self = StObject.set(x, "easing", null)
      
      @scala.inline
      def setElement(value: js.Any): Self = StObject.set(x, "element", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyframes(value: js.Array[ɵStyleData]): Self = StObject.set(x, "keyframes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyframesVarargs(value: ɵStyleData*): Self = StObject.set(x, "keyframes", js.Array(value :_*))
      
      @scala.inline
      def setPostStyleProps(value: js.Array[String]): Self = StObject.set(x, "postStyleProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPostStylePropsVarargs(value: String*): Self = StObject.set(x, "postStyleProps", js.Array(value :_*))
      
      @scala.inline
      def setPreStyleProps(value: js.Array[String]): Self = StObject.set(x, "preStyleProps", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreStylePropsVarargs(value: String*): Self = StObject.set(x, "preStyleProps", js.Array(value :_*))
      
      @scala.inline
      def setStretchStartingKeyframe(value: Boolean): Self = StObject.set(x, "stretchStartingKeyframe", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStretchStartingKeyframeUndefined: Self = StObject.set(x, "stretchStartingKeyframe", js.undefined)
      
      @scala.inline
      def setSubTimeline(value: Boolean): Self = StObject.set(x, "subTimeline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTotalTime(value: Double): Self = StObject.set(x, "totalTime", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.angularAnimations.angularAnimationsNumbers.`0`
    - typings.angularAnimations.angularAnimationsNumbers.`1`
  */
  trait AnimationTransitionInstructionType extends StObject
  object AnimationTransitionInstructionType {
    
    @scala.inline
    def TimelineAnimation: `1` = 1.asInstanceOf[`1`]
    
    @scala.inline
    def TransitionAnimation: `0` = 0.asInstanceOf[`0`]
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
    
    def addEventListener(eventName: String, handler: js.Function1[/* event */ js.Any, js.Any]): js.Any
    
    def cancel(): Unit
    
    var currentTime: Double
    
    def dispatchEvent(eventName: String): js.Any
    
    def finish(): Unit
    
    var onfinish: js.Function
    
    def pause(): Unit
    
    def play(): Unit
    
    var position: Double
  }
  object DOMAnimation {
    
    @scala.inline
    def apply(
      addEventListener: (String, js.Function1[/* event */ js.Any, js.Any]) => js.Any,
      cancel: () => Unit,
      currentTime: Double,
      dispatchEvent: String => js.Any,
      finish: () => Unit,
      onfinish: js.Function,
      pause: () => Unit,
      play: () => Unit,
      position: Double
    ): DOMAnimation = {
      val __obj = js.Dynamic.literal(addEventListener = js.Any.fromFunction2(addEventListener), cancel = js.Any.fromFunction0(cancel), currentTime = currentTime.asInstanceOf[js.Any], dispatchEvent = js.Any.fromFunction1(dispatchEvent), finish = js.Any.fromFunction0(finish), onfinish = onfinish.asInstanceOf[js.Any], pause = js.Any.fromFunction0(pause), play = js.Any.fromFunction0(play), position = position.asInstanceOf[js.Any])
      __obj.asInstanceOf[DOMAnimation]
    }
    
    @scala.inline
    implicit class DOMAnimationMutableBuilder[Self <: DOMAnimation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAddEventListener(value: (String, js.Function1[/* event */ js.Any, js.Any]) => js.Any): Self = StObject.set(x, "addEventListener", js.Any.fromFunction2(value))
      
      @scala.inline
      def setCancel(value: () => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction0(value))
      
      @scala.inline
      def setCurrentTime(value: Double): Self = StObject.set(x, "currentTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDispatchEvent(value: String => js.Any): Self = StObject.set(x, "dispatchEvent", js.Any.fromFunction1(value))
      
      @scala.inline
      def setFinish(value: () => Unit): Self = StObject.set(x, "finish", js.Any.fromFunction0(value))
      
      @scala.inline
      def setOnfinish(value: js.Function): Self = StObject.set(x, "onfinish", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPause(value: () => Unit): Self = StObject.set(x, "pause", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPlay(value: () => Unit): Self = StObject.set(x, "play", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPosition(value: Double): Self = StObject.set(x, "position", value.asInstanceOf[js.Any])
    }
  }
  
  trait ElementInstructionMap extends StObject {
    
    var _map: js.Any
    
    def append(element: js.Any, instructions: js.Array[AnimationTimelineInstruction]): Unit
    
    def clear(): Unit
    
    def consume(element: js.Any): js.Array[AnimationTimelineInstruction]
    
    def has(element: js.Any): Boolean
  }
  object ElementInstructionMap {
    
    @scala.inline
    def apply(
      _map: js.Any,
      append: (js.Any, js.Array[AnimationTimelineInstruction]) => Unit,
      clear: () => Unit,
      consume: js.Any => js.Array[AnimationTimelineInstruction],
      has: js.Any => Boolean
    ): ElementInstructionMap = {
      val __obj = js.Dynamic.literal(_map = _map.asInstanceOf[js.Any], append = js.Any.fromFunction2(append), clear = js.Any.fromFunction0(clear), consume = js.Any.fromFunction1(consume), has = js.Any.fromFunction1(has))
      __obj.asInstanceOf[ElementInstructionMap]
    }
    
    @scala.inline
    implicit class ElementInstructionMapMutableBuilder[Self <: ElementInstructionMap] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAppend(value: (js.Any, js.Array[AnimationTimelineInstruction]) => Unit): Self = StObject.set(x, "append", js.Any.fromFunction2(value))
      
      @scala.inline
      def setClear(value: () => Unit): Self = StObject.set(x, "clear", js.Any.fromFunction0(value))
      
      @scala.inline
      def setConsume(value: js.Any => js.Array[AnimationTimelineInstruction]): Self = StObject.set(x, "consume", js.Any.fromFunction1(value))
      
      @scala.inline
      def setHas(value: js.Any => Boolean): Self = StObject.set(x, "has", js.Any.fromFunction1(value))
      
      @scala.inline
      def set_map(value: js.Any): Self = StObject.set(x, "_map", value.asInstanceOf[js.Any])
    }
  }
}
