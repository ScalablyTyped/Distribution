package typings.async.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("async", "forEachOf")
@js.native
object forEachOf extends js.Object {
  
  def apply[T, E](obj: IterableCollection[T], iterator: AsyncForEachOfIterator[T, E]): js.Promise[Unit] = js.native
  def apply[T, E](obj: IterableCollection[T], iterator: AsyncForEachOfIterator[T, E], callback: ErrorCallback[E]): Unit = js.native
}
