package typings.agDashGrid.agDashGridMod

import typings.agDashGrid.distLibUtilsMod.ExternalPromise
import typings.agDashGrid.distLibUtilsMod.ResolveAndRejectCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid", "Promise")
@js.native
class Promise[T] protected ()
  extends typings.agDashGrid.distLibUtilsMod.Promise[T] {
  def this(callback: ResolveAndRejectCallback[T]) = this()
}

/* static members */
@JSImport("ag-grid", "Promise")
@js.native
object Promise extends js.Object {
  def all[T](toCombine: js.Array[typings.agDashGrid.distLibUtilsMod.Promise[T]]): typings.agDashGrid.distLibUtilsMod.Promise[js.Array[T]] = js.native
  def external[T](): ExternalPromise[T] = js.native
  def resolve[T](value: T): typings.agDashGrid.distLibUtilsMod.Promise[T] = js.native
}

