package typings.async.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("async", "parallelLimit")
@js.native
object parallelLimit extends js.Object {
  
  def apply[T, E](tasks: js.Array[AsyncFunction[T, E]], limit: Double): Unit = js.native
  def apply[T, E](tasks: js.Array[AsyncFunction[T, E]], limit: Double, callback: AsyncResultArrayCallback[T, E]): Unit = js.native
  def apply[T, E](tasks: Dictionary[AsyncFunction[T, E]], limit: Double): Unit = js.native
  def apply[T, E](tasks: Dictionary[AsyncFunction[T, E]], limit: Double, callback: AsyncResultObjectCallback[T, E]): Unit = js.native
}
