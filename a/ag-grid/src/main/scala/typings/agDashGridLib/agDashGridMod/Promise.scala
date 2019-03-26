package typings
package agDashGridLib.agDashGridMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid", "Promise")
@js.native
class Promise[T] protected ()
  extends agDashGridLib.distLibUtilsMod.Promise[T] {
  def this(callback: agDashGridLib.distLibUtilsMod.ResolveAndRejectCallback[T]) = this()
}

/* static members */
@JSImport("ag-grid", "Promise")
@js.native
object Promise extends js.Object {
  def all[T](toCombine: js.Array[agDashGridLib.distLibUtilsMod.Promise[T]]): agDashGridLib.distLibUtilsMod.Promise[js.Array[T]] = js.native
  def external[T](): agDashGridLib.distLibUtilsMod.ExternalPromise[T] = js.native
  def resolve[T](value: T): agDashGridLib.distLibUtilsMod.Promise[T] = js.native
}

