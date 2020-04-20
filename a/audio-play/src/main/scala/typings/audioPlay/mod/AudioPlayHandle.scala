package typings.audioPlay.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AudioPlayHandle extends js.Object {
  def pause(): js.Any
  def play(): js.Any
}

object AudioPlayHandle {
  @scala.inline
  def apply(pause: () => js.Any, play: () => js.Any): AudioPlayHandle = {
    val __obj = js.Dynamic.literal(pause = js.Any.fromFunction0(pause), play = js.Any.fromFunction0(play))
    __obj.asInstanceOf[AudioPlayHandle]
  }
}

