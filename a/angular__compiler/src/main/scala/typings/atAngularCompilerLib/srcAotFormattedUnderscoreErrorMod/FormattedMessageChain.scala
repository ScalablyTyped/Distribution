package typings
package atAngularCompilerLib.srcAotFormattedUnderscoreErrorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormattedMessageChain extends js.Object {
  var message: java.lang.String
  var next: js.UndefOr[FormattedMessageChain] = js.undefined
  var position: js.UndefOr[Position] = js.undefined
}

object FormattedMessageChain {
  @scala.inline
  def apply(message: java.lang.String, next: FormattedMessageChain = null, position: Position = null): FormattedMessageChain = {
    val __obj = js.Dynamic.literal(message = message)
    if (next != null) __obj.updateDynamic("next")(next)
    if (position != null) __obj.updateDynamic("position")(position)
    __obj.asInstanceOf[FormattedMessageChain]
  }
}

