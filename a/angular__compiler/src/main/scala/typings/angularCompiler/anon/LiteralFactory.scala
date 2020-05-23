package typings.angularCompiler.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LiteralFactory extends js.Object {
  var literalFactory: typings.angularCompiler.outputAstMod.Expression
  var literalFactoryArguments: js.Array[typings.angularCompiler.outputAstMod.Expression]
}

object LiteralFactory {
  @scala.inline
  def apply(
    literalFactory: typings.angularCompiler.outputAstMod.Expression,
    literalFactoryArguments: js.Array[typings.angularCompiler.outputAstMod.Expression]
  ): LiteralFactory = {
    val __obj = js.Dynamic.literal(literalFactory = literalFactory.asInstanceOf[js.Any], literalFactoryArguments = literalFactoryArguments.asInstanceOf[js.Any])
    __obj.asInstanceOf[LiteralFactory]
  }
}

