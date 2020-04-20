package typings.ampMessage.mod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Message extends js.Object {
  def inspect(): String
  def pop(): js.UndefOr[Buffer]
  def push(items: Buffer*): Double
  def shift(): js.UndefOr[Buffer]
  def toBuffer(): Buffer
  def unshift(items: Buffer*): Double
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
}

