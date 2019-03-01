package typings
package atAngularCompilerLib.srcRender3UtilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait R3Reference extends js.Object {
  var `type`: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression
  var value: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression
}

object R3Reference {
  @scala.inline
  def apply(
    `type`: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression,
    value: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression
  ): R3Reference = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[R3Reference]
  }
}

