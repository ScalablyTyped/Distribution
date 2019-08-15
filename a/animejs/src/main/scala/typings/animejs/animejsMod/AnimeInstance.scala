package typings.animejs.animejsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnimeInstance extends AnimeCallBack {
  var animatables: js.Array[js.Object]
  var animations: js.Array[js.Object]
  var autoplay: Boolean
  var began: Boolean
  var completed: Boolean
  var currentTime: Double
  var delay: Double
  var direction: String
  var duration: Double
  var finished: js.Promise[Unit]
  var loop: Double | Boolean
  var paused: Boolean
  var progress: Double
  var remaining: Double
  var reversed: Boolean
  var timelineOffset: Double
  def pause(): Unit
  def play(): Unit
  def restart(): Unit
  def reverse(): Unit
  def seek(time: Double): Unit
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
    timelineOffset: Double,
    begin: AnimeCallbackFunction = null,
    change: AnimeCallbackFunction = null,
    changeBegin: AnimeCallbackFunction = null,
    changeComplete: AnimeCallbackFunction = null,
    complete: AnimeCallbackFunction = null,
    loopBegin: AnimeCallbackFunction = null,
    loopComplete: AnimeCallbackFunction = null,
    update: AnimeCallbackFunction = null
  ): AnimeInstance = {
    val __obj = js.Dynamic.literal(animatables = animatables, animations = animations, autoplay = autoplay, began = began, completed = completed, currentTime = currentTime, delay = delay, direction = direction, duration = duration, finished = finished, loop = loop.asInstanceOf[js.Any], pause = js.Any.fromFunction0(pause), paused = paused, play = js.Any.fromFunction0(play), progress = progress, remaining = remaining, restart = js.Any.fromFunction0(restart), reverse = js.Any.fromFunction0(reverse), reversed = reversed, seek = js.Any.fromFunction1(seek), timelineOffset = timelineOffset)
    if (begin != null) __obj.updateDynamic("begin")(begin)
    if (change != null) __obj.updateDynamic("change")(change)
    if (changeBegin != null) __obj.updateDynamic("changeBegin")(changeBegin)
    if (changeComplete != null) __obj.updateDynamic("changeComplete")(changeComplete)
    if (complete != null) __obj.updateDynamic("complete")(complete)
    if (loopBegin != null) __obj.updateDynamic("loopBegin")(loopBegin)
    if (loopComplete != null) __obj.updateDynamic("loopComplete")(loopComplete)
    if (update != null) __obj.updateDynamic("update")(update)
    __obj.asInstanceOf[AnimeInstance]
  }
}

