package typings
package atAngularCompilerLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_LiteralFactory extends js.Object {
  var literalFactory: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression
  var literalFactoryArguments: js.Array[atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression]
}

object Anon_LiteralFactory {
  @scala.inline
  def apply(
    literalFactory: atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression,
    literalFactoryArguments: js.Array[atAngularCompilerLib.srcOutputOutputUnderscoreAstMod.Expression]
  ): Anon_LiteralFactory = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("literalFactory")(literalFactory)
    __obj.updateDynamic("literalFactoryArguments")(literalFactoryArguments)
    __obj.asInstanceOf[Anon_LiteralFactory]
  }
}

