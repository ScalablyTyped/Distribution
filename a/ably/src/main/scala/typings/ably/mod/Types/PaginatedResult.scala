package typings.ably.mod.Types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PaginatedResult[T] extends js.Object {
  
  def current(): js.Promise[PaginatedResult[T]] = js.native
  def current(results: paginatedResultCallback[T]): Unit = js.native
  
  def first(): js.Promise[PaginatedResult[T]] = js.native
  def first(results: paginatedResultCallback[T]): Unit = js.native
  
  def hasNext(): Boolean = js.native
  
  def isLast(): Boolean = js.native
  
  var items: js.Array[T] = js.native
  
  def next(): js.Promise[PaginatedResult[T]] = js.native
  def next(results: paginatedResultCallback[T]): Unit = js.native
}
