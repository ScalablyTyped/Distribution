package typings.async.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("async", "eachSeries")
@js.native
object eachSeries extends js.Object {
  
  def apply[T, E](arr: IterableCollection[T], iterator: AsyncIterator[T, E]): js.Promise[Unit] = js.native
  def apply[T, E](arr: IterableCollection[T], iterator: AsyncIterator[T, E], callback: ErrorCallback[E]): Unit = js.native
}
