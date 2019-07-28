package typings.antd

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined {  delay ? :number | undefined} & std.Boolean */
trait delaynumberundefinedBoolean extends js.Object {
  var delay: js.UndefOr[Double] = js.undefined
}

object delaynumberundefinedBoolean {
  @scala.inline
  def apply(valueOf: () => Boolean, delay: Int | Double = null): delaynumberundefinedBoolean = {
    val __obj = js.Dynamic.literal(valueOf = js.Any.fromFunction0(valueOf))
    if (delay != null) __obj.updateDynamic("delay")(delay.asInstanceOf[js.Any])
    __obj.asInstanceOf[delaynumberundefinedBoolean]
  }
}

