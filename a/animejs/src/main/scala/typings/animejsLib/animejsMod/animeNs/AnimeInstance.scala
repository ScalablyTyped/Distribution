package typings
package animejsLib.animejsMod.animeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AnimeInstance extends js.Object {
  var animatables: js.Array[js.Object] = js.native
  var animations: js.Array[js.Object] = js.native
  var autoplay: scala.Boolean = js.native
  var began: scala.Boolean = js.native
  @JSName("begin")
  var begin_Original: animejsLib.AnimeCallbackFunction = js.native
  @JSName("complete")
  var complete_Original: animejsLib.AnimeCallbackFunction = js.native
  var completed: scala.Boolean = js.native
  var currentTime: scala.Double = js.native
  var delay: scala.Double = js.native
  var direction: java.lang.String = js.native
  var duration: scala.Double = js.native
  var finished: js.Promise[scala.Unit] = js.native
  var loop: scala.Double | scala.Boolean = js.native
  var offset: scala.Double = js.native
  var paused: scala.Boolean = js.native
  var progress: scala.Double = js.native
  var remaining: scala.Double = js.native
  var reversed: scala.Boolean = js.native
  @JSName("run")
  var run_Original: animejsLib.AnimeCallbackFunction = js.native
  @JSName("update")
  var update_Original: animejsLib.AnimeCallbackFunction = js.native
  def begin(anim: AnimeInstance): scala.Unit = js.native
  def complete(anim: AnimeInstance): scala.Unit = js.native
  def pause(): scala.Unit = js.native
  def play(): scala.Unit = js.native
  def restart(): scala.Unit = js.native
  def reverse(): scala.Unit = js.native
  def run(anim: AnimeInstance): scala.Unit = js.native
  def seek(time: scala.Double): scala.Unit = js.native
  def update(anim: AnimeInstance): scala.Unit = js.native
}

