package typings.atAngularCompiler

import typings.atAngularCompiler.srcAotFormattedUnderscoreErrorMod.FormattedMessageChain
import typings.atAngularCompiler.srcAotFormattedUnderscoreErrorMod.Position
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Chain extends js.Object {
  var chain: FormattedMessageChain
  var position: js.UndefOr[Position] = js.undefined
}

object Anon_Chain {
  @scala.inline
  def apply(chain: FormattedMessageChain, position: Position = null): Anon_Chain = {
    val __obj = js.Dynamic.literal(chain = chain.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Chain]
  }
}

