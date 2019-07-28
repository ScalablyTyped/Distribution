package typings.async.asyncMod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AsyncQueue[T] extends js.Object {
  var buffer: Double = js.native
  var concurrency: Double = js.native
  var paused: Boolean = js.native
  var started: Boolean = js.native
  def drain(): js.Promise[Unit] = js.native
  def drain(handler: js.Function0[Unit]): Unit = js.native
  def empty(): js.Promise[Unit] = js.native
  def empty(handler: js.Function0[Unit]): Unit = js.native
  def error(): js.Promise[Unit] = js.native
  def error(handler: js.Function2[/* error */ Error, /* task */ T, Unit]): Unit = js.native
  def idle(): Boolean = js.native
  def kill(): Unit = js.native
  def length(): Double = js.native
  def pause(): Unit = js.native
  def push[R, E](task: T): Unit = js.native
  def push[R, E](task: T, callback: AsyncResultCallback[R, E]): Unit = js.native
  def push[R, E](task: js.Array[T]): Unit = js.native
  def push[R, E](task: js.Array[T], callback: AsyncResultCallback[R, E]): Unit = js.native
  def remove(filter: js.Function1[/* node */ DataContainer[T], Boolean]): Unit = js.native
  def resume(): Unit = js.native
  def running(): Double = js.native
  def saturated(): js.Promise[Unit] = js.native
  def saturated(handler: js.Function0[Unit]): Unit = js.native
  def unsaturated(): Unit = js.native
  def unshift[E](task: T): Unit = js.native
  def unshift[E](task: T, callback: ErrorCallback[E]): Unit = js.native
  def unshift[E](task: js.Array[T]): Unit = js.native
  def unshift[E](task: js.Array[T], callback: ErrorCallback[E]): Unit = js.native
  def workersList[TWorker /* <: DataContainer[T] */, CallbackContainer](): js.Array[TWorker] = js.native
}

