package typings.agGrid.utilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExternalPromise[T] extends js.Object {
  var promise: Promise[T] = js.native
  def resolve(value: T): Unit = js.native
}

object ExternalPromise {
  @scala.inline
  def apply[T](promise: Promise[T], resolve: T => Unit): ExternalPromise[T] = {
    val __obj = js.Dynamic.literal(promise = promise.asInstanceOf[js.Any], resolve = js.Any.fromFunction1(resolve))
    __obj.asInstanceOf[ExternalPromise[T]]
  }
  @scala.inline
  implicit class ExternalPromiseOps[Self <: ExternalPromise[_], T] (val x: Self with ExternalPromise[T]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPromise(value: Promise[T]): Self = this.set("promise", value.asInstanceOf[js.Any])
    @scala.inline
    def setResolve(value: T => Unit): Self = this.set("resolve", js.Any.fromFunction1(value))
  }
  
}

