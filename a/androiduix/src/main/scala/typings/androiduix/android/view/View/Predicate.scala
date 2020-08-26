package typings.androiduix.android.view.View

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Predicate[T] extends js.Object {
  @JSName("apply")
  def apply(t: T): Boolean = js.native
}

object Predicate {
  @scala.inline
  def apply[T](apply: T => Boolean): Predicate[T] = {
    val __obj = js.Dynamic.literal(apply = js.Any.fromFunction1(apply))
    __obj.asInstanceOf[Predicate[T]]
  }
  @scala.inline
  implicit class PredicateOps[Self <: Predicate[_], T] (val x: Self with Predicate[T]) extends AnyVal {
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
    def setApply(value: T => Boolean): Self = this.set("apply", js.Any.fromFunction1(value))
  }
  
}

