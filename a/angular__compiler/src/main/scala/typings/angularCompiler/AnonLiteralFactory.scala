package typings.angularCompiler

import typings.angularCompiler.outputAstMod.Expression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLiteralFactory extends js.Object {
  var literalFactory: Expression
  var literalFactoryArguments: js.Array[Expression]
}

object AnonLiteralFactory {
  @scala.inline
  def apply(literalFactory: Expression, literalFactoryArguments: js.Array[Expression]): AnonLiteralFactory = {
    val __obj = js.Dynamic.literal(literalFactory = literalFactory.asInstanceOf[js.Any], literalFactoryArguments = literalFactoryArguments.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLiteralFactory]
  }
}

