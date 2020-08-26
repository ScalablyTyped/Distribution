package typings.astring.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Write extends js.Object {
  def write(s: String): Unit = js.native
}

object Write {
  @scala.inline
  def apply(write: String => Unit): Write = {
    val __obj = js.Dynamic.literal(write = js.Any.fromFunction1(write))
    __obj.asInstanceOf[Write]
  }
  @scala.inline
  implicit class WriteOps[Self <: Write] (val x: Self) extends AnyVal {
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
    def setWrite(value: String => Unit): Self = this.set("write", js.Any.fromFunction1(value))
  }
  
}

