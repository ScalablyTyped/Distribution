package typings.atAngularCompiler

import typings.atAngularCompiler.srcOutputOutputUnderscoreAstMod.Expression
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_LiteralFactory extends js.Object {
  var literalFactory: Expression
  var literalFactoryArguments: js.Array[Expression]
}

object Anon_LiteralFactory {
  @scala.inline
  def apply(literalFactory: Expression, literalFactoryArguments: js.Array[Expression]): Anon_LiteralFactory = {
    val __obj = js.Dynamic.literal(literalFactory = literalFactory.asInstanceOf[js.Any], literalFactoryArguments = literalFactoryArguments.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_LiteralFactory]
  }
}

