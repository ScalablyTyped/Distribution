package typings.angularCompiler

import typings.angularCompiler.formattedErrorMod.FormattedMessageChain
import typings.angularCompiler.formattedErrorMod.Position
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChain extends js.Object {
  var chain: FormattedMessageChain
  var position: js.UndefOr[Position] = js.undefined
}

object AnonChain {
  @scala.inline
  def apply(chain: FormattedMessageChain, position: Position = null): AnonChain = {
    val __obj = js.Dynamic.literal(chain = chain.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonChain]
  }
}

