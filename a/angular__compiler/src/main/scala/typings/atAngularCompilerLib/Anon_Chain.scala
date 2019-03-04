package typings
package atAngularCompilerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Chain extends js.Object {
  var chain: atAngularCompilerLib.srcAotFormattedUnderscoreErrorMod.FormattedMessageChain
  var position: js.UndefOr[atAngularCompilerLib.srcAotFormattedUnderscoreErrorMod.Position] = js.undefined
}

object Anon_Chain {
  @scala.inline
  def apply(
    chain: atAngularCompilerLib.srcAotFormattedUnderscoreErrorMod.FormattedMessageChain,
    position: atAngularCompilerLib.srcAotFormattedUnderscoreErrorMod.Position = null
  ): Anon_Chain = {
    val __obj = js.Dynamic.literal(chain = chain)
    if (position != null) __obj.updateDynamic("position")(position)
    __obj.asInstanceOf[Anon_Chain]
  }
}

