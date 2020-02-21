package typings.asyncIterableStream.mod

import typings.std.IteratorResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AsyncIterator[T] extends js.Object {
  def next(): js.Promise[IteratorResult[T, _]]
  def `return`(): Unit
}

object AsyncIterator {
  @scala.inline
  def apply[T](next: () => js.Promise[IteratorResult[T, _]], `return`: () => Unit): AsyncIterator[T] = {
    val __obj = js.Dynamic.literal(next = js.Any.fromFunction0(next))
    __obj.updateDynamic("return")(js.Any.fromFunction0(`return`))
    __obj.asInstanceOf[AsyncIterator[T]]
  }
}

