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

