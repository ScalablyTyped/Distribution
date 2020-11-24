package typings.animejs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

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
  implicit class AnimeInstanceOps[Self <: AnimeInstance] (val x: Self) extends AnyVal {
    
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
    def setAnimatablesVarargs(value: js.Object*): Self = this.set("animatables", js.Array(value :_*))
    
    @scala.inline
    def setAnimatables(value: js.Array[js.Object]): Self = this.set("animatables", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnimationsVarargs(value: js.Object*): Self = this.set("animations", js.Array(value :_*))
    
    @scala.inline
    def setAnimations(value: js.Array[js.Object]): Self = this.set("animations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoplay(value: Boolean): Self = this.set("autoplay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBegan(value: Boolean): Self = this.set("began", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompleted(value: Boolean): Self = this.set("completed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCurrentTime(value: Double): Self = this.set("currentTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelay(value: Double): Self = this.set("delay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirection(value: String): Self = this.set("direction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDuration(value: Double): Self = this.set("duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFinished(value: js.Promise[Unit]): Self = this.set("finished", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoop(value: Double | Boolean): Self = this.set("loop", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPause(value: () => Unit): Self = this.set("pause", js.Any.fromFunction0(value))
    
    @scala.inline
    def setPaused(value: Boolean): Self = this.set("paused", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlay(value: () => Unit): Self = this.set("play", js.Any.fromFunction0(value))
    
    @scala.inline
    def setProgress(value: Double): Self = this.set("progress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemaining(value: Double): Self = this.set("remaining", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRestart(value: () => Unit): Self = this.set("restart", js.Any.fromFunction0(value))
    
    @scala.inline
    def setReverse(value: () => Unit): Self = this.set("reverse", js.Any.fromFunction0(value))
    
    @scala.inline
    def setReversed(value: Boolean): Self = this.set("reversed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeek(value: Double => Unit): Self = this.set("seek", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTick(value: Double => Unit): Self = this.set("tick", js.Any.fromFunction1(value))
    
    @scala.inline
    def setTimelineOffset(value: Double): Self = this.set("timelineOffset", value.asInstanceOf[js.Any])
  }
}
