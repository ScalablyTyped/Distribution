package typings.atAngularCompiler

import typings.atAngularCompiler.srcOutputOutputUnderscoreAstMod.Expression
import typings.atAngularCompiler.srcOutputOutputUnderscoreAstMod.Statement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Factory extends js.Object {
  var factory: Expression
  var statements: js.Array[Statement]
}

object Anon_Factory {
  @scala.inline
  def apply(factory: Expression, statements: js.Array[Statement]): Anon_Factory = {
    val __obj = js.Dynamic.literal(factory = factory, statements = statements)
  
    __obj.asInstanceOf[Anon_Factory]
  }
}

