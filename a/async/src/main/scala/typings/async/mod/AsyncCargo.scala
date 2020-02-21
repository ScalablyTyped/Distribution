package typings.async.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AsyncCargo extends js.Object {
  var payload: js.UndefOr[Double] = js.native
  /**
    * a function that sets a callback that is called when the last item from the queue has returned from the worker.
    * If the callback is omitted, q.drain() returns a promise for the next occurrence.
    */
  def drain(): js.Promise[Unit] = js.native
  def drain(handler: js.Function0[Unit]): Unit = js.native
  def empty(): Unit = js.native
  def idle(): Boolean = js.native
  def kill(): Unit = js.native
  def length(): Double = js.native
  def pause(): Unit = js.native
  def push(task: js.Any): Unit = js.native
  def push(task: js.Any, callback: js.Function): Unit = js.native
  def resume(): Unit = js.native
  def saturated(): Unit = js.native
}

