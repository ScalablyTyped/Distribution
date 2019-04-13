package typings
package atAngularCompilerLib.srcUtilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@angular/compiler/src/util", "SyncAsync")
@js.native
object SyncAsync extends js.Object {
  def all[T](syncAsyncValues: js.Array[atAngularCompilerLib.srcUtilMod.SyncAsync[T]]): atAngularCompilerLib.srcUtilMod.SyncAsync[js.Array[T]] = js.native
  def assertSync[T](value: atAngularCompilerLib.srcUtilMod.SyncAsync[T]): T = js.native
  def `then`[T, R](
    value: atAngularCompilerLib.srcUtilMod.SyncAsync[T],
    cb: js.Function1[/* value */ T, atAngularCompilerLib.srcUtilMod.SyncAsync[R]]
  ): atAngularCompilerLib.srcUtilMod.SyncAsync[R] = js.native
}

