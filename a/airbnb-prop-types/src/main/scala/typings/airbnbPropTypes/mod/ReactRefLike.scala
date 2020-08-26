package typings.airbnbPropTypes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReactRefLike[T] extends js.Object {
  val current: T | Null = js.native
}

object ReactRefLike {
  @scala.inline
  def apply[T](): ReactRefLike[T] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ReactRefLike[T]]
  }
  @scala.inline
  implicit class ReactRefLikeOps[Self <: ReactRefLike[_], T] (val x: Self with ReactRefLike[T]) extends AnyVal {
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
    def setCurrent(value: T): Self = this.set("current", value.asInstanceOf[js.Any])
    @scala.inline
    def setCurrentNull: Self = this.set("current", null)
  }
  
}

