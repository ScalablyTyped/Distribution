package typings.async.asyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("async", "queue")
@js.native
object queue extends js.Object {
  def apply[T, E](worker: AsyncWorker[T, E]): AsyncQueue[T] = js.native
  def apply[T, E](worker: AsyncWorker[T, E], concurrency: Double): AsyncQueue[T] = js.native
}

