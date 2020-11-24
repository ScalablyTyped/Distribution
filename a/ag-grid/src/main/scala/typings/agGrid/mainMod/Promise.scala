package typings.agGrid.mainMod

import typings.agGrid.utilsMod.ExternalPromise
import typings.agGrid.utilsMod.ResolveAndRejectCallback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ag-grid/dist/lib/main", "Promise")
@js.native
class Promise[T] protected ()
  extends typings.agGrid.utilsMod.Promise[T] {
  def this(callback: ResolveAndRejectCallback[T]) = this()
}
/* static members */
@JSImport("ag-grid/dist/lib/main", "Promise")
@js.native
object Promise extends js.Object {
  
  def all[T](toCombine: js.Array[typings.agGrid.utilsMod.Promise[T]]): typings.agGrid.utilsMod.Promise[js.Array[T]] = js.native
  
  def external[T](): ExternalPromise[T] = js.native
  
  def resolve[T](value: T): typings.agGrid.utilsMod.Promise[T] = js.native
}
