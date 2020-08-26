package typings.ampMessage.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Message extends js.Object {
  def inspect(): String = js.native
  def pop(): js.UndefOr[Buffer] = js.native
  def push(items: Buffer*): Double = js.native
  def shift(): js.UndefOr[Buffer] = js.native
  def toBuffer(): Buffer = js.native
  def unshift(items: Buffer*): Double = js.native
}

object Message {
  @scala.inline
  def apply(
    inspect: () => String,
    pop: () => js.UndefOr[Buffer],
    push: /* repeated */ Buffer => Double,
    shift: () => js.UndefOr[Buffer],
    toBuffer: () => Buffer,
    unshift: /* repeated */ Buffer => Double
  ): Message = {
    val __obj = js.Dynamic.literal(inspect = js.Any.fromFunction0(inspect), pop = js.Any.fromFunction0(pop), push = js.Any.fromFunction1(push), shift = js.Any.fromFunction0(shift), toBuffer = js.Any.fromFunction0(toBuffer), unshift = js.Any.fromFunction1(unshift))
    __obj.asInstanceOf[Message]
  }
  @scala.inline
  implicit class MessageOps[Self <: Message] (val x: Self) extends AnyVal {
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
    def setInspect(value: () => String): Self = this.set("inspect", js.Any.fromFunction0(value))
    @scala.inline
    def setPop(value: () => js.UndefOr[Buffer]): Self = this.set("pop", js.Any.fromFunction0(value))
    @scala.inline
    def setPush(value: /* repeated */ Buffer => Double): Self = this.set("push", js.Any.fromFunction1(value))
    @scala.inline
    def setShift(value: () => js.UndefOr[Buffer]): Self = this.set("shift", js.Any.fromFunction0(value))
    @scala.inline
    def setToBuffer(value: () => Buffer): Self = this.set("toBuffer", js.Any.fromFunction0(value))
    @scala.inline
    def setUnshift(value: /* repeated */ Buffer => Double): Self = this.set("unshift", js.Any.fromFunction1(value))
  }
  
}

