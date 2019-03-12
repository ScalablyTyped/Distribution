package typings
package ampDashMessageLib.ampDashMessageMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Message extends js.Object {
  def inspect(): java.lang.String
  def pop(): js.UndefOr[nodeLib.Buffer]
  def push(items: nodeLib.Buffer*): scala.Double
  def shift(): js.UndefOr[nodeLib.Buffer]
  def toBuffer(): nodeLib.Buffer
  def unshift(items: nodeLib.Buffer*): scala.Double
}

object Message {
  @scala.inline
  def apply(
    inspect: () => java.lang.String,
    pop: () => js.UndefOr[nodeLib.Buffer],
    push: /* repeated */ nodeLib.Buffer => scala.Double,
    shift: () => js.UndefOr[nodeLib.Buffer],
    toBuffer: () => nodeLib.Buffer,
    unshift: /* repeated */ nodeLib.Buffer => scala.Double
  ): Message = {
    val __obj = js.Dynamic.literal(inspect = js.Any.fromFunction0(inspect), pop = js.Any.fromFunction0(pop), push = js.Any.fromFunction1(push), shift = js.Any.fromFunction0(shift), toBuffer = js.Any.fromFunction0(toBuffer), unshift = js.Any.fromFunction1(unshift))
  
    __obj.asInstanceOf[Message]
  }
}

