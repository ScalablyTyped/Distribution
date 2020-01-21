package typings.angularCompiler

import typings.angularCompiler.outputAstMod.Expression
import typings.angularCompiler.outputAstMod.Statement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFactory extends js.Object {
  var factory: Expression
  var statements: js.Array[Statement]
}

object AnonFactory {
  @scala.inline
  def apply(factory: Expression, statements: js.Array[Statement]): AnonFactory = {
    val __obj = js.Dynamic.literal(factory = factory.asInstanceOf[js.Any], statements = statements.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonFactory]
  }
}

