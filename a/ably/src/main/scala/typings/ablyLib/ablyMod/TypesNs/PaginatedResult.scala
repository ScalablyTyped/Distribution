package typings
package ablyLib.ablyMod.TypesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaginatedResult[T] extends js.Object {
  var items: js.Array[T]
  def current(results: paginatedResultCallback[T]): scala.Unit
  def first(results: paginatedResultCallback[T]): scala.Unit
  def hasNext(): scala.Boolean
  def isLast(): scala.Boolean
  def next(results: paginatedResultCallback[T]): scala.Unit
}

object PaginatedResult {
  @scala.inline
  def apply[T](
    current: paginatedResultCallback[T] => scala.Unit,
    first: paginatedResultCallback[T] => scala.Unit,
    hasNext: () => scala.Boolean,
    isLast: () => scala.Boolean,
    items: js.Array[T],
    next: paginatedResultCallback[T] => scala.Unit
  ): PaginatedResult[T] = {
    val __obj = js.Dynamic.literal(current = js.Any.fromFunction1(current), first = js.Any.fromFunction1(first), hasNext = js.Any.fromFunction0(hasNext), isLast = js.Any.fromFunction0(isLast), items = items, next = js.Any.fromFunction1(next))
  
    __obj.asInstanceOf[PaginatedResult[T]]
  }
}

