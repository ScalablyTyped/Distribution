package typings.atAngularCompiler.srcRender3UtilMod

import typings.atAngularCompiler.srcOutputOutputUnderscoreAstMod.Expression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait R3Reference extends js.Object {
  var `type`: Expression
  var value: Expression
}

object R3Reference {
  @scala.inline
  def apply(`type`: Expression, value: Expression): R3Reference = {
    val __obj = js.Dynamic.literal(value = value)
    __obj.updateDynamic("type")(`type`)
    __obj.asInstanceOf[R3Reference]
  }
}

