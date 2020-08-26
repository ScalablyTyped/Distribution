package typings.angularCompiler.srcUtilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/util", "SyncAsync")
@js.native
object SyncAsync extends js.Object {
  def all[T_2](syncAsyncValues: js.Array[SyncAsync[T_2]]): SyncAsync[js.Array[T_2]] = js.native
  def assertSync[T](value: SyncAsync[T]): T = js.native
  def `then`[T_1, R](value: SyncAsync[T_1], cb: js.Function1[/* value */ T_1, SyncAsync[R]]): SyncAsync[R] = js.native
}

