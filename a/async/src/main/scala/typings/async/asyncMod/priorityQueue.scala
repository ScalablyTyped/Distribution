package typings.async.asyncMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("async", "priorityQueue")
@js.native
object priorityQueue extends js.Object {
  def apply[T, E](worker: AsyncWorker[T, E], concurrency: Double): AsyncPriorityQueue[T] = js.native
}

