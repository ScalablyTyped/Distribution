package typings.angularCompiler.srcUtilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/util", "SyncAsync")
@js.native
object SyncAsync extends js.Object {
  def all[T](syncAsyncValues: js.Array[SyncAsync[T]]): SyncAsync[js.Array[T]] = js.native
  def assertSync[T](value: SyncAsync[T]): T = js.native
  def `then`[T, R](value: SyncAsync[T], cb: js.Function1[/* value */ T, SyncAsync[R]]): SyncAsync[R] = js.native
}

