package typings
package agDashGridLib.distLibUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExternalPromise[T] extends js.Object {
  var promise: Promise[T]
  def resolve(value: T): scala.Unit
}

object ExternalPromise {
  @scala.inline
  def apply[T](promise: Promise[T], resolve: T => scala.Unit): ExternalPromise[T] = {
    val __obj = js.Dynamic.literal(promise = promise, resolve = js.Any.fromFunction1(resolve))
  
    __obj.asInstanceOf[ExternalPromise[T]]
  }
}

