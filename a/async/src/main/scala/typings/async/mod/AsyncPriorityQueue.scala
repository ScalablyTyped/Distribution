package typings.async.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AsyncPriorityQueue[T] extends js.Object {
  
  var buffer: Double = js.native
  
  var concurrency: Double = js.native
  
  def drain(): js.Any = js.native
  
  def empty(): js.Any = js.native
  
  def error(error: Error, data: js.Any): Unit = js.native
  
  def idle(): Boolean = js.native
  
  def kill(): Unit = js.native
  
  def length(): Double = js.native
  
  def pause(): Unit = js.native
  
  var paused: Boolean = js.native
  
  def push[R, E](task: T, priority: Double): Unit = js.native
  def push[R, E](task: T, priority: Double, callback: AsyncResultArrayCallback[R, E]): Unit = js.native
  def push[R, E](task: js.Array[T], priority: Double): Unit = js.native
  def push[R, E](task: js.Array[T], priority: Double, callback: AsyncResultArrayCallback[R, E]): Unit = js.native
  
  def resume(): Unit = js.native
  
  def running(): Double = js.native
  
  def saturated(): js.Any = js.native
  
  var started: Boolean = js.native
  
  def unsaturated(): Unit = js.native
  
  def workersList[TWorker /* <: DataContainer[T] */, CallbackContainer, PriorityContainer](): js.Array[TWorker] = js.native
}
