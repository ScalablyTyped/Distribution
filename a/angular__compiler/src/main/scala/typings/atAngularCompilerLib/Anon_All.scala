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
    all: js.Function1[
      js.Array[atAngularCompilerLib.srcUtilMod.SyncAsync[js.Any]], 
      atAngularCompilerLib.srcUtilMod.SyncAsync[js.Array[js.Any]]
    ],
    assertSync: js.Function1[atAngularCompilerLib.srcUtilMod.SyncAsync[js.Any], js.Any],
    `then`: js.Function2[
      atAngularCompilerLib.srcUtilMod.SyncAsync[js.Any], 
      js.Function1[js.Any, atAngularCompilerLib.srcUtilMod.SyncAsync[js.Any]], 
      atAngularCompilerLib.srcUtilMod.SyncAsync[js.Any]
    ]
  ): Anon_All = {
    val __obj = js.Dynamic.literal(`then` = `then`)
    __obj.updateDynamic("all")(all)
    __obj.updateDynamic("assertSync")(assertSync)
    __obj.asInstanceOf[Anon_All]
  }
}

