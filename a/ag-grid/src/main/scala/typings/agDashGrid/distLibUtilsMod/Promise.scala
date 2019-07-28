package typings.agDashGrid.distLibUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("ag-grid/dist/lib/utils", "Promise")
@js.native
class Promise[T] protected () extends js.Object {
  def this(callback: ResolveAndRejectCallback[T]) = this()
  var listOfWaiters: js.Any = js.native
  var resolution: js.Any = js.native
  var status: js.Any = js.native
  def firstOneOnly(func: js.Function1[/* result */ js.Any, Unit]): Unit = js.native
  def map[Z](adapter: js.Function1[/* from */ T, Z]): Promise[Z] = js.native
  /* private */ def onDone(value: js.Any): js.Any = js.native
  /* private */ def onReject(params: js.Any): js.Any = js.native
  def resolveNow[Z](ifNotResolvedValue: Z, ifResolved: js.Function1[/* current */ T, Z]): Z = js.native
  def `then`(func: js.Function1[/* result */ js.Any, Unit]): Unit = js.native
}

/* static members */
@JSImport("ag-grid/dist/lib/utils", "Promise")
@js.native
object Promise extends js.Object {
  def all[T](toCombine: js.Array[Promise[T]]): Promise[js.Array[T]] = js.native
  def external[T](): ExternalPromise[T] = js.native
  def resolve[T](value: T): Promise[T] = js.native
}

