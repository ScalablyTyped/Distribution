package typings.animejs.mod

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
    begin: /* anim */ AnimeInstance => Unit = null,
    change: /* anim */ AnimeInstance => Unit = null,
    changeBegin: /* anim */ AnimeInstance => Unit = null,
    changeComplete: /* anim */ AnimeInstance => Unit = null,
    complete: /* anim */ AnimeInstance => Unit = null,
    loopBegin: /* anim */ AnimeInstance => Unit = null,
    loopComplete: /* anim */ AnimeInstance => Unit = null,
    update: /* anim */ AnimeInstance => Unit = null
  ): AnimeInstance = {
    val __obj = js.Dynamic.literal(animatables = animatables.asInstanceOf[js.Any], animations = animations.asInstanceOf[js.Any], autoplay = autoplay.asInstanceOf[js.Any], began = began.asInstanceOf[js.Any], completed = completed.asInstanceOf[js.Any], currentTime = currentTime.asInstanceOf[js.Any], delay = delay.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], finished = finished.asInstanceOf[js.Any], loop = loop.asInstanceOf[js.Any], pause = js.Any.fromFunction0(pause), paused = paused.asInstanceOf[js.Any], play = js.Any.fromFunction0(play), progress = progress.asInstanceOf[js.Any], remaining = remaining.asInstanceOf[js.Any], restart = js.Any.fromFunction0(restart), reverse = js.Any.fromFunction0(reverse), reversed = reversed.asInstanceOf[js.Any], seek = js.Any.fromFunction1(seek), timelineOffset = timelineOffset.asInstanceOf[js.Any])
    if (begin != null) __obj.updateDynamic("begin")(js.Any.fromFunction1(begin))
    if (change != null) __obj.updateDynamic("change")(js.Any.fromFunction1(change))
    if (changeBegin != null) __obj.updateDynamic("changeBegin")(js.Any.fromFunction1(changeBegin))
    if (changeComplete != null) __obj.updateDynamic("changeComplete")(js.Any.fromFunction1(changeComplete))
    if (complete != null) __obj.updateDynamic("complete")(js.Any.fromFunction1(complete))
    if (loopBegin != null) __obj.updateDynamic("loopBegin")(js.Any.fromFunction1(loopBegin))
    if (loopComplete != null) __obj.updateDynamic("loopComplete")(js.Any.fromFunction1(loopComplete))
    if (update != null) __obj.updateDynamic("update")(js.Any.fromFunction1(update))
    __obj.asInstanceOf[AnimeInstance]
  }
}

