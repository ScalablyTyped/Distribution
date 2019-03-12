package typings
package atAngularCompilerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_All extends js.Object {
  def all[T](syncAsyncValues: js.Array[atAngularCompilerLib.srcUtilMod.SyncAsync[T]]): atAngularCompilerLib.srcUtilMod.SyncAsync[js.Array[T]]
  def assertSync[T](value: atAngularCompilerLib.srcUtilMod.SyncAsync[T]): T
  def `then`[T, R](
    value: atAngularCompilerLib.srcUtilMod.SyncAsync[T],
    cb: js.Function1[/* value */ T, atAngularCompilerLib.srcUtilMod.SyncAsync[R]]
  ): atAngularCompilerLib.srcUtilMod.SyncAsync[R]
}

object Anon_All {
  @scala.inline
  def apply(
    all: js.Array[atAngularCompilerLib.srcUtilMod.SyncAsync[js.Any]] => atAngularCompilerLib.srcUtilMod.SyncAsync[js.Array[js.Any]],
    assertSync: atAngularCompilerLib.srcUtilMod.SyncAsync[js.Any] => js.Any,
    `then`: (atAngularCompilerLib.srcUtilMod.SyncAsync[js.Any], js.Function1[js.Any, atAngularCompilerLib.srcUtilMod.SyncAsync[js.Any]]) => atAngularCompilerLib.srcUtilMod.SyncAsync[js.Any]
  ): Anon_All = {
    val __obj = js.Dynamic.literal(all = js.Any.fromFunction1(all), assertSync = js.Any.fromFunction1(assertSync))
    __obj.updateDynamic("then")(js.Any.fromFunction2(`then`))
    __obj.asInstanceOf[Anon_All]
  }
}

