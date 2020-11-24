package typings.async.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("async", "parallel")
@js.native
object parallel extends js.Object {
  
  def apply[T, E](tasks: js.Array[AsyncFunction[T, E]]): Unit = js.native
  def apply[T, E](tasks: js.Array[AsyncFunction[T, E]], callback: AsyncResultArrayCallback[T, E]): Unit = js.native
  def apply[T, E](tasks: Dictionary[AsyncFunction[T, E]]): Unit = js.native
  def apply[T, E](tasks: Dictionary[AsyncFunction[T, E]], callback: AsyncResultObjectCallback[T, E]): Unit = js.native
}
