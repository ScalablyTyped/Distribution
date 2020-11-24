package typings.async.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("async", "priorityQueue")
@js.native
object priorityQueue extends js.Object {
  
  def apply[T, E](worker: AsyncWorker[T, E], concurrency: Double): AsyncPriorityQueue[T] = js.native
}
