package typings.ably.mod.Types

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaginatedResult[T] extends js.Object {
  var items: js.Array[T]
  def current(results: paginatedResultCallback[T]): Unit
  def first(results: paginatedResultCallback[T]): Unit
  def hasNext(): Boolean
  def isLast(): Boolean
  def next(results: paginatedResultCallback[T]): Unit
}

object PaginatedResult {
  @scala.inline
  def apply[T](
    current: paginatedResultCallback[T] => Unit,
    first: paginatedResultCallback[T] => Unit,
    hasNext: () => Boolean,
    isLast: () => Boolean,
    items: js.Array[T],
    next: paginatedResultCallback[T] => Unit
  ): PaginatedResult[T] = {
    val __obj = js.Dynamic.literal(current = js.Any.fromFunction1(current), first = js.Any.fromFunction1(first), hasNext = js.Any.fromFunction0(hasNext), isLast = js.Any.fromFunction0(isLast), items = items.asInstanceOf[js.Any], next = js.Any.fromFunction1(next))
  
    __obj.asInstanceOf[PaginatedResult[T]]
  }
}

