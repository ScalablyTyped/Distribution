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
    inspect: js.Function0[java.lang.String],
    pop: js.Function0[js.UndefOr[nodeLib.Buffer]],
    push: js.Function1[/* repeated */ nodeLib.Buffer, scala.Double],
    shift: js.Function0[js.UndefOr[nodeLib.Buffer]],
    toBuffer: js.Function0[nodeLib.Buffer],
    unshift: js.Function1[/* repeated */ nodeLib.Buffer, scala.Double]
  ): Message = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("inspect")(inspect)
    __obj.updateDynamic("pop")(pop)
    __obj.updateDynamic("push")(push)
    __obj.updateDynamic("shift")(shift)
    __obj.updateDynamic("toBuffer")(toBuffer)
    __obj.updateDynamic("unshift")(unshift)
    __obj.asInstanceOf[Message]
  }
}

