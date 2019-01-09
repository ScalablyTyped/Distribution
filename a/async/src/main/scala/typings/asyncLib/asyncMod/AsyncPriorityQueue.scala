package typings
package asyncLib.asyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AsyncPriorityQueue[T] extends js.Object {
  var buffer: scala.Double = js.native
  var concurrency: scala.Double = js.native
  var paused: scala.Boolean = js.native
  var started: scala.Boolean = js.native
  def drain(): js.Any = js.native
  def empty(): js.Any = js.native
  def error(error: stdLib.Error, data: js.Any): scala.Unit = js.native
  def idle(): scala.Boolean = js.native
  def kill(): scala.Unit = js.native
  def length(): scala.Double = js.native
  def pause(): scala.Unit = js.native
  def push[R, E](task: T, priority: scala.Double): scala.Unit = js.native
  def push[R, E](task: T, priority: scala.Double, callback: AsyncResultArrayCallback[R, E]): scala.Unit = js.native
  def push[R, E](task: js.Array[T], priority: scala.Double): scala.Unit = js.native
  def push[R, E](task: js.Array[T], priority: scala.Double, callback: AsyncResultArrayCallback[R, E]): scala.Unit = js.native
  def resume(): scala.Unit = js.native
  def running(): scala.Double = js.native
  def saturated(): js.Any = js.native
  def unsaturated(): scala.Unit = js.native
  def workersList(): js.Array[asyncLib.Anon_CallbackData[T]] = js.native
}

