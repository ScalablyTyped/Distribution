package typings.atom.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisposableLike extends js.Object {
  def dispose(): Unit = js.native
}

object DisposableLike {
  @scala.inline
  def apply(dispose: () => Unit): DisposableLike = {
    val __obj = js.Dynamic.literal(dispose = js.Any.fromFunction0(dispose))
    __obj.asInstanceOf[DisposableLike]
  }
  @scala.inline
  implicit class DisposableLikeOps[Self <: DisposableLike] (val x: Self) extends AnyVal {
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
    def setDispose(value: () => Unit): Self = this.set("dispose", js.Any.fromFunction0(value))
  }
  
}

