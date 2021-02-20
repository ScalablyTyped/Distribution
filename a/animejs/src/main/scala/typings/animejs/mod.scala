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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("animejs", JSImport.Namespace)
  @js.native
  def apply(params: AnimeParams): AnimeInstance = js.native
  
  @JSImport("animejs", "bezier")
  @js.native
  def bezier(x1: Double, y1: Double, x2: Double, y2: Double): js.Function1[/* t */ Double, Double] = js.native
  
  @JSImport("animejs", "get")
  @js.native
  def get(targets: AnimeTarget, prop: String): String | Double = js.native
  
  @JSImport("animejs", "path")
  @js.native
  def path(): js.Function1[/* prop */ String, El] = js.native
  @JSImport("animejs", "path")
  @js.native
  def path(path: String): js.Function1[/* prop */ String, El] = js.native
  @JSImport("animejs", "path")
  @js.native
  def path(path: String, percent: Double): js.Function1[/* prop */ String, El] = js.native
  @JSImport("animejs", "path")
  @js.native
  def path(path: Null, percent: Double): js.Function1[/* prop */ String, El] = js.native
  @JSImport("animejs", "path")
  @js.native
  def path(path: HTMLElement): js.Function1[/* prop */ String, El] = js.native
  @JSImport("animejs", "path")
  @js.native
  def path(path: HTMLElement, percent: Double): js.Function1[/* prop */ String, El] = js.native
  @JSImport("animejs", "path")
  @js.native
  def path(path: SVGElement): js.Function1[/* prop */ String, El] = js.native
  @JSImport("animejs", "path")
  @js.native
  def path(path: SVGElement, percent: Double): js.Function1[/* prop */ String, El] = js.native
  
  @JSImport("animejs", "random")
  @js.native
  def random(min: Double, max: Double): Double = js.native
  
  @JSImport("animejs", "remove")
  @js.native
  def remove(targets: js.Array[AnimeTarget]): Unit = js.native
  @JSImport("animejs", "remove")
  @js.native
  def remove(targets: AnimeTarget): Unit = js.native
  
  @JSImport("animejs", "running")
  @js.native
  val running: js.Array[AnimeInstance] = js.native
  
  @JSImport("animejs", "set")
  @js.native
  def set(targets: AnimeTarget, value: StringDictionary[js.Any]): Unit = js.native
  
  @JSImport("animejs", "setDashoffset")
  @js.native
  def setDashoffset(): Double = js.native
  @JSImport("animejs", "setDashoffset")
  @js.native
  def setDashoffset(el: HTMLElement): Double = js.native
  @JSImport("animejs", "setDashoffset")
  @js.native
  def setDashoffset(el: SVGElement): Double = js.native
  
  @JSImport("animejs", "speed")
  @js.native
  val speed: Double = js.native
  
  @JSImport("animejs", "stagger")
  @js.native
  def stagger(value: String): FunctionBasedParameter = js.native
  @JSImport("animejs", "stagger")
  @js.native
  def stagger(value: String, options: StaggerOptions): FunctionBasedParameter = js.native
  @JSImport("animejs", "stagger")
  @js.native
  def stagger(value: js.Array[Double | String]): FunctionBasedParameter = js.native
  @JSImport("animejs", "stagger")
  @js.native
  def stagger(value: js.Array[Double | String], options: StaggerOptions): FunctionBasedParameter = js.native
  @JSImport("animejs", "stagger")
  @js.native
  def stagger(value: Double): FunctionBasedParameter = js.native
  @JSImport("animejs", "stagger")
  @js.native
  def stagger(value: Double, options: StaggerOptions): FunctionBasedParameter = js.native
  
  // Timeline
  @JSImport("animejs", "timeline")
  @js.native
  def timeline(): AnimeTimelineInstance = js.native
  @JSImport("animejs", "timeline")
  @js.native
  def timeline(params: js.Array[AnimeInstance]): AnimeTimelineInstance = js.native
  @JSImport("animejs", "timeline")
  @js.native
  def timeline(params: AnimeParams): AnimeTimelineInstance = js.native
  
  // Helpers
  @JSImport("animejs", "version")
  @js.native
  val version: String = js.native
  
  @js.native
  trait AnimeAnimParams
    extends AnimeCallBack
       with /* AnyAnimatedProperty */ StringDictionary[js.Any] {
    
    var delay: js.UndefOr[Double | FunctionBasedParameter] = js.native
    
    var duration: js.UndefOr[Double | FunctionBasedParameter] = js.native
    
    var easing: js.UndefOr[
        EasingOptions | String | CustomEasingFunction | (js.Function1[/* el */ HTMLElement, String])
      ] = js.native
    
    var elasticity: js.UndefOr[Double | FunctionBasedParameter] = js.native
    
    var endDelay: js.UndefOr[Double | FunctionBasedParameter] = js.native
    
    var keyframes: js.UndefOr[js.Array[AnimeAnimParams]] = js.native
    
    var round: js.UndefOr[Double | Boolean | FunctionBasedParameter] = js.native
    
    var targets: js.UndefOr[AnimeTarget | js.Array[AnimeTarget]] = js.native
  }
  object AnimeAnimParams {
    
    @scala.inline
    def apply(): AnimeAnimParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AnimeAnimParams]
    }
    
    @scala.inline
    implicit class AnimeAnimParamsMutableBuilder[Self <: AnimeAnimParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDelay(value: Double | FunctionBasedParameter): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayFunction3(value: (/* element */ HTMLElement, /* index */ Double, /* length */ Double) => Double): Self = StObject.set(x, "delay", js.Any.fromFunction3(value))
      
      @scala.inline
      def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      @scala.inline
      def setDuration(value: Double | FunctionBasedParameter): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurationFunction3(value: (/* element */ HTMLElement, /* index */ Double, /* length */ Double) => Double): Self = StObject.set(x, "duration", js.Any.fromFunction3(value))
      
      @scala.inline
      def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      @scala.inline
      def setEasing(
        value: EasingOptions | String | CustomEasingFunction | (js.Function1[/* el */ HTMLElement, String])
      ): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEasingFunction1(value: /* el */ HTMLElement => String): Self = StObject.set(x, "easing", js.Any.fromFunction1(value))
      
      @scala.inline
      def setEasingFunction3(
        value: (/* el */ HTMLElement, /* index */ Double, /* length */ Double) => js.Function1[/* time */ Double, Double]
      ): Self = StObject.set(x, "easing", js.Any.fromFunction3(value))
      
      @scala.inline
      def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
      
      @scala.inline
      def setElasticity(value: Double | FunctionBasedParameter): Self = StObject.set(x, "elasticity", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setElasticityFunction3(value: (/* element */ HTMLElement, /* index */ Double, /* length */ Double) => Double): Self = StObject.set(x, "elasticity", js.Any.fromFunction3(value))
      
      @scala.inline
      def setElasticityUndefined: Self = StObject.set(x, "elasticity", js.undefined)
      
      @scala.inline
      def setEndDelay(value: Double | FunctionBasedParameter): Self = StObject.set(x, "endDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndDelayFunction3(value: (/* element */ HTMLElement, /* index */ Double, /* length */ Double) => Double): Self = StObject.set(x, "endDelay", js.Any.fromFunction3(value))
      
      @scala.inline
      def setEndDelayUndefined: Self = StObject.set(x, "endDelay", js.undefined)
      
      @scala.inline
      def setKeyframes(value: js.Array[AnimeAnimParams]): Self = StObject.set(x, "keyframes", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyframesUndefined: Self = StObject.set(x, "keyframes", js.undefined)
      
      @scala.inline
      def setKeyframesVarargs(value: AnimeAnimParams*): Self = StObject.set(x, "keyframes", js.Array(value :_*))
      
      @scala.inline
      def setRound(value: Double | Boolean | FunctionBasedParameter): Self = StObject.set(x, "round", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRoundFunction3(value: (/* element */ HTMLElement, /* index */ Double, /* length */ Double) => Double): Self = StObject.set(x, "round", js.Any.fromFunction3(value))
      
      @scala.inline
      def setRoundUndefined: Self = StObject.set(x, "round", js.undefined)
      
      @scala.inline
      def setTargets(value: AnimeTarget | js.Array[AnimeTarget]): Self = StObject.set(x, "targets", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTargetsNull: Self = StObject.set(x, "targets", null)
      
      @scala.inline
      def setTargetsUndefined: Self = StObject.set(x, "targets", js.undefined)
      
      @scala.inline
      def setTargetsVarargs(value: AnimeTarget*): Self = StObject.set(x, "targets", js.Array(value :_*))
    }
  }
  
  @js.native
  trait AnimeCallBack extends StObject {
    
    var begin: js.UndefOr[AnimeCallbackFunction] = js.native
    
    var change: js.UndefOr[AnimeCallbackFunction] = js.native
    
    var changeBegin: js.UndefOr[AnimeCallbackFunction] = js.native
    
    var changeComplete: js.UndefOr[AnimeCallbackFunction] = js.native
    
    var complete: js.UndefOr[AnimeCallbackFunction] = js.native
    
    var loopBegin: js.UndefOr[AnimeCallbackFunction] = js.native
    
    var loopComplete: js.UndefOr[AnimeCallbackFunction] = js.native
    
    var update: js.UndefOr[AnimeCallbackFunction] = js.native
  }
  object AnimeCallBack {
    
    @scala.inline
    def apply(): AnimeCallBack = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AnimeCallBack]
    }
    
    @scala.inline
    implicit class AnimeCallBackMutableBuilder[Self <: AnimeCallBack] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBegin(value: /* anim */ AnimeInstance => Unit): Self = StObject.set(x, "begin", js.Any.fromFunction1(value))
      
      @scala.inline
      def setBeginUndefined: Self = StObject.set(x, "begin", js.undefined)
      
      @scala.inline
      def setChange(value: /* anim */ AnimeInstance => Unit): Self = StObject.set(x, "change", js.Any.fromFunction1(value))
      
      @scala.inline
      def setChangeBegin(value: /* anim */ AnimeInstance => Unit): Self = StObject.set(x, "changeBegin", js.Any.fromFunction1(value))
      
      @scala.inline
      def setChangeBeginUndefined: Self = StObject.set(x, "changeBegin", js.undefined)
      
      @scala.inline
      def setChangeComplete(value: /* anim */ AnimeInstance => Unit): Self = StObject.set(x, "changeComplete", js.Any.fromFunction1(value))
      
      @scala.inline
      def setChangeCompleteUndefined: Self = StObject.set(x, "changeComplete", js.undefined)
      
      @scala.inline
      def setChangeUndefined: Self = StObject.set(x, "change", js.undefined)
      
      @scala.inline
      def setComplete(value: /* anim */ AnimeInstance => Unit): Self = StObject.set(x, "complete", js.Any.fromFunction1(value))
      
      @scala.inline
      def setCompleteUndefined: Self = StObject.set(x, "complete", js.undefined)
      
      @scala.inline
      def setLoopBegin(value: /* anim */ AnimeInstance => Unit): Self = StObject.set(x, "loopBegin", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLoopBeginUndefined: Self = StObject.set(x, "loopBegin", js.undefined)
      
      @scala.inline
      def setLoopComplete(value: /* anim */ AnimeInstance => Unit): Self = StObject.set(x, "loopComplete", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLoopCompleteUndefined: Self = StObject.set(x, "loopComplete", js.undefined)
      
      @scala.inline
      def setUpdate(value: /* anim */ AnimeInstance => Unit): Self = StObject.set(x, "update", js.Any.fromFunction1(value))
      
      @scala.inline
      def setUpdateUndefined: Self = StObject.set(x, "update", js.undefined)
    }
  }
  
  type AnimeCallbackFunction = js.Function1[/* anim */ AnimeInstance, Unit]
  
  @js.native
  trait AnimeInstance extends AnimeCallBack {
    
    var animatables: js.Array[js.Object] = js.native
    
    var animations: js.Array[js.Object] = js.native
    
    var autoplay: Boolean = js.native
    
    var began: Boolean = js.native
    
    var completed: Boolean = js.native
    
    var currentTime: Double = js.native
    
    var delay: Double = js.native
    
    var direction: String = js.native
    
    var duration: Double = js.native
    
    var finished: js.Promise[Unit] = js.native
    
    var loop: Double | Boolean = js.native
    
    def pause(): Unit = js.native
    
    var paused: Boolean = js.native
    
    def play(): Unit = js.native
    
    var progress: Double = js.native
    
    var remaining: Double = js.native
    
    def restart(): Unit = js.native
    
    def reverse(): Unit = js.native
    
    var reversed: Boolean = js.native
    
    def seek(time: Double): Unit = js.native
    
    def tick(time: Double): Unit = js.native
    
    var timelineOffset: Double = js.native
  }
  object AnimeInstance {
    
    @scala.inline
    def apply(
      animatables: js.Array[js.Object],
      animations: js.Array[js.Object],
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
    implicit class AnimeInstanceMutableBuilder[Self <: AnimeInstance] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnimatables(value: js.Array[js.Object]): Self = StObject.set(x, "animatables", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimatablesVarargs(value: js.Object*): Self = StObject.set(x, "animatables", js.Array(value :_*))
      
      @scala.inline
      def setAnimations(value: js.Array[js.Object]): Self = StObject.set(x, "animations", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimationsVarargs(value: js.Object*): Self = StObject.set(x, "animations", js.Array(value :_*))
      
      @scala.inline
      def setAutoplay(value: Boolean): Self = StObject.set(x, "autoplay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBegan(value: Boolean): Self = StObject.set(x, "began", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCompleted(value: Boolean): Self = StObject.set(x, "completed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCurrentTime(value: Double): Self = StObject.set(x, "currentTime", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelay(value: Double): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirection(value: String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFinished(value: js.Promise[Unit]): Self = StObject.set(x, "finished", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoop(value: Double | Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPause(value: () => Unit): Self = StObject.set(x, "pause", js.Any.fromFunction0(value))
      
      @scala.inline
      def setPaused(value: Boolean): Self = StObject.set(x, "paused", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPlay(value: () => Unit): Self = StObject.set(x, "play", js.Any.fromFunction0(value))
      
      @scala.inline
      def setProgress(value: Double): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRemaining(value: Double): Self = StObject.set(x, "remaining", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRestart(value: () => Unit): Self = StObject.set(x, "restart", js.Any.fromFunction0(value))
      
      @scala.inline
      def setReverse(value: () => Unit): Self = StObject.set(x, "reverse", js.Any.fromFunction0(value))
      
      @scala.inline
      def setReversed(value: Boolean): Self = StObject.set(x, "reversed", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSeek(value: Double => Unit): Self = StObject.set(x, "seek", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTick(value: Double => Unit): Self = StObject.set(x, "tick", js.Any.fromFunction1(value))
      
      @scala.inline
      def setTimelineOffset(value: Double): Self = StObject.set(x, "timelineOffset", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait AnimeInstanceParams extends AnimeCallBack {
    
    var autoplay: js.UndefOr[Boolean] = js.native
    
    var direction: js.UndefOr[DirectionOptions | String] = js.native
    
    var loop: js.UndefOr[Double | Boolean] = js.native
  }
  object AnimeInstanceParams {
    
    @scala.inline
    def apply(): AnimeInstanceParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AnimeInstanceParams]
    }
    
    @scala.inline
    implicit class AnimeInstanceParamsMutableBuilder[Self <: AnimeInstanceParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoplay(value: Boolean): Self = StObject.set(x, "autoplay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoplayUndefined: Self = StObject.set(x, "autoplay", js.undefined)
      
      @scala.inline
      def setDirection(value: DirectionOptions | String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      @scala.inline
      def setLoop(value: Double | Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
    }
  }
  
  /* import warning: transforms.RemoveMultipleInheritance#findNewParents newComments Dropped parents 
  - typings.animejs.mod.AnimeCallBack because Already inherited
  - typings.animejs.mod.AnimeInstanceParams because var conflicts: begin, change, changeBegin, changeComplete, complete, loopBegin, loopComplete, update. Inlined loop, autoplay, direction */ @js.native
  trait AnimeParams extends AnimeAnimParams {
    
    var autoplay: js.UndefOr[Boolean] = js.native
    
    var direction: js.UndefOr[DirectionOptions | String] = js.native
    
    var loop: js.UndefOr[Double | Boolean] = js.native
  }
  object AnimeParams {
    
    @scala.inline
    def apply(): AnimeParams = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AnimeParams]
    }
    
    @scala.inline
    implicit class AnimeParamsMutableBuilder[Self <: AnimeParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAutoplay(value: Boolean): Self = StObject.set(x, "autoplay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAutoplayUndefined: Self = StObject.set(x, "autoplay", js.undefined)
      
      @scala.inline
      def setDirection(value: DirectionOptions | String): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      @scala.inline
      def setLoop(value: Double | Boolean): Self = StObject.set(x, "loop", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoopUndefined: Self = StObject.set(x, "loop", js.undefined)
    }
  }
  
  // Allowing null is necessary because DOM queries may not return anything.
  type AnimeTarget = String | js.Object | HTMLElement | SVGElement | NodeList | Null
  
  @js.native
  trait AnimeTimelineAnimParams extends AnimeAnimParams {
    
    var timelineOffset: Double | String | FunctionBasedParameter = js.native
  }
  object AnimeTimelineAnimParams {
    
    @scala.inline
    def apply(timelineOffset: Double | String | FunctionBasedParameter): AnimeTimelineAnimParams = {
      val __obj = js.Dynamic.literal(timelineOffset = timelineOffset.asInstanceOf[js.Any])
      __obj.asInstanceOf[AnimeTimelineAnimParams]
    }
    
    @scala.inline
    implicit class AnimeTimelineAnimParamsMutableBuilder[Self <: AnimeTimelineAnimParams] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setTimelineOffset(value: Double | String | FunctionBasedParameter): Self = StObject.set(x, "timelineOffset", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTimelineOffsetFunction3(value: (/* element */ HTMLElement, /* index */ Double, /* length */ Double) => Double): Self = StObject.set(x, "timelineOffset", js.Any.fromFunction3(value))
    }
  }
  
  @js.native
  trait AnimeTimelineInstance extends AnimeInstance {
    
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
    
    @scala.inline
    def alternate: typings.animejs.animejsStrings.alternate = "alternate".asInstanceOf[typings.animejs.animejsStrings.alternate]
    
    @scala.inline
    def normal: typings.animejs.animejsStrings.normal = "normal".asInstanceOf[typings.animejs.animejsStrings.normal]
    
    @scala.inline
    def reverse: typings.animejs.animejsStrings.reverse = "reverse".asInstanceOf[typings.animejs.animejsStrings.reverse]
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
    
    @scala.inline
    def easeInBack: typings.animejs.animejsStrings.easeInBack = "easeInBack".asInstanceOf[typings.animejs.animejsStrings.easeInBack]
    
    @scala.inline
    def easeInBounce: typings.animejs.animejsStrings.easeInBounce = "easeInBounce".asInstanceOf[typings.animejs.animejsStrings.easeInBounce]
    
    @scala.inline
    def easeInCirc: typings.animejs.animejsStrings.easeInCirc = "easeInCirc".asInstanceOf[typings.animejs.animejsStrings.easeInCirc]
    
    @scala.inline
    def easeInCubic: typings.animejs.animejsStrings.easeInCubic = "easeInCubic".asInstanceOf[typings.animejs.animejsStrings.easeInCubic]
    
    @scala.inline
    def easeInElastic: typings.animejs.animejsStrings.easeInElastic = "easeInElastic".asInstanceOf[typings.animejs.animejsStrings.easeInElastic]
    
    @scala.inline
    def easeInExpo: typings.animejs.animejsStrings.easeInExpo = "easeInExpo".asInstanceOf[typings.animejs.animejsStrings.easeInExpo]
    
    @scala.inline
    def easeInOutBack: typings.animejs.animejsStrings.easeInOutBack = "easeInOutBack".asInstanceOf[typings.animejs.animejsStrings.easeInOutBack]
    
    @scala.inline
    def easeInOutBounce: typings.animejs.animejsStrings.easeInOutBounce = "easeInOutBounce".asInstanceOf[typings.animejs.animejsStrings.easeInOutBounce]
    
    @scala.inline
    def easeInOutCirc: typings.animejs.animejsStrings.easeInOutCirc = "easeInOutCirc".asInstanceOf[typings.animejs.animejsStrings.easeInOutCirc]
    
    @scala.inline
    def easeInOutCubic: typings.animejs.animejsStrings.easeInOutCubic = "easeInOutCubic".asInstanceOf[typings.animejs.animejsStrings.easeInOutCubic]
    
    @scala.inline
    def easeInOutElastic: typings.animejs.animejsStrings.easeInOutElastic = "easeInOutElastic".asInstanceOf[typings.animejs.animejsStrings.easeInOutElastic]
    
    @scala.inline
    def easeInOutExpo: typings.animejs.animejsStrings.easeInOutExpo = "easeInOutExpo".asInstanceOf[typings.animejs.animejsStrings.easeInOutExpo]
    
    @scala.inline
    def easeInOutQuad: typings.animejs.animejsStrings.easeInOutQuad = "easeInOutQuad".asInstanceOf[typings.animejs.animejsStrings.easeInOutQuad]
    
    @scala.inline
    def easeInOutQuart: typings.animejs.animejsStrings.easeInOutQuart = "easeInOutQuart".asInstanceOf[typings.animejs.animejsStrings.easeInOutQuart]
    
    @scala.inline
    def easeInOutQuint: typings.animejs.animejsStrings.easeInOutQuint = "easeInOutQuint".asInstanceOf[typings.animejs.animejsStrings.easeInOutQuint]
    
    @scala.inline
    def easeInOutSine: typings.animejs.animejsStrings.easeInOutSine = "easeInOutSine".asInstanceOf[typings.animejs.animejsStrings.easeInOutSine]
    
    @scala.inline
    def easeInQuad: typings.animejs.animejsStrings.easeInQuad = "easeInQuad".asInstanceOf[typings.animejs.animejsStrings.easeInQuad]
    
    @scala.inline
    def easeInQuart: typings.animejs.animejsStrings.easeInQuart = "easeInQuart".asInstanceOf[typings.animejs.animejsStrings.easeInQuart]
    
    @scala.inline
    def easeInQuint: typings.animejs.animejsStrings.easeInQuint = "easeInQuint".asInstanceOf[typings.animejs.animejsStrings.easeInQuint]
    
    @scala.inline
    def easeInSine: typings.animejs.animejsStrings.easeInSine = "easeInSine".asInstanceOf[typings.animejs.animejsStrings.easeInSine]
    
    @scala.inline
    def easeOutBack: typings.animejs.animejsStrings.easeOutBack = "easeOutBack".asInstanceOf[typings.animejs.animejsStrings.easeOutBack]
    
    @scala.inline
    def easeOutBounce: typings.animejs.animejsStrings.easeOutBounce = "easeOutBounce".asInstanceOf[typings.animejs.animejsStrings.easeOutBounce]
    
    @scala.inline
    def easeOutCirc: typings.animejs.animejsStrings.easeOutCirc = "easeOutCirc".asInstanceOf[typings.animejs.animejsStrings.easeOutCirc]
    
    @scala.inline
    def easeOutCubic: typings.animejs.animejsStrings.easeOutCubic = "easeOutCubic".asInstanceOf[typings.animejs.animejsStrings.easeOutCubic]
    
    @scala.inline
    def easeOutElastic: typings.animejs.animejsStrings.easeOutElastic = "easeOutElastic".asInstanceOf[typings.animejs.animejsStrings.easeOutElastic]
    
    @scala.inline
    def easeOutExpo: typings.animejs.animejsStrings.easeOutExpo = "easeOutExpo".asInstanceOf[typings.animejs.animejsStrings.easeOutExpo]
    
    @scala.inline
    def easeOutQuad: typings.animejs.animejsStrings.easeOutQuad = "easeOutQuad".asInstanceOf[typings.animejs.animejsStrings.easeOutQuad]
    
    @scala.inline
    def easeOutQuart: typings.animejs.animejsStrings.easeOutQuart = "easeOutQuart".asInstanceOf[typings.animejs.animejsStrings.easeOutQuart]
    
    @scala.inline
    def easeOutQuint: typings.animejs.animejsStrings.easeOutQuint = "easeOutQuint".asInstanceOf[typings.animejs.animejsStrings.easeOutQuint]
    
    @scala.inline
    def easeOutSine: typings.animejs.animejsStrings.easeOutSine = "easeOutSine".asInstanceOf[typings.animejs.animejsStrings.easeOutSine]
    
    @scala.inline
    def linear: typings.animejs.animejsStrings.linear = "linear".asInstanceOf[typings.animejs.animejsStrings.linear]
  }
  
  type FunctionBasedParameter = js.Function3[/* element */ HTMLElement, /* index */ Double, /* length */ Double, Double]
  
  @js.native
  trait StaggerOptions extends StObject {
    
    var axis: js.UndefOr[x | y] = js.native
    
    var direction: js.UndefOr[normal | reverse] = js.native
    
    var easing: js.UndefOr[CustomEasingFunction | String | EasingOptions] = js.native
    
    var from: js.UndefOr[first | last | center | Double] = js.native
    
    var grid: js.UndefOr[js.Array[Double]] = js.native
    
    var start: js.UndefOr[Double | String] = js.native
  }
  object StaggerOptions {
    
    @scala.inline
    def apply(): StaggerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StaggerOptions]
    }
    
    @scala.inline
    implicit class StaggerOptionsMutableBuilder[Self <: StaggerOptions] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAxis(value: typings.animejs.animejsStrings.x | y): Self = StObject.set(x, "axis", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAxisUndefined: Self = StObject.set(x, "axis", js.undefined)
      
      @scala.inline
      def setDirection(value: normal | reverse): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDirectionUndefined: Self = StObject.set(x, "direction", js.undefined)
      
      @scala.inline
      def setEasing(value: CustomEasingFunction | String | EasingOptions): Self = StObject.set(x, "easing", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEasingFunction3(
        value: (/* el */ HTMLElement, /* index */ Double, /* length */ Double) => js.Function1[/* time */ Double, Double]
      ): Self = StObject.set(x, "easing", js.Any.fromFunction3(value))
      
      @scala.inline
      def setEasingUndefined: Self = StObject.set(x, "easing", js.undefined)
      
      @scala.inline
      def setFrom(value: first | last | center | Double): Self = StObject.set(x, "from", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFromUndefined: Self = StObject.set(x, "from", js.undefined)
      
      @scala.inline
      def setGrid(value: js.Array[Double]): Self = StObject.set(x, "grid", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGridUndefined: Self = StObject.set(x, "grid", js.undefined)
      
      @scala.inline
      def setGridVarargs(value: Double*): Self = StObject.set(x, "grid", js.Array(value :_*))
      
      @scala.inline
      def setStart(value: Double | String): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    }
  }
}
