package typings.agDashGrid.distLibUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExternalPromise[T] extends js.Object {
  var promise: Promise[T]
  def resolve(value: T): Unit
}

object ExternalPromise {
  @scala.inline
  def apply[T](promise: Promise[T], resolve: T => Unit): ExternalPromise[T] = {
    val __obj = js.Dynamic.literal(promise = promise, resolve = js.Any.fromFunction1(resolve))
  
    __obj.asInstanceOf[ExternalPromise[T]]
  }
}

