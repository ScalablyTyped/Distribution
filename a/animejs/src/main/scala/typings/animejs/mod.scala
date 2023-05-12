package typings.animejs

import org.scalablytyped.runtime.StringDictionary
import typings.animejs.animejsStrings.center
import typings.animejs.animejsStrings.first
import typings.animejs.animejsStrings.last
import typings.animejs.animejsStrings.normal
import typings.animejs.animejsStrings.reverse
import typings.animejs.animejsStrings.x
import typings.animejs.animejsStrings.y
import typings.animejs.anon.El
import typings.std.HTMLElement
import typings.std.NodeList
import typings.std.SVGElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(params: AnimeParams): AnimeInstance = ^.asInstanceOf[js.Dynamic].apply(params.asInstanceOf[js.Any]).asInstanceOf[AnimeInstance]
  
  @JSImport("animejs", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def bezier(x1: Double, y1: Double, x2: Double, y2: Double): js.Function1[/* t */ Double, Double] = (^.asInstanceOf[js.Dynamic].applyDynamic("bezier")(x1.asInstanceOf[js.Any], y1.asInstanceOf[js.Any], x2.asInstanceOf[js.Any], y2.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* t */ Double, Double]]
  
  inline def get(targets: AnimeTarget, prop: String): String | Double = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(targets.asInstanceOf[js.Any], prop.asInstanceOf[js.Any])).asInstanceOf[String | Double]
  inline def get(targets: AnimeTarget, prop: String, unit: String): String | Double = (^.asInstanceOf[js.Dynamic].applyDynamic("get")(targets.asInstanceOf[js.Any], prop.asInstanceOf[js.Any], unit.asInstanceOf[js.Any])).asInstanceOf[String | Double]
  
  inline def path(): js.Function1[/* prop */ String, El] = ^.asInstanceOf[js.Dynamic].applyDynamic("path")().asInstanceOf[js.Function1[/* prop */ String, El]]
  inline def path(path: String): js.Function1[/* prop */ String, El] = ^.asInstanceOf[js.Dynamic].applyDynamic("path")(path.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* prop */ String, El]]
  inline def path(path: String, percent: Double): js.Function1[/* prop */ String, El] = (^.asInstanceOf[js.Dynamic].applyDynamic("path")(path.asInstanceOf[js.Any], percent.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* prop */ String, El]]
  inline def path(path: Null, percent: Double): js.Function1[/* prop */ String, El] = (^.asInstanceOf[js.Dynamic].applyDynamic("path")(path.asInstanceOf[js.Any], percent.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* prop */ String, El]]
  inline def path(path: HTMLElement): js.Function1[/* prop */ String, El] = ^.asInstanceOf[js.Dynamic].applyDynamic("path")(path.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* prop */ String, El]]
  inline def path(path: HTMLElement, percent: Double): js.Function1[/* prop */ String, El] = (^.asInstanceOf[js.Dynamic].applyDynamic("path")(path.asInstanceOf[js.Any], percent.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* prop */ String, El]]
  inline def path(path: SVGElement): js.Function1[/* prop */ String, El] = ^.asInstanceOf[js.Dynamic].applyDynamic("path")(path.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* prop */ String, El]]
  inline def path(path: SVGElement, percent: Double): js.Function1[/* prop */ String, El] = (^.asInstanceOf[js.Dynamic].applyDynamic("path")(path.asInstanceOf[js.Any], percent.asInstanceOf[js.Any])).asInstanceOf[js.Function1[/* prop */ String, El]]
  
  inline def random(min: Double, max: Double): Double = (^.asInstanceOf[js.Dynamic].applyDynamic("random")(min.asInstanceOf[js.Any], max.asInstanceOf[js.Any])).asInstanceOf[Double]
  
  inline def remove(targets: js.Array[AnimeTarget]): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("remove")(targets.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def remove(targets: AnimeTarget): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("remove")(targets.asInstanceOf[js.Any]).asInstanceOf[Unit]
  
  @JSImport("animejs", "running")
  @js.native
  val running: js.Array[AnimeInstance] = js.native
  
  inline def set(targets: AnimeTarget, value: StringDictionary[Any]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("set")(targets.asInstanceOf[js.Any], value.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def setDashoffset(): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("setDashoffset")().asInstanceOf[Double]
  inline def setDashoffset(el: HTMLElement): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("setDashoffset")(el.asInstanceOf[js.Any]).asInstanceOf[Double]
  inline def setDashoffset(el: SVGElement): Double = ^.asInstanceOf[js.Dynamic].applyDynamic("setDashoffset")(el.asInstanceOf[js.Any]).asInstanceOf[Double]
  
  @JSImport("animejs", "speed")
  @js.native
  val speed: Double = js.native
  
  inline def stagger(value: String): FunctionBasedParameter = ^.asInstanceOf[js.Dynamic].applyDynamic("stagger")(value.asInstanceOf[js.Any]).asInstanceOf[FunctionBasedParameter]
  inline def stagger(value: String, options: StaggerOptions): FunctionBasedParameter = (^.asInstanceOf[js.Dynamic].applyDynamic("stagger")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[FunctionBasedParameter]
  inline def stagger(value: js.Array[Double | String]): FunctionBasedParameter = ^.asInstanceOf[js.Dynamic].applyDynamic("stagger")(value.asInstanceOf[js.Any]).asInstanceOf[FunctionBasedParameter]
  inline def stagger(value: js.Array[Double | String], options: StaggerOptions): FunctionBasedParameter = (^.asInstanceOf[js.Dynamic].applyDynamic("stagger")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[FunctionBasedParameter]
  inline def stagger(value: Double): FunctionBasedParameter = ^.asInstanceOf[js.Dynamic].applyDynamic("stagger")(value.asInstanceOf[js.Any]).asInstanceOf[FunctionBasedParameter]
  inline def stagger(value: Double, options: StaggerOptions): FunctionBasedParameter = (^.asInstanceOf[js.Dynamic].applyDynamic("stagger")(value.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[FunctionBasedParameter]
  
  // Timeline
  inline def timeline(): AnimeTimelineInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("timeline")().asInstanceOf[AnimeTimelineInstance]
  inline def timeline(params: js.Array[AnimeInstance]): AnimeTimelineInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("timeline")(params.asInstanceOf[js.Any]).asInstanceOf[AnimeTimelineInstance]
  inline def timeline(params: AnimeParams): AnimeTimelineInstance = ^.asInstanceOf[js.Dynamic].applyDynamic("timeline")(params.asInstanceOf[js.Any]).asInstanceOf[AnimeTimelineInstance]
  
  // Helpers
  @JSImport("animejs", "version")
  @js.native
  val version: String = js.native
  
  trait Animatable extends StObject {
    
    var id: Double
    
    var target: HTMLElement
    
    var total: Double
    
    var transforms: js.Object
  }
  object Animatable {
    
    inline def apply(id: Double, target: HTMLElement, total: Double, transforms: js.Object): Animatable = {
      val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any], transforms = transforms.asInstanceOf[js.Any])
      __obj.asInstanceOf[Animatable]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Animatable] (val x: Self) extends AnyVal {
      
      inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setTarget(value: HTMLElement): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
      
      inline def setTotal(value: Double): Self = StObject.set(x, "total", value.asInstanceOf[js.Any])
      
      inline def setTransforms(value: js.Object): Self = StObject.set(x, "transforms", value.asInstanceOf[js.Any])
    }
  }
  
  trait Animation extends StObject {
    
    var animatable: Animatable
    
    var currentValue: String
    
    var delay: Double
    
    var duration: Double
    
    var endDelay: Double
    
    var property: String
    
    var tweens: js.Array[js.Object]
    
    var `type`: String
  }
  object Animation {
    
    inline def apply(
      animatable: Animatable,
      currentValue: String,
      delay: Double,
      duration: Double,
      endDelay: Double,
      property: String,
      tweens: js.Array[js.Object],
      `type`: String
    ): Animation = {
      val __obj = js.Dynamic.literal(animatable = animatable.asInstanceOf[js.Any], currentValue = currentValue.asInstanceOf[js.Any], delay = delay.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], endDelay = endDelay.asInstanceOf[js.Any], property = property.asInstanceOf[js.Any], tweens = tweens.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[Animation]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Animation] (val x: Self) extends AnyVal {
      
      inline def setAnimatable(value: Animatable): Self = StObject.set(x, "animatable", value.asInstanceOf[js.Any])
      
      inline def setCurrentValue(value: String): Self = StObject.set(x, "currentValue", value.asInstanceOf[js.Any])
      
      inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setEndDelay(value: Double): Self = StObject.set(x, "endDelay", value.asInstanceOf[js.Any])
      
      inline def setProperty(value: String): Self = StObject.set(x, "property", value.asInstanceOf[js.Any])
      
      inline def setTweens(value: js.Array[js.Object]): Self = StObject.set(x, "tweens", value.asInstanceOf[js.Any])
      
      inline def setTweensVarargs(value: js.Object*): Self = StObject.set(x, "tweens", js.Array(value*))
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait AnimeAnimParams
    extends StObject
       with AnimeCallBack
       with /* AnyAnimatedProperty */ StringDictionary[Any] {
    
    var delay: js.UndefOr[Double | FunctionBasedParameter] = js.undefined
    
    var duration: js.UndefOr[Double | FunctionBasedParameter] = js.undefined
    
    var easing: js.UndefOr[
        EasingOptions | String | CustomEasingFunction | (js.Function1[/* el */ HTMLElement, String])
      ] = js.undefined
    
    var elasticity: js.UndefOr[Double | FunctionBasedParameter] = js.undefined
    
    var endDelay: js.UndefOr[Double | FunctionBasedParameter] = js.undefined
    
    var keyframes: js.UndefOr[js.Array[AnimeAnimParams]] = js.undefined
    
    var round: js.UndefOr[Double | Boolean | FunctionBasedParameter] = js.undefined
    
    var targets: js.UndefOr[AnimeTarget | js.Array[AnimeTarget]] = js.undefined
  }
  object AnimeAnimParams {
    
    inline def apply(): AnimeAnimParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AnimeAnimParams]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AnimeAnimParams] (val x: Self) extends AnyVal {
      
      inline def setDelay(value: Double | FunctionBasedParameter): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDelayFunction3(value: (/* element */ HTMLElement, /* index */ Double, /* length */ Double) => Double): Self = StObject.set(x, "delay", js.Any.fromFunction3(value))
      
      inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      inline def setDuration(value: Double | FunctionBasedParameter): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationFunction3(value: (/* element */ HTMLElement, /* index */ Double, /* length */ Double) => Double): Self = StObject.set(x, "duration", js.Any.fromFunction3(value))
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setEasing(
        value: EasingOptions | String | CustomEasingFunction | (js.Function1[/* el */ HTMLElement, String])
      ): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
      
      inline def setEasingFunction1(value: /* el */ HTMLElement => String): Self = StObject.set(x, "easing", js.Any.fromFunction1(value))
      
      inline def setEasingFunction3(
        value: (/* el */ HTMLElement, /* index */ Double, /* length */ Double) => js.Function1[/* time */ Double, Double]
      ): Self = StObject.set(x, "easing", js.Any.fromFunction3(value))
      
      inline def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
      
      inline def setElasticity(value: Double | FunctionBasedParameter): Self = StObject.set(x, "elasticity", value.asInstanceOf[js.Any])
      
      inline def setElasticityFunction3(value: (/* element */ HTMLElement, /* index */ Double, /* length */ Double) => Double): Self = StObject.set(x, "elasticity", js.Any.fromFunction3(value))
      
      inline def setElasticityUndefined: Self = StObject.set(x, "elasticity", js.undefined)
      
      inline def setEndDelay(value: Double | FunctionBasedParameter): Self = StObject.set(x, "endDelay", value.asInstanceOf[js.Any])
      
      inline def setEndDelayFunction3(value: (/* element */ HTMLElement, /* index */ Double, /* length */ Double) => Double): Self = StObject.set(x, "endDelay", js.Any.fromFunction3(value))
      
      inline def setEndDelayUndefined: Self = StObject.set(x, "endDelay", js.undefined)
      
      inline def setKeyframes(value: js.Array[AnimeAnimParams]): Self = StObject.set(x, "keyframes", value.asInstanceOf[js.Any])
      
      inline def setKeyframesUndefined: Self = StObject.set(x, "keyframes", js.undefined)
      
      inline def setKeyframesVarargs(value: AnimeAnimParams*): Self = StObject.set(x, "keyframes", js.Array(value*))
      
      inline def setRound(value: Double | Boolean | FunctionBasedParameter): Self = StObject.set(x, "round", value.asInstanceOf[js.Any])
      
      inline def setRoundFunction3(value: (/* element */ HTMLElement, /* index */ Double, /* length */ Double) => Double): Self = StObject.set(x, "round", js.Any.fromFunction3(value))
      
      inline def setRoundUndefined: Self = StObject.set(x, "round", js.undefined)
      
      inline def setTargets(value: AnimeTarget | js.Array[AnimeTarget]): Self = StObject.set(x, "targets", value.asInstanceOf[js.Any])
      
      inline def setTargetsNull: Self = StObject.set(x, "targets", null)
      
      inline def setTargetsUndefined: Self = StObject.set(x, "targets", js.undefined)
      
      inline def setTargetsVarargs(value: AnimeTarget*): Self = StObject.set(x, "targets", js.Array(value*))
    }
  }
  
  trait AnimeCallBack extends StObject {
    
    var begin: js.UndefOr[AnimeCallbackFunction] = js.undefined
    
    var change: js.UndefOr[AnimeCallbackFunction] = js.undefined
    
    var changeBegin: js.UndefOr[AnimeCallbackFunction] = js.undefined
    
    var changeComplete: js.UndefOr[AnimeCallbackFunction] = js.undefined
    
    var complete: js.UndefOr[AnimeCallbackFunction] = js.undefined
    
    var loopBegin: js.UndefOr[AnimeCallbackFunction] = js.undefined
    
    var loopComplete: js.UndefOr[AnimeCallbackFunction] = js.undefined
    
    var update: js.UndefOr[AnimeCallbackFunction] = js.undefined
  }
  object AnimeCallBack {
    
    inline def apply(): AnimeCallBack = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AnimeCallBack]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AnimeCallBack] (val x: Self) extends AnyVal {
      
      inline def setBegin(value: /* anim */ AnimeInstance => Unit): Self = StObject.set(x, "begin", js.Any.fromFunction1(value))
      
      inline def setBeginUndefined: Self = StObject.set(x, "begin", js.undefined)
      
      inline def setChange(value: /* anim */ AnimeInstance => Unit): Self = StObject.set(x, "change", js.Any.fromFunction1(value))
      
      inline def setChangeBegin(value: /* anim */ AnimeInstance => Unit): Self = StObject.set(x, "changeBegin", js.Any.fromFunction1(value))
      
      inline def setChangeBeginUndefined: Self = StObject.set(x, "changeBegin", js.undefined)
      
      inline def setChangeComplete(value: /* anim */ AnimeInstance => Unit): Self = StObject.set(x, "changeComplete", js.Any.fromFunction1(value))
      
      inline def setChangeCompleteUndefined: Self = StObject.set(x, "changeComplete", js.undefined)
      
      inline def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
      
      inline def setComplete(value: /* anim */ AnimeInstance => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
      
      inline def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
      
      inline def setLoopBegin(value: /* anim */ AnimeInstance => Unit): Self = StObject.set(x, "loopBegin", js.Any.fromFunction1(value))
      
      inline def setLoopBeginUndefined: Self = StObject.set(x, "loopBegin", js.undefined)
      
      inline def setLoopComplete(value: /* anim */ AnimeInstance => Unit): Self = StObject.set(x, "loopComplete", js.Any.fromFunction1(value))
      
      inline def setLoopCompleteUndefined: Self = StObject.set(x, "loopComplete", js.undefined)
      
      inline def setUpdate(value: /* anim */ AnimeInstance => Unit): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
      
      inline def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
    }
  }
  
  type AnimeCallbackFunction = js.Function1[/* anim */ AnimeInstance, Unit]
  
  trait AnimeInstance
    extends StObject
       with AnimeCallBack {
    
    var animatables: js.Array[Animatable]
    
    var animations: js.Array[Animation]
    
    var autoplay: Boolean
    
    var began: Boolean
    
    var completed: Boolean
    
    var currentTime: Double
    
    var delay: Double
    
    var direction: String
    
    var duration: Double
    
    var finished: js.Promise[Unit]
    
    var loop: Double | Boolean
    
    def pause(): Unit
    
    var paused: Boolean
    
    def play(): Unit
    
    var progress: Double
    
    var remaining: Double
    
    def restart(): Unit
    
    def reverse(): Unit
    
    var reversed: Boolean
    
    def seek(time: Double): Unit
    
    def tick(time: Double): Unit
    
    var timelineOffset: Double
  }
  object AnimeInstance {
    
    inline def apply(
      animatables: js.Array[Animatable],
      animations: js.Array[Animation],
      autoplay: Boolean,
      began: Boolean,
      completed: Boolean,
      currentTime: Double,
      delay: Double,
      direction: String,
      duration: Double,
      finished: js.Promise[Unit],
      loop: Double | Boolean,
      pause: () => Unit,
      paused: Boolean,
      play: () => Unit,
      progress: Double,
      remaining: Double,
      restart: () => Unit,
      reverse: () => Unit,
      reversed: Boolean,
      seek: Double => Unit,
      tick: Double => Unit,
      timelineOffset: Double
    ): AnimeInstance = {
      val __obj = js.Dynamic.literal(animatables = animatables.asInstanceOf[js.Any], animations = animations.asInstanceOf[js.Any], autoplay = autoplay.asInstanceOf[js.Any], began = began.asInstanceOf[js.Any], completed = completed.asInstanceOf[js.Any], currentTime = currentTime.asInstanceOf[js.Any], delay = delay.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], finished = finished.asInstanceOf[js.Any], loop = loop.asInstanceOf[js.Any], pause = js.Any.fromFunction0(pause), paused = paused.asInstanceOf[js.Any], play = js.Any.fromFunction0(play), progress = progress.asInstanceOf[js.Any], remaining = remaining.asInstanceOf[js.Any], restart = js.Any.fromFunction0(restart), reverse = js.Any.fromFunction0(reverse), reversed = reversed.asInstanceOf[js.Any], seek = js.Any.fromFunction1(seek), tick = js.Any.fromFunction1(tick), timelineOffset = timelineOffset.asInstanceOf[js.Any])
      __obj.asInstanceOf[AnimeInstance]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AnimeInstance] (val x: Self) extends AnyVal {
      
      inline def setAnimatables(value: js.Array[Animatable]): Self = StObject.set(x, "animatables", value.asInstanceOf[js.Any])
      
      inline def setAnimatablesVarargs(value: Animatable*): Self = StObject.set(x, "animatables", js.Array(value*))
      
      inline def setAnimations(value: js.Array[Animation]): Self = StObject.set(x, "animations", value.asInstanceOf[js.Any])
      
      inline def setAnimationsVarargs(value: Animation*): Self = StObject.set(x, "animations", js.Array(value*))
      
      inline def setAutoplay(value: Boolean): Self = StObject.set(x, "autoplay", value.asInstanceOf[js.Any])
      
      inline def setBegan(value: Boolean): Self = StObject.set(x, "began", value.asInstanceOf[js.Any])
      
      inline def setCompleted(value: Boolean): Self = StObject.set(x, "completed", value.asInstanceOf[js.Any])
      
      inline def setCurrentTime(value: Double): Self = StObject.set(x, "currentTime", value.asInstanceOf[js.Any])
      
      inline def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setFinished(value: js.Promise[Unit]): Self = StObject.set(x, "finished", value.asInstanceOf[js.Any])
      
      inline def setLoop(value: Double | Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
      
      inline def setPause(value: () => Unit): Self = StObject.set(x, "pause", js.Any.fromFunction0(value))
      
      inline def setPaused(value: Boolean): Self = StObject.set(x, "paused", value.asInstanceOf[js.Any])
      
      inline def setPlay(value: () => Unit): Self = StObject.set(x, "play", js.Any.fromFunction0(value))
      
      inline def setProgress(value: Double): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
      
      inline def setRemaining(value: Double): Self = StObject.set(x, "remaining", value.asInstanceOf[js.Any])
      
      inline def setRestart(value: () => Unit): Self = StObject.set(x, "restart", js.Any.fromFunction0(value))
      
      inline def setReverse(value: () => Unit): Self = StObject.set(x, "reverse", js.Any.fromFunction0(value))
      
      inline def setReversed(value: Boolean): Self = StObject.set(x, "reversed", value.asInstanceOf[js.Any])
      
      inline def setSeek(value: Double => Unit): Self = StObject.set(x, "seek", js.Any.fromFunction1(value))
      
      inline def setTick(value: Double => Unit): Self = StObject.set(x, "tick", js.Any.fromFunction1(value))
      
      inline def setTimelineOffset(value: Double): Self = StObject.set(x, "timelineOffset", value.asInstanceOf[js.Any])
    }
  }
  
  trait AnimeInstanceParams
    extends StObject
       with AnimeCallBack {
    
    var autoplay: js.UndefOr[Boolean] = js.undefined
    
    var direction: js.UndefOr[DirectionOptions | String] = js.undefined
    
    var loop: js.UndefOr[Double | Boolean] = js.undefined
  }
  object AnimeInstanceParams {
    
    inline def apply(): AnimeInstanceParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AnimeInstanceParams]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AnimeInstanceParams] (val x: Self) extends AnyVal {
      
      inline def setAutoplay(value: Boolean): Self = StObject.set(x, "autoplay", value.asInstanceOf[js.Any])
      
      inline def setAutoplayUndefined: Self = StObject.set(x, "autoplay", js.undefined)
      
      inline def setDirection(value: DirectionOptions | String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setLoop(value: Double | Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
      
      inline def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.animejs.mod.AnimeCallBack because Already inherited
  - typings.animejs.mod.AnimeAnimParams because var conflicts: begin, change, changeBegin, changeComplete, complete, loopBegin, loopComplete, update. Inlined targets, duration, delay, endDelay, elasticity, round, keyframes, easing */ trait AnimeParams
    extends StObject
       with AnimeInstanceParams
       with /* AnyAnimatedProperty */ StringDictionary[Any] {
    
    var delay: js.UndefOr[Double | FunctionBasedParameter] = js.undefined
    
    var duration: js.UndefOr[Double | FunctionBasedParameter] = js.undefined
    
    var easing: js.UndefOr[
        EasingOptions | String | CustomEasingFunction | (js.Function1[/* el */ HTMLElement, String])
      ] = js.undefined
    
    var elasticity: js.UndefOr[Double | FunctionBasedParameter] = js.undefined
    
    var endDelay: js.UndefOr[Double | FunctionBasedParameter] = js.undefined
    
    var keyframes: js.UndefOr[js.Array[AnimeAnimParams]] = js.undefined
    
    var round: js.UndefOr[Double | Boolean | FunctionBasedParameter] = js.undefined
    
    var targets: js.UndefOr[AnimeTarget | js.Array[AnimeTarget]] = js.undefined
  }
  object AnimeParams {
    
    inline def apply(): AnimeParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AnimeParams]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AnimeParams] (val x: Self) extends AnyVal {
      
      inline def setDelay(value: Double | FunctionBasedParameter): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      inline def setDelayFunction3(value: (/* element */ HTMLElement, /* index */ Double, /* length */ Double) => Double): Self = StObject.set(x, "delay", js.Any.fromFunction3(value))
      
      inline def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      inline def setDuration(value: Double | FunctionBasedParameter): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationFunction3(value: (/* element */ HTMLElement, /* index */ Double, /* length */ Double) => Double): Self = StObject.set(x, "duration", js.Any.fromFunction3(value))
      
      inline def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      inline def setEasing(
        value: EasingOptions | String | CustomEasingFunction | (js.Function1[/* el */ HTMLElement, String])
      ): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
      
      inline def setEasingFunction1(value: /* el */ HTMLElement => String): Self = StObject.set(x, "easing", js.Any.fromFunction1(value))
      
      inline def setEasingFunction3(
        value: (/* el */ HTMLElement, /* index */ Double, /* length */ Double) => js.Function1[/* time */ Double, Double]
      ): Self = StObject.set(x, "easing", js.Any.fromFunction3(value))
      
      inline def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
      
      inline def setElasticity(value: Double | FunctionBasedParameter): Self = StObject.set(x, "elasticity", value.asInstanceOf[js.Any])
      
      inline def setElasticityFunction3(value: (/* element */ HTMLElement, /* index */ Double, /* length */ Double) => Double): Self = StObject.set(x, "elasticity", js.Any.fromFunction3(value))
      
      inline def setElasticityUndefined: Self = StObject.set(x, "elasticity", js.undefined)
      
      inline def setEndDelay(value: Double | FunctionBasedParameter): Self = StObject.set(x, "endDelay", value.asInstanceOf[js.Any])
      
      inline def setEndDelayFunction3(value: (/* element */ HTMLElement, /* index */ Double, /* length */ Double) => Double): Self = StObject.set(x, "endDelay", js.Any.fromFunction3(value))
      
      inline def setEndDelayUndefined: Self = StObject.set(x, "endDelay", js.undefined)
      
      inline def setKeyframes(value: js.Array[AnimeAnimParams]): Self = StObject.set(x, "keyframes", value.asInstanceOf[js.Any])
      
      inline def setKeyframesUndefined: Self = StObject.set(x, "keyframes", js.undefined)
      
      inline def setKeyframesVarargs(value: AnimeAnimParams*): Self = StObject.set(x, "keyframes", js.Array(value*))
      
      inline def setRound(value: Double | Boolean | FunctionBasedParameter): Self = StObject.set(x, "round", value.asInstanceOf[js.Any])
      
      inline def setRoundFunction3(value: (/* element */ HTMLElement, /* index */ Double, /* length */ Double) => Double): Self = StObject.set(x, "round", js.Any.fromFunction3(value))
      
      inline def setRoundUndefined: Self = StObject.set(x, "round", js.undefined)
      
      inline def setTargets(value: AnimeTarget | js.Array[AnimeTarget]): Self = StObject.set(x, "targets", value.asInstanceOf[js.Any])
      
      inline def setTargetsNull: Self = StObject.set(x, "targets", null)
      
      inline def setTargetsUndefined: Self = StObject.set(x, "targets", js.undefined)
      
      inline def setTargetsVarargs(value: AnimeTarget*): Self = StObject.set(x, "targets", js.Array(value*))
    }
  }
  
  // Allowing null is necessary because DOM queries may not return anything.
  type AnimeTarget = String | js.Object | HTMLElement | SVGElement | NodeList | Null
  
  trait AnimeTimelineAnimParams
    extends StObject
       with AnimeAnimParams {
    
    var timelineOffset: Double | String | FunctionBasedParameter
  }
  object AnimeTimelineAnimParams {
    
    inline def apply(timelineOffset: Double | String | FunctionBasedParameter): AnimeTimelineAnimParams = {
      val __obj = js.Dynamic.literal(timelineOffset = timelineOffset.asInstanceOf[js.Any])
      __obj.asInstanceOf[AnimeTimelineAnimParams]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AnimeTimelineAnimParams] (val x: Self) extends AnyVal {
      
      inline def setTimelineOffset(value: Double | String | FunctionBasedParameter): Self = StObject.set(x, "timelineOffset", value.asInstanceOf[js.Any])
      
      inline def setTimelineOffsetFunction3(value: (/* element */ HTMLElement, /* index */ Double, /* length */ Double) => Double): Self = StObject.set(x, "timelineOffset", js.Any.fromFunction3(value))
    }
  }
  
  @js.native
  trait AnimeTimelineInstance
    extends StObject
       with AnimeInstance {
    
    def add(params: AnimeAnimParams): AnimeTimelineInstance = js.native
    def add(params: AnimeAnimParams, timelineOffset: String): AnimeTimelineInstance = js.native
    def add(params: AnimeAnimParams, timelineOffset: Double): AnimeTimelineInstance = js.native
  }
  
  type CustomEasingFunction = js.Function3[
    /* el */ HTMLElement, 
    /* index */ Double, 
    /* length */ Double, 
    js.Function1[/* time */ Double, Double]
  ]
  
  /* Rewritten from type alias, can be one of: 
    - typings.animejs.animejsStrings.reverse
    - typings.animejs.animejsStrings.alternate
    - typings.animejs.animejsStrings.normal
  */
  trait DirectionOptions extends StObject
  object DirectionOptions {
    
    inline def alternate: typings.animejs.animejsStrings.alternate = "alternate".asInstanceOf[typings.animejs.animejsStrings.alternate]
    
    inline def normal: typings.animejs.animejsStrings.normal = "normal".asInstanceOf[typings.animejs.animejsStrings.normal]
    
    inline def reverse: typings.animejs.animejsStrings.reverse = "reverse".asInstanceOf[typings.animejs.animejsStrings.reverse]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.animejs.animejsStrings.linear
    - typings.animejs.animejsStrings.easeInQuad
    - typings.animejs.animejsStrings.easeInCubic
    - typings.animejs.animejsStrings.easeInQuart
    - typings.animejs.animejsStrings.easeInQuint
    - typings.animejs.animejsStrings.easeInSine
    - typings.animejs.animejsStrings.easeInExpo
    - typings.animejs.animejsStrings.easeInCirc
    - typings.animejs.animejsStrings.easeInBack
    - typings.animejs.animejsStrings.easeInElastic
    - typings.animejs.animejsStrings.easeInBounce
    - typings.animejs.animejsStrings.easeOutQuad
    - typings.animejs.animejsStrings.easeOutCubic
    - typings.animejs.animejsStrings.easeOutQuart
    - typings.animejs.animejsStrings.easeOutQuint
    - typings.animejs.animejsStrings.easeOutSine
    - typings.animejs.animejsStrings.easeOutExpo
    - typings.animejs.animejsStrings.easeOutCirc
    - typings.animejs.animejsStrings.easeOutBack
    - typings.animejs.animejsStrings.easeOutElastic
    - typings.animejs.animejsStrings.easeOutBounce
    - typings.animejs.animejsStrings.easeInOutQuad
    - typings.animejs.animejsStrings.easeInOutCubic
    - typings.animejs.animejsStrings.easeInOutQuart
    - typings.animejs.animejsStrings.easeInOutQuint
    - typings.animejs.animejsStrings.easeInOutSine
    - typings.animejs.animejsStrings.easeInOutExpo
    - typings.animejs.animejsStrings.easeInOutCirc
    - typings.animejs.animejsStrings.easeInOutBack
    - typings.animejs.animejsStrings.easeInOutElastic
    - typings.animejs.animejsStrings.easeInOutBounce
  */
  trait EasingOptions extends StObject
  object EasingOptions {
    
    inline def easeInBack: typings.animejs.animejsStrings.easeInBack = "easeInBack".asInstanceOf[typings.animejs.animejsStrings.easeInBack]
    
    inline def easeInBounce: typings.animejs.animejsStrings.easeInBounce = "easeInBounce".asInstanceOf[typings.animejs.animejsStrings.easeInBounce]
    
    inline def easeInCirc: typings.animejs.animejsStrings.easeInCirc = "easeInCirc".asInstanceOf[typings.animejs.animejsStrings.easeInCirc]
    
    inline def easeInCubic: typings.animejs.animejsStrings.easeInCubic = "easeInCubic".asInstanceOf[typings.animejs.animejsStrings.easeInCubic]
    
    inline def easeInElastic: typings.animejs.animejsStrings.easeInElastic = "easeInElastic".asInstanceOf[typings.animejs.animejsStrings.easeInElastic]
    
    inline def easeInExpo: typings.animejs.animejsStrings.easeInExpo = "easeInExpo".asInstanceOf[typings.animejs.animejsStrings.easeInExpo]
    
    inline def easeInOutBack: typings.animejs.animejsStrings.easeInOutBack = "easeInOutBack".asInstanceOf[typings.animejs.animejsStrings.easeInOutBack]
    
    inline def easeInOutBounce: typings.animejs.animejsStrings.easeInOutBounce = "easeInOutBounce".asInstanceOf[typings.animejs.animejsStrings.easeInOutBounce]
    
    inline def easeInOutCirc: typings.animejs.animejsStrings.easeInOutCirc = "easeInOutCirc".asInstanceOf[typings.animejs.animejsStrings.easeInOutCirc]
    
    inline def easeInOutCubic: typings.animejs.animejsStrings.easeInOutCubic = "easeInOutCubic".asInstanceOf[typings.animejs.animejsStrings.easeInOutCubic]
    
    inline def easeInOutElastic: typings.animejs.animejsStrings.easeInOutElastic = "easeInOutElastic".asInstanceOf[typings.animejs.animejsStrings.easeInOutElastic]
    
    inline def easeInOutExpo: typings.animejs.animejsStrings.easeInOutExpo = "easeInOutExpo".asInstanceOf[typings.animejs.animejsStrings.easeInOutExpo]
    
    inline def easeInOutQuad: typings.animejs.animejsStrings.easeInOutQuad = "easeInOutQuad".asInstanceOf[typings.animejs.animejsStrings.easeInOutQuad]
    
    inline def easeInOutQuart: typings.animejs.animejsStrings.easeInOutQuart = "easeInOutQuart".asInstanceOf[typings.animejs.animejsStrings.easeInOutQuart]
    
    inline def easeInOutQuint: typings.animejs.animejsStrings.easeInOutQuint = "easeInOutQuint".asInstanceOf[typings.animejs.animejsStrings.easeInOutQuint]
    
    inline def easeInOutSine: typings.animejs.animejsStrings.easeInOutSine = "easeInOutSine".asInstanceOf[typings.animejs.animejsStrings.easeInOutSine]
    
    inline def easeInQuad: typings.animejs.animejsStrings.easeInQuad = "easeInQuad".asInstanceOf[typings.animejs.animejsStrings.easeInQuad]
    
    inline def easeInQuart: typings.animejs.animejsStrings.easeInQuart = "easeInQuart".asInstanceOf[typings.animejs.animejsStrings.easeInQuart]
    
    inline def easeInQuint: typings.animejs.animejsStrings.easeInQuint = "easeInQuint".asInstanceOf[typings.animejs.animejsStrings.easeInQuint]
    
    inline def easeInSine: typings.animejs.animejsStrings.easeInSine = "easeInSine".asInstanceOf[typings.animejs.animejsStrings.easeInSine]
    
    inline def easeOutBack: typings.animejs.animejsStrings.easeOutBack = "easeOutBack".asInstanceOf[typings.animejs.animejsStrings.easeOutBack]
    
    inline def easeOutBounce: typings.animejs.animejsStrings.easeOutBounce = "easeOutBounce".asInstanceOf[typings.animejs.animejsStrings.easeOutBounce]
    
    inline def easeOutCirc: typings.animejs.animejsStrings.easeOutCirc = "easeOutCirc".asInstanceOf[typings.animejs.animejsStrings.easeOutCirc]
    
    inline def easeOutCubic: typings.animejs.animejsStrings.easeOutCubic = "easeOutCubic".asInstanceOf[typings.animejs.animejsStrings.easeOutCubic]
    
    inline def easeOutElastic: typings.animejs.animejsStrings.easeOutElastic = "easeOutElastic".asInstanceOf[typings.animejs.animejsStrings.easeOutElastic]
    
    inline def easeOutExpo: typings.animejs.animejsStrings.easeOutExpo = "easeOutExpo".asInstanceOf[typings.animejs.animejsStrings.easeOutExpo]
    
    inline def easeOutQuad: typings.animejs.animejsStrings.easeOutQuad = "easeOutQuad".asInstanceOf[typings.animejs.animejsStrings.easeOutQuad]
    
    inline def easeOutQuart: typings.animejs.animejsStrings.easeOutQuart = "easeOutQuart".asInstanceOf[typings.animejs.animejsStrings.easeOutQuart]
    
    inline def easeOutQuint: typings.animejs.animejsStrings.easeOutQuint = "easeOutQuint".asInstanceOf[typings.animejs.animejsStrings.easeOutQuint]
    
    inline def easeOutSine: typings.animejs.animejsStrings.easeOutSine = "easeOutSine".asInstanceOf[typings.animejs.animejsStrings.easeOutSine]
    
    inline def linear: typings.animejs.animejsStrings.linear = "linear".asInstanceOf[typings.animejs.animejsStrings.linear]
  }
  
  type FunctionBasedParameter = js.Function3[/* element */ HTMLElement, /* index */ Double, /* length */ Double, Double]
  
  trait StaggerOptions extends StObject {
    
    var axis: js.UndefOr[x | y] = js.undefined
    
    var direction: js.UndefOr[normal | reverse] = js.undefined
    
    var easing: js.UndefOr[CustomEasingFunction | String | EasingOptions] = js.undefined
    
    var from: js.UndefOr[first | last | center | Double] = js.undefined
    
    var grid: js.UndefOr[js.Array[Double]] = js.undefined
    
    var start: js.UndefOr[Double | String] = js.undefined
  }
  object StaggerOptions {
    
    inline def apply(): StaggerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StaggerOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: StaggerOptions] (val x: Self) extends AnyVal {
      
      inline def setAxis(value: typings.animejs.animejsStrings.x | y): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
      
      inline def setAxisUndefined: Self = StObject.set(x, "axis", js.undefined)
      
      inline def setDirection(value: normal | reverse): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      inline def setEasing(value: CustomEasingFunction | String | EasingOptions): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
      
      inline def setEasingFunction3(
        value: (/* el */ HTMLElement, /* index */ Double, /* length */ Double) => js.Function1[/* time */ Double, Double]
      ): Self = StObject.set(x, "easing", js.Any.fromFunction3(value))
      
      inline def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
      
      inline def setFrom(value: first | last | center | Double): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      inline def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      inline def setGrid(value: js.Array[Double]): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
      
      inline def setGridUndefined: Self = StObject.set(x, "grid", js.undefined)
      
      inline def setGridVarargs(value: Double*): Self = StObject.set(x, "grid", js.Array(value*))
      
      inline def setStart(value: Double | String): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      inline def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    }
  }
}
