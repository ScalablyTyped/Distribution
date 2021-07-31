package typings.agGrid.mod

import typings.agGrid.utilsMod.ExternalPromise
import typings.agGrid.utilsMod.ResolveAndRejectCallback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("ag-grid", "Promise")
@js.native
class Promise[T] protected ()
  extends typings.agGrid.utilsMod.Promise[T] {
  def this(callback: ResolveAndRejectCallback[T]) = this()
}
/* static members */
object Promise {
  
  @JSImport("ag-grid", "Promise")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def all[T](toCombine: js.Array[typings.agGrid.utilsMod.Promise[T]]): typings.agGrid.utilsMod.Promise[js.Array[T]] = ^.asInstanceOf[js.Dynamic].applyDynamic("all")(toCombine.asInstanceOf[js.Any]).asInstanceOf[typings.agGrid.utilsMod.Promise[js.Array[T]]]
  
  @scala.inline
  def external[T](): ExternalPromise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("external")().asInstanceOf[ExternalPromise[T]]
  
  @scala.inline
  def resolve[T](value: T): typings.agGrid.utilsMod.Promise[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("resolve")(value.asInstanceOf[js.Any]).asInstanceOf[typings.agGrid.utilsMod.Promise[T]]
}
