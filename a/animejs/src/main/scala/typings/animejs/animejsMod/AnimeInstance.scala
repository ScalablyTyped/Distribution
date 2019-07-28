package typings.animejs.animejsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnimeInstance extends js.Object {
  var animatables: js.Array[js.Object] = js.native
  var animations: js.Array[js.Object] = js.native
  var autoplay: Boolean = js.native
  var began: Boolean = js.native
  @JSName("begin")
  var begin_Original: AnimeCallbackFunction = js.native
  @JSName("complete")
  var complete_Original: AnimeCallbackFunction = js.native
  var completed: Boolean = js.native
  var currentTime: Double = js.native
  var delay: Double = js.native
  var direction: String = js.native
  var duration: Double = js.native
  var finished: js.Promise[Unit] = js.native
  var loop: Double | Boolean = js.native
  var offset: Double = js.native
  var paused: Boolean = js.native
  var progress: Double = js.native
  var remaining: Double = js.native
  var reversed: Boolean = js.native
  @JSName("run")
  var run_Original: AnimeCallbackFunction = js.native
  @JSName("update")
  var update_Original: AnimeCallbackFunction = js.native
  def begin(anim: AnimeInstance): Unit = js.native
  def complete(anim: AnimeInstance): Unit = js.native
  def pause(): Unit = js.native
  def play(): Unit = js.native
  def restart(): Unit = js.native
  def reverse(): Unit = js.native
  def run(anim: AnimeInstance): Unit = js.native
  def seek(time: Double): Unit = js.native
  def update(anim: AnimeInstance): Unit = js.native
}

